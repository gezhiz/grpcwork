package com.worthto.client;

import com.worthto.proto.*;
import io.grpc.Channel;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author gezz
 * @description
 * @date 2020/2/29.
 */
public class GrpcClient {
    private static final Logger logger = Logger.getLogger(GrpcClient.class.getName());

    private final PersonServiceGrpc.PersonServiceBlockingStub blockingStub;
    private final PersonServiceGrpc.PersonServiceStub personServiceStub;

    /** Construct client for accessing HelloWorld server using the existing channel. */
    public GrpcClient(Channel channel) {
        // 'channel' here is a Channel, not a ManagedChannel, so it is not this code's responsibility to
        // shut it down.

        // Passing Channels to code makes code easier to test and makes it easier to reuse Channels.
        blockingStub = PersonServiceGrpc.newBlockingStub(channel);
        personServiceStub = PersonServiceGrpc.newStub(channel);
    }

    /** Say hello to server. */
    public void greet(String name) {
        logger.info("Will try to greet " + name + " ...");
        MyRequest request = MyRequest.newBuilder().setUsername(name).build();
        MyResponse response;
        try {
            response = blockingStub.getRealNameByUserName(request);
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return;
        }
        logger.info("Greeting: " + response.getRealname());
    }

    public void getPersons(String name) {
        Iterator<PersonResponse> personResponseIterator = blockingStub.getPersonsByAge(MyRequest.newBuilder().setUsername(name).build());
        while(personResponseIterator.hasNext()) {
            PersonResponse personResponse = personResponseIterator.next();
            System.out.println(personResponse.getName());
            System.out.println(personResponse.getAge());
            System.out.println(personResponse.getAddress());
        }
    }

    public void sendNames() {
        //异步调用,先设置回调
        StreamObserver<MyRequest> streamObserver = personServiceStub.sendNames(new StreamObserver<MyResponse>() {
            @Override
            public void onNext(MyResponse myResponse) {
                System.out.println("from server :" + myResponse.getRealname());
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {
                System.out.println("completed");
            }
        });
        streamObserver.onNext(MyRequest.newBuilder().setUsername("gezz").build());
        streamObserver.onNext(MyRequest.newBuilder().setUsername("gezz1").build());
        streamObserver.onNext(MyRequest.newBuilder().setUsername("gezz2").build());
        streamObserver.onNext(MyRequest.newBuilder().setUsername("gezz3").build());
        streamObserver.onCompleted();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public void sendPersons() {
        //异步调用,先设置回调
        StreamObserver<MyRequest> streamObserver = personServiceStub.sendPersons(new StreamObserver<MyResponse>() {
            @Override
            public void onNext(MyResponse myResponse) {
                System.out.println("from server :" + myResponse.getRealname());
            }

            @Override
            public void onError(Throwable throwable) {
                throwable.printStackTrace();
            }

            @Override
            public void onCompleted() {
                System.out.println("completed");
            }
        });

        for (int i = 0; i < 10; i++) {
            streamObserver.onNext(MyRequest.newBuilder().setUsername("gezz" + i).build());

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        streamObserver.onCompleted();

        try {
            Thread.sleep(18800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    /**
     * Greet server. If provided, the first element of {@code args} is the name to use in the
     * greeting. The second argument is the target server.
     */
    public static void main(String[] args) throws Exception {
        String user = "gerson";
        // Access a service running on the local machine on port 50051
        String target = "localhost:50051";
        // Allow passing in the user and target strings as command line arguments
        if (args.length > 0) {
            if ("--help".equals(args[0])) {
                System.err.println("Usage: [name [target]]");
                System.err.println("");
                System.err.println("  name    The name you wish to be greeted by. Defaults to " + user);
                System.err.println("  target  The server to connect to. Defaults to " + target);
                System.exit(1);
            }
            user = args[0];
        }
        if (args.length > 1) {
            target = args[1];
        }

        // Create a communication channel to the server, known as a Channel. Channels are thread-safe
        // and reusable. It is common to create channels at the beginning of your application and reuse
        // them until the application shuts down.
        ManagedChannel channel = ManagedChannelBuilder.forTarget(target)
                // Channels are secure by default (via SSL/TLS). For the example we disable TLS to avoid
                // needing certificates.
                .usePlaintext()
                .build();
        try {
            GrpcClient client = new GrpcClient(channel);
            //普通访问（无stream）
//            client.greet(user);
            //服务端返回stream
//            client.getPersons(user);
            //客户端请求参数是stream
            client.sendNames();
            //双向stream模式
//            client.sendPersons();
        } finally {
            // ManagedChannels use resources like threads and TCP connections. To prevent leaking these
            // resources the channel should be shut down when it will no longer be used. If it may be used
            // again leave it running.
            channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
        }
    }
}

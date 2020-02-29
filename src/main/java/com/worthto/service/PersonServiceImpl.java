package com.worthto.service;

import com.worthto.proto.*;
import io.grpc.stub.StreamObserver;

/**
 * @author gezz
 * @description
 * @date 2020/2/29.
 */
public class PersonServiceImpl extends PersonServiceGrpc.PersonServiceImplBase {

    @Override
    public void getRealNameByUserName(com.worthto.proto.MyRequest request,
                                      io.grpc.stub.StreamObserver<com.worthto.proto.MyResponse> responseObserver) {
        System.out.println("接收到客户端信息:" + request.getUsername());
        //把数据返回给客户端
        responseObserver.onNext(MyResponse.newBuilder().setRealname("张三").build());
        //标识方法调用结束了
        responseObserver.onCompleted();
    }

    @Override
    public void getPersonsByAge(MyRequest request, StreamObserver<PersonResponse> responseObserver) {
        System.out.println("接收到客户端信息:" + request.getUsername());
        responseObserver.onNext(PersonResponse.newBuilder().setName("gezz").setAge(10).setAddress("北京市朝阳区").build());
        responseObserver.onNext(PersonResponse.newBuilder().setName("yuan").setAge(20).setAddress("北京市信息园区").build());
        responseObserver.onNext(PersonResponse.newBuilder().setName("xinxi").setAge(30).setAddress("北京市望京").build());
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<MyRequest> sendNames(final StreamObserver<MyResponse> responseStreamObserver) {
        return new StreamObserver<MyRequest>() {

            @Override
            public void onNext(MyRequest myRequest) {
                //挨个处理请求参数MyRequest的对象
                System.out.println("onNext:" + myRequest.getUsername());
            }

            @Override
            public void onError(Throwable throwable) {
                throwable.printStackTrace();
            }

            @Override
            public void onCompleted() {
                responseStreamObserver.onNext(MyResponse.newBuilder().setRealname("gezz").build());
                responseStreamObserver.onCompleted();
            }
        };
    }

    @Override
    public StreamObserver<MyRequest> sendPersons(final StreamObserver<MyResponse> responseObserver) {
        return new StreamObserver<MyRequest>() {

            @Override
            public void onNext(MyRequest myRequest) {
                //挨个处理请求参数MyRequest的对象
                responseObserver.onNext(MyResponse.newBuilder().setRealname("gezz").build());
                System.out.println("onNext:" + myRequest.getUsername());
            }

            @Override
            public void onError(Throwable throwable) {
                throwable.printStackTrace();
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }
}

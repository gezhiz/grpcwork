package com.worthto.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.*;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.*;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.27.2)",
    comments = "Source: Person.proto")
public final class PersonServiceGrpc {

  private PersonServiceGrpc() {}

  public static final String SERVICE_NAME = "com.worthto.protobuf.PersonService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<MyRequest,
      MyResponse> getGetRealNameByUserNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRealNameByUserName",
      requestType = MyRequest.class,
      responseType = MyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<MyRequest,
      MyResponse> getGetRealNameByUserNameMethod() {
    io.grpc.MethodDescriptor<MyRequest, MyResponse> getGetRealNameByUserNameMethod;
    if ((getGetRealNameByUserNameMethod = PersonServiceGrpc.getGetRealNameByUserNameMethod) == null) {
      synchronized (PersonServiceGrpc.class) {
        if ((getGetRealNameByUserNameMethod = PersonServiceGrpc.getGetRealNameByUserNameMethod) == null) {
          PersonServiceGrpc.getGetRealNameByUserNameMethod = getGetRealNameByUserNameMethod =
              io.grpc.MethodDescriptor.<MyRequest, MyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRealNameByUserName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PersonServiceMethodDescriptorSupplier("GetRealNameByUserName"))
              .build();
        }
      }
    }
    return getGetRealNameByUserNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<MyRequest,
      PersonResponse> getGetPersonsByAgeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPersonsByAge",
      requestType = MyRequest.class,
      responseType = PersonResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<MyRequest,
      PersonResponse> getGetPersonsByAgeMethod() {
    io.grpc.MethodDescriptor<MyRequest, PersonResponse> getGetPersonsByAgeMethod;
    if ((getGetPersonsByAgeMethod = PersonServiceGrpc.getGetPersonsByAgeMethod) == null) {
      synchronized (PersonServiceGrpc.class) {
        if ((getGetPersonsByAgeMethod = PersonServiceGrpc.getGetPersonsByAgeMethod) == null) {
          PersonServiceGrpc.getGetPersonsByAgeMethod = getGetPersonsByAgeMethod =
              io.grpc.MethodDescriptor.<MyRequest, PersonResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPersonsByAge"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  PersonResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PersonServiceMethodDescriptorSupplier("GetPersonsByAge"))
              .build();
        }
      }
    }
    return getGetPersonsByAgeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<MyRequest,
      MyResponse> getSendNamesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendNames",
      requestType = MyRequest.class,
      responseType = MyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<MyRequest,
      MyResponse> getSendNamesMethod() {
    io.grpc.MethodDescriptor<MyRequest, MyResponse> getSendNamesMethod;
    if ((getSendNamesMethod = PersonServiceGrpc.getSendNamesMethod) == null) {
      synchronized (PersonServiceGrpc.class) {
        if ((getSendNamesMethod = PersonServiceGrpc.getSendNamesMethod) == null) {
          PersonServiceGrpc.getSendNamesMethod = getSendNamesMethod =
              io.grpc.MethodDescriptor.<MyRequest, MyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendNames"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PersonServiceMethodDescriptorSupplier("SendNames"))
              .build();
        }
      }
    }
    return getSendNamesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<MyRequest,
      MyResponse> getSendPersonsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendPersons",
      requestType = MyRequest.class,
      responseType = MyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<MyRequest,
      MyResponse> getSendPersonsMethod() {
    io.grpc.MethodDescriptor<MyRequest, MyResponse> getSendPersonsMethod;
    if ((getSendPersonsMethod = PersonServiceGrpc.getSendPersonsMethod) == null) {
      synchronized (PersonServiceGrpc.class) {
        if ((getSendPersonsMethod = PersonServiceGrpc.getSendPersonsMethod) == null) {
          PersonServiceGrpc.getSendPersonsMethod = getSendPersonsMethod =
              io.grpc.MethodDescriptor.<MyRequest, MyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendPersons"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PersonServiceMethodDescriptorSupplier("SendPersons"))
              .build();
        }
      }
    }
    return getSendPersonsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PersonServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PersonServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PersonServiceStub>() {
        @Override
        public PersonServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PersonServiceStub(channel, callOptions);
        }
      };
    return PersonServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PersonServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PersonServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PersonServiceBlockingStub>() {
        @Override
        public PersonServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PersonServiceBlockingStub(channel, callOptions);
        }
      };
    return PersonServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PersonServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PersonServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PersonServiceFutureStub>() {
        @Override
        public PersonServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PersonServiceFutureStub(channel, callOptions);
        }
      };
    return PersonServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class PersonServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getRealNameByUserName(MyRequest request,
        io.grpc.stub.StreamObserver<MyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRealNameByUserNameMethod(), responseObserver);
    }

    /**
     */
    public void getPersonsByAge(MyRequest request,
        io.grpc.stub.StreamObserver<PersonResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPersonsByAgeMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<MyRequest> sendNames(
        io.grpc.stub.StreamObserver<MyResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getSendNamesMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<MyRequest> sendPersons(
        io.grpc.stub.StreamObserver<MyResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getSendPersonsMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetRealNameByUserNameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                MyRequest,
                MyResponse>(
                  this, METHODID_GET_REAL_NAME_BY_USER_NAME)))
          .addMethod(
            getGetPersonsByAgeMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                MyRequest,
                PersonResponse>(
                  this, METHODID_GET_PERSONS_BY_AGE)))
          .addMethod(
            getSendNamesMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                MyRequest,
                MyResponse>(
                  this, METHODID_SEND_NAMES)))
          .addMethod(
            getSendPersonsMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                MyRequest,
                MyResponse>(
                  this, METHODID_SEND_PERSONS)))
          .build();
    }
  }

  /**
   */
  public static final class PersonServiceStub extends io.grpc.stub.AbstractAsyncStub<PersonServiceStub> {
    private PersonServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected PersonServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PersonServiceStub(channel, callOptions);
    }

    /**
     */
    public void getRealNameByUserName(MyRequest request,
        io.grpc.stub.StreamObserver<MyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRealNameByUserNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPersonsByAge(MyRequest request,
        io.grpc.stub.StreamObserver<PersonResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetPersonsByAgeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<MyRequest> sendNames(
        io.grpc.stub.StreamObserver<MyResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getSendNamesMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<MyRequest> sendPersons(
        io.grpc.stub.StreamObserver<MyResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getSendPersonsMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class PersonServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PersonServiceBlockingStub> {
    private PersonServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected PersonServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PersonServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public MyResponse getRealNameByUserName(MyRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetRealNameByUserNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<PersonResponse> getPersonsByAge(
        MyRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetPersonsByAgeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PersonServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PersonServiceFutureStub> {
    private PersonServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected PersonServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PersonServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<MyResponse> getRealNameByUserName(
        MyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRealNameByUserNameMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_REAL_NAME_BY_USER_NAME = 0;
  private static final int METHODID_GET_PERSONS_BY_AGE = 1;
  private static final int METHODID_SEND_NAMES = 2;
  private static final int METHODID_SEND_PERSONS = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PersonServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PersonServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_REAL_NAME_BY_USER_NAME:
          serviceImpl.getRealNameByUserName((MyRequest) request,
              (io.grpc.stub.StreamObserver<MyResponse>) responseObserver);
          break;
        case METHODID_GET_PERSONS_BY_AGE:
          serviceImpl.getPersonsByAge((MyRequest) request,
              (io.grpc.stub.StreamObserver<PersonResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_NAMES:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sendNames(
              (io.grpc.stub.StreamObserver<MyResponse>) responseObserver);
        case METHODID_SEND_PERSONS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sendPersons(
              (io.grpc.stub.StreamObserver<MyResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class PersonServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PersonServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return PersonProto.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PersonService");
    }
  }

  private static final class PersonServiceFileDescriptorSupplier
      extends PersonServiceBaseDescriptorSupplier {
    PersonServiceFileDescriptorSupplier() {}
  }

  private static final class PersonServiceMethodDescriptorSupplier
      extends PersonServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PersonServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PersonServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PersonServiceFileDescriptorSupplier())
              .addMethod(getGetRealNameByUserNameMethod())
              .addMethod(getGetPersonsByAgeMethod())
              .addMethod(getSendNamesMethod())
              .addMethod(getSendPersonsMethod())
              .build();
        }
      }
    }
    return result;
  }
}

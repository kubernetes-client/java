package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Integer;
import java.lang.Deprecated;
import java.lang.Long;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1ProbeFluent<A extends V1ProbeFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildExec instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ExecAction getExec();
  public V1ExecAction buildExec();
  public A withExec(V1ExecAction exec);
  public Boolean hasExec();
  public V1ProbeFluent.ExecNested<A> withNewExec();
  public V1ProbeFluent.ExecNested<A> withNewExecLike(V1ExecAction item);
  public V1ProbeFluent.ExecNested<A> editExec();
  public V1ProbeFluent.ExecNested<A> editOrNewExec();
  public V1ProbeFluent.ExecNested<A> editOrNewExecLike(V1ExecAction item);
  public Integer getFailureThreshold();
  public A withFailureThreshold(Integer failureThreshold);
  public Boolean hasFailureThreshold();
  
  /**
   * This method has been deprecated, please use method buildGrpc instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1GRPCAction getGrpc();
  public V1GRPCAction buildGrpc();
  public A withGrpc(V1GRPCAction grpc);
  public Boolean hasGrpc();
  public V1ProbeFluent.GrpcNested<A> withNewGrpc();
  public V1ProbeFluent.GrpcNested<A> withNewGrpcLike(V1GRPCAction item);
  public V1ProbeFluent.GrpcNested<A> editGrpc();
  public V1ProbeFluent.GrpcNested<A> editOrNewGrpc();
  public V1ProbeFluent.GrpcNested<A> editOrNewGrpcLike(V1GRPCAction item);
  
  /**
   * This method has been deprecated, please use method buildHttpGet instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1HTTPGetAction getHttpGet();
  public V1HTTPGetAction buildHttpGet();
  public A withHttpGet(V1HTTPGetAction httpGet);
  public Boolean hasHttpGet();
  public V1ProbeFluent.HttpGetNested<A> withNewHttpGet();
  public V1ProbeFluent.HttpGetNested<A> withNewHttpGetLike(V1HTTPGetAction item);
  public V1ProbeFluent.HttpGetNested<A> editHttpGet();
  public V1ProbeFluent.HttpGetNested<A> editOrNewHttpGet();
  public V1ProbeFluent.HttpGetNested<A> editOrNewHttpGetLike(V1HTTPGetAction item);
  public Integer getInitialDelaySeconds();
  public A withInitialDelaySeconds(Integer initialDelaySeconds);
  public Boolean hasInitialDelaySeconds();
  public Integer getPeriodSeconds();
  public A withPeriodSeconds(Integer periodSeconds);
  public Boolean hasPeriodSeconds();
  public Integer getSuccessThreshold();
  public A withSuccessThreshold(Integer successThreshold);
  public Boolean hasSuccessThreshold();
  
  /**
   * This method has been deprecated, please use method buildTcpSocket instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1TCPSocketAction getTcpSocket();
  public V1TCPSocketAction buildTcpSocket();
  public A withTcpSocket(V1TCPSocketAction tcpSocket);
  public Boolean hasTcpSocket();
  public V1ProbeFluent.TcpSocketNested<A> withNewTcpSocket();
  public V1ProbeFluent.TcpSocketNested<A> withNewTcpSocketLike(V1TCPSocketAction item);
  public V1ProbeFluent.TcpSocketNested<A> editTcpSocket();
  public V1ProbeFluent.TcpSocketNested<A> editOrNewTcpSocket();
  public V1ProbeFluent.TcpSocketNested<A> editOrNewTcpSocketLike(V1TCPSocketAction item);
  public Long getTerminationGracePeriodSeconds();
  public A withTerminationGracePeriodSeconds(Long terminationGracePeriodSeconds);
  public Boolean hasTerminationGracePeriodSeconds();
  public Integer getTimeoutSeconds();
  public A withTimeoutSeconds(Integer timeoutSeconds);
  public Boolean hasTimeoutSeconds();
  public interface ExecNested<N> extends Nested<N>,V1ExecActionFluent<V1ProbeFluent.ExecNested<N>>{
    public N and();
    public N endExec();
    
  }
  public interface GrpcNested<N> extends Nested<N>,V1GRPCActionFluent<V1ProbeFluent.GrpcNested<N>>{
    public N and();
    public N endGrpc();
    
  }
  public interface HttpGetNested<N> extends Nested<N>,V1HTTPGetActionFluent<V1ProbeFluent.HttpGetNested<N>>{
    public N and();
    public N endHttpGet();
    
  }
  public interface TcpSocketNested<N> extends Nested<N>,V1TCPSocketActionFluent<V1ProbeFluent.TcpSocketNested<N>>{
    public N and();
    public N endTcpSocket();
    
  }
  
}
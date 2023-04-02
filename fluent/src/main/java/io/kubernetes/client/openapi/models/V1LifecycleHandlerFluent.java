package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Deprecated;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1LifecycleHandlerFluent<A extends V1LifecycleHandlerFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildExec instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ExecAction getExec();
  public V1ExecAction buildExec();
  public A withExec(V1ExecAction exec);
  public Boolean hasExec();
  public V1LifecycleHandlerFluent.ExecNested<A> withNewExec();
  public V1LifecycleHandlerFluent.ExecNested<A> withNewExecLike(V1ExecAction item);
  public V1LifecycleHandlerFluent.ExecNested<A> editExec();
  public V1LifecycleHandlerFluent.ExecNested<A> editOrNewExec();
  public V1LifecycleHandlerFluent.ExecNested<A> editOrNewExecLike(V1ExecAction item);
  
  /**
   * This method has been deprecated, please use method buildHttpGet instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1HTTPGetAction getHttpGet();
  public V1HTTPGetAction buildHttpGet();
  public A withHttpGet(V1HTTPGetAction httpGet);
  public Boolean hasHttpGet();
  public V1LifecycleHandlerFluent.HttpGetNested<A> withNewHttpGet();
  public V1LifecycleHandlerFluent.HttpGetNested<A> withNewHttpGetLike(V1HTTPGetAction item);
  public V1LifecycleHandlerFluent.HttpGetNested<A> editHttpGet();
  public V1LifecycleHandlerFluent.HttpGetNested<A> editOrNewHttpGet();
  public V1LifecycleHandlerFluent.HttpGetNested<A> editOrNewHttpGetLike(V1HTTPGetAction item);
  
  /**
   * This method has been deprecated, please use method buildTcpSocket instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1TCPSocketAction getTcpSocket();
  public V1TCPSocketAction buildTcpSocket();
  public A withTcpSocket(V1TCPSocketAction tcpSocket);
  public Boolean hasTcpSocket();
  public V1LifecycleHandlerFluent.TcpSocketNested<A> withNewTcpSocket();
  public V1LifecycleHandlerFluent.TcpSocketNested<A> withNewTcpSocketLike(V1TCPSocketAction item);
  public V1LifecycleHandlerFluent.TcpSocketNested<A> editTcpSocket();
  public V1LifecycleHandlerFluent.TcpSocketNested<A> editOrNewTcpSocket();
  public V1LifecycleHandlerFluent.TcpSocketNested<A> editOrNewTcpSocketLike(V1TCPSocketAction item);
  public interface ExecNested<N> extends Nested<N>,V1ExecActionFluent<V1LifecycleHandlerFluent.ExecNested<N>>{
    public N and();
    public N endExec();
    
  }
  public interface HttpGetNested<N> extends Nested<N>,V1HTTPGetActionFluent<V1LifecycleHandlerFluent.HttpGetNested<N>>{
    public N and();
    public N endHttpGet();
    
  }
  public interface TcpSocketNested<N> extends Nested<N>,V1TCPSocketActionFluent<V1LifecycleHandlerFluent.TcpSocketNested<N>>{
    public N and();
    public N endTcpSocket();
    
  }
  
}
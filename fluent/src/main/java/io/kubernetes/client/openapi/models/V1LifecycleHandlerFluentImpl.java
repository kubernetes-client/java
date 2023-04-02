package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Boolean;
import java.lang.Object;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1LifecycleHandlerFluentImpl<A extends V1LifecycleHandlerFluent<A>> extends BaseFluent<A> implements V1LifecycleHandlerFluent<A>{
  public V1LifecycleHandlerFluentImpl() {
  }
  public V1LifecycleHandlerFluentImpl(V1LifecycleHandler instance) {
    this.withExec(instance.getExec());

    this.withHttpGet(instance.getHttpGet());

    this.withTcpSocket(instance.getTcpSocket());

  }
  private V1ExecActionBuilder exec;
  private V1HTTPGetActionBuilder httpGet;
  private V1TCPSocketActionBuilder tcpSocket;
  
  /**
   * This method has been deprecated, please use method buildExec instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ExecAction getExec() {
    return this.exec!=null ?this.exec.build():null;
  }
  public V1ExecAction buildExec() {
    return this.exec!=null ?this.exec.build():null;
  }
  public A withExec(V1ExecAction exec) {
    _visitables.get("exec").remove(this.exec);
    if (exec!=null){ this.exec= new V1ExecActionBuilder(exec); _visitables.get("exec").add(this.exec);} else { this.exec = null; _visitables.get("exec").remove(this.exec); } return (A) this;
  }
  public Boolean hasExec() {
    return this.exec != null;
  }
  public V1LifecycleHandlerFluent.ExecNested<A> withNewExec() {
    return new V1LifecycleHandlerFluentImpl.ExecNestedImpl();
  }
  public V1LifecycleHandlerFluent.ExecNested<A> withNewExecLike(V1ExecAction item) {
    return new V1LifecycleHandlerFluentImpl.ExecNestedImpl(item);
  }
  public V1LifecycleHandlerFluent.ExecNested<A> editExec() {
    return withNewExecLike(getExec());
  }
  public V1LifecycleHandlerFluent.ExecNested<A> editOrNewExec() {
    return withNewExecLike(getExec() != null ? getExec(): new V1ExecActionBuilder().build());
  }
  public V1LifecycleHandlerFluent.ExecNested<A> editOrNewExecLike(V1ExecAction item) {
    return withNewExecLike(getExec() != null ? getExec(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildHttpGet instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1HTTPGetAction getHttpGet() {
    return this.httpGet!=null ?this.httpGet.build():null;
  }
  public V1HTTPGetAction buildHttpGet() {
    return this.httpGet!=null ?this.httpGet.build():null;
  }
  public A withHttpGet(V1HTTPGetAction httpGet) {
    _visitables.get("httpGet").remove(this.httpGet);
    if (httpGet!=null){ this.httpGet= new V1HTTPGetActionBuilder(httpGet); _visitables.get("httpGet").add(this.httpGet);} else { this.httpGet = null; _visitables.get("httpGet").remove(this.httpGet); } return (A) this;
  }
  public Boolean hasHttpGet() {
    return this.httpGet != null;
  }
  public V1LifecycleHandlerFluent.HttpGetNested<A> withNewHttpGet() {
    return new V1LifecycleHandlerFluentImpl.HttpGetNestedImpl();
  }
  public V1LifecycleHandlerFluent.HttpGetNested<A> withNewHttpGetLike(V1HTTPGetAction item) {
    return new V1LifecycleHandlerFluentImpl.HttpGetNestedImpl(item);
  }
  public V1LifecycleHandlerFluent.HttpGetNested<A> editHttpGet() {
    return withNewHttpGetLike(getHttpGet());
  }
  public V1LifecycleHandlerFluent.HttpGetNested<A> editOrNewHttpGet() {
    return withNewHttpGetLike(getHttpGet() != null ? getHttpGet(): new V1HTTPGetActionBuilder().build());
  }
  public V1LifecycleHandlerFluent.HttpGetNested<A> editOrNewHttpGetLike(V1HTTPGetAction item) {
    return withNewHttpGetLike(getHttpGet() != null ? getHttpGet(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildTcpSocket instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1TCPSocketAction getTcpSocket() {
    return this.tcpSocket!=null ?this.tcpSocket.build():null;
  }
  public V1TCPSocketAction buildTcpSocket() {
    return this.tcpSocket!=null ?this.tcpSocket.build():null;
  }
  public A withTcpSocket(V1TCPSocketAction tcpSocket) {
    _visitables.get("tcpSocket").remove(this.tcpSocket);
    if (tcpSocket!=null){ this.tcpSocket= new V1TCPSocketActionBuilder(tcpSocket); _visitables.get("tcpSocket").add(this.tcpSocket);} else { this.tcpSocket = null; _visitables.get("tcpSocket").remove(this.tcpSocket); } return (A) this;
  }
  public Boolean hasTcpSocket() {
    return this.tcpSocket != null;
  }
  public V1LifecycleHandlerFluent.TcpSocketNested<A> withNewTcpSocket() {
    return new V1LifecycleHandlerFluentImpl.TcpSocketNestedImpl();
  }
  public V1LifecycleHandlerFluent.TcpSocketNested<A> withNewTcpSocketLike(V1TCPSocketAction item) {
    return new V1LifecycleHandlerFluentImpl.TcpSocketNestedImpl(item);
  }
  public V1LifecycleHandlerFluent.TcpSocketNested<A> editTcpSocket() {
    return withNewTcpSocketLike(getTcpSocket());
  }
  public V1LifecycleHandlerFluent.TcpSocketNested<A> editOrNewTcpSocket() {
    return withNewTcpSocketLike(getTcpSocket() != null ? getTcpSocket(): new V1TCPSocketActionBuilder().build());
  }
  public V1LifecycleHandlerFluent.TcpSocketNested<A> editOrNewTcpSocketLike(V1TCPSocketAction item) {
    return withNewTcpSocketLike(getTcpSocket() != null ? getTcpSocket(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1LifecycleHandlerFluentImpl that = (V1LifecycleHandlerFluentImpl) o;
    if (exec != null ? !exec.equals(that.exec) :that.exec != null) return false;
    if (httpGet != null ? !httpGet.equals(that.httpGet) :that.httpGet != null) return false;
    if (tcpSocket != null ? !tcpSocket.equals(that.tcpSocket) :that.tcpSocket != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(exec,  httpGet,  tcpSocket,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (exec != null) { sb.append("exec:"); sb.append(exec + ","); }
    if (httpGet != null) { sb.append("httpGet:"); sb.append(httpGet + ","); }
    if (tcpSocket != null) { sb.append("tcpSocket:"); sb.append(tcpSocket); }
    sb.append("}");
    return sb.toString();
  }
  class ExecNestedImpl<N> extends V1ExecActionFluentImpl<V1LifecycleHandlerFluent.ExecNested<N>> implements V1LifecycleHandlerFluent.ExecNested<N>,Nested<N>{
    ExecNestedImpl(V1ExecAction item) {
      this.builder = new V1ExecActionBuilder(this, item);
    }
    ExecNestedImpl() {
      this.builder = new V1ExecActionBuilder(this);
    }
    V1ExecActionBuilder builder;
    public N and() {
      return (N) V1LifecycleHandlerFluentImpl.this.withExec(builder.build());
    }
    public N endExec() {
      return and();
    }
    
  }
  class HttpGetNestedImpl<N> extends V1HTTPGetActionFluentImpl<V1LifecycleHandlerFluent.HttpGetNested<N>> implements V1LifecycleHandlerFluent.HttpGetNested<N>,Nested<N>{
    HttpGetNestedImpl(V1HTTPGetAction item) {
      this.builder = new V1HTTPGetActionBuilder(this, item);
    }
    HttpGetNestedImpl() {
      this.builder = new V1HTTPGetActionBuilder(this);
    }
    V1HTTPGetActionBuilder builder;
    public N and() {
      return (N) V1LifecycleHandlerFluentImpl.this.withHttpGet(builder.build());
    }
    public N endHttpGet() {
      return and();
    }
    
  }
  class TcpSocketNestedImpl<N> extends V1TCPSocketActionFluentImpl<V1LifecycleHandlerFluent.TcpSocketNested<N>> implements V1LifecycleHandlerFluent.TcpSocketNested<N>,Nested<N>{
    TcpSocketNestedImpl(V1TCPSocketAction item) {
      this.builder = new V1TCPSocketActionBuilder(this, item);
    }
    TcpSocketNestedImpl() {
      this.builder = new V1TCPSocketActionBuilder(this);
    }
    V1TCPSocketActionBuilder builder;
    public N and() {
      return (N) V1LifecycleHandlerFluentImpl.this.withTcpSocket(builder.build());
    }
    public N endTcpSocket() {
      return and();
    }
    
  }
  
}
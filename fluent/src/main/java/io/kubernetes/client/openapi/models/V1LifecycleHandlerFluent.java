package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1LifecycleHandlerFluent<A extends V1LifecycleHandlerFluent<A>> extends BaseFluent<A>{
  public V1LifecycleHandlerFluent() {
  }
  
  public V1LifecycleHandlerFluent(V1LifecycleHandler instance) {
    this.copyInstance(instance);
  }
  private V1ExecActionBuilder exec;
  private V1HTTPGetActionBuilder httpGet;
  private V1SleepActionBuilder sleep;
  private V1TCPSocketActionBuilder tcpSocket;
  
  protected void copyInstance(V1LifecycleHandler instance) {
    instance = (instance != null ? instance : new V1LifecycleHandler());
    if (instance != null) {
          this.withExec(instance.getExec());
          this.withHttpGet(instance.getHttpGet());
          this.withSleep(instance.getSleep());
          this.withTcpSocket(instance.getTcpSocket());
        }
  }
  
  public V1ExecAction buildExec() {
    return this.exec != null ? this.exec.build() : null;
  }
  
  public A withExec(V1ExecAction exec) {
    this._visitables.remove("exec");
    if (exec != null) {
        this.exec = new V1ExecActionBuilder(exec);
        this._visitables.get("exec").add(this.exec);
    } else {
        this.exec = null;
        this._visitables.get("exec").remove(this.exec);
    }
    return (A) this;
  }
  
  public boolean hasExec() {
    return this.exec != null;
  }
  
  public ExecNested<A> withNewExec() {
    return new ExecNested(null);
  }
  
  public ExecNested<A> withNewExecLike(V1ExecAction item) {
    return new ExecNested(item);
  }
  
  public ExecNested<A> editExec() {
    return withNewExecLike(java.util.Optional.ofNullable(buildExec()).orElse(null));
  }
  
  public ExecNested<A> editOrNewExec() {
    return withNewExecLike(java.util.Optional.ofNullable(buildExec()).orElse(new V1ExecActionBuilder().build()));
  }
  
  public ExecNested<A> editOrNewExecLike(V1ExecAction item) {
    return withNewExecLike(java.util.Optional.ofNullable(buildExec()).orElse(item));
  }
  
  public V1HTTPGetAction buildHttpGet() {
    return this.httpGet != null ? this.httpGet.build() : null;
  }
  
  public A withHttpGet(V1HTTPGetAction httpGet) {
    this._visitables.remove("httpGet");
    if (httpGet != null) {
        this.httpGet = new V1HTTPGetActionBuilder(httpGet);
        this._visitables.get("httpGet").add(this.httpGet);
    } else {
        this.httpGet = null;
        this._visitables.get("httpGet").remove(this.httpGet);
    }
    return (A) this;
  }
  
  public boolean hasHttpGet() {
    return this.httpGet != null;
  }
  
  public HttpGetNested<A> withNewHttpGet() {
    return new HttpGetNested(null);
  }
  
  public HttpGetNested<A> withNewHttpGetLike(V1HTTPGetAction item) {
    return new HttpGetNested(item);
  }
  
  public HttpGetNested<A> editHttpGet() {
    return withNewHttpGetLike(java.util.Optional.ofNullable(buildHttpGet()).orElse(null));
  }
  
  public HttpGetNested<A> editOrNewHttpGet() {
    return withNewHttpGetLike(java.util.Optional.ofNullable(buildHttpGet()).orElse(new V1HTTPGetActionBuilder().build()));
  }
  
  public HttpGetNested<A> editOrNewHttpGetLike(V1HTTPGetAction item) {
    return withNewHttpGetLike(java.util.Optional.ofNullable(buildHttpGet()).orElse(item));
  }
  
  public V1SleepAction buildSleep() {
    return this.sleep != null ? this.sleep.build() : null;
  }
  
  public A withSleep(V1SleepAction sleep) {
    this._visitables.remove("sleep");
    if (sleep != null) {
        this.sleep = new V1SleepActionBuilder(sleep);
        this._visitables.get("sleep").add(this.sleep);
    } else {
        this.sleep = null;
        this._visitables.get("sleep").remove(this.sleep);
    }
    return (A) this;
  }
  
  public boolean hasSleep() {
    return this.sleep != null;
  }
  
  public SleepNested<A> withNewSleep() {
    return new SleepNested(null);
  }
  
  public SleepNested<A> withNewSleepLike(V1SleepAction item) {
    return new SleepNested(item);
  }
  
  public SleepNested<A> editSleep() {
    return withNewSleepLike(java.util.Optional.ofNullable(buildSleep()).orElse(null));
  }
  
  public SleepNested<A> editOrNewSleep() {
    return withNewSleepLike(java.util.Optional.ofNullable(buildSleep()).orElse(new V1SleepActionBuilder().build()));
  }
  
  public SleepNested<A> editOrNewSleepLike(V1SleepAction item) {
    return withNewSleepLike(java.util.Optional.ofNullable(buildSleep()).orElse(item));
  }
  
  public V1TCPSocketAction buildTcpSocket() {
    return this.tcpSocket != null ? this.tcpSocket.build() : null;
  }
  
  public A withTcpSocket(V1TCPSocketAction tcpSocket) {
    this._visitables.remove("tcpSocket");
    if (tcpSocket != null) {
        this.tcpSocket = new V1TCPSocketActionBuilder(tcpSocket);
        this._visitables.get("tcpSocket").add(this.tcpSocket);
    } else {
        this.tcpSocket = null;
        this._visitables.get("tcpSocket").remove(this.tcpSocket);
    }
    return (A) this;
  }
  
  public boolean hasTcpSocket() {
    return this.tcpSocket != null;
  }
  
  public TcpSocketNested<A> withNewTcpSocket() {
    return new TcpSocketNested(null);
  }
  
  public TcpSocketNested<A> withNewTcpSocketLike(V1TCPSocketAction item) {
    return new TcpSocketNested(item);
  }
  
  public TcpSocketNested<A> editTcpSocket() {
    return withNewTcpSocketLike(java.util.Optional.ofNullable(buildTcpSocket()).orElse(null));
  }
  
  public TcpSocketNested<A> editOrNewTcpSocket() {
    return withNewTcpSocketLike(java.util.Optional.ofNullable(buildTcpSocket()).orElse(new V1TCPSocketActionBuilder().build()));
  }
  
  public TcpSocketNested<A> editOrNewTcpSocketLike(V1TCPSocketAction item) {
    return withNewTcpSocketLike(java.util.Optional.ofNullable(buildTcpSocket()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1LifecycleHandlerFluent that = (V1LifecycleHandlerFluent) o;
    if (!java.util.Objects.equals(exec, that.exec)) return false;
    if (!java.util.Objects.equals(httpGet, that.httpGet)) return false;
    if (!java.util.Objects.equals(sleep, that.sleep)) return false;
    if (!java.util.Objects.equals(tcpSocket, that.tcpSocket)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(exec,  httpGet,  sleep,  tcpSocket,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (exec != null) { sb.append("exec:"); sb.append(exec + ","); }
    if (httpGet != null) { sb.append("httpGet:"); sb.append(httpGet + ","); }
    if (sleep != null) { sb.append("sleep:"); sb.append(sleep + ","); }
    if (tcpSocket != null) { sb.append("tcpSocket:"); sb.append(tcpSocket); }
    sb.append("}");
    return sb.toString();
  }
  public class ExecNested<N> extends V1ExecActionFluent<ExecNested<N>> implements Nested<N>{
    ExecNested(V1ExecAction item) {
      this.builder = new V1ExecActionBuilder(this, item);
    }
    V1ExecActionBuilder builder;
    
    public N and() {
      return (N) V1LifecycleHandlerFluent.this.withExec(builder.build());
    }
    
    public N endExec() {
      return and();
    }
    
  
  }
  public class HttpGetNested<N> extends V1HTTPGetActionFluent<HttpGetNested<N>> implements Nested<N>{
    HttpGetNested(V1HTTPGetAction item) {
      this.builder = new V1HTTPGetActionBuilder(this, item);
    }
    V1HTTPGetActionBuilder builder;
    
    public N and() {
      return (N) V1LifecycleHandlerFluent.this.withHttpGet(builder.build());
    }
    
    public N endHttpGet() {
      return and();
    }
    
  
  }
  public class SleepNested<N> extends V1SleepActionFluent<SleepNested<N>> implements Nested<N>{
    SleepNested(V1SleepAction item) {
      this.builder = new V1SleepActionBuilder(this, item);
    }
    V1SleepActionBuilder builder;
    
    public N and() {
      return (N) V1LifecycleHandlerFluent.this.withSleep(builder.build());
    }
    
    public N endSleep() {
      return and();
    }
    
  
  }
  public class TcpSocketNested<N> extends V1TCPSocketActionFluent<TcpSocketNested<N>> implements Nested<N>{
    TcpSocketNested(V1TCPSocketAction item) {
      this.builder = new V1TCPSocketActionBuilder(this, item);
    }
    V1TCPSocketActionBuilder builder;
    
    public N and() {
      return (N) V1LifecycleHandlerFluent.this.withTcpSocket(builder.build());
    }
    
    public N endTcpSocket() {
      return and();
    }
    
  
  }

}
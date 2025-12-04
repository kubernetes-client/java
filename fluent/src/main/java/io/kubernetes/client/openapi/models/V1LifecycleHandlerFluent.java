package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1LifecycleHandlerFluent<A extends io.kubernetes.client.openapi.models.V1LifecycleHandlerFluent<A>> extends BaseFluent<A>{

  private V1ExecActionBuilder exec;
  private V1HTTPGetActionBuilder httpGet;
  private V1SleepActionBuilder sleep;
  private V1TCPSocketActionBuilder tcpSocket;

  public V1LifecycleHandlerFluent() {
  }
  
  public V1LifecycleHandlerFluent(V1LifecycleHandler instance) {
    this.copyInstance(instance);
  }

  public V1ExecAction buildExec() {
    return this.exec != null ? this.exec.build() : null;
  }
  
  public V1HTTPGetAction buildHttpGet() {
    return this.httpGet != null ? this.httpGet.build() : null;
  }
  
  public V1SleepAction buildSleep() {
    return this.sleep != null ? this.sleep.build() : null;
  }
  
  public V1TCPSocketAction buildTcpSocket() {
    return this.tcpSocket != null ? this.tcpSocket.build() : null;
  }
  
  protected void copyInstance(V1LifecycleHandler instance) {
    instance = instance != null ? instance : new V1LifecycleHandler();
    if (instance != null) {
        this.withExec(instance.getExec());
        this.withHttpGet(instance.getHttpGet());
        this.withSleep(instance.getSleep());
        this.withTcpSocket(instance.getTcpSocket());
    }
  }
  
  public ExecNested<A> editExec() {
    return this.withNewExecLike(Optional.ofNullable(this.buildExec()).orElse(null));
  }
  
  public HttpGetNested<A> editHttpGet() {
    return this.withNewHttpGetLike(Optional.ofNullable(this.buildHttpGet()).orElse(null));
  }
  
  public ExecNested<A> editOrNewExec() {
    return this.withNewExecLike(Optional.ofNullable(this.buildExec()).orElse(new V1ExecActionBuilder().build()));
  }
  
  public ExecNested<A> editOrNewExecLike(V1ExecAction item) {
    return this.withNewExecLike(Optional.ofNullable(this.buildExec()).orElse(item));
  }
  
  public HttpGetNested<A> editOrNewHttpGet() {
    return this.withNewHttpGetLike(Optional.ofNullable(this.buildHttpGet()).orElse(new V1HTTPGetActionBuilder().build()));
  }
  
  public HttpGetNested<A> editOrNewHttpGetLike(V1HTTPGetAction item) {
    return this.withNewHttpGetLike(Optional.ofNullable(this.buildHttpGet()).orElse(item));
  }
  
  public SleepNested<A> editOrNewSleep() {
    return this.withNewSleepLike(Optional.ofNullable(this.buildSleep()).orElse(new V1SleepActionBuilder().build()));
  }
  
  public SleepNested<A> editOrNewSleepLike(V1SleepAction item) {
    return this.withNewSleepLike(Optional.ofNullable(this.buildSleep()).orElse(item));
  }
  
  public TcpSocketNested<A> editOrNewTcpSocket() {
    return this.withNewTcpSocketLike(Optional.ofNullable(this.buildTcpSocket()).orElse(new V1TCPSocketActionBuilder().build()));
  }
  
  public TcpSocketNested<A> editOrNewTcpSocketLike(V1TCPSocketAction item) {
    return this.withNewTcpSocketLike(Optional.ofNullable(this.buildTcpSocket()).orElse(item));
  }
  
  public SleepNested<A> editSleep() {
    return this.withNewSleepLike(Optional.ofNullable(this.buildSleep()).orElse(null));
  }
  
  public TcpSocketNested<A> editTcpSocket() {
    return this.withNewTcpSocketLike(Optional.ofNullable(this.buildTcpSocket()).orElse(null));
  }
  
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }
    if (!(super.equals(o))) {
      return false;
    }
    V1LifecycleHandlerFluent that = (V1LifecycleHandlerFluent) o;
    if (!(Objects.equals(exec, that.exec))) {
      return false;
    }
    if (!(Objects.equals(httpGet, that.httpGet))) {
      return false;
    }
    if (!(Objects.equals(sleep, that.sleep))) {
      return false;
    }
    if (!(Objects.equals(tcpSocket, that.tcpSocket))) {
      return false;
    }
    return true;
  }
  
  public boolean hasExec() {
    return this.exec != null;
  }
  
  public boolean hasHttpGet() {
    return this.httpGet != null;
  }
  
  public boolean hasSleep() {
    return this.sleep != null;
  }
  
  public boolean hasTcpSocket() {
    return this.tcpSocket != null;
  }
  
  public int hashCode() {
    return Objects.hash(exec, httpGet, sleep, tcpSocket);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(exec == null)) {
        sb.append("exec:");
        sb.append(exec);
        sb.append(",");
    }
    if (!(httpGet == null)) {
        sb.append("httpGet:");
        sb.append(httpGet);
        sb.append(",");
    }
    if (!(sleep == null)) {
        sb.append("sleep:");
        sb.append(sleep);
        sb.append(",");
    }
    if (!(tcpSocket == null)) {
        sb.append("tcpSocket:");
        sb.append(tcpSocket);
    }
    sb.append("}");
    return sb.toString();
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
  
  public ExecNested<A> withNewExec() {
    return new ExecNested(null);
  }
  
  public ExecNested<A> withNewExecLike(V1ExecAction item) {
    return new ExecNested(item);
  }
  
  public HttpGetNested<A> withNewHttpGet() {
    return new HttpGetNested(null);
  }
  
  public HttpGetNested<A> withNewHttpGetLike(V1HTTPGetAction item) {
    return new HttpGetNested(item);
  }
  
  public SleepNested<A> withNewSleep() {
    return new SleepNested(null);
  }
  
  public SleepNested<A> withNewSleepLike(V1SleepAction item) {
    return new SleepNested(item);
  }
  
  public TcpSocketNested<A> withNewTcpSocket() {
    return new TcpSocketNested(null);
  }
  
  public TcpSocketNested<A> withNewTcpSocketLike(V1TCPSocketAction item) {
    return new TcpSocketNested(item);
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
  public class ExecNested<N> extends V1ExecActionFluent<ExecNested<N>> implements Nested<N>{
  
    V1ExecActionBuilder builder;
  
    ExecNested(V1ExecAction item) {
      this.builder = new V1ExecActionBuilder(this, item);
    }
  
    public N and() {
      return (N) V1LifecycleHandlerFluent.this.withExec(builder.build());
    }
    
    public N endExec() {
      return and();
    }
    
  }
  public class HttpGetNested<N> extends V1HTTPGetActionFluent<HttpGetNested<N>> implements Nested<N>{
  
    V1HTTPGetActionBuilder builder;
  
    HttpGetNested(V1HTTPGetAction item) {
      this.builder = new V1HTTPGetActionBuilder(this, item);
    }
  
    public N and() {
      return (N) V1LifecycleHandlerFluent.this.withHttpGet(builder.build());
    }
    
    public N endHttpGet() {
      return and();
    }
    
  }
  public class SleepNested<N> extends V1SleepActionFluent<SleepNested<N>> implements Nested<N>{
  
    V1SleepActionBuilder builder;
  
    SleepNested(V1SleepAction item) {
      this.builder = new V1SleepActionBuilder(this, item);
    }
  
    public N and() {
      return (N) V1LifecycleHandlerFluent.this.withSleep(builder.build());
    }
    
    public N endSleep() {
      return and();
    }
    
  }
  public class TcpSocketNested<N> extends V1TCPSocketActionFluent<TcpSocketNested<N>> implements Nested<N>{
  
    V1TCPSocketActionBuilder builder;
  
    TcpSocketNested(V1TCPSocketAction item) {
      this.builder = new V1TCPSocketActionBuilder(this, item);
    }
  
    public N and() {
      return (N) V1LifecycleHandlerFluent.this.withTcpSocket(builder.build());
    }
    
    public N endTcpSocket() {
      return and();
    }
    
  }
}
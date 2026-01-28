package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Integer;
import java.lang.Long;
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
public class V1ProbeFluent<A extends io.kubernetes.client.openapi.models.V1ProbeFluent<A>> extends BaseFluent<A>{

  private V1ExecActionBuilder exec;
  private Integer failureThreshold;
  private V1GRPCActionBuilder grpc;
  private V1HTTPGetActionBuilder httpGet;
  private Integer initialDelaySeconds;
  private Integer periodSeconds;
  private Integer successThreshold;
  private V1TCPSocketActionBuilder tcpSocket;
  private Long terminationGracePeriodSeconds;
  private Integer timeoutSeconds;

  public V1ProbeFluent() {
  }
  
  public V1ProbeFluent(V1Probe instance) {
    this.copyInstance(instance);
  }

  public V1ExecAction buildExec() {
    return this.exec != null ? this.exec.build() : null;
  }
  
  public V1GRPCAction buildGrpc() {
    return this.grpc != null ? this.grpc.build() : null;
  }
  
  public V1HTTPGetAction buildHttpGet() {
    return this.httpGet != null ? this.httpGet.build() : null;
  }
  
  public V1TCPSocketAction buildTcpSocket() {
    return this.tcpSocket != null ? this.tcpSocket.build() : null;
  }
  
  protected void copyInstance(V1Probe instance) {
    instance = instance != null ? instance : new V1Probe();
    if (instance != null) {
        this.withExec(instance.getExec());
        this.withFailureThreshold(instance.getFailureThreshold());
        this.withGrpc(instance.getGrpc());
        this.withHttpGet(instance.getHttpGet());
        this.withInitialDelaySeconds(instance.getInitialDelaySeconds());
        this.withPeriodSeconds(instance.getPeriodSeconds());
        this.withSuccessThreshold(instance.getSuccessThreshold());
        this.withTcpSocket(instance.getTcpSocket());
        this.withTerminationGracePeriodSeconds(instance.getTerminationGracePeriodSeconds());
        this.withTimeoutSeconds(instance.getTimeoutSeconds());
    }
  }
  
  public ExecNested<A> editExec() {
    return this.withNewExecLike(Optional.ofNullable(this.buildExec()).orElse(null));
  }
  
  public GrpcNested<A> editGrpc() {
    return this.withNewGrpcLike(Optional.ofNullable(this.buildGrpc()).orElse(null));
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
  
  public GrpcNested<A> editOrNewGrpc() {
    return this.withNewGrpcLike(Optional.ofNullable(this.buildGrpc()).orElse(new V1GRPCActionBuilder().build()));
  }
  
  public GrpcNested<A> editOrNewGrpcLike(V1GRPCAction item) {
    return this.withNewGrpcLike(Optional.ofNullable(this.buildGrpc()).orElse(item));
  }
  
  public HttpGetNested<A> editOrNewHttpGet() {
    return this.withNewHttpGetLike(Optional.ofNullable(this.buildHttpGet()).orElse(new V1HTTPGetActionBuilder().build()));
  }
  
  public HttpGetNested<A> editOrNewHttpGetLike(V1HTTPGetAction item) {
    return this.withNewHttpGetLike(Optional.ofNullable(this.buildHttpGet()).orElse(item));
  }
  
  public TcpSocketNested<A> editOrNewTcpSocket() {
    return this.withNewTcpSocketLike(Optional.ofNullable(this.buildTcpSocket()).orElse(new V1TCPSocketActionBuilder().build()));
  }
  
  public TcpSocketNested<A> editOrNewTcpSocketLike(V1TCPSocketAction item) {
    return this.withNewTcpSocketLike(Optional.ofNullable(this.buildTcpSocket()).orElse(item));
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
    V1ProbeFluent that = (V1ProbeFluent) o;
    if (!(Objects.equals(exec, that.exec))) {
      return false;
    }
    if (!(Objects.equals(failureThreshold, that.failureThreshold))) {
      return false;
    }
    if (!(Objects.equals(grpc, that.grpc))) {
      return false;
    }
    if (!(Objects.equals(httpGet, that.httpGet))) {
      return false;
    }
    if (!(Objects.equals(initialDelaySeconds, that.initialDelaySeconds))) {
      return false;
    }
    if (!(Objects.equals(periodSeconds, that.periodSeconds))) {
      return false;
    }
    if (!(Objects.equals(successThreshold, that.successThreshold))) {
      return false;
    }
    if (!(Objects.equals(tcpSocket, that.tcpSocket))) {
      return false;
    }
    if (!(Objects.equals(terminationGracePeriodSeconds, that.terminationGracePeriodSeconds))) {
      return false;
    }
    if (!(Objects.equals(timeoutSeconds, that.timeoutSeconds))) {
      return false;
    }
    return true;
  }
  
  public Integer getFailureThreshold() {
    return this.failureThreshold;
  }
  
  public Integer getInitialDelaySeconds() {
    return this.initialDelaySeconds;
  }
  
  public Integer getPeriodSeconds() {
    return this.periodSeconds;
  }
  
  public Integer getSuccessThreshold() {
    return this.successThreshold;
  }
  
  public Long getTerminationGracePeriodSeconds() {
    return this.terminationGracePeriodSeconds;
  }
  
  public Integer getTimeoutSeconds() {
    return this.timeoutSeconds;
  }
  
  public boolean hasExec() {
    return this.exec != null;
  }
  
  public boolean hasFailureThreshold() {
    return this.failureThreshold != null;
  }
  
  public boolean hasGrpc() {
    return this.grpc != null;
  }
  
  public boolean hasHttpGet() {
    return this.httpGet != null;
  }
  
  public boolean hasInitialDelaySeconds() {
    return this.initialDelaySeconds != null;
  }
  
  public boolean hasPeriodSeconds() {
    return this.periodSeconds != null;
  }
  
  public boolean hasSuccessThreshold() {
    return this.successThreshold != null;
  }
  
  public boolean hasTcpSocket() {
    return this.tcpSocket != null;
  }
  
  public boolean hasTerminationGracePeriodSeconds() {
    return this.terminationGracePeriodSeconds != null;
  }
  
  public boolean hasTimeoutSeconds() {
    return this.timeoutSeconds != null;
  }
  
  public int hashCode() {
    return Objects.hash(exec, failureThreshold, grpc, httpGet, initialDelaySeconds, periodSeconds, successThreshold, tcpSocket, terminationGracePeriodSeconds, timeoutSeconds);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(exec == null)) {
        sb.append("exec:");
        sb.append(exec);
        sb.append(",");
    }
    if (!(failureThreshold == null)) {
        sb.append("failureThreshold:");
        sb.append(failureThreshold);
        sb.append(",");
    }
    if (!(grpc == null)) {
        sb.append("grpc:");
        sb.append(grpc);
        sb.append(",");
    }
    if (!(httpGet == null)) {
        sb.append("httpGet:");
        sb.append(httpGet);
        sb.append(",");
    }
    if (!(initialDelaySeconds == null)) {
        sb.append("initialDelaySeconds:");
        sb.append(initialDelaySeconds);
        sb.append(",");
    }
    if (!(periodSeconds == null)) {
        sb.append("periodSeconds:");
        sb.append(periodSeconds);
        sb.append(",");
    }
    if (!(successThreshold == null)) {
        sb.append("successThreshold:");
        sb.append(successThreshold);
        sb.append(",");
    }
    if (!(tcpSocket == null)) {
        sb.append("tcpSocket:");
        sb.append(tcpSocket);
        sb.append(",");
    }
    if (!(terminationGracePeriodSeconds == null)) {
        sb.append("terminationGracePeriodSeconds:");
        sb.append(terminationGracePeriodSeconds);
        sb.append(",");
    }
    if (!(timeoutSeconds == null)) {
        sb.append("timeoutSeconds:");
        sb.append(timeoutSeconds);
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
  
  public A withFailureThreshold(Integer failureThreshold) {
    this.failureThreshold = failureThreshold;
    return (A) this;
  }
  
  public A withGrpc(V1GRPCAction grpc) {
    this._visitables.remove("grpc");
    if (grpc != null) {
        this.grpc = new V1GRPCActionBuilder(grpc);
        this._visitables.get("grpc").add(this.grpc);
    } else {
        this.grpc = null;
        this._visitables.get("grpc").remove(this.grpc);
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
  
  public A withInitialDelaySeconds(Integer initialDelaySeconds) {
    this.initialDelaySeconds = initialDelaySeconds;
    return (A) this;
  }
  
  public ExecNested<A> withNewExec() {
    return new ExecNested(null);
  }
  
  public ExecNested<A> withNewExecLike(V1ExecAction item) {
    return new ExecNested(item);
  }
  
  public GrpcNested<A> withNewGrpc() {
    return new GrpcNested(null);
  }
  
  public GrpcNested<A> withNewGrpcLike(V1GRPCAction item) {
    return new GrpcNested(item);
  }
  
  public HttpGetNested<A> withNewHttpGet() {
    return new HttpGetNested(null);
  }
  
  public HttpGetNested<A> withNewHttpGetLike(V1HTTPGetAction item) {
    return new HttpGetNested(item);
  }
  
  public TcpSocketNested<A> withNewTcpSocket() {
    return new TcpSocketNested(null);
  }
  
  public TcpSocketNested<A> withNewTcpSocketLike(V1TCPSocketAction item) {
    return new TcpSocketNested(item);
  }
  
  public A withPeriodSeconds(Integer periodSeconds) {
    this.periodSeconds = periodSeconds;
    return (A) this;
  }
  
  public A withSuccessThreshold(Integer successThreshold) {
    this.successThreshold = successThreshold;
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
  
  public A withTerminationGracePeriodSeconds(Long terminationGracePeriodSeconds) {
    this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
    return (A) this;
  }
  
  public A withTimeoutSeconds(Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
    return (A) this;
  }
  public class ExecNested<N> extends V1ExecActionFluent<ExecNested<N>> implements Nested<N>{
  
    V1ExecActionBuilder builder;
  
    ExecNested(V1ExecAction item) {
      this.builder = new V1ExecActionBuilder(this, item);
    }
  
    public N and() {
      return (N) V1ProbeFluent.this.withExec(builder.build());
    }
    
    public N endExec() {
      return and();
    }
    
  }
  public class GrpcNested<N> extends V1GRPCActionFluent<GrpcNested<N>> implements Nested<N>{
  
    V1GRPCActionBuilder builder;
  
    GrpcNested(V1GRPCAction item) {
      this.builder = new V1GRPCActionBuilder(this, item);
    }
  
    public N and() {
      return (N) V1ProbeFluent.this.withGrpc(builder.build());
    }
    
    public N endGrpc() {
      return and();
    }
    
  }
  public class HttpGetNested<N> extends V1HTTPGetActionFluent<HttpGetNested<N>> implements Nested<N>{
  
    V1HTTPGetActionBuilder builder;
  
    HttpGetNested(V1HTTPGetAction item) {
      this.builder = new V1HTTPGetActionBuilder(this, item);
    }
  
    public N and() {
      return (N) V1ProbeFluent.this.withHttpGet(builder.build());
    }
    
    public N endHttpGet() {
      return and();
    }
    
  }
  public class TcpSocketNested<N> extends V1TCPSocketActionFluent<TcpSocketNested<N>> implements Nested<N>{
  
    V1TCPSocketActionBuilder builder;
  
    TcpSocketNested(V1TCPSocketAction item) {
      this.builder = new V1TCPSocketActionBuilder(this, item);
    }
  
    public N and() {
      return (N) V1ProbeFluent.this.withTcpSocket(builder.build());
    }
    
    public N endTcpSocket() {
      return and();
    }
    
  }
}
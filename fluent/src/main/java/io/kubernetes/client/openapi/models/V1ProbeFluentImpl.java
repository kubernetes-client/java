package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1ProbeFluentImpl<A extends V1ProbeFluent<A>> extends BaseFluent<A> implements V1ProbeFluent<A>{
  public V1ProbeFluentImpl() {
  }
  public V1ProbeFluentImpl(V1Probe instance) {
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
  public V1ProbeFluent.ExecNested<A> withNewExec() {
    return new V1ProbeFluentImpl.ExecNestedImpl();
  }
  public V1ProbeFluent.ExecNested<A> withNewExecLike(V1ExecAction item) {
    return new V1ProbeFluentImpl.ExecNestedImpl(item);
  }
  public V1ProbeFluent.ExecNested<A> editExec() {
    return withNewExecLike(getExec());
  }
  public V1ProbeFluent.ExecNested<A> editOrNewExec() {
    return withNewExecLike(getExec() != null ? getExec(): new V1ExecActionBuilder().build());
  }
  public V1ProbeFluent.ExecNested<A> editOrNewExecLike(V1ExecAction item) {
    return withNewExecLike(getExec() != null ? getExec(): item);
  }
  public Integer getFailureThreshold() {
    return this.failureThreshold;
  }
  public A withFailureThreshold(Integer failureThreshold) {
    this.failureThreshold=failureThreshold; return (A) this;
  }
  public Boolean hasFailureThreshold() {
    return this.failureThreshold != null;
  }
  
  /**
   * This method has been deprecated, please use method buildGrpc instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1GRPCAction getGrpc() {
    return this.grpc!=null ?this.grpc.build():null;
  }
  public V1GRPCAction buildGrpc() {
    return this.grpc!=null ?this.grpc.build():null;
  }
  public A withGrpc(V1GRPCAction grpc) {
    _visitables.get("grpc").remove(this.grpc);
    if (grpc!=null){ this.grpc= new V1GRPCActionBuilder(grpc); _visitables.get("grpc").add(this.grpc);} else { this.grpc = null; _visitables.get("grpc").remove(this.grpc); } return (A) this;
  }
  public Boolean hasGrpc() {
    return this.grpc != null;
  }
  public V1ProbeFluent.GrpcNested<A> withNewGrpc() {
    return new V1ProbeFluentImpl.GrpcNestedImpl();
  }
  public V1ProbeFluent.GrpcNested<A> withNewGrpcLike(V1GRPCAction item) {
    return new V1ProbeFluentImpl.GrpcNestedImpl(item);
  }
  public V1ProbeFluent.GrpcNested<A> editGrpc() {
    return withNewGrpcLike(getGrpc());
  }
  public V1ProbeFluent.GrpcNested<A> editOrNewGrpc() {
    return withNewGrpcLike(getGrpc() != null ? getGrpc(): new V1GRPCActionBuilder().build());
  }
  public V1ProbeFluent.GrpcNested<A> editOrNewGrpcLike(V1GRPCAction item) {
    return withNewGrpcLike(getGrpc() != null ? getGrpc(): item);
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
  public V1ProbeFluent.HttpGetNested<A> withNewHttpGet() {
    return new V1ProbeFluentImpl.HttpGetNestedImpl();
  }
  public V1ProbeFluent.HttpGetNested<A> withNewHttpGetLike(V1HTTPGetAction item) {
    return new V1ProbeFluentImpl.HttpGetNestedImpl(item);
  }
  public V1ProbeFluent.HttpGetNested<A> editHttpGet() {
    return withNewHttpGetLike(getHttpGet());
  }
  public V1ProbeFluent.HttpGetNested<A> editOrNewHttpGet() {
    return withNewHttpGetLike(getHttpGet() != null ? getHttpGet(): new V1HTTPGetActionBuilder().build());
  }
  public V1ProbeFluent.HttpGetNested<A> editOrNewHttpGetLike(V1HTTPGetAction item) {
    return withNewHttpGetLike(getHttpGet() != null ? getHttpGet(): item);
  }
  public Integer getInitialDelaySeconds() {
    return this.initialDelaySeconds;
  }
  public A withInitialDelaySeconds(Integer initialDelaySeconds) {
    this.initialDelaySeconds=initialDelaySeconds; return (A) this;
  }
  public Boolean hasInitialDelaySeconds() {
    return this.initialDelaySeconds != null;
  }
  public Integer getPeriodSeconds() {
    return this.periodSeconds;
  }
  public A withPeriodSeconds(Integer periodSeconds) {
    this.periodSeconds=periodSeconds; return (A) this;
  }
  public Boolean hasPeriodSeconds() {
    return this.periodSeconds != null;
  }
  public Integer getSuccessThreshold() {
    return this.successThreshold;
  }
  public A withSuccessThreshold(Integer successThreshold) {
    this.successThreshold=successThreshold; return (A) this;
  }
  public Boolean hasSuccessThreshold() {
    return this.successThreshold != null;
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
  public V1ProbeFluent.TcpSocketNested<A> withNewTcpSocket() {
    return new V1ProbeFluentImpl.TcpSocketNestedImpl();
  }
  public V1ProbeFluent.TcpSocketNested<A> withNewTcpSocketLike(V1TCPSocketAction item) {
    return new V1ProbeFluentImpl.TcpSocketNestedImpl(item);
  }
  public V1ProbeFluent.TcpSocketNested<A> editTcpSocket() {
    return withNewTcpSocketLike(getTcpSocket());
  }
  public V1ProbeFluent.TcpSocketNested<A> editOrNewTcpSocket() {
    return withNewTcpSocketLike(getTcpSocket() != null ? getTcpSocket(): new V1TCPSocketActionBuilder().build());
  }
  public V1ProbeFluent.TcpSocketNested<A> editOrNewTcpSocketLike(V1TCPSocketAction item) {
    return withNewTcpSocketLike(getTcpSocket() != null ? getTcpSocket(): item);
  }
  public Long getTerminationGracePeriodSeconds() {
    return this.terminationGracePeriodSeconds;
  }
  public A withTerminationGracePeriodSeconds(Long terminationGracePeriodSeconds) {
    this.terminationGracePeriodSeconds=terminationGracePeriodSeconds; return (A) this;
  }
  public Boolean hasTerminationGracePeriodSeconds() {
    return this.terminationGracePeriodSeconds != null;
  }
  public Integer getTimeoutSeconds() {
    return this.timeoutSeconds;
  }
  public A withTimeoutSeconds(Integer timeoutSeconds) {
    this.timeoutSeconds=timeoutSeconds; return (A) this;
  }
  public Boolean hasTimeoutSeconds() {
    return this.timeoutSeconds != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ProbeFluentImpl that = (V1ProbeFluentImpl) o;
    if (exec != null ? !exec.equals(that.exec) :that.exec != null) return false;
    if (failureThreshold != null ? !failureThreshold.equals(that.failureThreshold) :that.failureThreshold != null) return false;
    if (grpc != null ? !grpc.equals(that.grpc) :that.grpc != null) return false;
    if (httpGet != null ? !httpGet.equals(that.httpGet) :that.httpGet != null) return false;
    if (initialDelaySeconds != null ? !initialDelaySeconds.equals(that.initialDelaySeconds) :that.initialDelaySeconds != null) return false;
    if (periodSeconds != null ? !periodSeconds.equals(that.periodSeconds) :that.periodSeconds != null) return false;
    if (successThreshold != null ? !successThreshold.equals(that.successThreshold) :that.successThreshold != null) return false;
    if (tcpSocket != null ? !tcpSocket.equals(that.tcpSocket) :that.tcpSocket != null) return false;
    if (terminationGracePeriodSeconds != null ? !terminationGracePeriodSeconds.equals(that.terminationGracePeriodSeconds) :that.terminationGracePeriodSeconds != null) return false;
    if (timeoutSeconds != null ? !timeoutSeconds.equals(that.timeoutSeconds) :that.timeoutSeconds != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(exec,  failureThreshold,  grpc,  httpGet,  initialDelaySeconds,  periodSeconds,  successThreshold,  tcpSocket,  terminationGracePeriodSeconds,  timeoutSeconds,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (exec != null) { sb.append("exec:"); sb.append(exec + ","); }
    if (failureThreshold != null) { sb.append("failureThreshold:"); sb.append(failureThreshold + ","); }
    if (grpc != null) { sb.append("grpc:"); sb.append(grpc + ","); }
    if (httpGet != null) { sb.append("httpGet:"); sb.append(httpGet + ","); }
    if (initialDelaySeconds != null) { sb.append("initialDelaySeconds:"); sb.append(initialDelaySeconds + ","); }
    if (periodSeconds != null) { sb.append("periodSeconds:"); sb.append(periodSeconds + ","); }
    if (successThreshold != null) { sb.append("successThreshold:"); sb.append(successThreshold + ","); }
    if (tcpSocket != null) { sb.append("tcpSocket:"); sb.append(tcpSocket + ","); }
    if (terminationGracePeriodSeconds != null) { sb.append("terminationGracePeriodSeconds:"); sb.append(terminationGracePeriodSeconds + ","); }
    if (timeoutSeconds != null) { sb.append("timeoutSeconds:"); sb.append(timeoutSeconds); }
    sb.append("}");
    return sb.toString();
  }
  class ExecNestedImpl<N> extends V1ExecActionFluentImpl<V1ProbeFluent.ExecNested<N>> implements V1ProbeFluent.ExecNested<N>,Nested<N>{
    ExecNestedImpl(V1ExecAction item) {
      this.builder = new V1ExecActionBuilder(this, item);
    }
    ExecNestedImpl() {
      this.builder = new V1ExecActionBuilder(this);
    }
    V1ExecActionBuilder builder;
    public N and() {
      return (N) V1ProbeFluentImpl.this.withExec(builder.build());
    }
    public N endExec() {
      return and();
    }
    
  }
  class GrpcNestedImpl<N> extends V1GRPCActionFluentImpl<V1ProbeFluent.GrpcNested<N>> implements V1ProbeFluent.GrpcNested<N>,Nested<N>{
    GrpcNestedImpl(V1GRPCAction item) {
      this.builder = new V1GRPCActionBuilder(this, item);
    }
    GrpcNestedImpl() {
      this.builder = new V1GRPCActionBuilder(this);
    }
    V1GRPCActionBuilder builder;
    public N and() {
      return (N) V1ProbeFluentImpl.this.withGrpc(builder.build());
    }
    public N endGrpc() {
      return and();
    }
    
  }
  class HttpGetNestedImpl<N> extends V1HTTPGetActionFluentImpl<V1ProbeFluent.HttpGetNested<N>> implements V1ProbeFluent.HttpGetNested<N>,Nested<N>{
    HttpGetNestedImpl(V1HTTPGetAction item) {
      this.builder = new V1HTTPGetActionBuilder(this, item);
    }
    HttpGetNestedImpl() {
      this.builder = new V1HTTPGetActionBuilder(this);
    }
    V1HTTPGetActionBuilder builder;
    public N and() {
      return (N) V1ProbeFluentImpl.this.withHttpGet(builder.build());
    }
    public N endHttpGet() {
      return and();
    }
    
  }
  class TcpSocketNestedImpl<N> extends V1TCPSocketActionFluentImpl<V1ProbeFluent.TcpSocketNested<N>> implements V1ProbeFluent.TcpSocketNested<N>,Nested<N>{
    TcpSocketNestedImpl(V1TCPSocketAction item) {
      this.builder = new V1TCPSocketActionBuilder(this, item);
    }
    TcpSocketNestedImpl() {
      this.builder = new V1TCPSocketActionBuilder(this);
    }
    V1TCPSocketActionBuilder builder;
    public N and() {
      return (N) V1ProbeFluentImpl.this.withTcpSocket(builder.build());
    }
    public N endTcpSocket() {
      return and();
    }
    
  }
  
}
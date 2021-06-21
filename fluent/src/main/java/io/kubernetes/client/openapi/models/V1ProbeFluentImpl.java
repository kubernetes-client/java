package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Nested;
import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class V1ProbeFluentImpl<A extends io.kubernetes.client.openapi.models.V1ProbeFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1ProbeFluent<A> {

    private io.kubernetes.client.openapi.models.V1ExecActionBuilder exec;
    private java.lang.Integer failureThreshold;
    private io.kubernetes.client.openapi.models.V1HTTPGetActionBuilder httpGet;
    private java.lang.Integer initialDelaySeconds;
    private java.lang.Integer periodSeconds;
    private java.lang.Integer successThreshold;
    private io.kubernetes.client.openapi.models.V1TCPSocketActionBuilder tcpSocket;
    private java.lang.Integer timeoutSeconds;

    public V1ProbeFluentImpl() {
    }

    public V1ProbeFluentImpl(io.kubernetes.client.openapi.models.V1Probe instance) {
        this.withExec(instance.getExec());
        
        this.withFailureThreshold(instance.getFailureThreshold());
        
        this.withHttpGet(instance.getHttpGet());
        
        this.withInitialDelaySeconds(instance.getInitialDelaySeconds());
        
        this.withPeriodSeconds(instance.getPeriodSeconds());
        
        this.withSuccessThreshold(instance.getSuccessThreshold());
        
        this.withTcpSocket(instance.getTcpSocket());
        
        this.withTimeoutSeconds(instance.getTimeoutSeconds());
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildExec instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1ExecAction getExec() {
        return this.exec!=null?this.exec.build():null;
    }

    public io.kubernetes.client.openapi.models.V1ExecAction buildExec() {
        return this.exec!=null?this.exec.build():null;
    }

    public A withExec(io.kubernetes.client.openapi.models.V1ExecAction exec) {
        _visitables.get("exec").remove(this.exec);
        if (exec!=null){ this.exec= new io.kubernetes.client.openapi.models.V1ExecActionBuilder(exec); _visitables.get("exec").add(this.exec);} return (A) this;
    }

    public java.lang.Boolean hasExec() {
        return this.exec != null;
    }

    public io.kubernetes.client.openapi.models.V1ProbeFluent.ExecNested<A> withNewExec() {
        return new io.kubernetes.client.openapi.models.V1ProbeFluentImpl.ExecNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1ProbeFluent.ExecNested<A> withNewExecLike(io.kubernetes.client.openapi.models.V1ExecAction item) {
        return new io.kubernetes.client.openapi.models.V1ProbeFluentImpl.ExecNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V1ProbeFluent.ExecNested<A> editExec() {
        return withNewExecLike(getExec());
    }

    public io.kubernetes.client.openapi.models.V1ProbeFluent.ExecNested<A> editOrNewExec() {
        return withNewExecLike(getExec() != null ? getExec(): new io.kubernetes.client.openapi.models.V1ExecActionBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V1ProbeFluent.ExecNested<A> editOrNewExecLike(io.kubernetes.client.openapi.models.V1ExecAction item) {
        return withNewExecLike(getExec() != null ? getExec(): item);
    }

    public java.lang.Integer getFailureThreshold() {
        return this.failureThreshold;
    }

    public A withFailureThreshold(java.lang.Integer failureThreshold) {
        this.failureThreshold=failureThreshold; return (A) this;
    }

    public java.lang.Boolean hasFailureThreshold() {
        return this.failureThreshold != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildHttpGet instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1HTTPGetAction getHttpGet() {
        return this.httpGet!=null?this.httpGet.build():null;
    }

    public io.kubernetes.client.openapi.models.V1HTTPGetAction buildHttpGet() {
        return this.httpGet!=null?this.httpGet.build():null;
    }

    public A withHttpGet(io.kubernetes.client.openapi.models.V1HTTPGetAction httpGet) {
        _visitables.get("httpGet").remove(this.httpGet);
        if (httpGet!=null){ this.httpGet= new io.kubernetes.client.openapi.models.V1HTTPGetActionBuilder(httpGet); _visitables.get("httpGet").add(this.httpGet);} return (A) this;
    }

    public java.lang.Boolean hasHttpGet() {
        return this.httpGet != null;
    }

    public io.kubernetes.client.openapi.models.V1ProbeFluent.HttpGetNested<A> withNewHttpGet() {
        return new io.kubernetes.client.openapi.models.V1ProbeFluentImpl.HttpGetNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1ProbeFluent.HttpGetNested<A> withNewHttpGetLike(io.kubernetes.client.openapi.models.V1HTTPGetAction item) {
        return new io.kubernetes.client.openapi.models.V1ProbeFluentImpl.HttpGetNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V1ProbeFluent.HttpGetNested<A> editHttpGet() {
        return withNewHttpGetLike(getHttpGet());
    }

    public io.kubernetes.client.openapi.models.V1ProbeFluent.HttpGetNested<A> editOrNewHttpGet() {
        return withNewHttpGetLike(getHttpGet() != null ? getHttpGet(): new io.kubernetes.client.openapi.models.V1HTTPGetActionBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V1ProbeFluent.HttpGetNested<A> editOrNewHttpGetLike(io.kubernetes.client.openapi.models.V1HTTPGetAction item) {
        return withNewHttpGetLike(getHttpGet() != null ? getHttpGet(): item);
    }

    public java.lang.Integer getInitialDelaySeconds() {
        return this.initialDelaySeconds;
    }

    public A withInitialDelaySeconds(java.lang.Integer initialDelaySeconds) {
        this.initialDelaySeconds=initialDelaySeconds; return (A) this;
    }

    public java.lang.Boolean hasInitialDelaySeconds() {
        return this.initialDelaySeconds != null;
    }

    public java.lang.Integer getPeriodSeconds() {
        return this.periodSeconds;
    }

    public A withPeriodSeconds(java.lang.Integer periodSeconds) {
        this.periodSeconds=periodSeconds; return (A) this;
    }

    public java.lang.Boolean hasPeriodSeconds() {
        return this.periodSeconds != null;
    }

    public java.lang.Integer getSuccessThreshold() {
        return this.successThreshold;
    }

    public A withSuccessThreshold(java.lang.Integer successThreshold) {
        this.successThreshold=successThreshold; return (A) this;
    }

    public java.lang.Boolean hasSuccessThreshold() {
        return this.successThreshold != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildTcpSocket instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1TCPSocketAction getTcpSocket() {
        return this.tcpSocket!=null?this.tcpSocket.build():null;
    }

    public io.kubernetes.client.openapi.models.V1TCPSocketAction buildTcpSocket() {
        return this.tcpSocket!=null?this.tcpSocket.build():null;
    }

    public A withTcpSocket(io.kubernetes.client.openapi.models.V1TCPSocketAction tcpSocket) {
        _visitables.get("tcpSocket").remove(this.tcpSocket);
        if (tcpSocket!=null){ this.tcpSocket= new io.kubernetes.client.openapi.models.V1TCPSocketActionBuilder(tcpSocket); _visitables.get("tcpSocket").add(this.tcpSocket);} return (A) this;
    }

    public java.lang.Boolean hasTcpSocket() {
        return this.tcpSocket != null;
    }

    public io.kubernetes.client.openapi.models.V1ProbeFluent.TcpSocketNested<A> withNewTcpSocket() {
        return new io.kubernetes.client.openapi.models.V1ProbeFluentImpl.TcpSocketNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1ProbeFluent.TcpSocketNested<A> withNewTcpSocketLike(io.kubernetes.client.openapi.models.V1TCPSocketAction item) {
        return new io.kubernetes.client.openapi.models.V1ProbeFluentImpl.TcpSocketNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V1ProbeFluent.TcpSocketNested<A> editTcpSocket() {
        return withNewTcpSocketLike(getTcpSocket());
    }

    public io.kubernetes.client.openapi.models.V1ProbeFluent.TcpSocketNested<A> editOrNewTcpSocket() {
        return withNewTcpSocketLike(getTcpSocket() != null ? getTcpSocket(): new io.kubernetes.client.openapi.models.V1TCPSocketActionBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V1ProbeFluent.TcpSocketNested<A> editOrNewTcpSocketLike(io.kubernetes.client.openapi.models.V1TCPSocketAction item) {
        return withNewTcpSocketLike(getTcpSocket() != null ? getTcpSocket(): item);
    }

    public java.lang.Integer getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

    public A withTimeoutSeconds(java.lang.Integer timeoutSeconds) {
        this.timeoutSeconds=timeoutSeconds; return (A) this;
    }

    public java.lang.Boolean hasTimeoutSeconds() {
        return this.timeoutSeconds != null;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1ProbeFluentImpl that = (V1ProbeFluentImpl) o;
        if (exec != null ? !exec.equals(that.exec) :that.exec != null) return false;
        if (failureThreshold != null ? !failureThreshold.equals(that.failureThreshold) :that.failureThreshold != null) return false;
        if (httpGet != null ? !httpGet.equals(that.httpGet) :that.httpGet != null) return false;
        if (initialDelaySeconds != null ? !initialDelaySeconds.equals(that.initialDelaySeconds) :that.initialDelaySeconds != null) return false;
        if (periodSeconds != null ? !periodSeconds.equals(that.periodSeconds) :that.periodSeconds != null) return false;
        if (successThreshold != null ? !successThreshold.equals(that.successThreshold) :that.successThreshold != null) return false;
        if (tcpSocket != null ? !tcpSocket.equals(that.tcpSocket) :that.tcpSocket != null) return false;
        if (timeoutSeconds != null ? !timeoutSeconds.equals(that.timeoutSeconds) :that.timeoutSeconds != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(exec,  failureThreshold,  httpGet,  initialDelaySeconds,  periodSeconds,  successThreshold,  tcpSocket,  timeoutSeconds,  super.hashCode());
    }

    public class ExecNestedImpl<N> extends io.kubernetes.client.openapi.models.V1ExecActionFluentImpl<io.kubernetes.client.openapi.models.V1ProbeFluent.ExecNested<N>> implements io.kubernetes.client.openapi.models.V1ProbeFluent.ExecNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1ExecActionBuilder builder;

            ExecNestedImpl(io.kubernetes.client.openapi.models.V1ExecAction item) {
                this.builder = new io.kubernetes.client.openapi.models.V1ExecActionBuilder(this, item);
                        
            }

            ExecNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1ExecActionBuilder(this);
                        
            }

            public N and() {
                return (N) V1ProbeFluentImpl.this.withExec(builder.build());
            }

            public N endExec() {
                return and();
            }
    }


    public class HttpGetNestedImpl<N> extends io.kubernetes.client.openapi.models.V1HTTPGetActionFluentImpl<io.kubernetes.client.openapi.models.V1ProbeFluent.HttpGetNested<N>> implements io.kubernetes.client.openapi.models.V1ProbeFluent.HttpGetNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1HTTPGetActionBuilder builder;

            HttpGetNestedImpl(io.kubernetes.client.openapi.models.V1HTTPGetAction item) {
                this.builder = new io.kubernetes.client.openapi.models.V1HTTPGetActionBuilder(this, item);
                        
            }

            HttpGetNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1HTTPGetActionBuilder(this);
                        
            }

            public N and() {
                return (N) V1ProbeFluentImpl.this.withHttpGet(builder.build());
            }

            public N endHttpGet() {
                return and();
            }
    }


    public class TcpSocketNestedImpl<N> extends io.kubernetes.client.openapi.models.V1TCPSocketActionFluentImpl<io.kubernetes.client.openapi.models.V1ProbeFluent.TcpSocketNested<N>> implements io.kubernetes.client.openapi.models.V1ProbeFluent.TcpSocketNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1TCPSocketActionBuilder builder;

            TcpSocketNestedImpl(io.kubernetes.client.openapi.models.V1TCPSocketAction item) {
                this.builder = new io.kubernetes.client.openapi.models.V1TCPSocketActionBuilder(this, item);
                        
            }

            TcpSocketNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1TCPSocketActionBuilder(this);
                        
            }

            public N and() {
                return (N) V1ProbeFluentImpl.this.withTcpSocket(builder.build());
            }

            public N endTcpSocket() {
                return and();
            }
    }


}

package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Nested;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class V1HandlerFluentImpl<A extends io.kubernetes.client.openapi.models.V1HandlerFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1HandlerFluent<A> {

    private io.kubernetes.client.openapi.models.V1ExecActionBuilder exec;
    private io.kubernetes.client.openapi.models.V1HTTPGetActionBuilder httpGet;
    private io.kubernetes.client.openapi.models.V1TCPSocketActionBuilder tcpSocket;

    public V1HandlerFluentImpl() {
    }

    public V1HandlerFluentImpl(io.kubernetes.client.openapi.models.V1Handler instance) {
        this.withExec(instance.getExec());
        
        this.withHttpGet(instance.getHttpGet());
        
        this.withTcpSocket(instance.getTcpSocket());
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

    public io.kubernetes.client.openapi.models.V1HandlerFluent.ExecNested<A> withNewExec() {
        return new io.kubernetes.client.openapi.models.V1HandlerFluentImpl.ExecNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1HandlerFluent.ExecNested<A> withNewExecLike(io.kubernetes.client.openapi.models.V1ExecAction item) {
        return new io.kubernetes.client.openapi.models.V1HandlerFluentImpl.ExecNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V1HandlerFluent.ExecNested<A> editExec() {
        return withNewExecLike(getExec());
    }

    public io.kubernetes.client.openapi.models.V1HandlerFluent.ExecNested<A> editOrNewExec() {
        return withNewExecLike(getExec() != null ? getExec(): new io.kubernetes.client.openapi.models.V1ExecActionBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V1HandlerFluent.ExecNested<A> editOrNewExecLike(io.kubernetes.client.openapi.models.V1ExecAction item) {
        return withNewExecLike(getExec() != null ? getExec(): item);
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

    public io.kubernetes.client.openapi.models.V1HandlerFluent.HttpGetNested<A> withNewHttpGet() {
        return new io.kubernetes.client.openapi.models.V1HandlerFluentImpl.HttpGetNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1HandlerFluent.HttpGetNested<A> withNewHttpGetLike(io.kubernetes.client.openapi.models.V1HTTPGetAction item) {
        return new io.kubernetes.client.openapi.models.V1HandlerFluentImpl.HttpGetNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V1HandlerFluent.HttpGetNested<A> editHttpGet() {
        return withNewHttpGetLike(getHttpGet());
    }

    public io.kubernetes.client.openapi.models.V1HandlerFluent.HttpGetNested<A> editOrNewHttpGet() {
        return withNewHttpGetLike(getHttpGet() != null ? getHttpGet(): new io.kubernetes.client.openapi.models.V1HTTPGetActionBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V1HandlerFluent.HttpGetNested<A> editOrNewHttpGetLike(io.kubernetes.client.openapi.models.V1HTTPGetAction item) {
        return withNewHttpGetLike(getHttpGet() != null ? getHttpGet(): item);
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

    public io.kubernetes.client.openapi.models.V1HandlerFluent.TcpSocketNested<A> withNewTcpSocket() {
        return new io.kubernetes.client.openapi.models.V1HandlerFluentImpl.TcpSocketNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1HandlerFluent.TcpSocketNested<A> withNewTcpSocketLike(io.kubernetes.client.openapi.models.V1TCPSocketAction item) {
        return new io.kubernetes.client.openapi.models.V1HandlerFluentImpl.TcpSocketNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V1HandlerFluent.TcpSocketNested<A> editTcpSocket() {
        return withNewTcpSocketLike(getTcpSocket());
    }

    public io.kubernetes.client.openapi.models.V1HandlerFluent.TcpSocketNested<A> editOrNewTcpSocket() {
        return withNewTcpSocketLike(getTcpSocket() != null ? getTcpSocket(): new io.kubernetes.client.openapi.models.V1TCPSocketActionBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V1HandlerFluent.TcpSocketNested<A> editOrNewTcpSocketLike(io.kubernetes.client.openapi.models.V1TCPSocketAction item) {
        return withNewTcpSocketLike(getTcpSocket() != null ? getTcpSocket(): item);
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1HandlerFluentImpl that = (V1HandlerFluentImpl) o;
        if (exec != null ? !exec.equals(that.exec) :that.exec != null) return false;
        if (httpGet != null ? !httpGet.equals(that.httpGet) :that.httpGet != null) return false;
        if (tcpSocket != null ? !tcpSocket.equals(that.tcpSocket) :that.tcpSocket != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(exec,  httpGet,  tcpSocket,  super.hashCode());
    }

    public class ExecNestedImpl<N> extends io.kubernetes.client.openapi.models.V1ExecActionFluentImpl<io.kubernetes.client.openapi.models.V1HandlerFluent.ExecNested<N>> implements io.kubernetes.client.openapi.models.V1HandlerFluent.ExecNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1ExecActionBuilder builder;

            ExecNestedImpl(io.kubernetes.client.openapi.models.V1ExecAction item) {
                this.builder = new io.kubernetes.client.openapi.models.V1ExecActionBuilder(this, item);
                        
            }

            ExecNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1ExecActionBuilder(this);
                        
            }

            public N and() {
                return (N) V1HandlerFluentImpl.this.withExec(builder.build());
            }

            public N endExec() {
                return and();
            }
    }


    public class HttpGetNestedImpl<N> extends io.kubernetes.client.openapi.models.V1HTTPGetActionFluentImpl<io.kubernetes.client.openapi.models.V1HandlerFluent.HttpGetNested<N>> implements io.kubernetes.client.openapi.models.V1HandlerFluent.HttpGetNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1HTTPGetActionBuilder builder;

            HttpGetNestedImpl(io.kubernetes.client.openapi.models.V1HTTPGetAction item) {
                this.builder = new io.kubernetes.client.openapi.models.V1HTTPGetActionBuilder(this, item);
                        
            }

            HttpGetNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1HTTPGetActionBuilder(this);
                        
            }

            public N and() {
                return (N) V1HandlerFluentImpl.this.withHttpGet(builder.build());
            }

            public N endHttpGet() {
                return and();
            }
    }


    public class TcpSocketNestedImpl<N> extends io.kubernetes.client.openapi.models.V1TCPSocketActionFluentImpl<io.kubernetes.client.openapi.models.V1HandlerFluent.TcpSocketNested<N>> implements io.kubernetes.client.openapi.models.V1HandlerFluent.TcpSocketNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1TCPSocketActionBuilder builder;

            TcpSocketNestedImpl(io.kubernetes.client.openapi.models.V1TCPSocketAction item) {
                this.builder = new io.kubernetes.client.openapi.models.V1TCPSocketActionBuilder(this, item);
                        
            }

            TcpSocketNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1TCPSocketActionBuilder(this);
                        
            }

            public N and() {
                return (N) V1HandlerFluentImpl.this.withTcpSocket(builder.build());
            }

            public N endTcpSocket() {
                return and();
            }
    }


}

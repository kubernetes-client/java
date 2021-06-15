package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Integer;
import java.lang.Deprecated;
import java.lang.Boolean;

public interface V1ProbeFluent<A extends io.kubernetes.client.openapi.models.V1ProbeFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildExec instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1ExecAction getExec();
    public io.kubernetes.client.openapi.models.V1ExecAction buildExec();
    public A withExec(io.kubernetes.client.openapi.models.V1ExecAction exec);
    public java.lang.Boolean hasExec();
    public io.kubernetes.client.openapi.models.V1ProbeFluent.ExecNested<A> withNewExec();
    public io.kubernetes.client.openapi.models.V1ProbeFluent.ExecNested<A> withNewExecLike(io.kubernetes.client.openapi.models.V1ExecAction item);
    public io.kubernetes.client.openapi.models.V1ProbeFluent.ExecNested<A> editExec();
    public io.kubernetes.client.openapi.models.V1ProbeFluent.ExecNested<A> editOrNewExec();
    public io.kubernetes.client.openapi.models.V1ProbeFluent.ExecNested<A> editOrNewExecLike(io.kubernetes.client.openapi.models.V1ExecAction item);
    public java.lang.Integer getFailureThreshold();
    public A withFailureThreshold(java.lang.Integer failureThreshold);
    public java.lang.Boolean hasFailureThreshold();
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildHttpGet instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1HTTPGetAction getHttpGet();
    public io.kubernetes.client.openapi.models.V1HTTPGetAction buildHttpGet();
    public A withHttpGet(io.kubernetes.client.openapi.models.V1HTTPGetAction httpGet);
    public java.lang.Boolean hasHttpGet();
    public io.kubernetes.client.openapi.models.V1ProbeFluent.HttpGetNested<A> withNewHttpGet();
    public io.kubernetes.client.openapi.models.V1ProbeFluent.HttpGetNested<A> withNewHttpGetLike(io.kubernetes.client.openapi.models.V1HTTPGetAction item);
    public io.kubernetes.client.openapi.models.V1ProbeFluent.HttpGetNested<A> editHttpGet();
    public io.kubernetes.client.openapi.models.V1ProbeFluent.HttpGetNested<A> editOrNewHttpGet();
    public io.kubernetes.client.openapi.models.V1ProbeFluent.HttpGetNested<A> editOrNewHttpGetLike(io.kubernetes.client.openapi.models.V1HTTPGetAction item);
    public java.lang.Integer getInitialDelaySeconds();
    public A withInitialDelaySeconds(java.lang.Integer initialDelaySeconds);
    public java.lang.Boolean hasInitialDelaySeconds();
    public java.lang.Integer getPeriodSeconds();
    public A withPeriodSeconds(java.lang.Integer periodSeconds);
    public java.lang.Boolean hasPeriodSeconds();
    public java.lang.Integer getSuccessThreshold();
    public A withSuccessThreshold(java.lang.Integer successThreshold);
    public java.lang.Boolean hasSuccessThreshold();
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildTcpSocket instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1TCPSocketAction getTcpSocket();
    public io.kubernetes.client.openapi.models.V1TCPSocketAction buildTcpSocket();
    public A withTcpSocket(io.kubernetes.client.openapi.models.V1TCPSocketAction tcpSocket);
    public java.lang.Boolean hasTcpSocket();
    public io.kubernetes.client.openapi.models.V1ProbeFluent.TcpSocketNested<A> withNewTcpSocket();
    public io.kubernetes.client.openapi.models.V1ProbeFluent.TcpSocketNested<A> withNewTcpSocketLike(io.kubernetes.client.openapi.models.V1TCPSocketAction item);
    public io.kubernetes.client.openapi.models.V1ProbeFluent.TcpSocketNested<A> editTcpSocket();
    public io.kubernetes.client.openapi.models.V1ProbeFluent.TcpSocketNested<A> editOrNewTcpSocket();
    public io.kubernetes.client.openapi.models.V1ProbeFluent.TcpSocketNested<A> editOrNewTcpSocketLike(io.kubernetes.client.openapi.models.V1TCPSocketAction item);
    public java.lang.Integer getTimeoutSeconds();
    public A withTimeoutSeconds(java.lang.Integer timeoutSeconds);
    public java.lang.Boolean hasTimeoutSeconds();
    public interface ExecNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1ExecActionFluent<io.kubernetes.client.openapi.models.V1ProbeFluent.ExecNested<N>> {

            public N and();
            public N endExec();    }


    public interface HttpGetNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1HTTPGetActionFluent<io.kubernetes.client.openapi.models.V1ProbeFluent.HttpGetNested<N>> {

            public N and();
            public N endHttpGet();    }


    public interface TcpSocketNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1TCPSocketActionFluent<io.kubernetes.client.openapi.models.V1ProbeFluent.TcpSocketNested<N>> {

            public N and();
            public N endTcpSocket();    }


}

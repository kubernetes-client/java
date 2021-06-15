package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

public interface V1ContainerPortFluent<A extends io.kubernetes.client.openapi.models.V1ContainerPortFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.Integer getContainerPort();
    public A withContainerPort(java.lang.Integer containerPort);
    public java.lang.Boolean hasContainerPort();
    public java.lang.String getHostIP();
    public A withHostIP(java.lang.String hostIP);
    public java.lang.Boolean hasHostIP();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withHostIP instead.
     */
        public A withNewHostIP(java.lang.String original);
    public java.lang.Integer getHostPort();
    public A withHostPort(java.lang.Integer hostPort);
    public java.lang.Boolean hasHostPort();
    public java.lang.String getName();
    public A withName(java.lang.String name);
    public java.lang.Boolean hasName();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withName instead.
     */
        public A withNewName(java.lang.String original);
    public java.lang.String getProtocol();
    public A withProtocol(java.lang.String protocol);
    public java.lang.Boolean hasProtocol();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withProtocol instead.
     */
        public A withNewProtocol(java.lang.String original);
}

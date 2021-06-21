package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

public interface V1PortStatusFluent<A extends io.kubernetes.client.openapi.models.V1PortStatusFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getError();
    public A withError(java.lang.String error);
    public java.lang.Boolean hasError();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withError instead.
     */
        public A withNewError(java.lang.String original);
    public java.lang.Integer getPort();
    public A withPort(java.lang.Integer port);
    public java.lang.Boolean hasPort();
    public java.lang.String getProtocol();
    public A withProtocol(java.lang.String protocol);
    public java.lang.Boolean hasProtocol();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withProtocol instead.
     */
        public A withNewProtocol(java.lang.String original);
}

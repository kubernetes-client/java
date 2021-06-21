package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.custom.IntOrString;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

public interface V1TCPSocketActionFluent<A extends io.kubernetes.client.openapi.models.V1TCPSocketActionFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getHost();
    public A withHost(java.lang.String host);
    public java.lang.Boolean hasHost();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withHost instead.
     */
        public A withNewHost(java.lang.String original);
    public io.kubernetes.client.custom.IntOrString getPort();
    public A withPort(io.kubernetes.client.custom.IntOrString port);
    public java.lang.Boolean hasPort();
    public A withNewPort(int value);
    public A withNewPort(java.lang.String value);
}

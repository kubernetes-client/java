package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

public interface V1ServerAddressByClientCIDRFluent<A extends io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDRFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getClientCIDR();
    public A withClientCIDR(java.lang.String clientCIDR);
    public java.lang.Boolean hasClientCIDR();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withClientCIDR instead.
     */
        public A withNewClientCIDR(java.lang.String original);
    public java.lang.String getServerAddress();
    public A withServerAddress(java.lang.String serverAddress);
    public java.lang.Boolean hasServerAddress();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withServerAddress instead.
     */
        public A withNewServerAddress(java.lang.String original);
}

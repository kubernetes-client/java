package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

public interface V1NodeAddressFluent<A extends io.kubernetes.client.openapi.models.V1NodeAddressFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getAddress();
    public A withAddress(java.lang.String address);
    public java.lang.Boolean hasAddress();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withAddress instead.
     */
        public A withNewAddress(java.lang.String original);
    public java.lang.String getType();
    public A withType(java.lang.String type);
    public java.lang.Boolean hasType();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withType instead.
     */
        public A withNewType(java.lang.String original);
}

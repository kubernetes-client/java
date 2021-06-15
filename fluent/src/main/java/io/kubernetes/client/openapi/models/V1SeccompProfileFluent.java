package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

public interface V1SeccompProfileFluent<A extends io.kubernetes.client.openapi.models.V1SeccompProfileFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getLocalhostProfile();
    public A withLocalhostProfile(java.lang.String localhostProfile);
    public java.lang.Boolean hasLocalhostProfile();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withLocalhostProfile instead.
     */
        public A withNewLocalhostProfile(java.lang.String original);
    public java.lang.String getType();
    public A withType(java.lang.String type);
    public java.lang.Boolean hasType();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withType instead.
     */
        public A withNewType(java.lang.String original);
}

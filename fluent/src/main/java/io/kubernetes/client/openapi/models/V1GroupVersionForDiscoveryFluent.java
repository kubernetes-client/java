package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

public interface V1GroupVersionForDiscoveryFluent<A extends io.kubernetes.client.openapi.models.V1GroupVersionForDiscoveryFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getGroupVersion();
    public A withGroupVersion(java.lang.String groupVersion);
    public java.lang.Boolean hasGroupVersion();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withGroupVersion instead.
     */
        public A withNewGroupVersion(java.lang.String original);
    public java.lang.String getVersion();
    public A withVersion(java.lang.String version);
    public java.lang.Boolean hasVersion();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withVersion instead.
     */
        public A withNewVersion(java.lang.String original);
}

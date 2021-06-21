package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

public interface V1EventSourceFluent<A extends io.kubernetes.client.openapi.models.V1EventSourceFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getComponent();
    public A withComponent(java.lang.String component);
    public java.lang.Boolean hasComponent();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withComponent instead.
     */
        public A withNewComponent(java.lang.String original);
    public java.lang.String getHost();
    public A withHost(java.lang.String host);
    public java.lang.Boolean hasHost();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withHost instead.
     */
        public A withNewHost(java.lang.String original);
}

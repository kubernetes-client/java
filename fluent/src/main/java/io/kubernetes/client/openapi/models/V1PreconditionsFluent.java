package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

public interface V1PreconditionsFluent<A extends io.kubernetes.client.openapi.models.V1PreconditionsFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getResourceVersion();
    public A withResourceVersion(java.lang.String resourceVersion);
    public java.lang.Boolean hasResourceVersion();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withResourceVersion instead.
     */
        public A withNewResourceVersion(java.lang.String original);
    public java.lang.String getUid();
    public A withUid(java.lang.String uid);
    public java.lang.Boolean hasUid();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withUid instead.
     */
        public A withNewUid(java.lang.String original);
}

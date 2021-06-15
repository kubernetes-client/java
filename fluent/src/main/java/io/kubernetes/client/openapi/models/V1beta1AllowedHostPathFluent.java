package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

public interface V1beta1AllowedHostPathFluent<A extends io.kubernetes.client.openapi.models.V1beta1AllowedHostPathFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getPathPrefix();
    public A withPathPrefix(java.lang.String pathPrefix);
    public java.lang.Boolean hasPathPrefix();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withPathPrefix instead.
     */
        public A withNewPathPrefix(java.lang.String original);
    public java.lang.Boolean getReadOnly();
    public A withReadOnly(java.lang.Boolean readOnly);
    public java.lang.Boolean hasReadOnly();
}

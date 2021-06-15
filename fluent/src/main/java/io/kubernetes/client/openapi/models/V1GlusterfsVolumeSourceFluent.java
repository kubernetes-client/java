package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

public interface V1GlusterfsVolumeSourceFluent<A extends io.kubernetes.client.openapi.models.V1GlusterfsVolumeSourceFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getEndpoints();
    public A withEndpoints(java.lang.String endpoints);
    public java.lang.Boolean hasEndpoints();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withEndpoints instead.
     */
        public A withNewEndpoints(java.lang.String original);
    public java.lang.String getPath();
    public A withPath(java.lang.String path);
    public java.lang.Boolean hasPath();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withPath instead.
     */
        public A withNewPath(java.lang.String original);
    public java.lang.Boolean getReadOnly();
    public A withReadOnly(java.lang.Boolean readOnly);
    public java.lang.Boolean hasReadOnly();
}

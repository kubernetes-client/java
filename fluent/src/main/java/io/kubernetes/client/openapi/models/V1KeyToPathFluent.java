package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

public interface V1KeyToPathFluent<A extends io.kubernetes.client.openapi.models.V1KeyToPathFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getKey();
    public A withKey(java.lang.String key);
    public java.lang.Boolean hasKey();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withKey instead.
     */
        public A withNewKey(java.lang.String original);
    public java.lang.Integer getMode();
    public A withMode(java.lang.Integer mode);
    public java.lang.Boolean hasMode();
    public java.lang.String getPath();
    public A withPath(java.lang.String path);
    public java.lang.Boolean hasPath();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withPath instead.
     */
        public A withNewPath(java.lang.String original);
}

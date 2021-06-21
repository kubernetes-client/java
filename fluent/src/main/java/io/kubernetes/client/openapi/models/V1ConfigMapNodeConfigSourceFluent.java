package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

public interface V1ConfigMapNodeConfigSourceFluent<A extends io.kubernetes.client.openapi.models.V1ConfigMapNodeConfigSourceFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getKubeletConfigKey();
    public A withKubeletConfigKey(java.lang.String kubeletConfigKey);
    public java.lang.Boolean hasKubeletConfigKey();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withKubeletConfigKey instead.
     */
        public A withNewKubeletConfigKey(java.lang.String original);
    public java.lang.String getName();
    public A withName(java.lang.String name);
    public java.lang.Boolean hasName();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withName instead.
     */
        public A withNewName(java.lang.String original);
    public java.lang.String getNamespace();
    public A withNamespace(java.lang.String namespace);
    public java.lang.Boolean hasNamespace();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withNamespace instead.
     */
        public A withNewNamespace(java.lang.String original);
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

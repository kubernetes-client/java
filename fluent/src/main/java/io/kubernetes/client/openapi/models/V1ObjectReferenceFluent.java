package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

public interface V1ObjectReferenceFluent<A extends io.kubernetes.client.openapi.models.V1ObjectReferenceFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getApiVersion();
    public A withApiVersion(java.lang.String apiVersion);
    public java.lang.Boolean hasApiVersion();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withApiVersion instead.
     */
        public A withNewApiVersion(java.lang.String original);
    public java.lang.String getFieldPath();
    public A withFieldPath(java.lang.String fieldPath);
    public java.lang.Boolean hasFieldPath();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withFieldPath instead.
     */
        public A withNewFieldPath(java.lang.String original);
    public java.lang.String getKind();
    public A withKind(java.lang.String kind);
    public java.lang.Boolean hasKind();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withKind instead.
     */
        public A withNewKind(java.lang.String original);
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

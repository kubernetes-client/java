package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

public interface V1beta1ResourceAttributesFluent<A extends io.kubernetes.client.openapi.models.V1beta1ResourceAttributesFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getGroup();
    public A withGroup(java.lang.String group);
    public java.lang.Boolean hasGroup();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withGroup instead.
     */
        public A withNewGroup(java.lang.String original);
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
    public java.lang.String getResource();
    public A withResource(java.lang.String resource);
    public java.lang.Boolean hasResource();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withResource instead.
     */
        public A withNewResource(java.lang.String original);
    public java.lang.String getSubresource();
    public A withSubresource(java.lang.String subresource);
    public java.lang.Boolean hasSubresource();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withSubresource instead.
     */
        public A withNewSubresource(java.lang.String original);
    public java.lang.String getVerb();
    public A withVerb(java.lang.String verb);
    public java.lang.Boolean hasVerb();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withVerb instead.
     */
        public A withNewVerb(java.lang.String original);
    public java.lang.String getVersion();
    public A withVersion(java.lang.String version);
    public java.lang.Boolean hasVersion();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withVersion instead.
     */
        public A withNewVersion(java.lang.String original);
}

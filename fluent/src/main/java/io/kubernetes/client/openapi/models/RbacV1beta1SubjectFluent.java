package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

public interface RbacV1beta1SubjectFluent<A extends io.kubernetes.client.openapi.models.RbacV1beta1SubjectFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getApiGroup();
    public A withApiGroup(java.lang.String apiGroup);
    public java.lang.Boolean hasApiGroup();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withApiGroup instead.
     */
        public A withNewApiGroup(java.lang.String original);
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
}

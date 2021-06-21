package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

public interface V1VolumeMountFluent<A extends io.kubernetes.client.openapi.models.V1VolumeMountFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getMountPath();
    public A withMountPath(java.lang.String mountPath);
    public java.lang.Boolean hasMountPath();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withMountPath instead.
     */
        public A withNewMountPath(java.lang.String original);
    public java.lang.String getMountPropagation();
    public A withMountPropagation(java.lang.String mountPropagation);
    public java.lang.Boolean hasMountPropagation();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withMountPropagation instead.
     */
        public A withNewMountPropagation(java.lang.String original);
    public java.lang.String getName();
    public A withName(java.lang.String name);
    public java.lang.Boolean hasName();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withName instead.
     */
        public A withNewName(java.lang.String original);
    public java.lang.Boolean getReadOnly();
    public A withReadOnly(java.lang.Boolean readOnly);
    public java.lang.Boolean hasReadOnly();
    public java.lang.String getSubPath();
    public A withSubPath(java.lang.String subPath);
    public java.lang.Boolean hasSubPath();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withSubPath instead.
     */
        public A withNewSubPath(java.lang.String original);
    public java.lang.String getSubPathExpr();
    public A withSubPathExpr(java.lang.String subPathExpr);
    public java.lang.Boolean hasSubPathExpr();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withSubPathExpr instead.
     */
        public A withNewSubPathExpr(java.lang.String original);
}

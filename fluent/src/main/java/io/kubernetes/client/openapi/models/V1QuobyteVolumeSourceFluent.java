package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

public interface V1QuobyteVolumeSourceFluent<A extends io.kubernetes.client.openapi.models.V1QuobyteVolumeSourceFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getGroup();
    public A withGroup(java.lang.String group);
    public java.lang.Boolean hasGroup();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withGroup instead.
     */
        public A withNewGroup(java.lang.String original);
    public java.lang.Boolean getReadOnly();
    public A withReadOnly(java.lang.Boolean readOnly);
    public java.lang.Boolean hasReadOnly();
    public java.lang.String getRegistry();
    public A withRegistry(java.lang.String registry);
    public java.lang.Boolean hasRegistry();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withRegistry instead.
     */
        public A withNewRegistry(java.lang.String original);
    public java.lang.String getTenant();
    public A withTenant(java.lang.String tenant);
    public java.lang.Boolean hasTenant();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withTenant instead.
     */
        public A withNewTenant(java.lang.String original);
    public java.lang.String getUser();
    public A withUser(java.lang.String user);
    public java.lang.Boolean hasUser();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withUser instead.
     */
        public A withNewUser(java.lang.String original);
    public java.lang.String getVolume();
    public A withVolume(java.lang.String volume);
    public java.lang.Boolean hasVolume();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withVolume instead.
     */
        public A withNewVolume(java.lang.String original);
}

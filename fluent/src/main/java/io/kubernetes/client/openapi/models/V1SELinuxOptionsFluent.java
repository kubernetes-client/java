package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

public interface V1SELinuxOptionsFluent<A extends io.kubernetes.client.openapi.models.V1SELinuxOptionsFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getLevel();
    public A withLevel(java.lang.String level);
    public java.lang.Boolean hasLevel();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withLevel instead.
     */
        public A withNewLevel(java.lang.String original);
    public java.lang.String getRole();
    public A withRole(java.lang.String role);
    public java.lang.Boolean hasRole();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withRole instead.
     */
        public A withNewRole(java.lang.String original);
    public java.lang.String getType();
    public A withType(java.lang.String type);
    public java.lang.Boolean hasType();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withType instead.
     */
        public A withNewType(java.lang.String original);
    public java.lang.String getUser();
    public A withUser(java.lang.String user);
    public java.lang.Boolean hasUser();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withUser instead.
     */
        public A withNewUser(java.lang.String original);
}

package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

public interface V1WindowsSecurityContextOptionsFluent<A extends io.kubernetes.client.openapi.models.V1WindowsSecurityContextOptionsFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getGmsaCredentialSpec();
    public A withGmsaCredentialSpec(java.lang.String gmsaCredentialSpec);
    public java.lang.Boolean hasGmsaCredentialSpec();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withGmsaCredentialSpec instead.
     */
        public A withNewGmsaCredentialSpec(java.lang.String original);
    public java.lang.String getGmsaCredentialSpecName();
    public A withGmsaCredentialSpecName(java.lang.String gmsaCredentialSpecName);
    public java.lang.Boolean hasGmsaCredentialSpecName();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withGmsaCredentialSpecName instead.
     */
        public A withNewGmsaCredentialSpecName(java.lang.String original);
    public java.lang.String getRunAsUserName();
    public A withRunAsUserName(java.lang.String runAsUserName);
    public java.lang.Boolean hasRunAsUserName();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withRunAsUserName instead.
     */
        public A withNewRunAsUserName(java.lang.String original);
}

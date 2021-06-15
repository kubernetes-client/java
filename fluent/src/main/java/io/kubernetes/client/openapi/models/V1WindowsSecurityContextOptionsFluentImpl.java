package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class V1WindowsSecurityContextOptionsFluentImpl<A extends io.kubernetes.client.openapi.models.V1WindowsSecurityContextOptionsFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1WindowsSecurityContextOptionsFluent<A> {

    private java.lang.String gmsaCredentialSpec;
    private java.lang.String gmsaCredentialSpecName;
    private java.lang.String runAsUserName;

    public V1WindowsSecurityContextOptionsFluentImpl() {
    }

    public V1WindowsSecurityContextOptionsFluentImpl(io.kubernetes.client.openapi.models.V1WindowsSecurityContextOptions instance) {
        this.withGmsaCredentialSpec(instance.getGmsaCredentialSpec());
        
        this.withGmsaCredentialSpecName(instance.getGmsaCredentialSpecName());
        
        this.withRunAsUserName(instance.getRunAsUserName());
    }

    public java.lang.String getGmsaCredentialSpec() {
        return this.gmsaCredentialSpec;
    }

    public A withGmsaCredentialSpec(java.lang.String gmsaCredentialSpec) {
        this.gmsaCredentialSpec=gmsaCredentialSpec; return (A) this;
    }

    public java.lang.Boolean hasGmsaCredentialSpec() {
        return this.gmsaCredentialSpec != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withGmsaCredentialSpec instead.
     */
        public A withNewGmsaCredentialSpec(java.lang.String original) {
        return (A)withGmsaCredentialSpec(new String(original));
    }

    public java.lang.String getGmsaCredentialSpecName() {
        return this.gmsaCredentialSpecName;
    }

    public A withGmsaCredentialSpecName(java.lang.String gmsaCredentialSpecName) {
        this.gmsaCredentialSpecName=gmsaCredentialSpecName; return (A) this;
    }

    public java.lang.Boolean hasGmsaCredentialSpecName() {
        return this.gmsaCredentialSpecName != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withGmsaCredentialSpecName instead.
     */
        public A withNewGmsaCredentialSpecName(java.lang.String original) {
        return (A)withGmsaCredentialSpecName(new String(original));
    }

    public java.lang.String getRunAsUserName() {
        return this.runAsUserName;
    }

    public A withRunAsUserName(java.lang.String runAsUserName) {
        this.runAsUserName=runAsUserName; return (A) this;
    }

    public java.lang.Boolean hasRunAsUserName() {
        return this.runAsUserName != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withRunAsUserName instead.
     */
        public A withNewRunAsUserName(java.lang.String original) {
        return (A)withRunAsUserName(new String(original));
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1WindowsSecurityContextOptionsFluentImpl that = (V1WindowsSecurityContextOptionsFluentImpl) o;
        if (gmsaCredentialSpec != null ? !gmsaCredentialSpec.equals(that.gmsaCredentialSpec) :that.gmsaCredentialSpec != null) return false;
        if (gmsaCredentialSpecName != null ? !gmsaCredentialSpecName.equals(that.gmsaCredentialSpecName) :that.gmsaCredentialSpecName != null) return false;
        if (runAsUserName != null ? !runAsUserName.equals(that.runAsUserName) :that.runAsUserName != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(gmsaCredentialSpec,  gmsaCredentialSpecName,  runAsUserName,  super.hashCode());
    }

}

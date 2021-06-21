package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class V1SeccompProfileFluentImpl<A extends io.kubernetes.client.openapi.models.V1SeccompProfileFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1SeccompProfileFluent<A> {

    private java.lang.String localhostProfile;
    private java.lang.String type;

    public V1SeccompProfileFluentImpl() {
    }

    public V1SeccompProfileFluentImpl(io.kubernetes.client.openapi.models.V1SeccompProfile instance) {
        this.withLocalhostProfile(instance.getLocalhostProfile());
        
        this.withType(instance.getType());
    }

    public java.lang.String getLocalhostProfile() {
        return this.localhostProfile;
    }

    public A withLocalhostProfile(java.lang.String localhostProfile) {
        this.localhostProfile=localhostProfile; return (A) this;
    }

    public java.lang.Boolean hasLocalhostProfile() {
        return this.localhostProfile != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withLocalhostProfile instead.
     */
        public A withNewLocalhostProfile(java.lang.String original) {
        return (A)withLocalhostProfile(new String(original));
    }

    public java.lang.String getType() {
        return this.type;
    }

    public A withType(java.lang.String type) {
        this.type=type; return (A) this;
    }

    public java.lang.Boolean hasType() {
        return this.type != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withType instead.
     */
        public A withNewType(java.lang.String original) {
        return (A)withType(new String(original));
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1SeccompProfileFluentImpl that = (V1SeccompProfileFluentImpl) o;
        if (localhostProfile != null ? !localhostProfile.equals(that.localhostProfile) :that.localhostProfile != null) return false;
        if (type != null ? !type.equals(that.type) :that.type != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(localhostProfile,  type,  super.hashCode());
    }

}

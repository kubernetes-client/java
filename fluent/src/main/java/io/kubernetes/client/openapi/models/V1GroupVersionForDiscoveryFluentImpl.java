package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class V1GroupVersionForDiscoveryFluentImpl<A extends io.kubernetes.client.openapi.models.V1GroupVersionForDiscoveryFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1GroupVersionForDiscoveryFluent<A> {

    private java.lang.String groupVersion;
    private java.lang.String version;

    public V1GroupVersionForDiscoveryFluentImpl() {
    }

    public V1GroupVersionForDiscoveryFluentImpl(io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery instance) {
        this.withGroupVersion(instance.getGroupVersion());
        
        this.withVersion(instance.getVersion());
    }

    public java.lang.String getGroupVersion() {
        return this.groupVersion;
    }

    public A withGroupVersion(java.lang.String groupVersion) {
        this.groupVersion=groupVersion; return (A) this;
    }

    public java.lang.Boolean hasGroupVersion() {
        return this.groupVersion != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withGroupVersion instead.
     */
        public A withNewGroupVersion(java.lang.String original) {
        return (A)withGroupVersion(new String(original));
    }

    public java.lang.String getVersion() {
        return this.version;
    }

    public A withVersion(java.lang.String version) {
        this.version=version; return (A) this;
    }

    public java.lang.Boolean hasVersion() {
        return this.version != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withVersion instead.
     */
        public A withNewVersion(java.lang.String original) {
        return (A)withVersion(new String(original));
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1GroupVersionForDiscoveryFluentImpl that = (V1GroupVersionForDiscoveryFluentImpl) o;
        if (groupVersion != null ? !groupVersion.equals(that.groupVersion) :that.groupVersion != null) return false;
        if (version != null ? !version.equals(that.version) :that.version != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(groupVersion,  version,  super.hashCode());
    }

}

package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class V1GlusterfsPersistentVolumeSourceFluentImpl<A extends io.kubernetes.client.openapi.models.V1GlusterfsPersistentVolumeSourceFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1GlusterfsPersistentVolumeSourceFluent<A> {

    private java.lang.String endpoints;
    private java.lang.String endpointsNamespace;
    private java.lang.String path;
    private java.lang.Boolean readOnly;

    public V1GlusterfsPersistentVolumeSourceFluentImpl() {
    }

    public V1GlusterfsPersistentVolumeSourceFluentImpl(io.kubernetes.client.openapi.models.V1GlusterfsPersistentVolumeSource instance) {
        this.withEndpoints(instance.getEndpoints());
        
        this.withEndpointsNamespace(instance.getEndpointsNamespace());
        
        this.withPath(instance.getPath());
        
        this.withReadOnly(instance.getReadOnly());
    }

    public java.lang.String getEndpoints() {
        return this.endpoints;
    }

    public A withEndpoints(java.lang.String endpoints) {
        this.endpoints=endpoints; return (A) this;
    }

    public java.lang.Boolean hasEndpoints() {
        return this.endpoints != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withEndpoints instead.
     */
        public A withNewEndpoints(java.lang.String original) {
        return (A)withEndpoints(new String(original));
    }

    public java.lang.String getEndpointsNamespace() {
        return this.endpointsNamespace;
    }

    public A withEndpointsNamespace(java.lang.String endpointsNamespace) {
        this.endpointsNamespace=endpointsNamespace; return (A) this;
    }

    public java.lang.Boolean hasEndpointsNamespace() {
        return this.endpointsNamespace != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withEndpointsNamespace instead.
     */
        public A withNewEndpointsNamespace(java.lang.String original) {
        return (A)withEndpointsNamespace(new String(original));
    }

    public java.lang.String getPath() {
        return this.path;
    }

    public A withPath(java.lang.String path) {
        this.path=path; return (A) this;
    }

    public java.lang.Boolean hasPath() {
        return this.path != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withPath instead.
     */
        public A withNewPath(java.lang.String original) {
        return (A)withPath(new String(original));
    }

    public java.lang.Boolean getReadOnly() {
        return this.readOnly;
    }

    public A withReadOnly(java.lang.Boolean readOnly) {
        this.readOnly=readOnly; return (A) this;
    }

    public java.lang.Boolean hasReadOnly() {
        return this.readOnly != null;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1GlusterfsPersistentVolumeSourceFluentImpl that = (V1GlusterfsPersistentVolumeSourceFluentImpl) o;
        if (endpoints != null ? !endpoints.equals(that.endpoints) :that.endpoints != null) return false;
        if (endpointsNamespace != null ? !endpointsNamespace.equals(that.endpointsNamespace) :that.endpointsNamespace != null) return false;
        if (path != null ? !path.equals(that.path) :that.path != null) return false;
        if (readOnly != null ? !readOnly.equals(that.readOnly) :that.readOnly != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(endpoints,  endpointsNamespace,  path,  readOnly,  super.hashCode());
    }

}

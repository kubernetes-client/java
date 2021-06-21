package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class V1beta1AllowedHostPathFluentImpl<A extends io.kubernetes.client.openapi.models.V1beta1AllowedHostPathFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1beta1AllowedHostPathFluent<A> {

    private java.lang.String pathPrefix;
    private java.lang.Boolean readOnly;

    public V1beta1AllowedHostPathFluentImpl() {
    }

    public V1beta1AllowedHostPathFluentImpl(io.kubernetes.client.openapi.models.V1beta1AllowedHostPath instance) {
        this.withPathPrefix(instance.getPathPrefix());
        
        this.withReadOnly(instance.getReadOnly());
    }

    public java.lang.String getPathPrefix() {
        return this.pathPrefix;
    }

    public A withPathPrefix(java.lang.String pathPrefix) {
        this.pathPrefix=pathPrefix; return (A) this;
    }

    public java.lang.Boolean hasPathPrefix() {
        return this.pathPrefix != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withPathPrefix instead.
     */
        public A withNewPathPrefix(java.lang.String original) {
        return (A)withPathPrefix(new String(original));
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
        V1beta1AllowedHostPathFluentImpl that = (V1beta1AllowedHostPathFluentImpl) o;
        if (pathPrefix != null ? !pathPrefix.equals(that.pathPrefix) :that.pathPrefix != null) return false;
        if (readOnly != null ? !readOnly.equals(that.readOnly) :that.readOnly != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(pathPrefix,  readOnly,  super.hashCode());
    }

}

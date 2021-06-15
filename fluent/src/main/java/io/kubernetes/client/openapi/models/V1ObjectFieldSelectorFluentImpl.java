package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class V1ObjectFieldSelectorFluentImpl<A extends io.kubernetes.client.openapi.models.V1ObjectFieldSelectorFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1ObjectFieldSelectorFluent<A> {

    private java.lang.String apiVersion;
    private java.lang.String fieldPath;

    public V1ObjectFieldSelectorFluentImpl() {
    }

    public V1ObjectFieldSelectorFluentImpl(io.kubernetes.client.openapi.models.V1ObjectFieldSelector instance) {
        this.withApiVersion(instance.getApiVersion());
        
        this.withFieldPath(instance.getFieldPath());
    }

    public java.lang.String getApiVersion() {
        return this.apiVersion;
    }

    public A withApiVersion(java.lang.String apiVersion) {
        this.apiVersion=apiVersion; return (A) this;
    }

    public java.lang.Boolean hasApiVersion() {
        return this.apiVersion != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withApiVersion instead.
     */
        public A withNewApiVersion(java.lang.String original) {
        return (A)withApiVersion(new String(original));
    }

    public java.lang.String getFieldPath() {
        return this.fieldPath;
    }

    public A withFieldPath(java.lang.String fieldPath) {
        this.fieldPath=fieldPath; return (A) this;
    }

    public java.lang.Boolean hasFieldPath() {
        return this.fieldPath != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withFieldPath instead.
     */
        public A withNewFieldPath(java.lang.String original) {
        return (A)withFieldPath(new String(original));
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1ObjectFieldSelectorFluentImpl that = (V1ObjectFieldSelectorFluentImpl) o;
        if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
        if (fieldPath != null ? !fieldPath.equals(that.fieldPath) :that.fieldPath != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(apiVersion,  fieldPath,  super.hashCode());
    }

}

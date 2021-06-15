package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class V1TypedLocalObjectReferenceFluentImpl<A extends io.kubernetes.client.openapi.models.V1TypedLocalObjectReferenceFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1TypedLocalObjectReferenceFluent<A> {

    private java.lang.String apiGroup;
    private java.lang.String kind;
    private java.lang.String name;

    public V1TypedLocalObjectReferenceFluentImpl() {
    }

    public V1TypedLocalObjectReferenceFluentImpl(io.kubernetes.client.openapi.models.V1TypedLocalObjectReference instance) {
        this.withApiGroup(instance.getApiGroup());
        
        this.withKind(instance.getKind());
        
        this.withName(instance.getName());
    }

    public java.lang.String getApiGroup() {
        return this.apiGroup;
    }

    public A withApiGroup(java.lang.String apiGroup) {
        this.apiGroup=apiGroup; return (A) this;
    }

    public java.lang.Boolean hasApiGroup() {
        return this.apiGroup != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withApiGroup instead.
     */
        public A withNewApiGroup(java.lang.String original) {
        return (A)withApiGroup(new String(original));
    }

    public java.lang.String getKind() {
        return this.kind;
    }

    public A withKind(java.lang.String kind) {
        this.kind=kind; return (A) this;
    }

    public java.lang.Boolean hasKind() {
        return this.kind != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withKind instead.
     */
        public A withNewKind(java.lang.String original) {
        return (A)withKind(new String(original));
    }

    public java.lang.String getName() {
        return this.name;
    }

    public A withName(java.lang.String name) {
        this.name=name; return (A) this;
    }

    public java.lang.Boolean hasName() {
        return this.name != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withName instead.
     */
        public A withNewName(java.lang.String original) {
        return (A)withName(new String(original));
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1TypedLocalObjectReferenceFluentImpl that = (V1TypedLocalObjectReferenceFluentImpl) o;
        if (apiGroup != null ? !apiGroup.equals(that.apiGroup) :that.apiGroup != null) return false;
        if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
        if (name != null ? !name.equals(that.name) :that.name != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(apiGroup,  kind,  name,  super.hashCode());
    }

}

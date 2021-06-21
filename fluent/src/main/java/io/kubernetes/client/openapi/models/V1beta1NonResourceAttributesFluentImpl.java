package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class V1beta1NonResourceAttributesFluentImpl<A extends io.kubernetes.client.openapi.models.V1beta1NonResourceAttributesFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1beta1NonResourceAttributesFluent<A> {

    private java.lang.String path;
    private java.lang.String verb;

    public V1beta1NonResourceAttributesFluentImpl() {
    }

    public V1beta1NonResourceAttributesFluentImpl(io.kubernetes.client.openapi.models.V1beta1NonResourceAttributes instance) {
        this.withPath(instance.getPath());
        
        this.withVerb(instance.getVerb());
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

    public java.lang.String getVerb() {
        return this.verb;
    }

    public A withVerb(java.lang.String verb) {
        this.verb=verb; return (A) this;
    }

    public java.lang.Boolean hasVerb() {
        return this.verb != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withVerb instead.
     */
        public A withNewVerb(java.lang.String original) {
        return (A)withVerb(new String(original));
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1beta1NonResourceAttributesFluentImpl that = (V1beta1NonResourceAttributesFluentImpl) o;
        if (path != null ? !path.equals(that.path) :that.path != null) return false;
        if (verb != null ? !verb.equals(that.verb) :that.verb != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(path,  verb,  super.hashCode());
    }

}

package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class V1beta1AllowedCSIDriverFluentImpl<A extends io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriverFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriverFluent<A> {

    private java.lang.String name;

    public V1beta1AllowedCSIDriverFluentImpl() {
    }

    public V1beta1AllowedCSIDriverFluentImpl(io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriver instance) {
        this.withName(instance.getName());
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
        V1beta1AllowedCSIDriverFluentImpl that = (V1beta1AllowedCSIDriverFluentImpl) o;
        if (name != null ? !name.equals(that.name) :that.name != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(name,  super.hashCode());
    }

}

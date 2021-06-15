package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class V1ServiceBackendPortFluentImpl<A extends io.kubernetes.client.openapi.models.V1ServiceBackendPortFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1ServiceBackendPortFluent<A> {

    private java.lang.String name;
    private java.lang.Integer number;

    public V1ServiceBackendPortFluentImpl() {
    }

    public V1ServiceBackendPortFluentImpl(io.kubernetes.client.openapi.models.V1ServiceBackendPort instance) {
        this.withName(instance.getName());
        
        this.withNumber(instance.getNumber());
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

    public java.lang.Integer getNumber() {
        return this.number;
    }

    public A withNumber(java.lang.Integer number) {
        this.number=number; return (A) this;
    }

    public java.lang.Boolean hasNumber() {
        return this.number != null;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1ServiceBackendPortFluentImpl that = (V1ServiceBackendPortFluentImpl) o;
        if (name != null ? !name.equals(that.name) :that.name != null) return false;
        if (number != null ? !number.equals(that.number) :that.number != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(name,  number,  super.hashCode());
    }

}

package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class V1PodDNSConfigOptionFluentImpl<A extends io.kubernetes.client.openapi.models.V1PodDNSConfigOptionFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1PodDNSConfigOptionFluent<A> {

    private java.lang.String name;
    private java.lang.String value;

    public V1PodDNSConfigOptionFluentImpl() {
    }

    public V1PodDNSConfigOptionFluentImpl(io.kubernetes.client.openapi.models.V1PodDNSConfigOption instance) {
        this.withName(instance.getName());
        
        this.withValue(instance.getValue());
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

    public java.lang.String getValue() {
        return this.value;
    }

    public A withValue(java.lang.String value) {
        this.value=value; return (A) this;
    }

    public java.lang.Boolean hasValue() {
        return this.value != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withValue instead.
     */
        public A withNewValue(java.lang.String original) {
        return (A)withValue(new String(original));
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1PodDNSConfigOptionFluentImpl that = (V1PodDNSConfigOptionFluentImpl) o;
        if (name != null ? !name.equals(that.name) :that.name != null) return false;
        if (value != null ? !value.equals(that.value) :that.value != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(name,  value,  super.hashCode());
    }

}

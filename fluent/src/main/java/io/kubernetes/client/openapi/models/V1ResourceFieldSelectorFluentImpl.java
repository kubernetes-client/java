package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.custom.Quantity;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class V1ResourceFieldSelectorFluentImpl<A extends io.kubernetes.client.openapi.models.V1ResourceFieldSelectorFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1ResourceFieldSelectorFluent<A> {

    private java.lang.String containerName;
    private io.kubernetes.client.custom.Quantity divisor;
    private java.lang.String resource;

    public V1ResourceFieldSelectorFluentImpl() {
    }

    public V1ResourceFieldSelectorFluentImpl(io.kubernetes.client.openapi.models.V1ResourceFieldSelector instance) {
        this.withContainerName(instance.getContainerName());
        
        this.withDivisor(instance.getDivisor());
        
        this.withResource(instance.getResource());
    }

    public java.lang.String getContainerName() {
        return this.containerName;
    }

    public A withContainerName(java.lang.String containerName) {
        this.containerName=containerName; return (A) this;
    }

    public java.lang.Boolean hasContainerName() {
        return this.containerName != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withContainerName instead.
     */
        public A withNewContainerName(java.lang.String original) {
        return (A)withContainerName(new String(original));
    }

    public io.kubernetes.client.custom.Quantity getDivisor() {
        return this.divisor;
    }

    public A withDivisor(io.kubernetes.client.custom.Quantity divisor) {
        this.divisor=divisor; return (A) this;
    }

    public java.lang.Boolean hasDivisor() {
        return this.divisor != null;
    }

    public A withNewDivisor(java.lang.String value) {
        return (A)withDivisor(new Quantity(value));
    }

    public java.lang.String getResource() {
        return this.resource;
    }

    public A withResource(java.lang.String resource) {
        this.resource=resource; return (A) this;
    }

    public java.lang.Boolean hasResource() {
        return this.resource != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withResource instead.
     */
        public A withNewResource(java.lang.String original) {
        return (A)withResource(new String(original));
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1ResourceFieldSelectorFluentImpl that = (V1ResourceFieldSelectorFluentImpl) o;
        if (containerName != null ? !containerName.equals(that.containerName) :that.containerName != null) return false;
        if (divisor != null ? !divisor.equals(that.divisor) :that.divisor != null) return false;
        if (resource != null ? !resource.equals(that.resource) :that.resource != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(containerName,  divisor,  resource,  super.hashCode());
    }

}

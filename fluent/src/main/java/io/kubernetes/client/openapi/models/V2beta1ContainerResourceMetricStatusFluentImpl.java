package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.custom.Quantity;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class V2beta1ContainerResourceMetricStatusFluentImpl<A extends io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricStatusFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricStatusFluent<A> {

    private java.lang.String container;
    private java.lang.Integer currentAverageUtilization;
    private io.kubernetes.client.custom.Quantity currentAverageValue;
    private java.lang.String name;

    public V2beta1ContainerResourceMetricStatusFluentImpl() {
    }

    public V2beta1ContainerResourceMetricStatusFluentImpl(io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricStatus instance) {
        this.withContainer(instance.getContainer());
        
        this.withCurrentAverageUtilization(instance.getCurrentAverageUtilization());
        
        this.withCurrentAverageValue(instance.getCurrentAverageValue());
        
        this.withName(instance.getName());
    }

    public java.lang.String getContainer() {
        return this.container;
    }

    public A withContainer(java.lang.String container) {
        this.container=container; return (A) this;
    }

    public java.lang.Boolean hasContainer() {
        return this.container != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withContainer instead.
     */
        public A withNewContainer(java.lang.String original) {
        return (A)withContainer(new String(original));
    }

    public java.lang.Integer getCurrentAverageUtilization() {
        return this.currentAverageUtilization;
    }

    public A withCurrentAverageUtilization(java.lang.Integer currentAverageUtilization) {
        this.currentAverageUtilization=currentAverageUtilization; return (A) this;
    }

    public java.lang.Boolean hasCurrentAverageUtilization() {
        return this.currentAverageUtilization != null;
    }

    public io.kubernetes.client.custom.Quantity getCurrentAverageValue() {
        return this.currentAverageValue;
    }

    public A withCurrentAverageValue(io.kubernetes.client.custom.Quantity currentAverageValue) {
        this.currentAverageValue=currentAverageValue; return (A) this;
    }

    public java.lang.Boolean hasCurrentAverageValue() {
        return this.currentAverageValue != null;
    }

    public A withNewCurrentAverageValue(java.lang.String value) {
        return (A)withCurrentAverageValue(new Quantity(value));
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
        V2beta1ContainerResourceMetricStatusFluentImpl that = (V2beta1ContainerResourceMetricStatusFluentImpl) o;
        if (container != null ? !container.equals(that.container) :that.container != null) return false;
        if (currentAverageUtilization != null ? !currentAverageUtilization.equals(that.currentAverageUtilization) :that.currentAverageUtilization != null) return false;
        if (currentAverageValue != null ? !currentAverageValue.equals(that.currentAverageValue) :that.currentAverageValue != null) return false;
        if (name != null ? !name.equals(that.name) :that.name != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(container,  currentAverageUtilization,  currentAverageValue,  name,  super.hashCode());
    }

}

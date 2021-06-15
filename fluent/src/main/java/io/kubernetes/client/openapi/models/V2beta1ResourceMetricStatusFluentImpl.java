package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.custom.Quantity;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class V2beta1ResourceMetricStatusFluentImpl<A extends io.kubernetes.client.openapi.models.V2beta1ResourceMetricStatusFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V2beta1ResourceMetricStatusFluent<A> {

    private java.lang.Integer currentAverageUtilization;
    private io.kubernetes.client.custom.Quantity currentAverageValue;
    private java.lang.String name;

    public V2beta1ResourceMetricStatusFluentImpl() {
    }

    public V2beta1ResourceMetricStatusFluentImpl(io.kubernetes.client.openapi.models.V2beta1ResourceMetricStatus instance) {
        this.withCurrentAverageUtilization(instance.getCurrentAverageUtilization());
        
        this.withCurrentAverageValue(instance.getCurrentAverageValue());
        
        this.withName(instance.getName());
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
        V2beta1ResourceMetricStatusFluentImpl that = (V2beta1ResourceMetricStatusFluentImpl) o;
        if (currentAverageUtilization != null ? !currentAverageUtilization.equals(that.currentAverageUtilization) :that.currentAverageUtilization != null) return false;
        if (currentAverageValue != null ? !currentAverageValue.equals(that.currentAverageValue) :that.currentAverageValue != null) return false;
        if (name != null ? !name.equals(that.name) :that.name != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(currentAverageUtilization,  currentAverageValue,  name,  super.hashCode());
    }

}

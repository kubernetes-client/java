package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.custom.Quantity;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class V2beta1ResourceMetricSourceFluentImpl<A extends io.kubernetes.client.openapi.models.V2beta1ResourceMetricSourceFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V2beta1ResourceMetricSourceFluent<A> {

    private java.lang.String name;
    private java.lang.Integer targetAverageUtilization;
    private io.kubernetes.client.custom.Quantity targetAverageValue;

    public V2beta1ResourceMetricSourceFluentImpl() {
    }

    public V2beta1ResourceMetricSourceFluentImpl(io.kubernetes.client.openapi.models.V2beta1ResourceMetricSource instance) {
        this.withName(instance.getName());
        
        this.withTargetAverageUtilization(instance.getTargetAverageUtilization());
        
        this.withTargetAverageValue(instance.getTargetAverageValue());
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

    public java.lang.Integer getTargetAverageUtilization() {
        return this.targetAverageUtilization;
    }

    public A withTargetAverageUtilization(java.lang.Integer targetAverageUtilization) {
        this.targetAverageUtilization=targetAverageUtilization; return (A) this;
    }

    public java.lang.Boolean hasTargetAverageUtilization() {
        return this.targetAverageUtilization != null;
    }

    public io.kubernetes.client.custom.Quantity getTargetAverageValue() {
        return this.targetAverageValue;
    }

    public A withTargetAverageValue(io.kubernetes.client.custom.Quantity targetAverageValue) {
        this.targetAverageValue=targetAverageValue; return (A) this;
    }

    public java.lang.Boolean hasTargetAverageValue() {
        return this.targetAverageValue != null;
    }

    public A withNewTargetAverageValue(java.lang.String value) {
        return (A)withTargetAverageValue(new Quantity(value));
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V2beta1ResourceMetricSourceFluentImpl that = (V2beta1ResourceMetricSourceFluentImpl) o;
        if (name != null ? !name.equals(that.name) :that.name != null) return false;
        if (targetAverageUtilization != null ? !targetAverageUtilization.equals(that.targetAverageUtilization) :that.targetAverageUtilization != null) return false;
        if (targetAverageValue != null ? !targetAverageValue.equals(that.targetAverageValue) :that.targetAverageValue != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(name,  targetAverageUtilization,  targetAverageValue,  super.hashCode());
    }

}

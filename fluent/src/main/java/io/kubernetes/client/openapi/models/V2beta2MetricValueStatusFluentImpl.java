package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.custom.Quantity;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class V2beta2MetricValueStatusFluentImpl<A extends io.kubernetes.client.openapi.models.V2beta2MetricValueStatusFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V2beta2MetricValueStatusFluent<A> {

    private java.lang.Integer averageUtilization;
    private io.kubernetes.client.custom.Quantity averageValue;
    private io.kubernetes.client.custom.Quantity value;

    public V2beta2MetricValueStatusFluentImpl() {
    }

    public V2beta2MetricValueStatusFluentImpl(io.kubernetes.client.openapi.models.V2beta2MetricValueStatus instance) {
        this.withAverageUtilization(instance.getAverageUtilization());
        
        this.withAverageValue(instance.getAverageValue());
        
        this.withValue(instance.getValue());
    }

    public java.lang.Integer getAverageUtilization() {
        return this.averageUtilization;
    }

    public A withAverageUtilization(java.lang.Integer averageUtilization) {
        this.averageUtilization=averageUtilization; return (A) this;
    }

    public java.lang.Boolean hasAverageUtilization() {
        return this.averageUtilization != null;
    }

    public io.kubernetes.client.custom.Quantity getAverageValue() {
        return this.averageValue;
    }

    public A withAverageValue(io.kubernetes.client.custom.Quantity averageValue) {
        this.averageValue=averageValue; return (A) this;
    }

    public java.lang.Boolean hasAverageValue() {
        return this.averageValue != null;
    }

    public A withNewAverageValue(java.lang.String value) {
        return (A)withAverageValue(new Quantity(value));
    }

    public io.kubernetes.client.custom.Quantity getValue() {
        return this.value;
    }

    public A withValue(io.kubernetes.client.custom.Quantity value) {
        this.value=value; return (A) this;
    }

    public java.lang.Boolean hasValue() {
        return this.value != null;
    }

    public A withNewValue(java.lang.String value) {
        return (A)withValue(new Quantity(value));
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V2beta2MetricValueStatusFluentImpl that = (V2beta2MetricValueStatusFluentImpl) o;
        if (averageUtilization != null ? !averageUtilization.equals(that.averageUtilization) :that.averageUtilization != null) return false;
        if (averageValue != null ? !averageValue.equals(that.averageValue) :that.averageValue != null) return false;
        if (value != null ? !value.equals(that.value) :that.value != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(averageUtilization,  averageValue,  value,  super.hashCode());
    }

}

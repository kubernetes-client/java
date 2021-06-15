package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class V2beta2HPAScalingPolicyFluentImpl<A extends io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicyFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicyFluent<A> {

    private java.lang.Integer periodSeconds;
    private java.lang.String type;
    private java.lang.Integer value;

    public V2beta2HPAScalingPolicyFluentImpl() {
    }

    public V2beta2HPAScalingPolicyFluentImpl(io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicy instance) {
        this.withPeriodSeconds(instance.getPeriodSeconds());
        
        this.withType(instance.getType());
        
        this.withValue(instance.getValue());
    }

    public java.lang.Integer getPeriodSeconds() {
        return this.periodSeconds;
    }

    public A withPeriodSeconds(java.lang.Integer periodSeconds) {
        this.periodSeconds=periodSeconds; return (A) this;
    }

    public java.lang.Boolean hasPeriodSeconds() {
        return this.periodSeconds != null;
    }

    public java.lang.String getType() {
        return this.type;
    }

    public A withType(java.lang.String type) {
        this.type=type; return (A) this;
    }

    public java.lang.Boolean hasType() {
        return this.type != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withType instead.
     */
        public A withNewType(java.lang.String original) {
        return (A)withType(new String(original));
    }

    public java.lang.Integer getValue() {
        return this.value;
    }

    public A withValue(java.lang.Integer value) {
        this.value=value; return (A) this;
    }

    public java.lang.Boolean hasValue() {
        return this.value != null;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V2beta2HPAScalingPolicyFluentImpl that = (V2beta2HPAScalingPolicyFluentImpl) o;
        if (periodSeconds != null ? !periodSeconds.equals(that.periodSeconds) :that.periodSeconds != null) return false;
        if (type != null ? !type.equals(that.type) :that.type != null) return false;
        if (value != null ? !value.equals(that.value) :that.value != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(periodSeconds,  type,  value,  super.hashCode());
    }

}

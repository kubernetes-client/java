package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class V1beta1HostPortRangeFluentImpl<A extends io.kubernetes.client.openapi.models.V1beta1HostPortRangeFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1beta1HostPortRangeFluent<A> {

    private java.lang.Integer max;
    private java.lang.Integer min;

    public V1beta1HostPortRangeFluentImpl() {
    }

    public V1beta1HostPortRangeFluentImpl(io.kubernetes.client.openapi.models.V1beta1HostPortRange instance) {
        this.withMax(instance.getMax());
        
        this.withMin(instance.getMin());
    }

    public java.lang.Integer getMax() {
        return this.max;
    }

    public A withMax(java.lang.Integer max) {
        this.max=max; return (A) this;
    }

    public java.lang.Boolean hasMax() {
        return this.max != null;
    }

    public java.lang.Integer getMin() {
        return this.min;
    }

    public A withMin(java.lang.Integer min) {
        this.min=min; return (A) this;
    }

    public java.lang.Boolean hasMin() {
        return this.min != null;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1beta1HostPortRangeFluentImpl that = (V1beta1HostPortRangeFluentImpl) o;
        if (max != null ? !max.equals(that.max) :that.max != null) return false;
        if (min != null ? !min.equals(that.min) :that.min != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(max,  min,  super.hashCode());
    }

}

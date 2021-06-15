package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class V1VolumeNodeResourcesFluentImpl<A extends io.kubernetes.client.openapi.models.V1VolumeNodeResourcesFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1VolumeNodeResourcesFluent<A> {

    private java.lang.Integer count;

    public V1VolumeNodeResourcesFluentImpl() {
    }

    public V1VolumeNodeResourcesFluentImpl(io.kubernetes.client.openapi.models.V1VolumeNodeResources instance) {
        this.withCount(instance.getCount());
    }

    public java.lang.Integer getCount() {
        return this.count;
    }

    public A withCount(java.lang.Integer count) {
        this.count=count; return (A) this;
    }

    public java.lang.Boolean hasCount() {
        return this.count != null;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1VolumeNodeResourcesFluentImpl that = (V1VolumeNodeResourcesFluentImpl) o;
        if (count != null ? !count.equals(that.count) :that.count != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(count,  super.hashCode());
    }

}

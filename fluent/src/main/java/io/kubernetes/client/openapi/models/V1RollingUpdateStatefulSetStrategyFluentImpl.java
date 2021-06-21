package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class V1RollingUpdateStatefulSetStrategyFluentImpl<A extends io.kubernetes.client.openapi.models.V1RollingUpdateStatefulSetStrategyFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1RollingUpdateStatefulSetStrategyFluent<A> {

    private java.lang.Integer partition;

    public V1RollingUpdateStatefulSetStrategyFluentImpl() {
    }

    public V1RollingUpdateStatefulSetStrategyFluentImpl(io.kubernetes.client.openapi.models.V1RollingUpdateStatefulSetStrategy instance) {
        this.withPartition(instance.getPartition());
    }

    public java.lang.Integer getPartition() {
        return this.partition;
    }

    public A withPartition(java.lang.Integer partition) {
        this.partition=partition; return (A) this;
    }

    public java.lang.Boolean hasPartition() {
        return this.partition != null;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1RollingUpdateStatefulSetStrategyFluentImpl that = (V1RollingUpdateStatefulSetStrategyFluentImpl) o;
        if (partition != null ? !partition.equals(that.partition) :that.partition != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(partition,  super.hashCode());
    }

}

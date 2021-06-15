package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class V1ScaleSpecFluentImpl<A extends io.kubernetes.client.openapi.models.V1ScaleSpecFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1ScaleSpecFluent<A> {

    private java.lang.Integer replicas;

    public V1ScaleSpecFluentImpl() {
    }

    public V1ScaleSpecFluentImpl(io.kubernetes.client.openapi.models.V1ScaleSpec instance) {
        this.withReplicas(instance.getReplicas());
    }

    public java.lang.Integer getReplicas() {
        return this.replicas;
    }

    public A withReplicas(java.lang.Integer replicas) {
        this.replicas=replicas; return (A) this;
    }

    public java.lang.Boolean hasReplicas() {
        return this.replicas != null;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1ScaleSpecFluentImpl that = (V1ScaleSpecFluentImpl) o;
        if (replicas != null ? !replicas.equals(that.replicas) :that.replicas != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(replicas,  super.hashCode());
    }

}

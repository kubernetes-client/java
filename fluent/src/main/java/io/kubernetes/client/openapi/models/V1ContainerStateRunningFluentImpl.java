package io.kubernetes.client.openapi.models;

import java.time.OffsetDateTime;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class V1ContainerStateRunningFluentImpl<A extends io.kubernetes.client.openapi.models.V1ContainerStateRunningFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1ContainerStateRunningFluent<A> {

    private java.time.OffsetDateTime startedAt;

    public V1ContainerStateRunningFluentImpl() {
    }

    public V1ContainerStateRunningFluentImpl(io.kubernetes.client.openapi.models.V1ContainerStateRunning instance) {
        this.withStartedAt(instance.getStartedAt());
    }

    public java.time.OffsetDateTime getStartedAt() {
        return this.startedAt;
    }

    public A withStartedAt(java.time.OffsetDateTime startedAt) {
        this.startedAt=startedAt; return (A) this;
    }

    public java.lang.Boolean hasStartedAt() {
        return this.startedAt != null;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1ContainerStateRunningFluentImpl that = (V1ContainerStateRunningFluentImpl) o;
        if (startedAt != null ? !startedAt.equals(that.startedAt) :that.startedAt != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(startedAt,  super.hashCode());
    }

}

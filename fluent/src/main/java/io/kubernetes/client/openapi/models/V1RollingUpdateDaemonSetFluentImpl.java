package io.kubernetes.client.openapi.models;

import io.kubernetes.client.custom.IntOrString;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class V1RollingUpdateDaemonSetFluentImpl<A extends io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSetFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSetFluent<A> {

    private io.kubernetes.client.custom.IntOrString maxUnavailable;

    public V1RollingUpdateDaemonSetFluentImpl() {
    }

    public V1RollingUpdateDaemonSetFluentImpl(io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSet instance) {
        this.withMaxUnavailable(instance.getMaxUnavailable());
    }

    public io.kubernetes.client.custom.IntOrString getMaxUnavailable() {
        return this.maxUnavailable;
    }

    public A withMaxUnavailable(io.kubernetes.client.custom.IntOrString maxUnavailable) {
        this.maxUnavailable=maxUnavailable; return (A) this;
    }

    public java.lang.Boolean hasMaxUnavailable() {
        return this.maxUnavailable != null;
    }

    public A withNewMaxUnavailable(int value) {
        return (A)withMaxUnavailable(new IntOrString(value));
    }

    public A withNewMaxUnavailable(java.lang.String value) {
        return (A)withMaxUnavailable(new IntOrString(value));
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1RollingUpdateDaemonSetFluentImpl that = (V1RollingUpdateDaemonSetFluentImpl) o;
        if (maxUnavailable != null ? !maxUnavailable.equals(that.maxUnavailable) :that.maxUnavailable != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(maxUnavailable,  super.hashCode());
    }

}

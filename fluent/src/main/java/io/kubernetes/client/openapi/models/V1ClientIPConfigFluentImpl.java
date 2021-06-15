package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class V1ClientIPConfigFluentImpl<A extends io.kubernetes.client.openapi.models.V1ClientIPConfigFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1ClientIPConfigFluent<A> {

    private java.lang.Integer timeoutSeconds;

    public V1ClientIPConfigFluentImpl() {
    }

    public V1ClientIPConfigFluentImpl(io.kubernetes.client.openapi.models.V1ClientIPConfig instance) {
        this.withTimeoutSeconds(instance.getTimeoutSeconds());
    }

    public java.lang.Integer getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

    public A withTimeoutSeconds(java.lang.Integer timeoutSeconds) {
        this.timeoutSeconds=timeoutSeconds; return (A) this;
    }

    public java.lang.Boolean hasTimeoutSeconds() {
        return this.timeoutSeconds != null;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1ClientIPConfigFluentImpl that = (V1ClientIPConfigFluentImpl) o;
        if (timeoutSeconds != null ? !timeoutSeconds.equals(that.timeoutSeconds) :that.timeoutSeconds != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(timeoutSeconds,  super.hashCode());
    }

}

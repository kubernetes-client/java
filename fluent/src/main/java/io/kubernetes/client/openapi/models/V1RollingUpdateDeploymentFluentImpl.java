package io.kubernetes.client.openapi.models;

import io.kubernetes.client.custom.IntOrString;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class V1RollingUpdateDeploymentFluentImpl<A extends io.kubernetes.client.openapi.models.V1RollingUpdateDeploymentFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1RollingUpdateDeploymentFluent<A> {

    private io.kubernetes.client.custom.IntOrString maxSurge;
    private io.kubernetes.client.custom.IntOrString maxUnavailable;

    public V1RollingUpdateDeploymentFluentImpl() {
    }

    public V1RollingUpdateDeploymentFluentImpl(io.kubernetes.client.openapi.models.V1RollingUpdateDeployment instance) {
        this.withMaxSurge(instance.getMaxSurge());
        
        this.withMaxUnavailable(instance.getMaxUnavailable());
    }

    public io.kubernetes.client.custom.IntOrString getMaxSurge() {
        return this.maxSurge;
    }

    public A withMaxSurge(io.kubernetes.client.custom.IntOrString maxSurge) {
        this.maxSurge=maxSurge; return (A) this;
    }

    public java.lang.Boolean hasMaxSurge() {
        return this.maxSurge != null;
    }

    public A withNewMaxSurge(int value) {
        return (A)withMaxSurge(new IntOrString(value));
    }

    public A withNewMaxSurge(java.lang.String value) {
        return (A)withMaxSurge(new IntOrString(value));
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
        V1RollingUpdateDeploymentFluentImpl that = (V1RollingUpdateDeploymentFluentImpl) o;
        if (maxSurge != null ? !maxSurge.equals(that.maxSurge) :that.maxSurge != null) return false;
        if (maxUnavailable != null ? !maxUnavailable.equals(that.maxUnavailable) :that.maxUnavailable != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(maxSurge,  maxUnavailable,  super.hashCode());
    }

}

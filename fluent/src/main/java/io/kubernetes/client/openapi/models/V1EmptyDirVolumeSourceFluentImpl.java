package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.custom.Quantity;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class V1EmptyDirVolumeSourceFluentImpl<A extends io.kubernetes.client.openapi.models.V1EmptyDirVolumeSourceFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1EmptyDirVolumeSourceFluent<A> {

    private java.lang.String medium;
    private io.kubernetes.client.custom.Quantity sizeLimit;

    public V1EmptyDirVolumeSourceFluentImpl() {
    }

    public V1EmptyDirVolumeSourceFluentImpl(io.kubernetes.client.openapi.models.V1EmptyDirVolumeSource instance) {
        this.withMedium(instance.getMedium());
        
        this.withSizeLimit(instance.getSizeLimit());
    }

    public java.lang.String getMedium() {
        return this.medium;
    }

    public A withMedium(java.lang.String medium) {
        this.medium=medium; return (A) this;
    }

    public java.lang.Boolean hasMedium() {
        return this.medium != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withMedium instead.
     */
        public A withNewMedium(java.lang.String original) {
        return (A)withMedium(new String(original));
    }

    public io.kubernetes.client.custom.Quantity getSizeLimit() {
        return this.sizeLimit;
    }

    public A withSizeLimit(io.kubernetes.client.custom.Quantity sizeLimit) {
        this.sizeLimit=sizeLimit; return (A) this;
    }

    public java.lang.Boolean hasSizeLimit() {
        return this.sizeLimit != null;
    }

    public A withNewSizeLimit(java.lang.String value) {
        return (A)withSizeLimit(new Quantity(value));
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1EmptyDirVolumeSourceFluentImpl that = (V1EmptyDirVolumeSourceFluentImpl) o;
        if (medium != null ? !medium.equals(that.medium) :that.medium != null) return false;
        if (sizeLimit != null ? !sizeLimit.equals(that.sizeLimit) :that.sizeLimit != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(medium,  sizeLimit,  super.hashCode());
    }

}

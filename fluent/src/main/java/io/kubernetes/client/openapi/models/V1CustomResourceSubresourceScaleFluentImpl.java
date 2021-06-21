package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class V1CustomResourceSubresourceScaleFluentImpl<A extends io.kubernetes.client.openapi.models.V1CustomResourceSubresourceScaleFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1CustomResourceSubresourceScaleFluent<A> {

    private java.lang.String labelSelectorPath;
    private java.lang.String specReplicasPath;
    private java.lang.String statusReplicasPath;

    public V1CustomResourceSubresourceScaleFluentImpl() {
    }

    public V1CustomResourceSubresourceScaleFluentImpl(io.kubernetes.client.openapi.models.V1CustomResourceSubresourceScale instance) {
        this.withLabelSelectorPath(instance.getLabelSelectorPath());
        
        this.withSpecReplicasPath(instance.getSpecReplicasPath());
        
        this.withStatusReplicasPath(instance.getStatusReplicasPath());
    }

    public java.lang.String getLabelSelectorPath() {
        return this.labelSelectorPath;
    }

    public A withLabelSelectorPath(java.lang.String labelSelectorPath) {
        this.labelSelectorPath=labelSelectorPath; return (A) this;
    }

    public java.lang.Boolean hasLabelSelectorPath() {
        return this.labelSelectorPath != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withLabelSelectorPath instead.
     */
        public A withNewLabelSelectorPath(java.lang.String original) {
        return (A)withLabelSelectorPath(new String(original));
    }

    public java.lang.String getSpecReplicasPath() {
        return this.specReplicasPath;
    }

    public A withSpecReplicasPath(java.lang.String specReplicasPath) {
        this.specReplicasPath=specReplicasPath; return (A) this;
    }

    public java.lang.Boolean hasSpecReplicasPath() {
        return this.specReplicasPath != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withSpecReplicasPath instead.
     */
        public A withNewSpecReplicasPath(java.lang.String original) {
        return (A)withSpecReplicasPath(new String(original));
    }

    public java.lang.String getStatusReplicasPath() {
        return this.statusReplicasPath;
    }

    public A withStatusReplicasPath(java.lang.String statusReplicasPath) {
        this.statusReplicasPath=statusReplicasPath; return (A) this;
    }

    public java.lang.Boolean hasStatusReplicasPath() {
        return this.statusReplicasPath != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withStatusReplicasPath instead.
     */
        public A withNewStatusReplicasPath(java.lang.String original) {
        return (A)withStatusReplicasPath(new String(original));
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1CustomResourceSubresourceScaleFluentImpl that = (V1CustomResourceSubresourceScaleFluentImpl) o;
        if (labelSelectorPath != null ? !labelSelectorPath.equals(that.labelSelectorPath) :that.labelSelectorPath != null) return false;
        if (specReplicasPath != null ? !specReplicasPath.equals(that.specReplicasPath) :that.specReplicasPath != null) return false;
        if (statusReplicasPath != null ? !statusReplicasPath.equals(that.statusReplicasPath) :that.statusReplicasPath != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(labelSelectorPath,  specReplicasPath,  statusReplicasPath,  super.hashCode());
    }

}

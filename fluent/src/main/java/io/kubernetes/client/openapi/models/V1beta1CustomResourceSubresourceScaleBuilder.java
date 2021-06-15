package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1beta1CustomResourceSubresourceScaleBuilder extends io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresourceScaleFluentImpl<io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresourceScaleBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresourceScale,io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresourceScaleBuilder> {

    io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresourceScaleFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1beta1CustomResourceSubresourceScaleBuilder() {
        this(true);
    }

    public V1beta1CustomResourceSubresourceScaleBuilder(java.lang.Boolean validationEnabled) {
        this(new V1beta1CustomResourceSubresourceScale(), validationEnabled);
    }

    public V1beta1CustomResourceSubresourceScaleBuilder(io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresourceScaleFluent<?> fluent) {
        this(fluent, true);
    }

    public V1beta1CustomResourceSubresourceScaleBuilder(io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresourceScaleFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1beta1CustomResourceSubresourceScale(), validationEnabled);
    }

    public V1beta1CustomResourceSubresourceScaleBuilder(io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresourceScaleFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresourceScale instance) {
        this(fluent, instance, true);
    }

    public V1beta1CustomResourceSubresourceScaleBuilder(io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresourceScaleFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresourceScale instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withLabelSelectorPath(instance.getLabelSelectorPath());
        
        fluent.withSpecReplicasPath(instance.getSpecReplicasPath());
        
        fluent.withStatusReplicasPath(instance.getStatusReplicasPath());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1beta1CustomResourceSubresourceScaleBuilder(io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresourceScale instance) {
        this(instance,true);
    }

    public V1beta1CustomResourceSubresourceScaleBuilder(io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresourceScale instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withLabelSelectorPath(instance.getLabelSelectorPath());
        
        this.withSpecReplicasPath(instance.getSpecReplicasPath());
        
        this.withStatusReplicasPath(instance.getStatusReplicasPath());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceSubresourceScale build() {
        V1beta1CustomResourceSubresourceScale buildable = new V1beta1CustomResourceSubresourceScale();
        buildable.setLabelSelectorPath(fluent.getLabelSelectorPath());
        buildable.setSpecReplicasPath(fluent.getSpecReplicasPath());
        buildable.setStatusReplicasPath(fluent.getStatusReplicasPath());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1beta1CustomResourceSubresourceScaleBuilder that = (V1beta1CustomResourceSubresourceScaleBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}

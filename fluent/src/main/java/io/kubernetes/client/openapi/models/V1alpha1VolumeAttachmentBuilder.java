package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1alpha1VolumeAttachmentBuilder extends io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentFluentImpl<io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1alpha1VolumeAttachment,io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentBuilder> {

    io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1alpha1VolumeAttachmentBuilder() {
        this(true);
    }

    public V1alpha1VolumeAttachmentBuilder(java.lang.Boolean validationEnabled) {
        this(new V1alpha1VolumeAttachment(), validationEnabled);
    }

    public V1alpha1VolumeAttachmentBuilder(io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentFluent<?> fluent) {
        this(fluent, true);
    }

    public V1alpha1VolumeAttachmentBuilder(io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1alpha1VolumeAttachment(), validationEnabled);
    }

    public V1alpha1VolumeAttachmentBuilder(io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentFluent<?> fluent,io.kubernetes.client.openapi.models.V1alpha1VolumeAttachment instance) {
        this(fluent, instance, true);
    }

    public V1alpha1VolumeAttachmentBuilder(io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentFluent<?> fluent,io.kubernetes.client.openapi.models.V1alpha1VolumeAttachment instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withApiVersion(instance.getApiVersion());
        
        fluent.withKind(instance.getKind());
        
        fluent.withMetadata(instance.getMetadata());
        
        fluent.withSpec(instance.getSpec());
        
        fluent.withStatus(instance.getStatus());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1alpha1VolumeAttachmentBuilder(io.kubernetes.client.openapi.models.V1alpha1VolumeAttachment instance) {
        this(instance,true);
    }

    public V1alpha1VolumeAttachmentBuilder(io.kubernetes.client.openapi.models.V1alpha1VolumeAttachment instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withApiVersion(instance.getApiVersion());
        
        this.withKind(instance.getKind());
        
        this.withMetadata(instance.getMetadata());
        
        this.withSpec(instance.getSpec());
        
        this.withStatus(instance.getStatus());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1alpha1VolumeAttachment build() {
        V1alpha1VolumeAttachment buildable = new V1alpha1VolumeAttachment();
        buildable.setApiVersion(fluent.getApiVersion());
        buildable.setKind(fluent.getKind());
        buildable.setMetadata(fluent.getMetadata());
        buildable.setSpec(fluent.getSpec());
        buildable.setStatus(fluent.getStatus());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1alpha1VolumeAttachmentBuilder that = (V1alpha1VolumeAttachmentBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}

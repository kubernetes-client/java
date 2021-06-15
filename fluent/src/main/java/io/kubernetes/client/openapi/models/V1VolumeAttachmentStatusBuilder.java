package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1VolumeAttachmentStatusBuilder extends io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusFluentImpl<io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1VolumeAttachmentStatus,io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusBuilder> {

    io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1VolumeAttachmentStatusBuilder() {
        this(true);
    }

    public V1VolumeAttachmentStatusBuilder(java.lang.Boolean validationEnabled) {
        this(new V1VolumeAttachmentStatus(), validationEnabled);
    }

    public V1VolumeAttachmentStatusBuilder(io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusFluent<?> fluent) {
        this(fluent, true);
    }

    public V1VolumeAttachmentStatusBuilder(io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1VolumeAttachmentStatus(), validationEnabled);
    }

    public V1VolumeAttachmentStatusBuilder(io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V1VolumeAttachmentStatus instance) {
        this(fluent, instance, true);
    }

    public V1VolumeAttachmentStatusBuilder(io.kubernetes.client.openapi.models.V1VolumeAttachmentStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V1VolumeAttachmentStatus instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withAttachError(instance.getAttachError());
        
        fluent.withAttached(instance.getAttached());
        
        fluent.withAttachmentMetadata(instance.getAttachmentMetadata());
        
        fluent.withDetachError(instance.getDetachError());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1VolumeAttachmentStatusBuilder(io.kubernetes.client.openapi.models.V1VolumeAttachmentStatus instance) {
        this(instance,true);
    }

    public V1VolumeAttachmentStatusBuilder(io.kubernetes.client.openapi.models.V1VolumeAttachmentStatus instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withAttachError(instance.getAttachError());
        
        this.withAttached(instance.getAttached());
        
        this.withAttachmentMetadata(instance.getAttachmentMetadata());
        
        this.withDetachError(instance.getDetachError());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1VolumeAttachmentStatus build() {
        V1VolumeAttachmentStatus buildable = new V1VolumeAttachmentStatus();
        buildable.setAttachError(fluent.getAttachError());
        buildable.setAttached(fluent.getAttached());
        buildable.setAttachmentMetadata(fluent.getAttachmentMetadata());
        buildable.setDetachError(fluent.getDetachError());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1VolumeAttachmentStatusBuilder that = (V1VolumeAttachmentStatusBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}

package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1AttachedVolumeBuilder extends io.kubernetes.client.openapi.models.V1AttachedVolumeFluentImpl<io.kubernetes.client.openapi.models.V1AttachedVolumeBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1AttachedVolume,io.kubernetes.client.openapi.models.V1AttachedVolumeBuilder> {

    io.kubernetes.client.openapi.models.V1AttachedVolumeFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1AttachedVolumeBuilder() {
        this(true);
    }

    public V1AttachedVolumeBuilder(java.lang.Boolean validationEnabled) {
        this(new V1AttachedVolume(), validationEnabled);
    }

    public V1AttachedVolumeBuilder(io.kubernetes.client.openapi.models.V1AttachedVolumeFluent<?> fluent) {
        this(fluent, true);
    }

    public V1AttachedVolumeBuilder(io.kubernetes.client.openapi.models.V1AttachedVolumeFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1AttachedVolume(), validationEnabled);
    }

    public V1AttachedVolumeBuilder(io.kubernetes.client.openapi.models.V1AttachedVolumeFluent<?> fluent,io.kubernetes.client.openapi.models.V1AttachedVolume instance) {
        this(fluent, instance, true);
    }

    public V1AttachedVolumeBuilder(io.kubernetes.client.openapi.models.V1AttachedVolumeFluent<?> fluent,io.kubernetes.client.openapi.models.V1AttachedVolume instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withDevicePath(instance.getDevicePath());
        
        fluent.withName(instance.getName());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1AttachedVolumeBuilder(io.kubernetes.client.openapi.models.V1AttachedVolume instance) {
        this(instance,true);
    }

    public V1AttachedVolumeBuilder(io.kubernetes.client.openapi.models.V1AttachedVolume instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withDevicePath(instance.getDevicePath());
        
        this.withName(instance.getName());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1AttachedVolume build() {
        V1AttachedVolume buildable = new V1AttachedVolume();
        buildable.setDevicePath(fluent.getDevicePath());
        buildable.setName(fluent.getName());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1AttachedVolumeBuilder that = (V1AttachedVolumeBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}

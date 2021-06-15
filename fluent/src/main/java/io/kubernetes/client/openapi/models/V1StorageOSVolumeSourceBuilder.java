package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1StorageOSVolumeSourceBuilder extends io.kubernetes.client.openapi.models.V1StorageOSVolumeSourceFluentImpl<io.kubernetes.client.openapi.models.V1StorageOSVolumeSourceBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1StorageOSVolumeSource,io.kubernetes.client.openapi.models.V1StorageOSVolumeSourceBuilder> {

    io.kubernetes.client.openapi.models.V1StorageOSVolumeSourceFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1StorageOSVolumeSourceBuilder() {
        this(true);
    }

    public V1StorageOSVolumeSourceBuilder(java.lang.Boolean validationEnabled) {
        this(new V1StorageOSVolumeSource(), validationEnabled);
    }

    public V1StorageOSVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1StorageOSVolumeSourceFluent<?> fluent) {
        this(fluent, true);
    }

    public V1StorageOSVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1StorageOSVolumeSourceFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1StorageOSVolumeSource(), validationEnabled);
    }

    public V1StorageOSVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1StorageOSVolumeSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1StorageOSVolumeSource instance) {
        this(fluent, instance, true);
    }

    public V1StorageOSVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1StorageOSVolumeSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1StorageOSVolumeSource instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withFsType(instance.getFsType());
        
        fluent.withReadOnly(instance.getReadOnly());
        
        fluent.withSecretRef(instance.getSecretRef());
        
        fluent.withVolumeName(instance.getVolumeName());
        
        fluent.withVolumeNamespace(instance.getVolumeNamespace());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1StorageOSVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1StorageOSVolumeSource instance) {
        this(instance,true);
    }

    public V1StorageOSVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1StorageOSVolumeSource instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withFsType(instance.getFsType());
        
        this.withReadOnly(instance.getReadOnly());
        
        this.withSecretRef(instance.getSecretRef());
        
        this.withVolumeName(instance.getVolumeName());
        
        this.withVolumeNamespace(instance.getVolumeNamespace());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1StorageOSVolumeSource build() {
        V1StorageOSVolumeSource buildable = new V1StorageOSVolumeSource();
        buildable.setFsType(fluent.getFsType());
        buildable.setReadOnly(fluent.getReadOnly());
        buildable.setSecretRef(fluent.getSecretRef());
        buildable.setVolumeName(fluent.getVolumeName());
        buildable.setVolumeNamespace(fluent.getVolumeNamespace());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1StorageOSVolumeSourceBuilder that = (V1StorageOSVolumeSourceBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}

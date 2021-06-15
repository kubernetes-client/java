package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1StorageOSPersistentVolumeSourceBuilder extends io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSourceFluentImpl<io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSourceBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSource,io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSourceBuilder> {

    io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSourceFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1StorageOSPersistentVolumeSourceBuilder() {
        this(true);
    }

    public V1StorageOSPersistentVolumeSourceBuilder(java.lang.Boolean validationEnabled) {
        this(new V1StorageOSPersistentVolumeSource(), validationEnabled);
    }

    public V1StorageOSPersistentVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSourceFluent<?> fluent) {
        this(fluent, true);
    }

    public V1StorageOSPersistentVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSourceFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1StorageOSPersistentVolumeSource(), validationEnabled);
    }

    public V1StorageOSPersistentVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSource instance) {
        this(fluent, instance, true);
    }

    public V1StorageOSPersistentVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSource instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withFsType(instance.getFsType());
        
        fluent.withReadOnly(instance.getReadOnly());
        
        fluent.withSecretRef(instance.getSecretRef());
        
        fluent.withVolumeName(instance.getVolumeName());
        
        fluent.withVolumeNamespace(instance.getVolumeNamespace());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1StorageOSPersistentVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSource instance) {
        this(instance,true);
    }

    public V1StorageOSPersistentVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSource instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withFsType(instance.getFsType());
        
        this.withReadOnly(instance.getReadOnly());
        
        this.withSecretRef(instance.getSecretRef());
        
        this.withVolumeName(instance.getVolumeName());
        
        this.withVolumeNamespace(instance.getVolumeNamespace());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSource build() {
        V1StorageOSPersistentVolumeSource buildable = new V1StorageOSPersistentVolumeSource();
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
        V1StorageOSPersistentVolumeSourceBuilder that = (V1StorageOSPersistentVolumeSourceBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}

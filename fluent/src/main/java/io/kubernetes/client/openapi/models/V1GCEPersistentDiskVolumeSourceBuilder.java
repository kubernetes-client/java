package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1GCEPersistentDiskVolumeSourceBuilder extends io.kubernetes.client.openapi.models.V1GCEPersistentDiskVolumeSourceFluentImpl<io.kubernetes.client.openapi.models.V1GCEPersistentDiskVolumeSourceBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1GCEPersistentDiskVolumeSource,io.kubernetes.client.openapi.models.V1GCEPersistentDiskVolumeSourceBuilder> {

    io.kubernetes.client.openapi.models.V1GCEPersistentDiskVolumeSourceFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1GCEPersistentDiskVolumeSourceBuilder() {
        this(true);
    }

    public V1GCEPersistentDiskVolumeSourceBuilder(java.lang.Boolean validationEnabled) {
        this(new V1GCEPersistentDiskVolumeSource(), validationEnabled);
    }

    public V1GCEPersistentDiskVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1GCEPersistentDiskVolumeSourceFluent<?> fluent) {
        this(fluent, true);
    }

    public V1GCEPersistentDiskVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1GCEPersistentDiskVolumeSourceFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1GCEPersistentDiskVolumeSource(), validationEnabled);
    }

    public V1GCEPersistentDiskVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1GCEPersistentDiskVolumeSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1GCEPersistentDiskVolumeSource instance) {
        this(fluent, instance, true);
    }

    public V1GCEPersistentDiskVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1GCEPersistentDiskVolumeSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1GCEPersistentDiskVolumeSource instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withFsType(instance.getFsType());
        
        fluent.withPartition(instance.getPartition());
        
        fluent.withPdName(instance.getPdName());
        
        fluent.withReadOnly(instance.getReadOnly());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1GCEPersistentDiskVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1GCEPersistentDiskVolumeSource instance) {
        this(instance,true);
    }

    public V1GCEPersistentDiskVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1GCEPersistentDiskVolumeSource instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withFsType(instance.getFsType());
        
        this.withPartition(instance.getPartition());
        
        this.withPdName(instance.getPdName());
        
        this.withReadOnly(instance.getReadOnly());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1GCEPersistentDiskVolumeSource build() {
        V1GCEPersistentDiskVolumeSource buildable = new V1GCEPersistentDiskVolumeSource();
        buildable.setFsType(fluent.getFsType());
        buildable.setPartition(fluent.getPartition());
        buildable.setPdName(fluent.getPdName());
        buildable.setReadOnly(fluent.getReadOnly());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1GCEPersistentDiskVolumeSourceBuilder that = (V1GCEPersistentDiskVolumeSourceBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}

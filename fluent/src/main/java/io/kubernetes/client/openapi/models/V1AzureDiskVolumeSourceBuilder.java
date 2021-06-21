package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1AzureDiskVolumeSourceBuilder extends io.kubernetes.client.openapi.models.V1AzureDiskVolumeSourceFluentImpl<io.kubernetes.client.openapi.models.V1AzureDiskVolumeSourceBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1AzureDiskVolumeSource,io.kubernetes.client.openapi.models.V1AzureDiskVolumeSourceBuilder> {

    io.kubernetes.client.openapi.models.V1AzureDiskVolumeSourceFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1AzureDiskVolumeSourceBuilder() {
        this(true);
    }

    public V1AzureDiskVolumeSourceBuilder(java.lang.Boolean validationEnabled) {
        this(new V1AzureDiskVolumeSource(), validationEnabled);
    }

    public V1AzureDiskVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1AzureDiskVolumeSourceFluent<?> fluent) {
        this(fluent, true);
    }

    public V1AzureDiskVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1AzureDiskVolumeSourceFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1AzureDiskVolumeSource(), validationEnabled);
    }

    public V1AzureDiskVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1AzureDiskVolumeSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1AzureDiskVolumeSource instance) {
        this(fluent, instance, true);
    }

    public V1AzureDiskVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1AzureDiskVolumeSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1AzureDiskVolumeSource instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withCachingMode(instance.getCachingMode());
        
        fluent.withDiskName(instance.getDiskName());
        
        fluent.withDiskURI(instance.getDiskURI());
        
        fluent.withFsType(instance.getFsType());
        
        fluent.withKind(instance.getKind());
        
        fluent.withReadOnly(instance.getReadOnly());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1AzureDiskVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1AzureDiskVolumeSource instance) {
        this(instance,true);
    }

    public V1AzureDiskVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1AzureDiskVolumeSource instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withCachingMode(instance.getCachingMode());
        
        this.withDiskName(instance.getDiskName());
        
        this.withDiskURI(instance.getDiskURI());
        
        this.withFsType(instance.getFsType());
        
        this.withKind(instance.getKind());
        
        this.withReadOnly(instance.getReadOnly());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1AzureDiskVolumeSource build() {
        V1AzureDiskVolumeSource buildable = new V1AzureDiskVolumeSource();
        buildable.setCachingMode(fluent.getCachingMode());
        buildable.setDiskName(fluent.getDiskName());
        buildable.setDiskURI(fluent.getDiskURI());
        buildable.setFsType(fluent.getFsType());
        buildable.setKind(fluent.getKind());
        buildable.setReadOnly(fluent.getReadOnly());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1AzureDiskVolumeSourceBuilder that = (V1AzureDiskVolumeSourceBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}

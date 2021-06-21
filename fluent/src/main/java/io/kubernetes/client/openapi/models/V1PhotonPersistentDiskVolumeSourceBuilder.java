package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1PhotonPersistentDiskVolumeSourceBuilder extends io.kubernetes.client.openapi.models.V1PhotonPersistentDiskVolumeSourceFluentImpl<io.kubernetes.client.openapi.models.V1PhotonPersistentDiskVolumeSourceBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1PhotonPersistentDiskVolumeSource,io.kubernetes.client.openapi.models.V1PhotonPersistentDiskVolumeSourceBuilder> {

    io.kubernetes.client.openapi.models.V1PhotonPersistentDiskVolumeSourceFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1PhotonPersistentDiskVolumeSourceBuilder() {
        this(true);
    }

    public V1PhotonPersistentDiskVolumeSourceBuilder(java.lang.Boolean validationEnabled) {
        this(new V1PhotonPersistentDiskVolumeSource(), validationEnabled);
    }

    public V1PhotonPersistentDiskVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1PhotonPersistentDiskVolumeSourceFluent<?> fluent) {
        this(fluent, true);
    }

    public V1PhotonPersistentDiskVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1PhotonPersistentDiskVolumeSourceFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1PhotonPersistentDiskVolumeSource(), validationEnabled);
    }

    public V1PhotonPersistentDiskVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1PhotonPersistentDiskVolumeSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1PhotonPersistentDiskVolumeSource instance) {
        this(fluent, instance, true);
    }

    public V1PhotonPersistentDiskVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1PhotonPersistentDiskVolumeSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1PhotonPersistentDiskVolumeSource instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withFsType(instance.getFsType());
        
        fluent.withPdID(instance.getPdID());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1PhotonPersistentDiskVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1PhotonPersistentDiskVolumeSource instance) {
        this(instance,true);
    }

    public V1PhotonPersistentDiskVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1PhotonPersistentDiskVolumeSource instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withFsType(instance.getFsType());
        
        this.withPdID(instance.getPdID());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1PhotonPersistentDiskVolumeSource build() {
        V1PhotonPersistentDiskVolumeSource buildable = new V1PhotonPersistentDiskVolumeSource();
        buildable.setFsType(fluent.getFsType());
        buildable.setPdID(fluent.getPdID());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1PhotonPersistentDiskVolumeSourceBuilder that = (V1PhotonPersistentDiskVolumeSourceBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}

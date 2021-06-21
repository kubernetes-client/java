package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1RBDPersistentVolumeSourceBuilder extends io.kubernetes.client.openapi.models.V1RBDPersistentVolumeSourceFluentImpl<io.kubernetes.client.openapi.models.V1RBDPersistentVolumeSourceBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1RBDPersistentVolumeSource,io.kubernetes.client.openapi.models.V1RBDPersistentVolumeSourceBuilder> {

    io.kubernetes.client.openapi.models.V1RBDPersistentVolumeSourceFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1RBDPersistentVolumeSourceBuilder() {
        this(true);
    }

    public V1RBDPersistentVolumeSourceBuilder(java.lang.Boolean validationEnabled) {
        this(new V1RBDPersistentVolumeSource(), validationEnabled);
    }

    public V1RBDPersistentVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1RBDPersistentVolumeSourceFluent<?> fluent) {
        this(fluent, true);
    }

    public V1RBDPersistentVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1RBDPersistentVolumeSourceFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1RBDPersistentVolumeSource(), validationEnabled);
    }

    public V1RBDPersistentVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1RBDPersistentVolumeSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1RBDPersistentVolumeSource instance) {
        this(fluent, instance, true);
    }

    public V1RBDPersistentVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1RBDPersistentVolumeSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1RBDPersistentVolumeSource instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withFsType(instance.getFsType());
        
        fluent.withImage(instance.getImage());
        
        fluent.withKeyring(instance.getKeyring());
        
        fluent.withMonitors(instance.getMonitors());
        
        fluent.withPool(instance.getPool());
        
        fluent.withReadOnly(instance.getReadOnly());
        
        fluent.withSecretRef(instance.getSecretRef());
        
        fluent.withUser(instance.getUser());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1RBDPersistentVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1RBDPersistentVolumeSource instance) {
        this(instance,true);
    }

    public V1RBDPersistentVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1RBDPersistentVolumeSource instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withFsType(instance.getFsType());
        
        this.withImage(instance.getImage());
        
        this.withKeyring(instance.getKeyring());
        
        this.withMonitors(instance.getMonitors());
        
        this.withPool(instance.getPool());
        
        this.withReadOnly(instance.getReadOnly());
        
        this.withSecretRef(instance.getSecretRef());
        
        this.withUser(instance.getUser());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1RBDPersistentVolumeSource build() {
        V1RBDPersistentVolumeSource buildable = new V1RBDPersistentVolumeSource();
        buildable.setFsType(fluent.getFsType());
        buildable.setImage(fluent.getImage());
        buildable.setKeyring(fluent.getKeyring());
        buildable.setMonitors(fluent.getMonitors());
        buildable.setPool(fluent.getPool());
        buildable.setReadOnly(fluent.getReadOnly());
        buildable.setSecretRef(fluent.getSecretRef());
        buildable.setUser(fluent.getUser());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1RBDPersistentVolumeSourceBuilder that = (V1RBDPersistentVolumeSourceBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}

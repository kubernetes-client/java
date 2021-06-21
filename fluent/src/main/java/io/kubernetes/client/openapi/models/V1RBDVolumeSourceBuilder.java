package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1RBDVolumeSourceBuilder extends io.kubernetes.client.openapi.models.V1RBDVolumeSourceFluentImpl<io.kubernetes.client.openapi.models.V1RBDVolumeSourceBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1RBDVolumeSource,io.kubernetes.client.openapi.models.V1RBDVolumeSourceBuilder> {

    io.kubernetes.client.openapi.models.V1RBDVolumeSourceFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1RBDVolumeSourceBuilder() {
        this(true);
    }

    public V1RBDVolumeSourceBuilder(java.lang.Boolean validationEnabled) {
        this(new V1RBDVolumeSource(), validationEnabled);
    }

    public V1RBDVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1RBDVolumeSourceFluent<?> fluent) {
        this(fluent, true);
    }

    public V1RBDVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1RBDVolumeSourceFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1RBDVolumeSource(), validationEnabled);
    }

    public V1RBDVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1RBDVolumeSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1RBDVolumeSource instance) {
        this(fluent, instance, true);
    }

    public V1RBDVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1RBDVolumeSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1RBDVolumeSource instance,java.lang.Boolean validationEnabled) {
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

    public V1RBDVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1RBDVolumeSource instance) {
        this(instance,true);
    }

    public V1RBDVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1RBDVolumeSource instance,java.lang.Boolean validationEnabled) {
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

    public io.kubernetes.client.openapi.models.V1RBDVolumeSource build() {
        V1RBDVolumeSource buildable = new V1RBDVolumeSource();
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
        V1RBDVolumeSourceBuilder that = (V1RBDVolumeSourceBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}

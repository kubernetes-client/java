package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1PersistentVolumeClaimVolumeSourceBuilder extends io.kubernetes.client.openapi.models.V1PersistentVolumeClaimVolumeSourceFluentImpl<io.kubernetes.client.openapi.models.V1PersistentVolumeClaimVolumeSourceBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1PersistentVolumeClaimVolumeSource,io.kubernetes.client.openapi.models.V1PersistentVolumeClaimVolumeSourceBuilder> {

    io.kubernetes.client.openapi.models.V1PersistentVolumeClaimVolumeSourceFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1PersistentVolumeClaimVolumeSourceBuilder() {
        this(true);
    }

    public V1PersistentVolumeClaimVolumeSourceBuilder(java.lang.Boolean validationEnabled) {
        this(new V1PersistentVolumeClaimVolumeSource(), validationEnabled);
    }

    public V1PersistentVolumeClaimVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1PersistentVolumeClaimVolumeSourceFluent<?> fluent) {
        this(fluent, true);
    }

    public V1PersistentVolumeClaimVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1PersistentVolumeClaimVolumeSourceFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1PersistentVolumeClaimVolumeSource(), validationEnabled);
    }

    public V1PersistentVolumeClaimVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1PersistentVolumeClaimVolumeSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1PersistentVolumeClaimVolumeSource instance) {
        this(fluent, instance, true);
    }

    public V1PersistentVolumeClaimVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1PersistentVolumeClaimVolumeSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1PersistentVolumeClaimVolumeSource instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withClaimName(instance.getClaimName());
        
        fluent.withReadOnly(instance.getReadOnly());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1PersistentVolumeClaimVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1PersistentVolumeClaimVolumeSource instance) {
        this(instance,true);
    }

    public V1PersistentVolumeClaimVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1PersistentVolumeClaimVolumeSource instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withClaimName(instance.getClaimName());
        
        this.withReadOnly(instance.getReadOnly());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimVolumeSource build() {
        V1PersistentVolumeClaimVolumeSource buildable = new V1PersistentVolumeClaimVolumeSource();
        buildable.setClaimName(fluent.getClaimName());
        buildable.setReadOnly(fluent.getReadOnly());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1PersistentVolumeClaimVolumeSourceBuilder that = (V1PersistentVolumeClaimVolumeSourceBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}

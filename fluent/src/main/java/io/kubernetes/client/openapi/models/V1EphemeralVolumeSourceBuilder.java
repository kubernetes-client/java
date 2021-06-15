package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1EphemeralVolumeSourceBuilder extends io.kubernetes.client.openapi.models.V1EphemeralVolumeSourceFluentImpl<io.kubernetes.client.openapi.models.V1EphemeralVolumeSourceBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1EphemeralVolumeSource,io.kubernetes.client.openapi.models.V1EphemeralVolumeSourceBuilder> {

    io.kubernetes.client.openapi.models.V1EphemeralVolumeSourceFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1EphemeralVolumeSourceBuilder() {
        this(true);
    }

    public V1EphemeralVolumeSourceBuilder(java.lang.Boolean validationEnabled) {
        this(new V1EphemeralVolumeSource(), validationEnabled);
    }

    public V1EphemeralVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1EphemeralVolumeSourceFluent<?> fluent) {
        this(fluent, true);
    }

    public V1EphemeralVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1EphemeralVolumeSourceFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1EphemeralVolumeSource(), validationEnabled);
    }

    public V1EphemeralVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1EphemeralVolumeSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1EphemeralVolumeSource instance) {
        this(fluent, instance, true);
    }

    public V1EphemeralVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1EphemeralVolumeSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1EphemeralVolumeSource instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withReadOnly(instance.getReadOnly());
        
        fluent.withVolumeClaimTemplate(instance.getVolumeClaimTemplate());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1EphemeralVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1EphemeralVolumeSource instance) {
        this(instance,true);
    }

    public V1EphemeralVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1EphemeralVolumeSource instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withReadOnly(instance.getReadOnly());
        
        this.withVolumeClaimTemplate(instance.getVolumeClaimTemplate());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1EphemeralVolumeSource build() {
        V1EphemeralVolumeSource buildable = new V1EphemeralVolumeSource();
        buildable.setReadOnly(fluent.getReadOnly());
        buildable.setVolumeClaimTemplate(fluent.getVolumeClaimTemplate());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1EphemeralVolumeSourceBuilder that = (V1EphemeralVolumeSourceBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}

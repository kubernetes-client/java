package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1SecretVolumeSourceBuilder extends io.kubernetes.client.openapi.models.V1SecretVolumeSourceFluentImpl<io.kubernetes.client.openapi.models.V1SecretVolumeSourceBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1SecretVolumeSource,io.kubernetes.client.openapi.models.V1SecretVolumeSourceBuilder> {

    io.kubernetes.client.openapi.models.V1SecretVolumeSourceFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1SecretVolumeSourceBuilder() {
        this(true);
    }

    public V1SecretVolumeSourceBuilder(java.lang.Boolean validationEnabled) {
        this(new V1SecretVolumeSource(), validationEnabled);
    }

    public V1SecretVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1SecretVolumeSourceFluent<?> fluent) {
        this(fluent, true);
    }

    public V1SecretVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1SecretVolumeSourceFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1SecretVolumeSource(), validationEnabled);
    }

    public V1SecretVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1SecretVolumeSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1SecretVolumeSource instance) {
        this(fluent, instance, true);
    }

    public V1SecretVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1SecretVolumeSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1SecretVolumeSource instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withDefaultMode(instance.getDefaultMode());
        
        fluent.withItems(instance.getItems());
        
        fluent.withOptional(instance.getOptional());
        
        fluent.withSecretName(instance.getSecretName());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1SecretVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1SecretVolumeSource instance) {
        this(instance,true);
    }

    public V1SecretVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1SecretVolumeSource instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withDefaultMode(instance.getDefaultMode());
        
        this.withItems(instance.getItems());
        
        this.withOptional(instance.getOptional());
        
        this.withSecretName(instance.getSecretName());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1SecretVolumeSource build() {
        V1SecretVolumeSource buildable = new V1SecretVolumeSource();
        buildable.setDefaultMode(fluent.getDefaultMode());
        buildable.setItems(fluent.getItems());
        buildable.setOptional(fluent.getOptional());
        buildable.setSecretName(fluent.getSecretName());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1SecretVolumeSourceBuilder that = (V1SecretVolumeSourceBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}

package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1ConfigMapVolumeSourceBuilder extends io.kubernetes.client.openapi.models.V1ConfigMapVolumeSourceFluentImpl<io.kubernetes.client.openapi.models.V1ConfigMapVolumeSourceBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1ConfigMapVolumeSource,io.kubernetes.client.openapi.models.V1ConfigMapVolumeSourceBuilder> {

    io.kubernetes.client.openapi.models.V1ConfigMapVolumeSourceFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1ConfigMapVolumeSourceBuilder() {
        this(true);
    }

    public V1ConfigMapVolumeSourceBuilder(java.lang.Boolean validationEnabled) {
        this(new V1ConfigMapVolumeSource(), validationEnabled);
    }

    public V1ConfigMapVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1ConfigMapVolumeSourceFluent<?> fluent) {
        this(fluent, true);
    }

    public V1ConfigMapVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1ConfigMapVolumeSourceFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1ConfigMapVolumeSource(), validationEnabled);
    }

    public V1ConfigMapVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1ConfigMapVolumeSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1ConfigMapVolumeSource instance) {
        this(fluent, instance, true);
    }

    public V1ConfigMapVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1ConfigMapVolumeSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1ConfigMapVolumeSource instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withDefaultMode(instance.getDefaultMode());
        
        fluent.withItems(instance.getItems());
        
        fluent.withName(instance.getName());
        
        fluent.withOptional(instance.getOptional());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1ConfigMapVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1ConfigMapVolumeSource instance) {
        this(instance,true);
    }

    public V1ConfigMapVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1ConfigMapVolumeSource instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withDefaultMode(instance.getDefaultMode());
        
        this.withItems(instance.getItems());
        
        this.withName(instance.getName());
        
        this.withOptional(instance.getOptional());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1ConfigMapVolumeSource build() {
        V1ConfigMapVolumeSource buildable = new V1ConfigMapVolumeSource();
        buildable.setDefaultMode(fluent.getDefaultMode());
        buildable.setItems(fluent.getItems());
        buildable.setName(fluent.getName());
        buildable.setOptional(fluent.getOptional());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1ConfigMapVolumeSourceBuilder that = (V1ConfigMapVolumeSourceBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}

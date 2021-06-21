package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1GlusterfsVolumeSourceBuilder extends io.kubernetes.client.openapi.models.V1GlusterfsVolumeSourceFluentImpl<io.kubernetes.client.openapi.models.V1GlusterfsVolumeSourceBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1GlusterfsVolumeSource,io.kubernetes.client.openapi.models.V1GlusterfsVolumeSourceBuilder> {

    io.kubernetes.client.openapi.models.V1GlusterfsVolumeSourceFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1GlusterfsVolumeSourceBuilder() {
        this(true);
    }

    public V1GlusterfsVolumeSourceBuilder(java.lang.Boolean validationEnabled) {
        this(new V1GlusterfsVolumeSource(), validationEnabled);
    }

    public V1GlusterfsVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1GlusterfsVolumeSourceFluent<?> fluent) {
        this(fluent, true);
    }

    public V1GlusterfsVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1GlusterfsVolumeSourceFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1GlusterfsVolumeSource(), validationEnabled);
    }

    public V1GlusterfsVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1GlusterfsVolumeSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1GlusterfsVolumeSource instance) {
        this(fluent, instance, true);
    }

    public V1GlusterfsVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1GlusterfsVolumeSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1GlusterfsVolumeSource instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withEndpoints(instance.getEndpoints());
        
        fluent.withPath(instance.getPath());
        
        fluent.withReadOnly(instance.getReadOnly());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1GlusterfsVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1GlusterfsVolumeSource instance) {
        this(instance,true);
    }

    public V1GlusterfsVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1GlusterfsVolumeSource instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withEndpoints(instance.getEndpoints());
        
        this.withPath(instance.getPath());
        
        this.withReadOnly(instance.getReadOnly());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1GlusterfsVolumeSource build() {
        V1GlusterfsVolumeSource buildable = new V1GlusterfsVolumeSource();
        buildable.setEndpoints(fluent.getEndpoints());
        buildable.setPath(fluent.getPath());
        buildable.setReadOnly(fluent.getReadOnly());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1GlusterfsVolumeSourceBuilder that = (V1GlusterfsVolumeSourceBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}

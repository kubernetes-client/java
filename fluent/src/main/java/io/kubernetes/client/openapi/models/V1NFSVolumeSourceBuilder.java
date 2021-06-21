package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1NFSVolumeSourceBuilder extends io.kubernetes.client.openapi.models.V1NFSVolumeSourceFluentImpl<io.kubernetes.client.openapi.models.V1NFSVolumeSourceBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1NFSVolumeSource,io.kubernetes.client.openapi.models.V1NFSVolumeSourceBuilder> {

    io.kubernetes.client.openapi.models.V1NFSVolumeSourceFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1NFSVolumeSourceBuilder() {
        this(true);
    }

    public V1NFSVolumeSourceBuilder(java.lang.Boolean validationEnabled) {
        this(new V1NFSVolumeSource(), validationEnabled);
    }

    public V1NFSVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1NFSVolumeSourceFluent<?> fluent) {
        this(fluent, true);
    }

    public V1NFSVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1NFSVolumeSourceFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1NFSVolumeSource(), validationEnabled);
    }

    public V1NFSVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1NFSVolumeSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1NFSVolumeSource instance) {
        this(fluent, instance, true);
    }

    public V1NFSVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1NFSVolumeSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1NFSVolumeSource instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withPath(instance.getPath());
        
        fluent.withReadOnly(instance.getReadOnly());
        
        fluent.withServer(instance.getServer());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1NFSVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1NFSVolumeSource instance) {
        this(instance,true);
    }

    public V1NFSVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1NFSVolumeSource instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withPath(instance.getPath());
        
        this.withReadOnly(instance.getReadOnly());
        
        this.withServer(instance.getServer());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1NFSVolumeSource build() {
        V1NFSVolumeSource buildable = new V1NFSVolumeSource();
        buildable.setPath(fluent.getPath());
        buildable.setReadOnly(fluent.getReadOnly());
        buildable.setServer(fluent.getServer());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1NFSVolumeSourceBuilder that = (V1NFSVolumeSourceBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}

package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1HostPathVolumeSourceBuilder extends io.kubernetes.client.openapi.models.V1HostPathVolumeSourceFluentImpl<io.kubernetes.client.openapi.models.V1HostPathVolumeSourceBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1HostPathVolumeSource,io.kubernetes.client.openapi.models.V1HostPathVolumeSourceBuilder> {

    io.kubernetes.client.openapi.models.V1HostPathVolumeSourceFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1HostPathVolumeSourceBuilder() {
        this(true);
    }

    public V1HostPathVolumeSourceBuilder(java.lang.Boolean validationEnabled) {
        this(new V1HostPathVolumeSource(), validationEnabled);
    }

    public V1HostPathVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1HostPathVolumeSourceFluent<?> fluent) {
        this(fluent, true);
    }

    public V1HostPathVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1HostPathVolumeSourceFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1HostPathVolumeSource(), validationEnabled);
    }

    public V1HostPathVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1HostPathVolumeSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1HostPathVolumeSource instance) {
        this(fluent, instance, true);
    }

    public V1HostPathVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1HostPathVolumeSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1HostPathVolumeSource instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withPath(instance.getPath());
        
        fluent.withType(instance.getType());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1HostPathVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1HostPathVolumeSource instance) {
        this(instance,true);
    }

    public V1HostPathVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1HostPathVolumeSource instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withPath(instance.getPath());
        
        this.withType(instance.getType());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1HostPathVolumeSource build() {
        V1HostPathVolumeSource buildable = new V1HostPathVolumeSource();
        buildable.setPath(fluent.getPath());
        buildable.setType(fluent.getType());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1HostPathVolumeSourceBuilder that = (V1HostPathVolumeSourceBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}

package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1LocalVolumeSourceBuilder extends io.kubernetes.client.openapi.models.V1LocalVolumeSourceFluentImpl<io.kubernetes.client.openapi.models.V1LocalVolumeSourceBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1LocalVolumeSource,io.kubernetes.client.openapi.models.V1LocalVolumeSourceBuilder> {

    io.kubernetes.client.openapi.models.V1LocalVolumeSourceFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1LocalVolumeSourceBuilder() {
        this(true);
    }

    public V1LocalVolumeSourceBuilder(java.lang.Boolean validationEnabled) {
        this(new V1LocalVolumeSource(), validationEnabled);
    }

    public V1LocalVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1LocalVolumeSourceFluent<?> fluent) {
        this(fluent, true);
    }

    public V1LocalVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1LocalVolumeSourceFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1LocalVolumeSource(), validationEnabled);
    }

    public V1LocalVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1LocalVolumeSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1LocalVolumeSource instance) {
        this(fluent, instance, true);
    }

    public V1LocalVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1LocalVolumeSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1LocalVolumeSource instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withFsType(instance.getFsType());
        
        fluent.withPath(instance.getPath());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1LocalVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1LocalVolumeSource instance) {
        this(instance,true);
    }

    public V1LocalVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1LocalVolumeSource instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withFsType(instance.getFsType());
        
        this.withPath(instance.getPath());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1LocalVolumeSource build() {
        V1LocalVolumeSource buildable = new V1LocalVolumeSource();
        buildable.setFsType(fluent.getFsType());
        buildable.setPath(fluent.getPath());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1LocalVolumeSourceBuilder that = (V1LocalVolumeSourceBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}

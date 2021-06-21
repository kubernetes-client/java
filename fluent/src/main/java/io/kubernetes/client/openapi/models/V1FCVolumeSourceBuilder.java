package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1FCVolumeSourceBuilder extends io.kubernetes.client.openapi.models.V1FCVolumeSourceFluentImpl<io.kubernetes.client.openapi.models.V1FCVolumeSourceBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1FCVolumeSource,io.kubernetes.client.openapi.models.V1FCVolumeSourceBuilder> {

    io.kubernetes.client.openapi.models.V1FCVolumeSourceFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1FCVolumeSourceBuilder() {
        this(true);
    }

    public V1FCVolumeSourceBuilder(java.lang.Boolean validationEnabled) {
        this(new V1FCVolumeSource(), validationEnabled);
    }

    public V1FCVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1FCVolumeSourceFluent<?> fluent) {
        this(fluent, true);
    }

    public V1FCVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1FCVolumeSourceFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1FCVolumeSource(), validationEnabled);
    }

    public V1FCVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1FCVolumeSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1FCVolumeSource instance) {
        this(fluent, instance, true);
    }

    public V1FCVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1FCVolumeSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1FCVolumeSource instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withFsType(instance.getFsType());
        
        fluent.withLun(instance.getLun());
        
        fluent.withReadOnly(instance.getReadOnly());
        
        fluent.withTargetWWNs(instance.getTargetWWNs());
        
        fluent.withWwids(instance.getWwids());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1FCVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1FCVolumeSource instance) {
        this(instance,true);
    }

    public V1FCVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1FCVolumeSource instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withFsType(instance.getFsType());
        
        this.withLun(instance.getLun());
        
        this.withReadOnly(instance.getReadOnly());
        
        this.withTargetWWNs(instance.getTargetWWNs());
        
        this.withWwids(instance.getWwids());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1FCVolumeSource build() {
        V1FCVolumeSource buildable = new V1FCVolumeSource();
        buildable.setFsType(fluent.getFsType());
        buildable.setLun(fluent.getLun());
        buildable.setReadOnly(fluent.getReadOnly());
        buildable.setTargetWWNs(fluent.getTargetWWNs());
        buildable.setWwids(fluent.getWwids());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1FCVolumeSourceBuilder that = (V1FCVolumeSourceBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}

package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1PortworxVolumeSourceBuilder extends io.kubernetes.client.openapi.models.V1PortworxVolumeSourceFluentImpl<io.kubernetes.client.openapi.models.V1PortworxVolumeSourceBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1PortworxVolumeSource,io.kubernetes.client.openapi.models.V1PortworxVolumeSourceBuilder> {

    io.kubernetes.client.openapi.models.V1PortworxVolumeSourceFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1PortworxVolumeSourceBuilder() {
        this(true);
    }

    public V1PortworxVolumeSourceBuilder(java.lang.Boolean validationEnabled) {
        this(new V1PortworxVolumeSource(), validationEnabled);
    }

    public V1PortworxVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1PortworxVolumeSourceFluent<?> fluent) {
        this(fluent, true);
    }

    public V1PortworxVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1PortworxVolumeSourceFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1PortworxVolumeSource(), validationEnabled);
    }

    public V1PortworxVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1PortworxVolumeSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1PortworxVolumeSource instance) {
        this(fluent, instance, true);
    }

    public V1PortworxVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1PortworxVolumeSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1PortworxVolumeSource instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withFsType(instance.getFsType());
        
        fluent.withReadOnly(instance.getReadOnly());
        
        fluent.withVolumeID(instance.getVolumeID());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1PortworxVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1PortworxVolumeSource instance) {
        this(instance,true);
    }

    public V1PortworxVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1PortworxVolumeSource instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withFsType(instance.getFsType());
        
        this.withReadOnly(instance.getReadOnly());
        
        this.withVolumeID(instance.getVolumeID());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1PortworxVolumeSource build() {
        V1PortworxVolumeSource buildable = new V1PortworxVolumeSource();
        buildable.setFsType(fluent.getFsType());
        buildable.setReadOnly(fluent.getReadOnly());
        buildable.setVolumeID(fluent.getVolumeID());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1PortworxVolumeSourceBuilder that = (V1PortworxVolumeSourceBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}

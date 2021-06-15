package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1VolumeDeviceBuilder extends io.kubernetes.client.openapi.models.V1VolumeDeviceFluentImpl<io.kubernetes.client.openapi.models.V1VolumeDeviceBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1VolumeDevice,io.kubernetes.client.openapi.models.V1VolumeDeviceBuilder> {

    io.kubernetes.client.openapi.models.V1VolumeDeviceFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1VolumeDeviceBuilder() {
        this(true);
    }

    public V1VolumeDeviceBuilder(java.lang.Boolean validationEnabled) {
        this(new V1VolumeDevice(), validationEnabled);
    }

    public V1VolumeDeviceBuilder(io.kubernetes.client.openapi.models.V1VolumeDeviceFluent<?> fluent) {
        this(fluent, true);
    }

    public V1VolumeDeviceBuilder(io.kubernetes.client.openapi.models.V1VolumeDeviceFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1VolumeDevice(), validationEnabled);
    }

    public V1VolumeDeviceBuilder(io.kubernetes.client.openapi.models.V1VolumeDeviceFluent<?> fluent,io.kubernetes.client.openapi.models.V1VolumeDevice instance) {
        this(fluent, instance, true);
    }

    public V1VolumeDeviceBuilder(io.kubernetes.client.openapi.models.V1VolumeDeviceFluent<?> fluent,io.kubernetes.client.openapi.models.V1VolumeDevice instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withDevicePath(instance.getDevicePath());
        
        fluent.withName(instance.getName());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1VolumeDeviceBuilder(io.kubernetes.client.openapi.models.V1VolumeDevice instance) {
        this(instance,true);
    }

    public V1VolumeDeviceBuilder(io.kubernetes.client.openapi.models.V1VolumeDevice instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withDevicePath(instance.getDevicePath());
        
        this.withName(instance.getName());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1VolumeDevice build() {
        V1VolumeDevice buildable = new V1VolumeDevice();
        buildable.setDevicePath(fluent.getDevicePath());
        buildable.setName(fluent.getName());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1VolumeDeviceBuilder that = (V1VolumeDeviceBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}

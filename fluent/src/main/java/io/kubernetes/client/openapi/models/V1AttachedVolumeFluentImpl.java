package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class V1AttachedVolumeFluentImpl<A extends io.kubernetes.client.openapi.models.V1AttachedVolumeFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1AttachedVolumeFluent<A> {

    private java.lang.String devicePath;
    private java.lang.String name;

    public V1AttachedVolumeFluentImpl() {
    }

    public V1AttachedVolumeFluentImpl(io.kubernetes.client.openapi.models.V1AttachedVolume instance) {
        this.withDevicePath(instance.getDevicePath());
        
        this.withName(instance.getName());
    }

    public java.lang.String getDevicePath() {
        return this.devicePath;
    }

    public A withDevicePath(java.lang.String devicePath) {
        this.devicePath=devicePath; return (A) this;
    }

    public java.lang.Boolean hasDevicePath() {
        return this.devicePath != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withDevicePath instead.
     */
        public A withNewDevicePath(java.lang.String original) {
        return (A)withDevicePath(new String(original));
    }

    public java.lang.String getName() {
        return this.name;
    }

    public A withName(java.lang.String name) {
        this.name=name; return (A) this;
    }

    public java.lang.Boolean hasName() {
        return this.name != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withName instead.
     */
        public A withNewName(java.lang.String original) {
        return (A)withName(new String(original));
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1AttachedVolumeFluentImpl that = (V1AttachedVolumeFluentImpl) o;
        if (devicePath != null ? !devicePath.equals(that.devicePath) :that.devicePath != null) return false;
        if (name != null ? !name.equals(that.name) :that.name != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(devicePath,  name,  super.hashCode());
    }

}

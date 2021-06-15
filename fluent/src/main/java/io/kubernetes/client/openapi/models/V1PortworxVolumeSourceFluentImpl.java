package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class V1PortworxVolumeSourceFluentImpl<A extends io.kubernetes.client.openapi.models.V1PortworxVolumeSourceFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1PortworxVolumeSourceFluent<A> {

    private java.lang.String fsType;
    private java.lang.Boolean readOnly;
    private java.lang.String volumeID;

    public V1PortworxVolumeSourceFluentImpl() {
    }

    public V1PortworxVolumeSourceFluentImpl(io.kubernetes.client.openapi.models.V1PortworxVolumeSource instance) {
        this.withFsType(instance.getFsType());
        
        this.withReadOnly(instance.getReadOnly());
        
        this.withVolumeID(instance.getVolumeID());
    }

    public java.lang.String getFsType() {
        return this.fsType;
    }

    public A withFsType(java.lang.String fsType) {
        this.fsType=fsType; return (A) this;
    }

    public java.lang.Boolean hasFsType() {
        return this.fsType != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withFsType instead.
     */
        public A withNewFsType(java.lang.String original) {
        return (A)withFsType(new String(original));
    }

    public java.lang.Boolean getReadOnly() {
        return this.readOnly;
    }

    public A withReadOnly(java.lang.Boolean readOnly) {
        this.readOnly=readOnly; return (A) this;
    }

    public java.lang.Boolean hasReadOnly() {
        return this.readOnly != null;
    }

    public java.lang.String getVolumeID() {
        return this.volumeID;
    }

    public A withVolumeID(java.lang.String volumeID) {
        this.volumeID=volumeID; return (A) this;
    }

    public java.lang.Boolean hasVolumeID() {
        return this.volumeID != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withVolumeID instead.
     */
        public A withNewVolumeID(java.lang.String original) {
        return (A)withVolumeID(new String(original));
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1PortworxVolumeSourceFluentImpl that = (V1PortworxVolumeSourceFluentImpl) o;
        if (fsType != null ? !fsType.equals(that.fsType) :that.fsType != null) return false;
        if (readOnly != null ? !readOnly.equals(that.readOnly) :that.readOnly != null) return false;
        if (volumeID != null ? !volumeID.equals(that.volumeID) :that.volumeID != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fsType,  readOnly,  volumeID,  super.hashCode());
    }

}

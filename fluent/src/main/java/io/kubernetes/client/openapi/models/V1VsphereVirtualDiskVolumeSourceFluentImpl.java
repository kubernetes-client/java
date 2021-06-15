package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class V1VsphereVirtualDiskVolumeSourceFluentImpl<A extends io.kubernetes.client.openapi.models.V1VsphereVirtualDiskVolumeSourceFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1VsphereVirtualDiskVolumeSourceFluent<A> {

    private java.lang.String fsType;
    private java.lang.String storagePolicyID;
    private java.lang.String storagePolicyName;
    private java.lang.String volumePath;

    public V1VsphereVirtualDiskVolumeSourceFluentImpl() {
    }

    public V1VsphereVirtualDiskVolumeSourceFluentImpl(io.kubernetes.client.openapi.models.V1VsphereVirtualDiskVolumeSource instance) {
        this.withFsType(instance.getFsType());
        
        this.withStoragePolicyID(instance.getStoragePolicyID());
        
        this.withStoragePolicyName(instance.getStoragePolicyName());
        
        this.withVolumePath(instance.getVolumePath());
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

    public java.lang.String getStoragePolicyID() {
        return this.storagePolicyID;
    }

    public A withStoragePolicyID(java.lang.String storagePolicyID) {
        this.storagePolicyID=storagePolicyID; return (A) this;
    }

    public java.lang.Boolean hasStoragePolicyID() {
        return this.storagePolicyID != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withStoragePolicyID instead.
     */
        public A withNewStoragePolicyID(java.lang.String original) {
        return (A)withStoragePolicyID(new String(original));
    }

    public java.lang.String getStoragePolicyName() {
        return this.storagePolicyName;
    }

    public A withStoragePolicyName(java.lang.String storagePolicyName) {
        this.storagePolicyName=storagePolicyName; return (A) this;
    }

    public java.lang.Boolean hasStoragePolicyName() {
        return this.storagePolicyName != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withStoragePolicyName instead.
     */
        public A withNewStoragePolicyName(java.lang.String original) {
        return (A)withStoragePolicyName(new String(original));
    }

    public java.lang.String getVolumePath() {
        return this.volumePath;
    }

    public A withVolumePath(java.lang.String volumePath) {
        this.volumePath=volumePath; return (A) this;
    }

    public java.lang.Boolean hasVolumePath() {
        return this.volumePath != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withVolumePath instead.
     */
        public A withNewVolumePath(java.lang.String original) {
        return (A)withVolumePath(new String(original));
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1VsphereVirtualDiskVolumeSourceFluentImpl that = (V1VsphereVirtualDiskVolumeSourceFluentImpl) o;
        if (fsType != null ? !fsType.equals(that.fsType) :that.fsType != null) return false;
        if (storagePolicyID != null ? !storagePolicyID.equals(that.storagePolicyID) :that.storagePolicyID != null) return false;
        if (storagePolicyName != null ? !storagePolicyName.equals(that.storagePolicyName) :that.storagePolicyName != null) return false;
        if (volumePath != null ? !volumePath.equals(that.volumePath) :that.volumePath != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fsType,  storagePolicyID,  storagePolicyName,  volumePath,  super.hashCode());
    }

}

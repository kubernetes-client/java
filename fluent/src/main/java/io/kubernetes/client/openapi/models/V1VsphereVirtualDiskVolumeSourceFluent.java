package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

public interface V1VsphereVirtualDiskVolumeSourceFluent<A extends io.kubernetes.client.openapi.models.V1VsphereVirtualDiskVolumeSourceFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getFsType();
    public A withFsType(java.lang.String fsType);
    public java.lang.Boolean hasFsType();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withFsType instead.
     */
        public A withNewFsType(java.lang.String original);
    public java.lang.String getStoragePolicyID();
    public A withStoragePolicyID(java.lang.String storagePolicyID);
    public java.lang.Boolean hasStoragePolicyID();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withStoragePolicyID instead.
     */
        public A withNewStoragePolicyID(java.lang.String original);
    public java.lang.String getStoragePolicyName();
    public A withStoragePolicyName(java.lang.String storagePolicyName);
    public java.lang.Boolean hasStoragePolicyName();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withStoragePolicyName instead.
     */
        public A withNewStoragePolicyName(java.lang.String original);
    public java.lang.String getVolumePath();
    public A withVolumePath(java.lang.String volumePath);
    public java.lang.Boolean hasVolumePath();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withVolumePath instead.
     */
        public A withNewVolumePath(java.lang.String original);
}

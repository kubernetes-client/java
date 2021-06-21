package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

public interface V1GCEPersistentDiskVolumeSourceFluent<A extends io.kubernetes.client.openapi.models.V1GCEPersistentDiskVolumeSourceFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getFsType();
    public A withFsType(java.lang.String fsType);
    public java.lang.Boolean hasFsType();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withFsType instead.
     */
        public A withNewFsType(java.lang.String original);
    public java.lang.Integer getPartition();
    public A withPartition(java.lang.Integer partition);
    public java.lang.Boolean hasPartition();
    public java.lang.String getPdName();
    public A withPdName(java.lang.String pdName);
    public java.lang.Boolean hasPdName();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withPdName instead.
     */
        public A withNewPdName(java.lang.String original);
    public java.lang.Boolean getReadOnly();
    public A withReadOnly(java.lang.Boolean readOnly);
    public java.lang.Boolean hasReadOnly();
}

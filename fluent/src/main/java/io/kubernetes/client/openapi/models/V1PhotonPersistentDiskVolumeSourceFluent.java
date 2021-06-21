package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

public interface V1PhotonPersistentDiskVolumeSourceFluent<A extends io.kubernetes.client.openapi.models.V1PhotonPersistentDiskVolumeSourceFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getFsType();
    public A withFsType(java.lang.String fsType);
    public java.lang.Boolean hasFsType();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withFsType instead.
     */
        public A withNewFsType(java.lang.String original);
    public java.lang.String getPdID();
    public A withPdID(java.lang.String pdID);
    public java.lang.Boolean hasPdID();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withPdID instead.
     */
        public A withNewPdID(java.lang.String original);
}

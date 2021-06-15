package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

public interface V1AzureDiskVolumeSourceFluent<A extends io.kubernetes.client.openapi.models.V1AzureDiskVolumeSourceFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getCachingMode();
    public A withCachingMode(java.lang.String cachingMode);
    public java.lang.Boolean hasCachingMode();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withCachingMode instead.
     */
        public A withNewCachingMode(java.lang.String original);
    public java.lang.String getDiskName();
    public A withDiskName(java.lang.String diskName);
    public java.lang.Boolean hasDiskName();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withDiskName instead.
     */
        public A withNewDiskName(java.lang.String original);
    public java.lang.String getDiskURI();
    public A withDiskURI(java.lang.String diskURI);
    public java.lang.Boolean hasDiskURI();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withDiskURI instead.
     */
        public A withNewDiskURI(java.lang.String original);
    public java.lang.String getFsType();
    public A withFsType(java.lang.String fsType);
    public java.lang.Boolean hasFsType();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withFsType instead.
     */
        public A withNewFsType(java.lang.String original);
    public java.lang.String getKind();
    public A withKind(java.lang.String kind);
    public java.lang.Boolean hasKind();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withKind instead.
     */
        public A withNewKind(java.lang.String original);
    public java.lang.Boolean getReadOnly();
    public A withReadOnly(java.lang.Boolean readOnly);
    public java.lang.Boolean hasReadOnly();
}

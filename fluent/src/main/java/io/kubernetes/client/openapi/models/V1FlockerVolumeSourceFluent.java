package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

public interface V1FlockerVolumeSourceFluent<A extends io.kubernetes.client.openapi.models.V1FlockerVolumeSourceFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getDatasetName();
    public A withDatasetName(java.lang.String datasetName);
    public java.lang.Boolean hasDatasetName();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withDatasetName instead.
     */
        public A withNewDatasetName(java.lang.String original);
    public java.lang.String getDatasetUUID();
    public A withDatasetUUID(java.lang.String datasetUUID);
    public java.lang.Boolean hasDatasetUUID();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withDatasetUUID instead.
     */
        public A withNewDatasetUUID(java.lang.String original);
}

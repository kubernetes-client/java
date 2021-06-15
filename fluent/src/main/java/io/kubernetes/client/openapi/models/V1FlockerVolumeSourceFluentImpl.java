package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class V1FlockerVolumeSourceFluentImpl<A extends io.kubernetes.client.openapi.models.V1FlockerVolumeSourceFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1FlockerVolumeSourceFluent<A> {

    private java.lang.String datasetName;
    private java.lang.String datasetUUID;

    public V1FlockerVolumeSourceFluentImpl() {
    }

    public V1FlockerVolumeSourceFluentImpl(io.kubernetes.client.openapi.models.V1FlockerVolumeSource instance) {
        this.withDatasetName(instance.getDatasetName());
        
        this.withDatasetUUID(instance.getDatasetUUID());
    }

    public java.lang.String getDatasetName() {
        return this.datasetName;
    }

    public A withDatasetName(java.lang.String datasetName) {
        this.datasetName=datasetName; return (A) this;
    }

    public java.lang.Boolean hasDatasetName() {
        return this.datasetName != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withDatasetName instead.
     */
        public A withNewDatasetName(java.lang.String original) {
        return (A)withDatasetName(new String(original));
    }

    public java.lang.String getDatasetUUID() {
        return this.datasetUUID;
    }

    public A withDatasetUUID(java.lang.String datasetUUID) {
        this.datasetUUID=datasetUUID; return (A) this;
    }

    public java.lang.Boolean hasDatasetUUID() {
        return this.datasetUUID != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withDatasetUUID instead.
     */
        public A withNewDatasetUUID(java.lang.String original) {
        return (A)withDatasetUUID(new String(original));
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1FlockerVolumeSourceFluentImpl that = (V1FlockerVolumeSourceFluentImpl) o;
        if (datasetName != null ? !datasetName.equals(that.datasetName) :that.datasetName != null) return false;
        if (datasetUUID != null ? !datasetUUID.equals(that.datasetUUID) :that.datasetUUID != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(datasetName,  datasetUUID,  super.hashCode());
    }

}

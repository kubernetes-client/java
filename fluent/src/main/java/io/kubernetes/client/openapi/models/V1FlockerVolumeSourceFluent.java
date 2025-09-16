package io.kubernetes.client.openapi.models;

import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Objects;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1FlockerVolumeSourceFluent<A extends io.kubernetes.client.openapi.models.V1FlockerVolumeSourceFluent<A>> extends BaseFluent<A>{
  public V1FlockerVolumeSourceFluent() {
  }
  
  public V1FlockerVolumeSourceFluent(V1FlockerVolumeSource instance) {
    this.copyInstance(instance);
  }
  private String datasetName;
  private String datasetUUID;
  
  protected void copyInstance(V1FlockerVolumeSource instance) {
    instance = instance != null ? instance : new V1FlockerVolumeSource();
    if (instance != null) {
        this.withDatasetName(instance.getDatasetName());
        this.withDatasetUUID(instance.getDatasetUUID());
    }
  }
  
  public String getDatasetName() {
    return this.datasetName;
  }
  
  public A withDatasetName(String datasetName) {
    this.datasetName = datasetName;
    return (A) this;
  }
  
  public boolean hasDatasetName() {
    return this.datasetName != null;
  }
  
  public String getDatasetUUID() {
    return this.datasetUUID;
  }
  
  public A withDatasetUUID(String datasetUUID) {
    this.datasetUUID = datasetUUID;
    return (A) this;
  }
  
  public boolean hasDatasetUUID() {
    return this.datasetUUID != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }
    if (!(super.equals(o))) {
      return false;
    }
    V1FlockerVolumeSourceFluent that = (V1FlockerVolumeSourceFluent) o;
    if (!(Objects.equals(datasetName, that.datasetName))) {
      return false;
    }
    if (!(Objects.equals(datasetUUID, that.datasetUUID))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(datasetName, datasetUUID);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(datasetName == null)) {
        sb.append("datasetName:");
        sb.append(datasetName);
        sb.append(",");
    }
    if (!(datasetUUID == null)) {
        sb.append("datasetUUID:");
        sb.append(datasetUUID);
    }
    sb.append("}");
    return sb.toString();
  }
  

}
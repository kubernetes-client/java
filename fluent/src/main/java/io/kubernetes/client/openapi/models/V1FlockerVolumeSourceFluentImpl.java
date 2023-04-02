package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1FlockerVolumeSourceFluentImpl<A extends V1FlockerVolumeSourceFluent<A>> extends BaseFluent<A> implements V1FlockerVolumeSourceFluent<A>{
  public V1FlockerVolumeSourceFluentImpl() {
  }
  public V1FlockerVolumeSourceFluentImpl(V1FlockerVolumeSource instance) {
    this.withDatasetName(instance.getDatasetName());

    this.withDatasetUUID(instance.getDatasetUUID());

  }
  private String datasetName;
  private String datasetUUID;
  public String getDatasetName() {
    return this.datasetName;
  }
  public A withDatasetName(String datasetName) {
    this.datasetName=datasetName; return (A) this;
  }
  public Boolean hasDatasetName() {
    return this.datasetName != null;
  }
  public String getDatasetUUID() {
    return this.datasetUUID;
  }
  public A withDatasetUUID(String datasetUUID) {
    this.datasetUUID=datasetUUID; return (A) this;
  }
  public Boolean hasDatasetUUID() {
    return this.datasetUUID != null;
  }
  public boolean equals(Object o) {
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
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (datasetName != null) { sb.append("datasetName:"); sb.append(datasetName + ","); }
    if (datasetUUID != null) { sb.append("datasetUUID:"); sb.append(datasetUUID); }
    sb.append("}");
    return sb.toString();
  }
  
}
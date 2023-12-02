package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1AWSElasticBlockStoreVolumeSourceFluent<A extends V1AWSElasticBlockStoreVolumeSourceFluent<A>> extends BaseFluent<A>{
  public V1AWSElasticBlockStoreVolumeSourceFluent() {
  }
  
  public V1AWSElasticBlockStoreVolumeSourceFluent(V1AWSElasticBlockStoreVolumeSource instance) {
    this.copyInstance(instance);
  }
  private String fsType;
  private Integer partition;
  private Boolean readOnly;
  private String volumeID;
  
  protected void copyInstance(V1AWSElasticBlockStoreVolumeSource instance) {
    instance = (instance != null ? instance : new V1AWSElasticBlockStoreVolumeSource());
    if (instance != null) {
          this.withFsType(instance.getFsType());
          this.withPartition(instance.getPartition());
          this.withReadOnly(instance.getReadOnly());
          this.withVolumeID(instance.getVolumeID());
        }
  }
  
  public String getFsType() {
    return this.fsType;
  }
  
  public A withFsType(String fsType) {
    this.fsType = fsType;
    return (A) this;
  }
  
  public boolean hasFsType() {
    return this.fsType != null;
  }
  
  public Integer getPartition() {
    return this.partition;
  }
  
  public A withPartition(Integer partition) {
    this.partition = partition;
    return (A) this;
  }
  
  public boolean hasPartition() {
    return this.partition != null;
  }
  
  public Boolean getReadOnly() {
    return this.readOnly;
  }
  
  public A withReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return (A) this;
  }
  
  public boolean hasReadOnly() {
    return this.readOnly != null;
  }
  
  public String getVolumeID() {
    return this.volumeID;
  }
  
  public A withVolumeID(String volumeID) {
    this.volumeID = volumeID;
    return (A) this;
  }
  
  public boolean hasVolumeID() {
    return this.volumeID != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1AWSElasticBlockStoreVolumeSourceFluent that = (V1AWSElasticBlockStoreVolumeSourceFluent) o;
    if (!java.util.Objects.equals(fsType, that.fsType)) return false;
    if (!java.util.Objects.equals(partition, that.partition)) return false;
    if (!java.util.Objects.equals(readOnly, that.readOnly)) return false;
    if (!java.util.Objects.equals(volumeID, that.volumeID)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(fsType,  partition,  readOnly,  volumeID,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (fsType != null) { sb.append("fsType:"); sb.append(fsType + ","); }
    if (partition != null) { sb.append("partition:"); sb.append(partition + ","); }
    if (readOnly != null) { sb.append("readOnly:"); sb.append(readOnly + ","); }
    if (volumeID != null) { sb.append("volumeID:"); sb.append(volumeID); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withReadOnly() {
    return withReadOnly(true);
  }
  

}
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1AWSElasticBlockStoreVolumeSourceFluent<A extends io.kubernetes.client.openapi.models.V1AWSElasticBlockStoreVolumeSourceFluent<A>> extends BaseFluent<A>{

  private String fsType;
  private Integer partition;
  private Boolean readOnly;
  private String volumeID;

  public V1AWSElasticBlockStoreVolumeSourceFluent() {
  }
  
  public V1AWSElasticBlockStoreVolumeSourceFluent(V1AWSElasticBlockStoreVolumeSource instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1AWSElasticBlockStoreVolumeSource instance) {
    instance = instance != null ? instance : new V1AWSElasticBlockStoreVolumeSource();
    if (instance != null) {
        this.withFsType(instance.getFsType());
        this.withPartition(instance.getPartition());
        this.withReadOnly(instance.getReadOnly());
        this.withVolumeID(instance.getVolumeID());
    }
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
    V1AWSElasticBlockStoreVolumeSourceFluent that = (V1AWSElasticBlockStoreVolumeSourceFluent) o;
    if (!(Objects.equals(fsType, that.fsType))) {
      return false;
    }
    if (!(Objects.equals(partition, that.partition))) {
      return false;
    }
    if (!(Objects.equals(readOnly, that.readOnly))) {
      return false;
    }
    if (!(Objects.equals(volumeID, that.volumeID))) {
      return false;
    }
    return true;
  }
  
  public String getFsType() {
    return this.fsType;
  }
  
  public Integer getPartition() {
    return this.partition;
  }
  
  public Boolean getReadOnly() {
    return this.readOnly;
  }
  
  public String getVolumeID() {
    return this.volumeID;
  }
  
  public boolean hasFsType() {
    return this.fsType != null;
  }
  
  public boolean hasPartition() {
    return this.partition != null;
  }
  
  public boolean hasReadOnly() {
    return this.readOnly != null;
  }
  
  public boolean hasVolumeID() {
    return this.volumeID != null;
  }
  
  public int hashCode() {
    return Objects.hash(fsType, partition, readOnly, volumeID);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(fsType == null)) {
        sb.append("fsType:");
        sb.append(fsType);
        sb.append(",");
    }
    if (!(partition == null)) {
        sb.append("partition:");
        sb.append(partition);
        sb.append(",");
    }
    if (!(readOnly == null)) {
        sb.append("readOnly:");
        sb.append(readOnly);
        sb.append(",");
    }
    if (!(volumeID == null)) {
        sb.append("volumeID:");
        sb.append(volumeID);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withFsType(String fsType) {
    this.fsType = fsType;
    return (A) this;
  }
  
  public A withPartition(Integer partition) {
    this.partition = partition;
    return (A) this;
  }
  
  public A withReadOnly() {
    return withReadOnly(true);
  }
  
  public A withReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return (A) this;
  }
  
  public A withVolumeID(String volumeID) {
    this.volumeID = volumeID;
    return (A) this;
  }
  
}
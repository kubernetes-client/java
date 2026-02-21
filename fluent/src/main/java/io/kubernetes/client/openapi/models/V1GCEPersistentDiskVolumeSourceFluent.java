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
public class V1GCEPersistentDiskVolumeSourceFluent<A extends io.kubernetes.client.openapi.models.V1GCEPersistentDiskVolumeSourceFluent<A>> extends BaseFluent<A>{

  private String fsType;
  private Integer partition;
  private String pdName;
  private Boolean readOnly;

  public V1GCEPersistentDiskVolumeSourceFluent() {
  }
  
  public V1GCEPersistentDiskVolumeSourceFluent(V1GCEPersistentDiskVolumeSource instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1GCEPersistentDiskVolumeSource instance) {
    instance = instance != null ? instance : new V1GCEPersistentDiskVolumeSource();
    if (instance != null) {
        this.withFsType(instance.getFsType());
        this.withPartition(instance.getPartition());
        this.withPdName(instance.getPdName());
        this.withReadOnly(instance.getReadOnly());
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
    V1GCEPersistentDiskVolumeSourceFluent that = (V1GCEPersistentDiskVolumeSourceFluent) o;
    if (!(Objects.equals(fsType, that.fsType))) {
      return false;
    }
    if (!(Objects.equals(partition, that.partition))) {
      return false;
    }
    if (!(Objects.equals(pdName, that.pdName))) {
      return false;
    }
    if (!(Objects.equals(readOnly, that.readOnly))) {
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
  
  public String getPdName() {
    return this.pdName;
  }
  
  public Boolean getReadOnly() {
    return this.readOnly;
  }
  
  public boolean hasFsType() {
    return this.fsType != null;
  }
  
  public boolean hasPartition() {
    return this.partition != null;
  }
  
  public boolean hasPdName() {
    return this.pdName != null;
  }
  
  public boolean hasReadOnly() {
    return this.readOnly != null;
  }
  
  public int hashCode() {
    return Objects.hash(fsType, partition, pdName, readOnly);
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
    if (!(pdName == null)) {
        sb.append("pdName:");
        sb.append(pdName);
        sb.append(",");
    }
    if (!(readOnly == null)) {
        sb.append("readOnly:");
        sb.append(readOnly);
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
  
  public A withPdName(String pdName) {
    this.pdName = pdName;
    return (A) this;
  }
  
  public A withReadOnly() {
    return withReadOnly(true);
  }
  
  public A withReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return (A) this;
  }
  
}
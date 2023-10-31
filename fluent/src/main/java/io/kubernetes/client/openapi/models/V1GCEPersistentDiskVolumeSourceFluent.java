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
public class V1GCEPersistentDiskVolumeSourceFluent<A extends V1GCEPersistentDiskVolumeSourceFluent<A>> extends BaseFluent<A>{
  public V1GCEPersistentDiskVolumeSourceFluent() {
  }
  
  public V1GCEPersistentDiskVolumeSourceFluent(V1GCEPersistentDiskVolumeSource instance) {
    this.copyInstance(instance);
  }
  private String fsType;
  private Integer partition;
  private String pdName;
  private Boolean readOnly;
  
  protected void copyInstance(V1GCEPersistentDiskVolumeSource instance) {
    instance = (instance != null ? instance : new V1GCEPersistentDiskVolumeSource());
    if (instance != null) {
          this.withFsType(instance.getFsType());
          this.withPartition(instance.getPartition());
          this.withPdName(instance.getPdName());
          this.withReadOnly(instance.getReadOnly());
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
  
  public String getPdName() {
    return this.pdName;
  }
  
  public A withPdName(String pdName) {
    this.pdName = pdName;
    return (A) this;
  }
  
  public boolean hasPdName() {
    return this.pdName != null;
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
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1GCEPersistentDiskVolumeSourceFluent that = (V1GCEPersistentDiskVolumeSourceFluent) o;
    if (!java.util.Objects.equals(fsType, that.fsType)) return false;
    if (!java.util.Objects.equals(partition, that.partition)) return false;
    if (!java.util.Objects.equals(pdName, that.pdName)) return false;
    if (!java.util.Objects.equals(readOnly, that.readOnly)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(fsType,  partition,  pdName,  readOnly,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (fsType != null) { sb.append("fsType:"); sb.append(fsType + ","); }
    if (partition != null) { sb.append("partition:"); sb.append(partition + ","); }
    if (pdName != null) { sb.append("pdName:"); sb.append(pdName + ","); }
    if (readOnly != null) { sb.append("readOnly:"); sb.append(readOnly); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withReadOnly() {
    return withReadOnly(true);
  }
  

}
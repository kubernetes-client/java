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
  @SuppressWarnings(value = "unchecked")
  public class V1GCEPersistentDiskVolumeSourceFluentImpl<A extends V1GCEPersistentDiskVolumeSourceFluent<A>> extends BaseFluent<A> implements V1GCEPersistentDiskVolumeSourceFluent<A>{
  public V1GCEPersistentDiskVolumeSourceFluentImpl() {
  }
  public V1GCEPersistentDiskVolumeSourceFluentImpl(V1GCEPersistentDiskVolumeSource instance) {
    this.withFsType(instance.getFsType());

    this.withPartition(instance.getPartition());

    this.withPdName(instance.getPdName());

    this.withReadOnly(instance.getReadOnly());

  }
  private String fsType;
  private Integer partition;
  private String pdName;
  private Boolean readOnly;
  public String getFsType() {
    return this.fsType;
  }
  public A withFsType(String fsType) {
    this.fsType=fsType; return (A) this;
  }
  public Boolean hasFsType() {
    return this.fsType != null;
  }
  public Integer getPartition() {
    return this.partition;
  }
  public A withPartition(Integer partition) {
    this.partition=partition; return (A) this;
  }
  public Boolean hasPartition() {
    return this.partition != null;
  }
  public String getPdName() {
    return this.pdName;
  }
  public A withPdName(String pdName) {
    this.pdName=pdName; return (A) this;
  }
  public Boolean hasPdName() {
    return this.pdName != null;
  }
  public Boolean getReadOnly() {
    return this.readOnly;
  }
  public A withReadOnly(Boolean readOnly) {
    this.readOnly=readOnly; return (A) this;
  }
  public Boolean hasReadOnly() {
    return this.readOnly != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1GCEPersistentDiskVolumeSourceFluentImpl that = (V1GCEPersistentDiskVolumeSourceFluentImpl) o;
    if (fsType != null ? !fsType.equals(that.fsType) :that.fsType != null) return false;
    if (partition != null ? !partition.equals(that.partition) :that.partition != null) return false;
    if (pdName != null ? !pdName.equals(that.pdName) :that.pdName != null) return false;
    if (readOnly != null ? !readOnly.equals(that.readOnly) :that.readOnly != null) return false;
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
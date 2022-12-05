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
  public class V1PhotonPersistentDiskVolumeSourceFluentImpl<A extends V1PhotonPersistentDiskVolumeSourceFluent<A>> extends BaseFluent<A> implements V1PhotonPersistentDiskVolumeSourceFluent<A>{
  public V1PhotonPersistentDiskVolumeSourceFluentImpl() {
  }
  public V1PhotonPersistentDiskVolumeSourceFluentImpl(V1PhotonPersistentDiskVolumeSource instance) {
    this.withFsType(instance.getFsType());

    this.withPdID(instance.getPdID());

  }
  private String fsType;
  private String pdID;
  public String getFsType() {
    return this.fsType;
  }
  public A withFsType(String fsType) {
    this.fsType=fsType; return (A) this;
  }
  public Boolean hasFsType() {
    return this.fsType != null;
  }
  public String getPdID() {
    return this.pdID;
  }
  public A withPdID(String pdID) {
    this.pdID=pdID; return (A) this;
  }
  public Boolean hasPdID() {
    return this.pdID != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1PhotonPersistentDiskVolumeSourceFluentImpl that = (V1PhotonPersistentDiskVolumeSourceFluentImpl) o;
    if (fsType != null ? !fsType.equals(that.fsType) :that.fsType != null) return false;
    if (pdID != null ? !pdID.equals(that.pdID) :that.pdID != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fsType,  pdID,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (fsType != null) { sb.append("fsType:"); sb.append(fsType + ","); }
    if (pdID != null) { sb.append("pdID:"); sb.append(pdID); }
    sb.append("}");
    return sb.toString();
  }
  
}
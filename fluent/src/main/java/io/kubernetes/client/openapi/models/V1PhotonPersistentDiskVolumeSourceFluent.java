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
public class V1PhotonPersistentDiskVolumeSourceFluent<A extends io.kubernetes.client.openapi.models.V1PhotonPersistentDiskVolumeSourceFluent<A>> extends BaseFluent<A>{
  public V1PhotonPersistentDiskVolumeSourceFluent() {
  }
  
  public V1PhotonPersistentDiskVolumeSourceFluent(V1PhotonPersistentDiskVolumeSource instance) {
    this.copyInstance(instance);
  }
  private String fsType;
  private String pdID;
  
  protected void copyInstance(V1PhotonPersistentDiskVolumeSource instance) {
    instance = instance != null ? instance : new V1PhotonPersistentDiskVolumeSource();
    if (instance != null) {
        this.withFsType(instance.getFsType());
        this.withPdID(instance.getPdID());
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
  
  public String getPdID() {
    return this.pdID;
  }
  
  public A withPdID(String pdID) {
    this.pdID = pdID;
    return (A) this;
  }
  
  public boolean hasPdID() {
    return this.pdID != null;
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
    V1PhotonPersistentDiskVolumeSourceFluent that = (V1PhotonPersistentDiskVolumeSourceFluent) o;
    if (!(Objects.equals(fsType, that.fsType))) {
      return false;
    }
    if (!(Objects.equals(pdID, that.pdID))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(fsType, pdID);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(fsType == null)) {
        sb.append("fsType:");
        sb.append(fsType);
        sb.append(",");
    }
    if (!(pdID == null)) {
        sb.append("pdID:");
        sb.append(pdID);
    }
    sb.append("}");
    return sb.toString();
  }
  

}
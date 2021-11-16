package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public class V1PhotonPersistentDiskVolumeSourceFluentImpl<A extends io.kubernetes.client.openapi.models.V1PhotonPersistentDiskVolumeSourceFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1PhotonPersistentDiskVolumeSourceFluent<A>{
  public V1PhotonPersistentDiskVolumeSourceFluentImpl() {
  }
  public V1PhotonPersistentDiskVolumeSourceFluentImpl(io.kubernetes.client.openapi.models.V1PhotonPersistentDiskVolumeSource instance) {
    this.withFsType(instance.getFsType());

    this.withPdID(instance.getPdID());

  }
  private java.lang.String fsType;
  private java.lang.String pdID;
  public java.lang.String getFsType() {
    return this.fsType;
  }
  public A withFsType(java.lang.String fsType) {
    this.fsType=fsType; return (A) this;
  }
  public java.lang.Boolean hasFsType() {
    return this.fsType != null;
  }
  
  /**
   * Method is deprecated. use withFsType instead.
   */
  @java.lang.Deprecated
  public A withNewFsType(java.lang.String arg0) {
    return (A)withFsType(new String(arg0));
  }
  public java.lang.String getPdID() {
    return this.pdID;
  }
  public A withPdID(java.lang.String pdID) {
    this.pdID=pdID; return (A) this;
  }
  public java.lang.Boolean hasPdID() {
    return this.pdID != null;
  }
  
  /**
   * Method is deprecated. use withPdID instead.
   */
  @java.lang.Deprecated
  public A withNewPdID(java.lang.String arg0) {
    return (A)withPdID(new String(arg0));
  }
  public boolean equals(java.lang.Object o) {
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
  
}
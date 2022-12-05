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
  public class V1VsphereVirtualDiskVolumeSourceFluentImpl<A extends V1VsphereVirtualDiskVolumeSourceFluent<A>> extends BaseFluent<A> implements V1VsphereVirtualDiskVolumeSourceFluent<A>{
  public V1VsphereVirtualDiskVolumeSourceFluentImpl() {
  }
  public V1VsphereVirtualDiskVolumeSourceFluentImpl(V1VsphereVirtualDiskVolumeSource instance) {
    this.withFsType(instance.getFsType());

    this.withStoragePolicyID(instance.getStoragePolicyID());

    this.withStoragePolicyName(instance.getStoragePolicyName());

    this.withVolumePath(instance.getVolumePath());

  }
  private String fsType;
  private String storagePolicyID;
  private String storagePolicyName;
  private String volumePath;
  public String getFsType() {
    return this.fsType;
  }
  public A withFsType(String fsType) {
    this.fsType=fsType; return (A) this;
  }
  public Boolean hasFsType() {
    return this.fsType != null;
  }
  public String getStoragePolicyID() {
    return this.storagePolicyID;
  }
  public A withStoragePolicyID(String storagePolicyID) {
    this.storagePolicyID=storagePolicyID; return (A) this;
  }
  public Boolean hasStoragePolicyID() {
    return this.storagePolicyID != null;
  }
  public String getStoragePolicyName() {
    return this.storagePolicyName;
  }
  public A withStoragePolicyName(String storagePolicyName) {
    this.storagePolicyName=storagePolicyName; return (A) this;
  }
  public Boolean hasStoragePolicyName() {
    return this.storagePolicyName != null;
  }
  public String getVolumePath() {
    return this.volumePath;
  }
  public A withVolumePath(String volumePath) {
    this.volumePath=volumePath; return (A) this;
  }
  public Boolean hasVolumePath() {
    return this.volumePath != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1VsphereVirtualDiskVolumeSourceFluentImpl that = (V1VsphereVirtualDiskVolumeSourceFluentImpl) o;
    if (fsType != null ? !fsType.equals(that.fsType) :that.fsType != null) return false;
    if (storagePolicyID != null ? !storagePolicyID.equals(that.storagePolicyID) :that.storagePolicyID != null) return false;
    if (storagePolicyName != null ? !storagePolicyName.equals(that.storagePolicyName) :that.storagePolicyName != null) return false;
    if (volumePath != null ? !volumePath.equals(that.volumePath) :that.volumePath != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fsType,  storagePolicyID,  storagePolicyName,  volumePath,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (fsType != null) { sb.append("fsType:"); sb.append(fsType + ","); }
    if (storagePolicyID != null) { sb.append("storagePolicyID:"); sb.append(storagePolicyID + ","); }
    if (storagePolicyName != null) { sb.append("storagePolicyName:"); sb.append(storagePolicyName + ","); }
    if (volumePath != null) { sb.append("volumePath:"); sb.append(volumePath); }
    sb.append("}");
    return sb.toString();
  }
  
}
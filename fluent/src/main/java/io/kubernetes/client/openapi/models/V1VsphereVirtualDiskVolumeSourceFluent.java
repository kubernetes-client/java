package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1VsphereVirtualDiskVolumeSourceFluent<A extends V1VsphereVirtualDiskVolumeSourceFluent<A>> extends BaseFluent<A>{
  public V1VsphereVirtualDiskVolumeSourceFluent() {
  }
  
  public V1VsphereVirtualDiskVolumeSourceFluent(V1VsphereVirtualDiskVolumeSource instance) {
    this.copyInstance(instance);
  }
  private String fsType;
  private String storagePolicyID;
  private String storagePolicyName;
  private String volumePath;
  
  protected void copyInstance(V1VsphereVirtualDiskVolumeSource instance) {
    instance = (instance != null ? instance : new V1VsphereVirtualDiskVolumeSource());
    if (instance != null) {
          this.withFsType(instance.getFsType());
          this.withStoragePolicyID(instance.getStoragePolicyID());
          this.withStoragePolicyName(instance.getStoragePolicyName());
          this.withVolumePath(instance.getVolumePath());
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
  
  public String getStoragePolicyID() {
    return this.storagePolicyID;
  }
  
  public A withStoragePolicyID(String storagePolicyID) {
    this.storagePolicyID = storagePolicyID;
    return (A) this;
  }
  
  public boolean hasStoragePolicyID() {
    return this.storagePolicyID != null;
  }
  
  public String getStoragePolicyName() {
    return this.storagePolicyName;
  }
  
  public A withStoragePolicyName(String storagePolicyName) {
    this.storagePolicyName = storagePolicyName;
    return (A) this;
  }
  
  public boolean hasStoragePolicyName() {
    return this.storagePolicyName != null;
  }
  
  public String getVolumePath() {
    return this.volumePath;
  }
  
  public A withVolumePath(String volumePath) {
    this.volumePath = volumePath;
    return (A) this;
  }
  
  public boolean hasVolumePath() {
    return this.volumePath != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1VsphereVirtualDiskVolumeSourceFluent that = (V1VsphereVirtualDiskVolumeSourceFluent) o;
    if (!java.util.Objects.equals(fsType, that.fsType)) return false;
    if (!java.util.Objects.equals(storagePolicyID, that.storagePolicyID)) return false;
    if (!java.util.Objects.equals(storagePolicyName, that.storagePolicyName)) return false;
    if (!java.util.Objects.equals(volumePath, that.volumePath)) return false;
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
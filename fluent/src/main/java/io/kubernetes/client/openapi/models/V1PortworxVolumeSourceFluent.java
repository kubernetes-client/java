package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1PortworxVolumeSourceFluent<A extends V1PortworxVolumeSourceFluent<A>> extends BaseFluent<A>{
  public V1PortworxVolumeSourceFluent() {
  }
  
  public V1PortworxVolumeSourceFluent(V1PortworxVolumeSource instance) {
    this.copyInstance(instance);
  }
  private String fsType;
  private Boolean readOnly;
  private String volumeID;
  
  protected void copyInstance(V1PortworxVolumeSource instance) {
    instance = (instance != null ? instance : new V1PortworxVolumeSource());
    if (instance != null) {
          this.withFsType(instance.getFsType());
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
    V1PortworxVolumeSourceFluent that = (V1PortworxVolumeSourceFluent) o;
    if (!java.util.Objects.equals(fsType, that.fsType)) return false;
    if (!java.util.Objects.equals(readOnly, that.readOnly)) return false;
    if (!java.util.Objects.equals(volumeID, that.volumeID)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(fsType,  readOnly,  volumeID,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (fsType != null) { sb.append("fsType:"); sb.append(fsType + ","); }
    if (readOnly != null) { sb.append("readOnly:"); sb.append(readOnly + ","); }
    if (volumeID != null) { sb.append("volumeID:"); sb.append(volumeID); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withReadOnly() {
    return withReadOnly(true);
  }
  

}
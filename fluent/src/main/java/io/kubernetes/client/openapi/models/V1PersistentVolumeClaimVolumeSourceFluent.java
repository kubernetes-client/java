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
public class V1PersistentVolumeClaimVolumeSourceFluent<A extends V1PersistentVolumeClaimVolumeSourceFluent<A>> extends BaseFluent<A>{
  public V1PersistentVolumeClaimVolumeSourceFluent() {
  }
  
  public V1PersistentVolumeClaimVolumeSourceFluent(V1PersistentVolumeClaimVolumeSource instance) {
    this.copyInstance(instance);
  }
  private String claimName;
  private Boolean readOnly;
  
  protected void copyInstance(V1PersistentVolumeClaimVolumeSource instance) {
    instance = (instance != null ? instance : new V1PersistentVolumeClaimVolumeSource());
    if (instance != null) {
          this.withClaimName(instance.getClaimName());
          this.withReadOnly(instance.getReadOnly());
        }
  }
  
  public String getClaimName() {
    return this.claimName;
  }
  
  public A withClaimName(String claimName) {
    this.claimName = claimName;
    return (A) this;
  }
  
  public boolean hasClaimName() {
    return this.claimName != null;
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
    V1PersistentVolumeClaimVolumeSourceFluent that = (V1PersistentVolumeClaimVolumeSourceFluent) o;
    if (!java.util.Objects.equals(claimName, that.claimName)) return false;
    if (!java.util.Objects.equals(readOnly, that.readOnly)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(claimName,  readOnly,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (claimName != null) { sb.append("claimName:"); sb.append(claimName + ","); }
    if (readOnly != null) { sb.append("readOnly:"); sb.append(readOnly); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withReadOnly() {
    return withReadOnly(true);
  }
  

}
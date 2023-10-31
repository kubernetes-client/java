package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1StatefulSetPersistentVolumeClaimRetentionPolicyFluent<A extends V1StatefulSetPersistentVolumeClaimRetentionPolicyFluent<A>> extends BaseFluent<A>{
  public V1StatefulSetPersistentVolumeClaimRetentionPolicyFluent() {
  }
  
  public V1StatefulSetPersistentVolumeClaimRetentionPolicyFluent(V1StatefulSetPersistentVolumeClaimRetentionPolicy instance) {
    this.copyInstance(instance);
  }
  private String whenDeleted;
  private String whenScaled;
  
  protected void copyInstance(V1StatefulSetPersistentVolumeClaimRetentionPolicy instance) {
    instance = (instance != null ? instance : new V1StatefulSetPersistentVolumeClaimRetentionPolicy());
    if (instance != null) {
          this.withWhenDeleted(instance.getWhenDeleted());
          this.withWhenScaled(instance.getWhenScaled());
        }
  }
  
  public String getWhenDeleted() {
    return this.whenDeleted;
  }
  
  public A withWhenDeleted(String whenDeleted) {
    this.whenDeleted = whenDeleted;
    return (A) this;
  }
  
  public boolean hasWhenDeleted() {
    return this.whenDeleted != null;
  }
  
  public String getWhenScaled() {
    return this.whenScaled;
  }
  
  public A withWhenScaled(String whenScaled) {
    this.whenScaled = whenScaled;
    return (A) this;
  }
  
  public boolean hasWhenScaled() {
    return this.whenScaled != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1StatefulSetPersistentVolumeClaimRetentionPolicyFluent that = (V1StatefulSetPersistentVolumeClaimRetentionPolicyFluent) o;
    if (!java.util.Objects.equals(whenDeleted, that.whenDeleted)) return false;
    if (!java.util.Objects.equals(whenScaled, that.whenScaled)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(whenDeleted,  whenScaled,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (whenDeleted != null) { sb.append("whenDeleted:"); sb.append(whenDeleted + ","); }
    if (whenScaled != null) { sb.append("whenScaled:"); sb.append(whenScaled); }
    sb.append("}");
    return sb.toString();
  }
  

}
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
  public class V1PersistentVolumeClaimVolumeSourceFluentImpl<A extends V1PersistentVolumeClaimVolumeSourceFluent<A>> extends BaseFluent<A> implements V1PersistentVolumeClaimVolumeSourceFluent<A>{
  public V1PersistentVolumeClaimVolumeSourceFluentImpl() {
  }
  public V1PersistentVolumeClaimVolumeSourceFluentImpl(V1PersistentVolumeClaimVolumeSource instance) {
    this.withClaimName(instance.getClaimName());

    this.withReadOnly(instance.getReadOnly());

  }
  private String claimName;
  private Boolean readOnly;
  public String getClaimName() {
    return this.claimName;
  }
  public A withClaimName(String claimName) {
    this.claimName=claimName; return (A) this;
  }
  public Boolean hasClaimName() {
    return this.claimName != null;
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
    V1PersistentVolumeClaimVolumeSourceFluentImpl that = (V1PersistentVolumeClaimVolumeSourceFluentImpl) o;
    if (claimName != null ? !claimName.equals(that.claimName) :that.claimName != null) return false;
    if (readOnly != null ? !readOnly.equals(that.readOnly) :that.readOnly != null) return false;
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
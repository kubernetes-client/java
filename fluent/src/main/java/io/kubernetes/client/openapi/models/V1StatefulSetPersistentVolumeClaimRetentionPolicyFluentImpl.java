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
  public class V1StatefulSetPersistentVolumeClaimRetentionPolicyFluentImpl<A extends V1StatefulSetPersistentVolumeClaimRetentionPolicyFluent<A>> extends BaseFluent<A> implements V1StatefulSetPersistentVolumeClaimRetentionPolicyFluent<A>{
  public V1StatefulSetPersistentVolumeClaimRetentionPolicyFluentImpl() {
  }
  public V1StatefulSetPersistentVolumeClaimRetentionPolicyFluentImpl(V1StatefulSetPersistentVolumeClaimRetentionPolicy instance) {
    this.withWhenDeleted(instance.getWhenDeleted());

    this.withWhenScaled(instance.getWhenScaled());

  }
  private String whenDeleted;
  private String whenScaled;
  public String getWhenDeleted() {
    return this.whenDeleted;
  }
  public A withWhenDeleted(String whenDeleted) {
    this.whenDeleted=whenDeleted; return (A) this;
  }
  public Boolean hasWhenDeleted() {
    return this.whenDeleted != null;
  }
  public String getWhenScaled() {
    return this.whenScaled;
  }
  public A withWhenScaled(String whenScaled) {
    this.whenScaled=whenScaled; return (A) this;
  }
  public Boolean hasWhenScaled() {
    return this.whenScaled != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1StatefulSetPersistentVolumeClaimRetentionPolicyFluentImpl that = (V1StatefulSetPersistentVolumeClaimRetentionPolicyFluentImpl) o;
    if (whenDeleted != null ? !whenDeleted.equals(that.whenDeleted) :that.whenDeleted != null) return false;
    if (whenScaled != null ? !whenScaled.equals(that.whenScaled) :that.whenScaled != null) return false;
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
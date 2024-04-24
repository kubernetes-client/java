package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ModifyVolumeStatusFluent<A extends V1ModifyVolumeStatusFluent<A>> extends BaseFluent<A>{
  public V1ModifyVolumeStatusFluent() {
  }
  
  public V1ModifyVolumeStatusFluent(V1ModifyVolumeStatus instance) {
    this.copyInstance(instance);
  }
  private String status;
  private String targetVolumeAttributesClassName;
  
  protected void copyInstance(V1ModifyVolumeStatus instance) {
    instance = (instance != null ? instance : new V1ModifyVolumeStatus());
    if (instance != null) {
          this.withStatus(instance.getStatus());
          this.withTargetVolumeAttributesClassName(instance.getTargetVolumeAttributesClassName());
        }
  }
  
  public String getStatus() {
    return this.status;
  }
  
  public A withStatus(String status) {
    this.status = status;
    return (A) this;
  }
  
  public boolean hasStatus() {
    return this.status != null;
  }
  
  public String getTargetVolumeAttributesClassName() {
    return this.targetVolumeAttributesClassName;
  }
  
  public A withTargetVolumeAttributesClassName(String targetVolumeAttributesClassName) {
    this.targetVolumeAttributesClassName = targetVolumeAttributesClassName;
    return (A) this;
  }
  
  public boolean hasTargetVolumeAttributesClassName() {
    return this.targetVolumeAttributesClassName != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ModifyVolumeStatusFluent that = (V1ModifyVolumeStatusFluent) o;
    if (!java.util.Objects.equals(status, that.status)) return false;
    if (!java.util.Objects.equals(targetVolumeAttributesClassName, that.targetVolumeAttributesClassName)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(status,  targetVolumeAttributesClassName,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (status != null) { sb.append("status:"); sb.append(status + ","); }
    if (targetVolumeAttributesClassName != null) { sb.append("targetVolumeAttributesClassName:"); sb.append(targetVolumeAttributesClassName); }
    sb.append("}");
    return sb.toString();
  }
  

}
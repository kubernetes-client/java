package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ModifyVolumeStatusFluent<A extends io.kubernetes.client.openapi.models.V1ModifyVolumeStatusFluent<A>> extends BaseFluent<A>{

  private String status;
  private String targetVolumeAttributesClassName;

  public V1ModifyVolumeStatusFluent() {
  }
  
  public V1ModifyVolumeStatusFluent(V1ModifyVolumeStatus instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1ModifyVolumeStatus instance) {
    instance = instance != null ? instance : new V1ModifyVolumeStatus();
    if (instance != null) {
        this.withStatus(instance.getStatus());
        this.withTargetVolumeAttributesClassName(instance.getTargetVolumeAttributesClassName());
    }
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
    V1ModifyVolumeStatusFluent that = (V1ModifyVolumeStatusFluent) o;
    if (!(Objects.equals(status, that.status))) {
      return false;
    }
    if (!(Objects.equals(targetVolumeAttributesClassName, that.targetVolumeAttributesClassName))) {
      return false;
    }
    return true;
  }
  
  public String getStatus() {
    return this.status;
  }
  
  public String getTargetVolumeAttributesClassName() {
    return this.targetVolumeAttributesClassName;
  }
  
  public boolean hasStatus() {
    return this.status != null;
  }
  
  public boolean hasTargetVolumeAttributesClassName() {
    return this.targetVolumeAttributesClassName != null;
  }
  
  public int hashCode() {
    return Objects.hash(status, targetVolumeAttributesClassName);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(status == null)) {
        sb.append("status:");
        sb.append(status);
        sb.append(",");
    }
    if (!(targetVolumeAttributesClassName == null)) {
        sb.append("targetVolumeAttributesClassName:");
        sb.append(targetVolumeAttributesClassName);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withStatus(String status) {
    this.status = status;
    return (A) this;
  }
  
  public A withTargetVolumeAttributesClassName(String targetVolumeAttributesClassName) {
    this.targetVolumeAttributesClassName = targetVolumeAttributesClassName;
    return (A) this;
  }
  
}
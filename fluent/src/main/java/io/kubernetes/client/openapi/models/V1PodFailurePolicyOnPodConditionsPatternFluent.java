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
public class V1PodFailurePolicyOnPodConditionsPatternFluent<A extends io.kubernetes.client.openapi.models.V1PodFailurePolicyOnPodConditionsPatternFluent<A>> extends BaseFluent<A>{

  private String status;
  private String type;

  public V1PodFailurePolicyOnPodConditionsPatternFluent() {
  }
  
  public V1PodFailurePolicyOnPodConditionsPatternFluent(V1PodFailurePolicyOnPodConditionsPattern instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1PodFailurePolicyOnPodConditionsPattern instance) {
    instance = instance != null ? instance : new V1PodFailurePolicyOnPodConditionsPattern();
    if (instance != null) {
        this.withStatus(instance.getStatus());
        this.withType(instance.getType());
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
    V1PodFailurePolicyOnPodConditionsPatternFluent that = (V1PodFailurePolicyOnPodConditionsPatternFluent) o;
    if (!(Objects.equals(status, that.status))) {
      return false;
    }
    if (!(Objects.equals(type, that.type))) {
      return false;
    }
    return true;
  }
  
  public String getStatus() {
    return this.status;
  }
  
  public String getType() {
    return this.type;
  }
  
  public boolean hasStatus() {
    return this.status != null;
  }
  
  public boolean hasType() {
    return this.type != null;
  }
  
  public int hashCode() {
    return Objects.hash(status, type);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(status == null)) {
        sb.append("status:");
        sb.append(status);
        sb.append(",");
    }
    if (!(type == null)) {
        sb.append("type:");
        sb.append(type);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withStatus(String status) {
    this.status = status;
    return (A) this;
  }
  
  public A withType(String type) {
    this.type = type;
    return (A) this;
  }
  
}
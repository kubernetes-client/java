package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1PodFailurePolicyOnPodConditionsPatternFluent<A extends V1PodFailurePolicyOnPodConditionsPatternFluent<A>> extends BaseFluent<A>{
  public V1PodFailurePolicyOnPodConditionsPatternFluent() {
  }
  
  public V1PodFailurePolicyOnPodConditionsPatternFluent(V1PodFailurePolicyOnPodConditionsPattern instance) {
    this.copyInstance(instance);
  }
  private String status;
  private String type;
  
  protected void copyInstance(V1PodFailurePolicyOnPodConditionsPattern instance) {
    instance = (instance != null ? instance : new V1PodFailurePolicyOnPodConditionsPattern());
    if (instance != null) {
          this.withStatus(instance.getStatus());
          this.withType(instance.getType());
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
  
  public String getType() {
    return this.type;
  }
  
  public A withType(String type) {
    this.type = type;
    return (A) this;
  }
  
  public boolean hasType() {
    return this.type != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1PodFailurePolicyOnPodConditionsPatternFluent that = (V1PodFailurePolicyOnPodConditionsPatternFluent) o;
    if (!java.util.Objects.equals(status, that.status)) return false;
    if (!java.util.Objects.equals(type, that.type)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(status,  type,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (status != null) { sb.append("status:"); sb.append(status + ","); }
    if (type != null) { sb.append("type:"); sb.append(type); }
    sb.append("}");
    return sb.toString();
  }
  

}
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
  public class V1PodFailurePolicyOnPodConditionsPatternFluentImpl<A extends V1PodFailurePolicyOnPodConditionsPatternFluent<A>> extends BaseFluent<A> implements V1PodFailurePolicyOnPodConditionsPatternFluent<A>{
  public V1PodFailurePolicyOnPodConditionsPatternFluentImpl() {
  }
  public V1PodFailurePolicyOnPodConditionsPatternFluentImpl(V1PodFailurePolicyOnPodConditionsPattern instance) {
    this.withStatus(instance.getStatus());

    this.withType(instance.getType());

  }
  private String status;
  private String type;
  public String getStatus() {
    return this.status;
  }
  public A withStatus(String status) {
    this.status=status; return (A) this;
  }
  public Boolean hasStatus() {
    return this.status != null;
  }
  public String getType() {
    return this.type;
  }
  public A withType(String type) {
    this.type=type; return (A) this;
  }
  public Boolean hasType() {
    return this.type != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1PodFailurePolicyOnPodConditionsPatternFluentImpl that = (V1PodFailurePolicyOnPodConditionsPatternFluentImpl) o;
    if (status != null ? !status.equals(that.status) :that.status != null) return false;
    if (type != null ? !type.equals(that.type) :that.type != null) return false;
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
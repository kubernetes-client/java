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
  public class V1PodReadinessGateFluentImpl<A extends V1PodReadinessGateFluent<A>> extends BaseFluent<A> implements V1PodReadinessGateFluent<A>{
  public V1PodReadinessGateFluentImpl() {
  }
  public V1PodReadinessGateFluentImpl(V1PodReadinessGate instance) {
    this.withConditionType(instance.getConditionType());

  }
  private String conditionType;
  public String getConditionType() {
    return this.conditionType;
  }
  public A withConditionType(String conditionType) {
    this.conditionType=conditionType; return (A) this;
  }
  public Boolean hasConditionType() {
    return this.conditionType != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1PodReadinessGateFluentImpl that = (V1PodReadinessGateFluentImpl) o;
    if (conditionType != null ? !conditionType.equals(that.conditionType) :that.conditionType != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(conditionType,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (conditionType != null) { sb.append("conditionType:"); sb.append(conditionType); }
    sb.append("}");
    return sb.toString();
  }
  
}
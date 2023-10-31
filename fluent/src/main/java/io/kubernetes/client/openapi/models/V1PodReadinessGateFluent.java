package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1PodReadinessGateFluent<A extends V1PodReadinessGateFluent<A>> extends BaseFluent<A>{
  public V1PodReadinessGateFluent() {
  }
  
  public V1PodReadinessGateFluent(V1PodReadinessGate instance) {
    this.copyInstance(instance);
  }
  private String conditionType;
  
  protected void copyInstance(V1PodReadinessGate instance) {
    instance = (instance != null ? instance : new V1PodReadinessGate());
    if (instance != null) {
          this.withConditionType(instance.getConditionType());
        }
  }
  
  public String getConditionType() {
    return this.conditionType;
  }
  
  public A withConditionType(String conditionType) {
    this.conditionType = conditionType;
    return (A) this;
  }
  
  public boolean hasConditionType() {
    return this.conditionType != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1PodReadinessGateFluent that = (V1PodReadinessGateFluent) o;
    if (!java.util.Objects.equals(conditionType, that.conditionType)) return false;
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
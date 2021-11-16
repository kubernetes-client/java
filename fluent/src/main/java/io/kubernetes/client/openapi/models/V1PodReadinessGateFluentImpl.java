package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public class V1PodReadinessGateFluentImpl<A extends io.kubernetes.client.openapi.models.V1PodReadinessGateFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1PodReadinessGateFluent<A>{
  public V1PodReadinessGateFluentImpl() {
  }
  public V1PodReadinessGateFluentImpl(io.kubernetes.client.openapi.models.V1PodReadinessGate instance) {
    this.withConditionType(instance.getConditionType());

  }
  private java.lang.String conditionType;
  public java.lang.String getConditionType() {
    return this.conditionType;
  }
  public A withConditionType(java.lang.String conditionType) {
    this.conditionType=conditionType; return (A) this;
  }
  public java.lang.Boolean hasConditionType() {
    return this.conditionType != null;
  }
  
  /**
   * Method is deprecated. use withConditionType instead.
   */
  @java.lang.Deprecated
  public A withNewConditionType(java.lang.String arg0) {
    return (A)withConditionType(new String(arg0));
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1PodReadinessGateFluentImpl that = (V1PodReadinessGateFluentImpl) o;
    if (conditionType != null ? !conditionType.equals(that.conditionType) :that.conditionType != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(conditionType,  super.hashCode());
  }
  
}
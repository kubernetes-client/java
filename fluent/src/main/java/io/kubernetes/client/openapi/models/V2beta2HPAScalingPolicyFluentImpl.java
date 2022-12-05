package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V2beta2HPAScalingPolicyFluentImpl<A extends V2beta2HPAScalingPolicyFluent<A>> extends BaseFluent<A> implements V2beta2HPAScalingPolicyFluent<A>{
  public V2beta2HPAScalingPolicyFluentImpl() {
  }
  public V2beta2HPAScalingPolicyFluentImpl(V2beta2HPAScalingPolicy instance) {
    this.withPeriodSeconds(instance.getPeriodSeconds());

    this.withType(instance.getType());

    this.withValue(instance.getValue());

  }
  private Integer periodSeconds;
  private String type;
  private Integer value;
  public Integer getPeriodSeconds() {
    return this.periodSeconds;
  }
  public A withPeriodSeconds(Integer periodSeconds) {
    this.periodSeconds=periodSeconds; return (A) this;
  }
  public Boolean hasPeriodSeconds() {
    return this.periodSeconds != null;
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
  public Integer getValue() {
    return this.value;
  }
  public A withValue(Integer value) {
    this.value=value; return (A) this;
  }
  public Boolean hasValue() {
    return this.value != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V2beta2HPAScalingPolicyFluentImpl that = (V2beta2HPAScalingPolicyFluentImpl) o;
    if (periodSeconds != null ? !periodSeconds.equals(that.periodSeconds) :that.periodSeconds != null) return false;
    if (type != null ? !type.equals(that.type) :that.type != null) return false;
    if (value != null ? !value.equals(that.value) :that.value != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(periodSeconds,  type,  value,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (periodSeconds != null) { sb.append("periodSeconds:"); sb.append(periodSeconds + ","); }
    if (type != null) { sb.append("type:"); sb.append(type + ","); }
    if (value != null) { sb.append("value:"); sb.append(value); }
    sb.append("}");
    return sb.toString();
  }
  
}
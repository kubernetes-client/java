package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V2HPAScalingPolicyFluent<A extends V2HPAScalingPolicyFluent<A>> extends BaseFluent<A>{
  public V2HPAScalingPolicyFluent() {
  }
  
  public V2HPAScalingPolicyFluent(V2HPAScalingPolicy instance) {
    this.copyInstance(instance);
  }
  private Integer periodSeconds;
  private String type;
  private Integer value;
  
  protected void copyInstance(V2HPAScalingPolicy instance) {
    instance = (instance != null ? instance : new V2HPAScalingPolicy());
    if (instance != null) {
          this.withPeriodSeconds(instance.getPeriodSeconds());
          this.withType(instance.getType());
          this.withValue(instance.getValue());
        }
  }
  
  public Integer getPeriodSeconds() {
    return this.periodSeconds;
  }
  
  public A withPeriodSeconds(Integer periodSeconds) {
    this.periodSeconds = periodSeconds;
    return (A) this;
  }
  
  public boolean hasPeriodSeconds() {
    return this.periodSeconds != null;
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
  
  public Integer getValue() {
    return this.value;
  }
  
  public A withValue(Integer value) {
    this.value = value;
    return (A) this;
  }
  
  public boolean hasValue() {
    return this.value != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V2HPAScalingPolicyFluent that = (V2HPAScalingPolicyFluent) o;
    if (!java.util.Objects.equals(periodSeconds, that.periodSeconds)) return false;
    if (!java.util.Objects.equals(type, that.type)) return false;
    if (!java.util.Objects.equals(value, that.value)) return false;
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
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V2HPAScalingPolicyFluent<A extends io.kubernetes.client.openapi.models.V2HPAScalingPolicyFluent<A>> extends BaseFluent<A>{

  private Integer periodSeconds;
  private String type;
  private Integer value;

  public V2HPAScalingPolicyFluent() {
  }
  
  public V2HPAScalingPolicyFluent(V2HPAScalingPolicy instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V2HPAScalingPolicy instance) {
    instance = instance != null ? instance : new V2HPAScalingPolicy();
    if (instance != null) {
        this.withPeriodSeconds(instance.getPeriodSeconds());
        this.withType(instance.getType());
        this.withValue(instance.getValue());
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
    V2HPAScalingPolicyFluent that = (V2HPAScalingPolicyFluent) o;
    if (!(Objects.equals(periodSeconds, that.periodSeconds))) {
      return false;
    }
    if (!(Objects.equals(type, that.type))) {
      return false;
    }
    if (!(Objects.equals(value, that.value))) {
      return false;
    }
    return true;
  }
  
  public Integer getPeriodSeconds() {
    return this.periodSeconds;
  }
  
  public String getType() {
    return this.type;
  }
  
  public Integer getValue() {
    return this.value;
  }
  
  public boolean hasPeriodSeconds() {
    return this.periodSeconds != null;
  }
  
  public boolean hasType() {
    return this.type != null;
  }
  
  public boolean hasValue() {
    return this.value != null;
  }
  
  public int hashCode() {
    return Objects.hash(periodSeconds, type, value);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(periodSeconds == null)) {
        sb.append("periodSeconds:");
        sb.append(periodSeconds);
        sb.append(",");
    }
    if (!(type == null)) {
        sb.append("type:");
        sb.append(type);
        sb.append(",");
    }
    if (!(value == null)) {
        sb.append("value:");
        sb.append(value);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withPeriodSeconds(Integer periodSeconds) {
    this.periodSeconds = periodSeconds;
    return (A) this;
  }
  
  public A withType(String type) {
    this.type = type;
    return (A) this;
  }
  
  public A withValue(Integer value) {
    this.value = value;
    return (A) this;
  }
  
}
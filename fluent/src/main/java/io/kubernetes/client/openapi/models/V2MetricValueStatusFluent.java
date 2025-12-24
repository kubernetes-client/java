package io.kubernetes.client.openapi.models;

import io.kubernetes.client.custom.Quantity;
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
public class V2MetricValueStatusFluent<A extends io.kubernetes.client.openapi.models.V2MetricValueStatusFluent<A>> extends BaseFluent<A>{

  private Integer averageUtilization;
  private Quantity averageValue;
  private Quantity value;

  public V2MetricValueStatusFluent() {
  }
  
  public V2MetricValueStatusFluent(V2MetricValueStatus instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V2MetricValueStatus instance) {
    instance = instance != null ? instance : new V2MetricValueStatus();
    if (instance != null) {
        this.withAverageUtilization(instance.getAverageUtilization());
        this.withAverageValue(instance.getAverageValue());
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
    V2MetricValueStatusFluent that = (V2MetricValueStatusFluent) o;
    if (!(Objects.equals(averageUtilization, that.averageUtilization))) {
      return false;
    }
    if (!(Objects.equals(averageValue, that.averageValue))) {
      return false;
    }
    if (!(Objects.equals(value, that.value))) {
      return false;
    }
    return true;
  }
  
  public Integer getAverageUtilization() {
    return this.averageUtilization;
  }
  
  public Quantity getAverageValue() {
    return this.averageValue;
  }
  
  public Quantity getValue() {
    return this.value;
  }
  
  public boolean hasAverageUtilization() {
    return this.averageUtilization != null;
  }
  
  public boolean hasAverageValue() {
    return this.averageValue != null;
  }
  
  public boolean hasValue() {
    return this.value != null;
  }
  
  public int hashCode() {
    return Objects.hash(averageUtilization, averageValue, value);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(averageUtilization == null)) {
        sb.append("averageUtilization:");
        sb.append(averageUtilization);
        sb.append(",");
    }
    if (!(averageValue == null)) {
        sb.append("averageValue:");
        sb.append(averageValue);
        sb.append(",");
    }
    if (!(value == null)) {
        sb.append("value:");
        sb.append(value);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withAverageUtilization(Integer averageUtilization) {
    this.averageUtilization = averageUtilization;
    return (A) this;
  }
  
  public A withAverageValue(Quantity averageValue) {
    this.averageValue = averageValue;
    return (A) this;
  }
  
  public A withNewAverageValue(String value) {
    return (A) this.withAverageValue(new Quantity(value));
  }
  
  public A withNewValue(String value) {
    return (A) this.withValue(new Quantity(value));
  }
  
  public A withValue(Quantity value) {
    this.value = value;
    return (A) this;
  }
  
}
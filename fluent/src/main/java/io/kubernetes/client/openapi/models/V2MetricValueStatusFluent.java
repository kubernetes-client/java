package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Objects;
import io.kubernetes.client.custom.Quantity;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V2MetricValueStatusFluent<A extends io.kubernetes.client.openapi.models.V2MetricValueStatusFluent<A>> extends BaseFluent<A>{
  public V2MetricValueStatusFluent() {
  }
  
  public V2MetricValueStatusFluent(V2MetricValueStatus instance) {
    this.copyInstance(instance);
  }
  private Integer averageUtilization;
  private Quantity averageValue;
  private Quantity value;
  
  protected void copyInstance(V2MetricValueStatus instance) {
    instance = instance != null ? instance : new V2MetricValueStatus();
    if (instance != null) {
        this.withAverageUtilization(instance.getAverageUtilization());
        this.withAverageValue(instance.getAverageValue());
        this.withValue(instance.getValue());
    }
  }
  
  public Integer getAverageUtilization() {
    return this.averageUtilization;
  }
  
  public A withAverageUtilization(Integer averageUtilization) {
    this.averageUtilization = averageUtilization;
    return (A) this;
  }
  
  public boolean hasAverageUtilization() {
    return this.averageUtilization != null;
  }
  
  public Quantity getAverageValue() {
    return this.averageValue;
  }
  
  public A withAverageValue(Quantity averageValue) {
    this.averageValue = averageValue;
    return (A) this;
  }
  
  public boolean hasAverageValue() {
    return this.averageValue != null;
  }
  
  public A withNewAverageValue(String value) {
    return (A) this.withAverageValue(new Quantity(value));
  }
  
  public Quantity getValue() {
    return this.value;
  }
  
  public A withValue(Quantity value) {
    this.value = value;
    return (A) this;
  }
  
  public boolean hasValue() {
    return this.value != null;
  }
  
  public A withNewValue(String value) {
    return (A) this.withValue(new Quantity(value));
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
  

}
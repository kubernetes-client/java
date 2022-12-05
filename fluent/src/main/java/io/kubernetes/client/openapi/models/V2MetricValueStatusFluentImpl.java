package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.custom.Quantity;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V2MetricValueStatusFluentImpl<A extends V2MetricValueStatusFluent<A>> extends BaseFluent<A> implements V2MetricValueStatusFluent<A>{
  public V2MetricValueStatusFluentImpl() {
  }
  public V2MetricValueStatusFluentImpl(V2MetricValueStatus instance) {
    this.withAverageUtilization(instance.getAverageUtilization());

    this.withAverageValue(instance.getAverageValue());

    this.withValue(instance.getValue());

  }
  private Integer averageUtilization;
  private Quantity averageValue;
  private Quantity value;
  public Integer getAverageUtilization() {
    return this.averageUtilization;
  }
  public A withAverageUtilization(Integer averageUtilization) {
    this.averageUtilization=averageUtilization; return (A) this;
  }
  public Boolean hasAverageUtilization() {
    return this.averageUtilization != null;
  }
  public Quantity getAverageValue() {
    return this.averageValue;
  }
  public A withAverageValue(Quantity averageValue) {
    this.averageValue=averageValue; return (A) this;
  }
  public Boolean hasAverageValue() {
    return this.averageValue != null;
  }
  public A withNewAverageValue(String value) {
    return (A)withAverageValue(new Quantity(value));
  }
  public Quantity getValue() {
    return this.value;
  }
  public A withValue(Quantity value) {
    this.value=value; return (A) this;
  }
  public Boolean hasValue() {
    return this.value != null;
  }
  public A withNewValue(String value) {
    return (A)withValue(new Quantity(value));
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V2MetricValueStatusFluentImpl that = (V2MetricValueStatusFluentImpl) o;
    if (averageUtilization != null ? !averageUtilization.equals(that.averageUtilization) :that.averageUtilization != null) return false;
    if (averageValue != null ? !averageValue.equals(that.averageValue) :that.averageValue != null) return false;
    if (value != null ? !value.equals(that.value) :that.value != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(averageUtilization,  averageValue,  value,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (averageUtilization != null) { sb.append("averageUtilization:"); sb.append(averageUtilization + ","); }
    if (averageValue != null) { sb.append("averageValue:"); sb.append(averageValue + ","); }
    if (value != null) { sb.append("value:"); sb.append(value); }
    sb.append("}");
    return sb.toString();
  }
  
}
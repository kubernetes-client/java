package io.kubernetes.client.openapi.models;

import io.kubernetes.client.custom.Quantity;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1beta2CounterFluent<A extends io.kubernetes.client.openapi.models.V1beta2CounterFluent<A>> extends BaseFluent<A>{

  private Quantity value;

  public V1beta2CounterFluent() {
  }
  
  public V1beta2CounterFluent(V1beta2Counter instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1beta2Counter instance) {
    instance = instance != null ? instance : new V1beta2Counter();
    if (instance != null) {
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
    V1beta2CounterFluent that = (V1beta2CounterFluent) o;
    if (!(Objects.equals(value, that.value))) {
      return false;
    }
    return true;
  }
  
  public Quantity getValue() {
    return this.value;
  }
  
  public boolean hasValue() {
    return this.value != null;
  }
  
  public int hashCode() {
    return Objects.hash(value);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(value == null)) {
        sb.append("value:");
        sb.append(value);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withNewValue(String value) {
    return (A) this.withValue(new Quantity(value));
  }
  
  public A withValue(Quantity value) {
    this.value = value;
    return (A) this;
  }
  
}
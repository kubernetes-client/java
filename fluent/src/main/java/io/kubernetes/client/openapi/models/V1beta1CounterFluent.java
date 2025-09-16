package io.kubernetes.client.openapi.models;

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
public class V1beta1CounterFluent<A extends io.kubernetes.client.openapi.models.V1beta1CounterFluent<A>> extends BaseFluent<A>{
  public V1beta1CounterFluent() {
  }
  
  public V1beta1CounterFluent(V1beta1Counter instance) {
    this.copyInstance(instance);
  }
  private Quantity value;
  
  protected void copyInstance(V1beta1Counter instance) {
    instance = instance != null ? instance : new V1beta1Counter();
    if (instance != null) {
      this.withValue(instance.getValue());
    }
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
    V1beta1CounterFluent that = (V1beta1CounterFluent) o;
    if (!(Objects.equals(value, that.value))) {
      return false;
    }
    return true;
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
  

}
package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.custom.Quantity;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1alpha3CounterFluent<A extends V1alpha3CounterFluent<A>> extends BaseFluent<A>{
  public V1alpha3CounterFluent() {
  }
  
  public V1alpha3CounterFluent(V1alpha3Counter instance) {
    this.copyInstance(instance);
  }
  private Quantity value;
  
  protected void copyInstance(V1alpha3Counter instance) {
    instance = (instance != null ? instance : new V1alpha3Counter());
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
    return (A)withValue(new Quantity(value));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha3CounterFluent that = (V1alpha3CounterFluent) o;
    if (!java.util.Objects.equals(value, that.value)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(value,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (value != null) { sb.append("value:"); sb.append(value); }
    sb.append("}");
    return sb.toString();
  }
  

}
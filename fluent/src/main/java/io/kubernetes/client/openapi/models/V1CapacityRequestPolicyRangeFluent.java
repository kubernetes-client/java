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
public class V1CapacityRequestPolicyRangeFluent<A extends io.kubernetes.client.openapi.models.V1CapacityRequestPolicyRangeFluent<A>> extends BaseFluent<A>{
  public V1CapacityRequestPolicyRangeFluent() {
  }
  
  public V1CapacityRequestPolicyRangeFluent(V1CapacityRequestPolicyRange instance) {
    this.copyInstance(instance);
  }
  private Quantity max;
  private Quantity min;
  private Quantity step;
  
  protected void copyInstance(V1CapacityRequestPolicyRange instance) {
    instance = instance != null ? instance : new V1CapacityRequestPolicyRange();
    if (instance != null) {
        this.withMax(instance.getMax());
        this.withMin(instance.getMin());
        this.withStep(instance.getStep());
    }
  }
  
  public Quantity getMax() {
    return this.max;
  }
  
  public A withMax(Quantity max) {
    this.max = max;
    return (A) this;
  }
  
  public boolean hasMax() {
    return this.max != null;
  }
  
  public A withNewMax(String value) {
    return (A) this.withMax(new Quantity(value));
  }
  
  public Quantity getMin() {
    return this.min;
  }
  
  public A withMin(Quantity min) {
    this.min = min;
    return (A) this;
  }
  
  public boolean hasMin() {
    return this.min != null;
  }
  
  public A withNewMin(String value) {
    return (A) this.withMin(new Quantity(value));
  }
  
  public Quantity getStep() {
    return this.step;
  }
  
  public A withStep(Quantity step) {
    this.step = step;
    return (A) this;
  }
  
  public boolean hasStep() {
    return this.step != null;
  }
  
  public A withNewStep(String value) {
    return (A) this.withStep(new Quantity(value));
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
    V1CapacityRequestPolicyRangeFluent that = (V1CapacityRequestPolicyRangeFluent) o;
    if (!(Objects.equals(max, that.max))) {
      return false;
    }
    if (!(Objects.equals(min, that.min))) {
      return false;
    }
    if (!(Objects.equals(step, that.step))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(max, min, step);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(max == null)) {
        sb.append("max:");
        sb.append(max);
        sb.append(",");
    }
    if (!(min == null)) {
        sb.append("min:");
        sb.append(min);
        sb.append(",");
    }
    if (!(step == null)) {
        sb.append("step:");
        sb.append(step);
    }
    sb.append("}");
    return sb.toString();
  }
  

}
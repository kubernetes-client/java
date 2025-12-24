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
public class V1beta2CapacityRequestPolicyRangeFluent<A extends io.kubernetes.client.openapi.models.V1beta2CapacityRequestPolicyRangeFluent<A>> extends BaseFluent<A>{

  private Quantity max;
  private Quantity min;
  private Quantity step;

  public V1beta2CapacityRequestPolicyRangeFluent() {
  }
  
  public V1beta2CapacityRequestPolicyRangeFluent(V1beta2CapacityRequestPolicyRange instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1beta2CapacityRequestPolicyRange instance) {
    instance = instance != null ? instance : new V1beta2CapacityRequestPolicyRange();
    if (instance != null) {
        this.withMax(instance.getMax());
        this.withMin(instance.getMin());
        this.withStep(instance.getStep());
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
    V1beta2CapacityRequestPolicyRangeFluent that = (V1beta2CapacityRequestPolicyRangeFluent) o;
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
  
  public Quantity getMax() {
    return this.max;
  }
  
  public Quantity getMin() {
    return this.min;
  }
  
  public Quantity getStep() {
    return this.step;
  }
  
  public boolean hasMax() {
    return this.max != null;
  }
  
  public boolean hasMin() {
    return this.min != null;
  }
  
  public boolean hasStep() {
    return this.step != null;
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
  
  public A withMax(Quantity max) {
    this.max = max;
    return (A) this;
  }
  
  public A withMin(Quantity min) {
    this.min = min;
    return (A) this;
  }
  
  public A withNewMax(String value) {
    return (A) this.withMax(new Quantity(value));
  }
  
  public A withNewMin(String value) {
    return (A) this.withMin(new Quantity(value));
  }
  
  public A withNewStep(String value) {
    return (A) this.withStep(new Quantity(value));
  }
  
  public A withStep(Quantity step) {
    this.step = step;
    return (A) this;
  }
  
}
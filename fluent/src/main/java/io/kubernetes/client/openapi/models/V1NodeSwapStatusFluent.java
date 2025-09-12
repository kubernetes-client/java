package io.kubernetes.client.openapi.models;

import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Long;
import java.util.Objects;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1NodeSwapStatusFluent<A extends io.kubernetes.client.openapi.models.V1NodeSwapStatusFluent<A>> extends BaseFluent<A>{
  public V1NodeSwapStatusFluent() {
  }
  
  public V1NodeSwapStatusFluent(V1NodeSwapStatus instance) {
    this.copyInstance(instance);
  }
  private Long capacity;
  
  protected void copyInstance(V1NodeSwapStatus instance) {
    instance = instance != null ? instance : new V1NodeSwapStatus();
    if (instance != null) {
      this.withCapacity(instance.getCapacity());
    }
  }
  
  public Long getCapacity() {
    return this.capacity;
  }
  
  public A withCapacity(Long capacity) {
    this.capacity = capacity;
    return (A) this;
  }
  
  public boolean hasCapacity() {
    return this.capacity != null;
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
    V1NodeSwapStatusFluent that = (V1NodeSwapStatusFluent) o;
    if (!(Objects.equals(capacity, that.capacity))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(capacity);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(capacity == null)) {
        sb.append("capacity:");
        sb.append(capacity);
    }
    sb.append("}");
    return sb.toString();
  }
  

}
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
public class V1alpha1GangSchedulingPolicyFluent<A extends io.kubernetes.client.openapi.models.V1alpha1GangSchedulingPolicyFluent<A>> extends BaseFluent<A>{

  private Integer minCount;

  public V1alpha1GangSchedulingPolicyFluent() {
  }
  
  public V1alpha1GangSchedulingPolicyFluent(V1alpha1GangSchedulingPolicy instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1alpha1GangSchedulingPolicy instance) {
    instance = instance != null ? instance : new V1alpha1GangSchedulingPolicy();
    if (instance != null) {
      this.withMinCount(instance.getMinCount());
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
    V1alpha1GangSchedulingPolicyFluent that = (V1alpha1GangSchedulingPolicyFluent) o;
    if (!(Objects.equals(minCount, that.minCount))) {
      return false;
    }
    return true;
  }
  
  public Integer getMinCount() {
    return this.minCount;
  }
  
  public boolean hasMinCount() {
    return this.minCount != null;
  }
  
  public int hashCode() {
    return Objects.hash(minCount);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(minCount == null)) {
        sb.append("minCount:");
        sb.append(minCount);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withMinCount(Integer minCount) {
    this.minCount = minCount;
    return (A) this;
  }
  
}
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
public class V1ScaleSpecFluent<A extends io.kubernetes.client.openapi.models.V1ScaleSpecFluent<A>> extends BaseFluent<A>{

  private Integer replicas;

  public V1ScaleSpecFluent() {
  }
  
  public V1ScaleSpecFluent(V1ScaleSpec instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1ScaleSpec instance) {
    instance = instance != null ? instance : new V1ScaleSpec();
    if (instance != null) {
      this.withReplicas(instance.getReplicas());
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
    V1ScaleSpecFluent that = (V1ScaleSpecFluent) o;
    if (!(Objects.equals(replicas, that.replicas))) {
      return false;
    }
    return true;
  }
  
  public Integer getReplicas() {
    return this.replicas;
  }
  
  public boolean hasReplicas() {
    return this.replicas != null;
  }
  
  public int hashCode() {
    return Objects.hash(replicas);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(replicas == null)) {
        sb.append("replicas:");
        sb.append(replicas);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withReplicas(Integer replicas) {
    this.replicas = replicas;
    return (A) this;
  }
  
}
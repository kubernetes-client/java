package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Objects;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ScaleStatusFluent<A extends io.kubernetes.client.openapi.models.V1ScaleStatusFluent<A>> extends BaseFluent<A>{
  public V1ScaleStatusFluent() {
  }
  
  public V1ScaleStatusFluent(V1ScaleStatus instance) {
    this.copyInstance(instance);
  }
  private Integer replicas;
  private String selector;
  
  protected void copyInstance(V1ScaleStatus instance) {
    instance = instance != null ? instance : new V1ScaleStatus();
    if (instance != null) {
        this.withReplicas(instance.getReplicas());
        this.withSelector(instance.getSelector());
    }
  }
  
  public Integer getReplicas() {
    return this.replicas;
  }
  
  public A withReplicas(Integer replicas) {
    this.replicas = replicas;
    return (A) this;
  }
  
  public boolean hasReplicas() {
    return this.replicas != null;
  }
  
  public String getSelector() {
    return this.selector;
  }
  
  public A withSelector(String selector) {
    this.selector = selector;
    return (A) this;
  }
  
  public boolean hasSelector() {
    return this.selector != null;
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
    V1ScaleStatusFluent that = (V1ScaleStatusFluent) o;
    if (!(Objects.equals(replicas, that.replicas))) {
      return false;
    }
    if (!(Objects.equals(selector, that.selector))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(replicas, selector);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(replicas == null)) {
        sb.append("replicas:");
        sb.append(replicas);
        sb.append(",");
    }
    if (!(selector == null)) {
        sb.append("selector:");
        sb.append(selector);
    }
    sb.append("}");
    return sb.toString();
  }
  

}
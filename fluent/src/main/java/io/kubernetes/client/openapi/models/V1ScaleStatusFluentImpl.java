package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1ScaleStatusFluentImpl<A extends V1ScaleStatusFluent<A>> extends BaseFluent<A> implements V1ScaleStatusFluent<A>{
  public V1ScaleStatusFluentImpl() {
  }
  public V1ScaleStatusFluentImpl(V1ScaleStatus instance) {
    this.withReplicas(instance.getReplicas());

    this.withSelector(instance.getSelector());

  }
  private Integer replicas;
  private String selector;
  public Integer getReplicas() {
    return this.replicas;
  }
  public A withReplicas(Integer replicas) {
    this.replicas=replicas; return (A) this;
  }
  public Boolean hasReplicas() {
    return this.replicas != null;
  }
  public String getSelector() {
    return this.selector;
  }
  public A withSelector(String selector) {
    this.selector=selector; return (A) this;
  }
  public Boolean hasSelector() {
    return this.selector != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ScaleStatusFluentImpl that = (V1ScaleStatusFluentImpl) o;
    if (replicas != null ? !replicas.equals(that.replicas) :that.replicas != null) return false;
    if (selector != null ? !selector.equals(that.selector) :that.selector != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(replicas,  selector,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (replicas != null) { sb.append("replicas:"); sb.append(replicas + ","); }
    if (selector != null) { sb.append("selector:"); sb.append(selector); }
    sb.append("}");
    return sb.toString();
  }
  
}
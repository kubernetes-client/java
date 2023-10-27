package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ScaleSpecFluent<A extends V1ScaleSpecFluent<A>> extends BaseFluent<A>{
  public V1ScaleSpecFluent() {
  }
  
  public V1ScaleSpecFluent(V1ScaleSpec instance) {
    this.copyInstance(instance);
  }
  private Integer replicas;
  
  protected void copyInstance(V1ScaleSpec instance) {
    instance = (instance != null ? instance : new V1ScaleSpec());
    if (instance != null) {
          this.withReplicas(instance.getReplicas());
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
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ScaleSpecFluent that = (V1ScaleSpecFluent) o;
    if (!java.util.Objects.equals(replicas, that.replicas)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(replicas,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (replicas != null) { sb.append("replicas:"); sb.append(replicas); }
    sb.append("}");
    return sb.toString();
  }
  

}
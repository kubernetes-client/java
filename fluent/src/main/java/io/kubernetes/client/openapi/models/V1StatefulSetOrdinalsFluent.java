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
public class V1StatefulSetOrdinalsFluent<A extends V1StatefulSetOrdinalsFluent<A>> extends BaseFluent<A>{
  public V1StatefulSetOrdinalsFluent() {
  }
  
  public V1StatefulSetOrdinalsFluent(V1StatefulSetOrdinals instance) {
    this.copyInstance(instance);
  }
  private Integer start;
  
  protected void copyInstance(V1StatefulSetOrdinals instance) {
    instance = (instance != null ? instance : new V1StatefulSetOrdinals());
    if (instance != null) {
          this.withStart(instance.getStart());
        }
  }
  
  public Integer getStart() {
    return this.start;
  }
  
  public A withStart(Integer start) {
    this.start = start;
    return (A) this;
  }
  
  public boolean hasStart() {
    return this.start != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1StatefulSetOrdinalsFluent that = (V1StatefulSetOrdinalsFluent) o;
    if (!java.util.Objects.equals(start, that.start)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(start,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (start != null) { sb.append("start:"); sb.append(start); }
    sb.append("}");
    return sb.toString();
  }
  

}
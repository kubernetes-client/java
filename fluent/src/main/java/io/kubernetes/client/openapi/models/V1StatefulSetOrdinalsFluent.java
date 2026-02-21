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
public class V1StatefulSetOrdinalsFluent<A extends io.kubernetes.client.openapi.models.V1StatefulSetOrdinalsFluent<A>> extends BaseFluent<A>{

  private Integer start;

  public V1StatefulSetOrdinalsFluent() {
  }
  
  public V1StatefulSetOrdinalsFluent(V1StatefulSetOrdinals instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1StatefulSetOrdinals instance) {
    instance = instance != null ? instance : new V1StatefulSetOrdinals();
    if (instance != null) {
      this.withStart(instance.getStart());
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
    V1StatefulSetOrdinalsFluent that = (V1StatefulSetOrdinalsFluent) o;
    if (!(Objects.equals(start, that.start))) {
      return false;
    }
    return true;
  }
  
  public Integer getStart() {
    return this.start;
  }
  
  public boolean hasStart() {
    return this.start != null;
  }
  
  public int hashCode() {
    return Objects.hash(start);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(start == null)) {
        sb.append("start:");
        sb.append(start);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withStart(Integer start) {
    this.start = start;
    return (A) this;
  }
  
}
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
  public class V1StatefulSetOrdinalsFluentImpl<A extends V1StatefulSetOrdinalsFluent<A>> extends BaseFluent<A> implements V1StatefulSetOrdinalsFluent<A>{
  public V1StatefulSetOrdinalsFluentImpl() {
  }
  public V1StatefulSetOrdinalsFluentImpl(V1StatefulSetOrdinals instance) {
    if (instance != null) {
      this.withStart(instance.getStart());
    }
  }
  private Integer start;
  public Integer getStart() {
    return this.start;
  }
  public A withStart(Integer start) {
    this.start=start; return (A) this;
  }
  public Boolean hasStart() {
    return this.start != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1StatefulSetOrdinalsFluentImpl that = (V1StatefulSetOrdinalsFluentImpl) o;
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
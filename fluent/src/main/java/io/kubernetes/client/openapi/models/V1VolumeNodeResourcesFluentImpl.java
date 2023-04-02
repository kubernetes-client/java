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
  public class V1VolumeNodeResourcesFluentImpl<A extends V1VolumeNodeResourcesFluent<A>> extends BaseFluent<A> implements V1VolumeNodeResourcesFluent<A>{
  public V1VolumeNodeResourcesFluentImpl() {
  }
  public V1VolumeNodeResourcesFluentImpl(V1VolumeNodeResources instance) {
    this.withCount(instance.getCount());

  }
  private Integer count;
  public Integer getCount() {
    return this.count;
  }
  public A withCount(Integer count) {
    this.count=count; return (A) this;
  }
  public Boolean hasCount() {
    return this.count != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1VolumeNodeResourcesFluentImpl that = (V1VolumeNodeResourcesFluentImpl) o;
    if (count != null ? !count.equals(that.count) :that.count != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(count,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (count != null) { sb.append("count:"); sb.append(count); }
    sb.append("}");
    return sb.toString();
  }
  
}
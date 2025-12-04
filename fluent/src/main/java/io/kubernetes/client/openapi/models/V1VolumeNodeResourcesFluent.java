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
public class V1VolumeNodeResourcesFluent<A extends io.kubernetes.client.openapi.models.V1VolumeNodeResourcesFluent<A>> extends BaseFluent<A>{

  private Integer count;

  public V1VolumeNodeResourcesFluent() {
  }
  
  public V1VolumeNodeResourcesFluent(V1VolumeNodeResources instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1VolumeNodeResources instance) {
    instance = instance != null ? instance : new V1VolumeNodeResources();
    if (instance != null) {
      this.withCount(instance.getCount());
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
    V1VolumeNodeResourcesFluent that = (V1VolumeNodeResourcesFluent) o;
    if (!(Objects.equals(count, that.count))) {
      return false;
    }
    return true;
  }
  
  public Integer getCount() {
    return this.count;
  }
  
  public boolean hasCount() {
    return this.count != null;
  }
  
  public int hashCode() {
    return Objects.hash(count);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(count == null)) {
        sb.append("count:");
        sb.append(count);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withCount(Integer count) {
    this.count = count;
    return (A) this;
  }
  
}
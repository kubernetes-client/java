package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.StringBuilder;
import java.time.OffsetDateTime;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Objects;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class CoreV1EventSeriesFluent<A extends io.kubernetes.client.openapi.models.CoreV1EventSeriesFluent<A>> extends BaseFluent<A>{
  public CoreV1EventSeriesFluent() {
  }
  
  public CoreV1EventSeriesFluent(CoreV1EventSeries instance) {
    this.copyInstance(instance);
  }
  private Integer count;
  private OffsetDateTime lastObservedTime;
  
  protected void copyInstance(CoreV1EventSeries instance) {
    instance = instance != null ? instance : new CoreV1EventSeries();
    if (instance != null) {
        this.withCount(instance.getCount());
        this.withLastObservedTime(instance.getLastObservedTime());
    }
  }
  
  public Integer getCount() {
    return this.count;
  }
  
  public A withCount(Integer count) {
    this.count = count;
    return (A) this;
  }
  
  public boolean hasCount() {
    return this.count != null;
  }
  
  public OffsetDateTime getLastObservedTime() {
    return this.lastObservedTime;
  }
  
  public A withLastObservedTime(OffsetDateTime lastObservedTime) {
    this.lastObservedTime = lastObservedTime;
    return (A) this;
  }
  
  public boolean hasLastObservedTime() {
    return this.lastObservedTime != null;
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
    CoreV1EventSeriesFluent that = (CoreV1EventSeriesFluent) o;
    if (!(Objects.equals(count, that.count))) {
      return false;
    }
    if (!(Objects.equals(lastObservedTime, that.lastObservedTime))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(count, lastObservedTime);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(count == null)) {
        sb.append("count:");
        sb.append(count);
        sb.append(",");
    }
    if (!(lastObservedTime == null)) {
        sb.append("lastObservedTime:");
        sb.append(lastObservedTime);
    }
    sb.append("}");
    return sb.toString();
  }
  

}
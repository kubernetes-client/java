package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.time.OffsetDateTime;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class CoreV1EventSeriesFluentImpl<A extends CoreV1EventSeriesFluent<A>> extends BaseFluent<A> implements CoreV1EventSeriesFluent<A>{
  public CoreV1EventSeriesFluentImpl() {
  }
  public CoreV1EventSeriesFluentImpl(CoreV1EventSeries instance) {
    if (instance != null) {
      this.withCount(instance.getCount());
      this.withLastObservedTime(instance.getLastObservedTime());
    }
  }
  private Integer count;
  private OffsetDateTime lastObservedTime;
  public Integer getCount() {
    return this.count;
  }
  public A withCount(Integer count) {
    this.count=count; return (A) this;
  }
  public Boolean hasCount() {
    return this.count != null;
  }
  public OffsetDateTime getLastObservedTime() {
    return this.lastObservedTime;
  }
  public A withLastObservedTime(OffsetDateTime lastObservedTime) {
    this.lastObservedTime=lastObservedTime; return (A) this;
  }
  public Boolean hasLastObservedTime() {
    return this.lastObservedTime != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    CoreV1EventSeriesFluentImpl that = (CoreV1EventSeriesFluentImpl) o;
    if (!java.util.Objects.equals(count, that.count)) return false;

    if (!java.util.Objects.equals(lastObservedTime, that.lastObservedTime)) return false;

    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(count,  lastObservedTime,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (count != null) { sb.append("count:"); sb.append(count + ","); }
    if (lastObservedTime != null) { sb.append("lastObservedTime:"); sb.append(lastObservedTime); }
    sb.append("}");
    return sb.toString();
  }
  
}
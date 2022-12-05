package io.kubernetes.client.openapi.models;

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
  public class V1ContainerStateRunningFluentImpl<A extends V1ContainerStateRunningFluent<A>> extends BaseFluent<A> implements V1ContainerStateRunningFluent<A>{
  public V1ContainerStateRunningFluentImpl() {
  }
  public V1ContainerStateRunningFluentImpl(V1ContainerStateRunning instance) {
    this.withStartedAt(instance.getStartedAt());

  }
  private OffsetDateTime startedAt;
  public OffsetDateTime getStartedAt() {
    return this.startedAt;
  }
  public A withStartedAt(OffsetDateTime startedAt) {
    this.startedAt=startedAt; return (A) this;
  }
  public Boolean hasStartedAt() {
    return this.startedAt != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ContainerStateRunningFluentImpl that = (V1ContainerStateRunningFluentImpl) o;
    if (startedAt != null ? !startedAt.equals(that.startedAt) :that.startedAt != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(startedAt,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (startedAt != null) { sb.append("startedAt:"); sb.append(startedAt); }
    sb.append("}");
    return sb.toString();
  }
  
}
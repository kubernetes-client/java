package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ContainerStateRunningFluent<A extends io.kubernetes.client.openapi.models.V1ContainerStateRunningFluent<A>> extends BaseFluent<A>{

  private OffsetDateTime startedAt;

  public V1ContainerStateRunningFluent() {
  }
  
  public V1ContainerStateRunningFluent(V1ContainerStateRunning instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1ContainerStateRunning instance) {
    instance = instance != null ? instance : new V1ContainerStateRunning();
    if (instance != null) {
      this.withStartedAt(instance.getStartedAt());
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
    V1ContainerStateRunningFluent that = (V1ContainerStateRunningFluent) o;
    if (!(Objects.equals(startedAt, that.startedAt))) {
      return false;
    }
    return true;
  }
  
  public OffsetDateTime getStartedAt() {
    return this.startedAt;
  }
  
  public boolean hasStartedAt() {
    return this.startedAt != null;
  }
  
  public int hashCode() {
    return Objects.hash(startedAt);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(startedAt == null)) {
        sb.append("startedAt:");
        sb.append(startedAt);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withStartedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
    return (A) this;
  }
  
}
package io.kubernetes.client.openapi.models;

import java.time.OffsetDateTime;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ContainerStateRunningFluent<A extends V1ContainerStateRunningFluent<A>> extends BaseFluent<A>{
  public V1ContainerStateRunningFluent() {
  }
  
  public V1ContainerStateRunningFluent(V1ContainerStateRunning instance) {
    this.copyInstance(instance);
  }
  private OffsetDateTime startedAt;
  
  protected void copyInstance(V1ContainerStateRunning instance) {
    instance = (instance != null ? instance : new V1ContainerStateRunning());
    if (instance != null) {
          this.withStartedAt(instance.getStartedAt());
        }
  }
  
  public OffsetDateTime getStartedAt() {
    return this.startedAt;
  }
  
  public A withStartedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
    return (A) this;
  }
  
  public boolean hasStartedAt() {
    return this.startedAt != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ContainerStateRunningFluent that = (V1ContainerStateRunningFluent) o;
    if (!java.util.Objects.equals(startedAt, that.startedAt)) return false;
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
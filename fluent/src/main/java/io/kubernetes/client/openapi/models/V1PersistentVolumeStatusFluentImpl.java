package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1PersistentVolumeStatusFluentImpl<A extends V1PersistentVolumeStatusFluent<A>> extends BaseFluent<A> implements V1PersistentVolumeStatusFluent<A>{
  public V1PersistentVolumeStatusFluentImpl() {
  }
  public V1PersistentVolumeStatusFluentImpl(V1PersistentVolumeStatus instance) {
    this.withMessage(instance.getMessage());

    this.withPhase(instance.getPhase());

    this.withReason(instance.getReason());

  }
  private String message;
  private String phase;
  private String reason;
  public String getMessage() {
    return this.message;
  }
  public A withMessage(String message) {
    this.message=message; return (A) this;
  }
  public Boolean hasMessage() {
    return this.message != null;
  }
  public String getPhase() {
    return this.phase;
  }
  public A withPhase(String phase) {
    this.phase=phase; return (A) this;
  }
  public Boolean hasPhase() {
    return this.phase != null;
  }
  public String getReason() {
    return this.reason;
  }
  public A withReason(String reason) {
    this.reason=reason; return (A) this;
  }
  public Boolean hasReason() {
    return this.reason != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1PersistentVolumeStatusFluentImpl that = (V1PersistentVolumeStatusFluentImpl) o;
    if (message != null ? !message.equals(that.message) :that.message != null) return false;
    if (phase != null ? !phase.equals(that.phase) :that.phase != null) return false;
    if (reason != null ? !reason.equals(that.reason) :that.reason != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(message,  phase,  reason,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (message != null) { sb.append("message:"); sb.append(message + ","); }
    if (phase != null) { sb.append("phase:"); sb.append(phase + ","); }
    if (reason != null) { sb.append("reason:"); sb.append(reason); }
    sb.append("}");
    return sb.toString();
  }
  
}
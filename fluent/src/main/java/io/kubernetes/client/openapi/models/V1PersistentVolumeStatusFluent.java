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
public class V1PersistentVolumeStatusFluent<A extends io.kubernetes.client.openapi.models.V1PersistentVolumeStatusFluent<A>> extends BaseFluent<A>{

  private OffsetDateTime lastPhaseTransitionTime;
  private String message;
  private String phase;
  private String reason;

  public V1PersistentVolumeStatusFluent() {
  }
  
  public V1PersistentVolumeStatusFluent(V1PersistentVolumeStatus instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1PersistentVolumeStatus instance) {
    instance = instance != null ? instance : new V1PersistentVolumeStatus();
    if (instance != null) {
        this.withLastPhaseTransitionTime(instance.getLastPhaseTransitionTime());
        this.withMessage(instance.getMessage());
        this.withPhase(instance.getPhase());
        this.withReason(instance.getReason());
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
    V1PersistentVolumeStatusFluent that = (V1PersistentVolumeStatusFluent) o;
    if (!(Objects.equals(lastPhaseTransitionTime, that.lastPhaseTransitionTime))) {
      return false;
    }
    if (!(Objects.equals(message, that.message))) {
      return false;
    }
    if (!(Objects.equals(phase, that.phase))) {
      return false;
    }
    if (!(Objects.equals(reason, that.reason))) {
      return false;
    }
    return true;
  }
  
  public OffsetDateTime getLastPhaseTransitionTime() {
    return this.lastPhaseTransitionTime;
  }
  
  public String getMessage() {
    return this.message;
  }
  
  public String getPhase() {
    return this.phase;
  }
  
  public String getReason() {
    return this.reason;
  }
  
  public boolean hasLastPhaseTransitionTime() {
    return this.lastPhaseTransitionTime != null;
  }
  
  public boolean hasMessage() {
    return this.message != null;
  }
  
  public boolean hasPhase() {
    return this.phase != null;
  }
  
  public boolean hasReason() {
    return this.reason != null;
  }
  
  public int hashCode() {
    return Objects.hash(lastPhaseTransitionTime, message, phase, reason);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(lastPhaseTransitionTime == null)) {
        sb.append("lastPhaseTransitionTime:");
        sb.append(lastPhaseTransitionTime);
        sb.append(",");
    }
    if (!(message == null)) {
        sb.append("message:");
        sb.append(message);
        sb.append(",");
    }
    if (!(phase == null)) {
        sb.append("phase:");
        sb.append(phase);
        sb.append(",");
    }
    if (!(reason == null)) {
        sb.append("reason:");
        sb.append(reason);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withLastPhaseTransitionTime(OffsetDateTime lastPhaseTransitionTime) {
    this.lastPhaseTransitionTime = lastPhaseTransitionTime;
    return (A) this;
  }
  
  public A withMessage(String message) {
    this.message = message;
    return (A) this;
  }
  
  public A withPhase(String phase) {
    this.phase = phase;
    return (A) this;
  }
  
  public A withReason(String reason) {
    this.reason = reason;
    return (A) this;
  }
  
}
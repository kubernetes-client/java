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
public class V1PersistentVolumeStatusFluent<A extends V1PersistentVolumeStatusFluent<A>> extends BaseFluent<A>{
  public V1PersistentVolumeStatusFluent() {
  }
  
  public V1PersistentVolumeStatusFluent(V1PersistentVolumeStatus instance) {
    this.copyInstance(instance);
  }
  private OffsetDateTime lastPhaseTransitionTime;
  private String message;
  private String phase;
  private String reason;
  
  protected void copyInstance(V1PersistentVolumeStatus instance) {
    instance = (instance != null ? instance : new V1PersistentVolumeStatus());
    if (instance != null) {
          this.withLastPhaseTransitionTime(instance.getLastPhaseTransitionTime());
          this.withMessage(instance.getMessage());
          this.withPhase(instance.getPhase());
          this.withReason(instance.getReason());
        }
  }
  
  public OffsetDateTime getLastPhaseTransitionTime() {
    return this.lastPhaseTransitionTime;
  }
  
  public A withLastPhaseTransitionTime(OffsetDateTime lastPhaseTransitionTime) {
    this.lastPhaseTransitionTime = lastPhaseTransitionTime;
    return (A) this;
  }
  
  public boolean hasLastPhaseTransitionTime() {
    return this.lastPhaseTransitionTime != null;
  }
  
  public String getMessage() {
    return this.message;
  }
  
  public A withMessage(String message) {
    this.message = message;
    return (A) this;
  }
  
  public boolean hasMessage() {
    return this.message != null;
  }
  
  public String getPhase() {
    return this.phase;
  }
  
  public A withPhase(String phase) {
    this.phase = phase;
    return (A) this;
  }
  
  public boolean hasPhase() {
    return this.phase != null;
  }
  
  public String getReason() {
    return this.reason;
  }
  
  public A withReason(String reason) {
    this.reason = reason;
    return (A) this;
  }
  
  public boolean hasReason() {
    return this.reason != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1PersistentVolumeStatusFluent that = (V1PersistentVolumeStatusFluent) o;
    if (!java.util.Objects.equals(lastPhaseTransitionTime, that.lastPhaseTransitionTime)) return false;
    if (!java.util.Objects.equals(message, that.message)) return false;
    if (!java.util.Objects.equals(phase, that.phase)) return false;
    if (!java.util.Objects.equals(reason, that.reason)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(lastPhaseTransitionTime,  message,  phase,  reason,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (lastPhaseTransitionTime != null) { sb.append("lastPhaseTransitionTime:"); sb.append(lastPhaseTransitionTime + ","); }
    if (message != null) { sb.append("message:"); sb.append(message + ","); }
    if (phase != null) { sb.append("phase:"); sb.append(phase + ","); }
    if (reason != null) { sb.append("reason:"); sb.append(reason); }
    sb.append("}");
    return sb.toString();
  }
  

}
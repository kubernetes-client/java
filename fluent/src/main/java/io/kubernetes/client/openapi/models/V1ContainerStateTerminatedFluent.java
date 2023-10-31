package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.time.OffsetDateTime;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ContainerStateTerminatedFluent<A extends V1ContainerStateTerminatedFluent<A>> extends BaseFluent<A>{
  public V1ContainerStateTerminatedFluent() {
  }
  
  public V1ContainerStateTerminatedFluent(V1ContainerStateTerminated instance) {
    this.copyInstance(instance);
  }
  private String containerID;
  private Integer exitCode;
  private OffsetDateTime finishedAt;
  private String message;
  private String reason;
  private Integer signal;
  private OffsetDateTime startedAt;
  
  protected void copyInstance(V1ContainerStateTerminated instance) {
    instance = (instance != null ? instance : new V1ContainerStateTerminated());
    if (instance != null) {
          this.withContainerID(instance.getContainerID());
          this.withExitCode(instance.getExitCode());
          this.withFinishedAt(instance.getFinishedAt());
          this.withMessage(instance.getMessage());
          this.withReason(instance.getReason());
          this.withSignal(instance.getSignal());
          this.withStartedAt(instance.getStartedAt());
        }
  }
  
  public String getContainerID() {
    return this.containerID;
  }
  
  public A withContainerID(String containerID) {
    this.containerID = containerID;
    return (A) this;
  }
  
  public boolean hasContainerID() {
    return this.containerID != null;
  }
  
  public Integer getExitCode() {
    return this.exitCode;
  }
  
  public A withExitCode(Integer exitCode) {
    this.exitCode = exitCode;
    return (A) this;
  }
  
  public boolean hasExitCode() {
    return this.exitCode != null;
  }
  
  public OffsetDateTime getFinishedAt() {
    return this.finishedAt;
  }
  
  public A withFinishedAt(OffsetDateTime finishedAt) {
    this.finishedAt = finishedAt;
    return (A) this;
  }
  
  public boolean hasFinishedAt() {
    return this.finishedAt != null;
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
  
  public Integer getSignal() {
    return this.signal;
  }
  
  public A withSignal(Integer signal) {
    this.signal = signal;
    return (A) this;
  }
  
  public boolean hasSignal() {
    return this.signal != null;
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
    V1ContainerStateTerminatedFluent that = (V1ContainerStateTerminatedFluent) o;
    if (!java.util.Objects.equals(containerID, that.containerID)) return false;
    if (!java.util.Objects.equals(exitCode, that.exitCode)) return false;
    if (!java.util.Objects.equals(finishedAt, that.finishedAt)) return false;
    if (!java.util.Objects.equals(message, that.message)) return false;
    if (!java.util.Objects.equals(reason, that.reason)) return false;
    if (!java.util.Objects.equals(signal, that.signal)) return false;
    if (!java.util.Objects.equals(startedAt, that.startedAt)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(containerID,  exitCode,  finishedAt,  message,  reason,  signal,  startedAt,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (containerID != null) { sb.append("containerID:"); sb.append(containerID + ","); }
    if (exitCode != null) { sb.append("exitCode:"); sb.append(exitCode + ","); }
    if (finishedAt != null) { sb.append("finishedAt:"); sb.append(finishedAt + ","); }
    if (message != null) { sb.append("message:"); sb.append(message + ","); }
    if (reason != null) { sb.append("reason:"); sb.append(reason + ","); }
    if (signal != null) { sb.append("signal:"); sb.append(signal + ","); }
    if (startedAt != null) { sb.append("startedAt:"); sb.append(startedAt); }
    sb.append("}");
    return sb.toString();
  }
  

}
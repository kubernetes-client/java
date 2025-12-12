package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Integer;
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
public class V1ContainerStateTerminatedFluent<A extends io.kubernetes.client.openapi.models.V1ContainerStateTerminatedFluent<A>> extends BaseFluent<A>{

  private String containerID;
  private Integer exitCode;
  private OffsetDateTime finishedAt;
  private String message;
  private String reason;
  private Integer signal;
  private OffsetDateTime startedAt;

  public V1ContainerStateTerminatedFluent() {
  }
  
  public V1ContainerStateTerminatedFluent(V1ContainerStateTerminated instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1ContainerStateTerminated instance) {
    instance = instance != null ? instance : new V1ContainerStateTerminated();
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
    V1ContainerStateTerminatedFluent that = (V1ContainerStateTerminatedFluent) o;
    if (!(Objects.equals(containerID, that.containerID))) {
      return false;
    }
    if (!(Objects.equals(exitCode, that.exitCode))) {
      return false;
    }
    if (!(Objects.equals(finishedAt, that.finishedAt))) {
      return false;
    }
    if (!(Objects.equals(message, that.message))) {
      return false;
    }
    if (!(Objects.equals(reason, that.reason))) {
      return false;
    }
    if (!(Objects.equals(signal, that.signal))) {
      return false;
    }
    if (!(Objects.equals(startedAt, that.startedAt))) {
      return false;
    }
    return true;
  }
  
  public String getContainerID() {
    return this.containerID;
  }
  
  public Integer getExitCode() {
    return this.exitCode;
  }
  
  public OffsetDateTime getFinishedAt() {
    return this.finishedAt;
  }
  
  public String getMessage() {
    return this.message;
  }
  
  public String getReason() {
    return this.reason;
  }
  
  public Integer getSignal() {
    return this.signal;
  }
  
  public OffsetDateTime getStartedAt() {
    return this.startedAt;
  }
  
  public boolean hasContainerID() {
    return this.containerID != null;
  }
  
  public boolean hasExitCode() {
    return this.exitCode != null;
  }
  
  public boolean hasFinishedAt() {
    return this.finishedAt != null;
  }
  
  public boolean hasMessage() {
    return this.message != null;
  }
  
  public boolean hasReason() {
    return this.reason != null;
  }
  
  public boolean hasSignal() {
    return this.signal != null;
  }
  
  public boolean hasStartedAt() {
    return this.startedAt != null;
  }
  
  public int hashCode() {
    return Objects.hash(containerID, exitCode, finishedAt, message, reason, signal, startedAt);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(containerID == null)) {
        sb.append("containerID:");
        sb.append(containerID);
        sb.append(",");
    }
    if (!(exitCode == null)) {
        sb.append("exitCode:");
        sb.append(exitCode);
        sb.append(",");
    }
    if (!(finishedAt == null)) {
        sb.append("finishedAt:");
        sb.append(finishedAt);
        sb.append(",");
    }
    if (!(message == null)) {
        sb.append("message:");
        sb.append(message);
        sb.append(",");
    }
    if (!(reason == null)) {
        sb.append("reason:");
        sb.append(reason);
        sb.append(",");
    }
    if (!(signal == null)) {
        sb.append("signal:");
        sb.append(signal);
        sb.append(",");
    }
    if (!(startedAt == null)) {
        sb.append("startedAt:");
        sb.append(startedAt);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withContainerID(String containerID) {
    this.containerID = containerID;
    return (A) this;
  }
  
  public A withExitCode(Integer exitCode) {
    this.exitCode = exitCode;
    return (A) this;
  }
  
  public A withFinishedAt(OffsetDateTime finishedAt) {
    this.finishedAt = finishedAt;
    return (A) this;
  }
  
  public A withMessage(String message) {
    this.message = message;
    return (A) this;
  }
  
  public A withReason(String reason) {
    this.reason = reason;
    return (A) this;
  }
  
  public A withSignal(Integer signal) {
    this.signal = signal;
    return (A) this;
  }
  
  public A withStartedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
    return (A) this;
  }
  
}
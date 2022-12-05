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
  public class V1ContainerStateTerminatedFluentImpl<A extends V1ContainerStateTerminatedFluent<A>> extends BaseFluent<A> implements V1ContainerStateTerminatedFluent<A>{
  public V1ContainerStateTerminatedFluentImpl() {
  }
  public V1ContainerStateTerminatedFluentImpl(V1ContainerStateTerminated instance) {
    this.withContainerID(instance.getContainerID());

    this.withExitCode(instance.getExitCode());

    this.withFinishedAt(instance.getFinishedAt());

    this.withMessage(instance.getMessage());

    this.withReason(instance.getReason());

    this.withSignal(instance.getSignal());

    this.withStartedAt(instance.getStartedAt());

  }
  private String containerID;
  private Integer exitCode;
  private OffsetDateTime finishedAt;
  private String message;
  private String reason;
  private Integer signal;
  private OffsetDateTime startedAt;
  public String getContainerID() {
    return this.containerID;
  }
  public A withContainerID(String containerID) {
    this.containerID=containerID; return (A) this;
  }
  public Boolean hasContainerID() {
    return this.containerID != null;
  }
  public Integer getExitCode() {
    return this.exitCode;
  }
  public A withExitCode(Integer exitCode) {
    this.exitCode=exitCode; return (A) this;
  }
  public Boolean hasExitCode() {
    return this.exitCode != null;
  }
  public OffsetDateTime getFinishedAt() {
    return this.finishedAt;
  }
  public A withFinishedAt(OffsetDateTime finishedAt) {
    this.finishedAt=finishedAt; return (A) this;
  }
  public Boolean hasFinishedAt() {
    return this.finishedAt != null;
  }
  public String getMessage() {
    return this.message;
  }
  public A withMessage(String message) {
    this.message=message; return (A) this;
  }
  public Boolean hasMessage() {
    return this.message != null;
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
  public Integer getSignal() {
    return this.signal;
  }
  public A withSignal(Integer signal) {
    this.signal=signal; return (A) this;
  }
  public Boolean hasSignal() {
    return this.signal != null;
  }
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
    V1ContainerStateTerminatedFluentImpl that = (V1ContainerStateTerminatedFluentImpl) o;
    if (containerID != null ? !containerID.equals(that.containerID) :that.containerID != null) return false;
    if (exitCode != null ? !exitCode.equals(that.exitCode) :that.exitCode != null) return false;
    if (finishedAt != null ? !finishedAt.equals(that.finishedAt) :that.finishedAt != null) return false;
    if (message != null ? !message.equals(that.message) :that.message != null) return false;
    if (reason != null ? !reason.equals(that.reason) :that.reason != null) return false;
    if (signal != null ? !signal.equals(that.signal) :that.signal != null) return false;
    if (startedAt != null ? !startedAt.equals(that.startedAt) :that.startedAt != null) return false;
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
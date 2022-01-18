/*
Copyright 2022 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.models;

/** Generated */
public class V1ContainerStateTerminatedFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1ContainerStateTerminatedFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1ContainerStateTerminatedFluent<A> {
  public V1ContainerStateTerminatedFluentImpl() {}

  public V1ContainerStateTerminatedFluentImpl(
      io.kubernetes.client.openapi.models.V1ContainerStateTerminated instance) {
    this.withContainerID(instance.getContainerID());

    this.withExitCode(instance.getExitCode());

    this.withFinishedAt(instance.getFinishedAt());

    this.withMessage(instance.getMessage());

    this.withReason(instance.getReason());

    this.withSignal(instance.getSignal());

    this.withStartedAt(instance.getStartedAt());
  }

  private java.lang.String containerID;
  private java.lang.Integer exitCode;
  private java.time.OffsetDateTime finishedAt;
  private java.lang.String message;
  private java.lang.String reason;
  private java.lang.Integer signal;
  private java.time.OffsetDateTime startedAt;

  public java.lang.String getContainerID() {
    return this.containerID;
  }

  public A withContainerID(java.lang.String containerID) {
    this.containerID = containerID;
    return (A) this;
  }

  public java.lang.Boolean hasContainerID() {
    return this.containerID != null;
  }

  /** Method is deprecated. use withContainerID instead. */
  @java.lang.Deprecated
  public A withNewContainerID(java.lang.String original) {
    return (A) withContainerID(new String(original));
  }

  public java.lang.Integer getExitCode() {
    return this.exitCode;
  }

  public A withExitCode(java.lang.Integer exitCode) {
    this.exitCode = exitCode;
    return (A) this;
  }

  public java.lang.Boolean hasExitCode() {
    return this.exitCode != null;
  }

  public java.time.OffsetDateTime getFinishedAt() {
    return this.finishedAt;
  }

  public A withFinishedAt(java.time.OffsetDateTime finishedAt) {
    this.finishedAt = finishedAt;
    return (A) this;
  }

  public java.lang.Boolean hasFinishedAt() {
    return this.finishedAt != null;
  }

  public java.lang.String getMessage() {
    return this.message;
  }

  public A withMessage(java.lang.String message) {
    this.message = message;
    return (A) this;
  }

  public java.lang.Boolean hasMessage() {
    return this.message != null;
  }

  /** Method is deprecated. use withMessage instead. */
  @java.lang.Deprecated
  public A withNewMessage(java.lang.String original) {
    return (A) withMessage(new String(original));
  }

  public java.lang.String getReason() {
    return this.reason;
  }

  public A withReason(java.lang.String reason) {
    this.reason = reason;
    return (A) this;
  }

  public java.lang.Boolean hasReason() {
    return this.reason != null;
  }

  /** Method is deprecated. use withReason instead. */
  @java.lang.Deprecated
  public A withNewReason(java.lang.String original) {
    return (A) withReason(new String(original));
  }

  public java.lang.Integer getSignal() {
    return this.signal;
  }

  public A withSignal(java.lang.Integer signal) {
    this.signal = signal;
    return (A) this;
  }

  public java.lang.Boolean hasSignal() {
    return this.signal != null;
  }

  public java.time.OffsetDateTime getStartedAt() {
    return this.startedAt;
  }

  public A withStartedAt(java.time.OffsetDateTime startedAt) {
    this.startedAt = startedAt;
    return (A) this;
  }

  public java.lang.Boolean hasStartedAt() {
    return this.startedAt != null;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ContainerStateTerminatedFluentImpl that = (V1ContainerStateTerminatedFluentImpl) o;
    if (containerID != null ? !containerID.equals(that.containerID) : that.containerID != null)
      return false;
    if (exitCode != null ? !exitCode.equals(that.exitCode) : that.exitCode != null) return false;
    if (finishedAt != null ? !finishedAt.equals(that.finishedAt) : that.finishedAt != null)
      return false;
    if (message != null ? !message.equals(that.message) : that.message != null) return false;
    if (reason != null ? !reason.equals(that.reason) : that.reason != null) return false;
    if (signal != null ? !signal.equals(that.signal) : that.signal != null) return false;
    if (startedAt != null ? !startedAt.equals(that.startedAt) : that.startedAt != null)
      return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        containerID, exitCode, finishedAt, message, reason, signal, startedAt, super.hashCode());
  }
}

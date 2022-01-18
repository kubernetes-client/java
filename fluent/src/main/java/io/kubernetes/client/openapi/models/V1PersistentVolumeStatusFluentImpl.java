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
public class V1PersistentVolumeStatusFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1PersistentVolumeStatusFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1PersistentVolumeStatusFluent<A> {
  public V1PersistentVolumeStatusFluentImpl() {}

  public V1PersistentVolumeStatusFluentImpl(
      io.kubernetes.client.openapi.models.V1PersistentVolumeStatus instance) {
    this.withMessage(instance.getMessage());

    this.withPhase(instance.getPhase());

    this.withReason(instance.getReason());
  }

  private java.lang.String message;
  private io.kubernetes.client.openapi.models.V1PersistentVolumeStatus.PhaseEnum phase;
  private java.lang.String reason;

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

  public io.kubernetes.client.openapi.models.V1PersistentVolumeStatus.PhaseEnum getPhase() {
    return this.phase;
  }

  public A withPhase(io.kubernetes.client.openapi.models.V1PersistentVolumeStatus.PhaseEnum phase) {
    this.phase = phase;
    return (A) this;
  }

  public java.lang.Boolean hasPhase() {
    return this.phase != null;
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

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1PersistentVolumeStatusFluentImpl that = (V1PersistentVolumeStatusFluentImpl) o;
    if (message != null ? !message.equals(that.message) : that.message != null) return false;
    if (phase != null ? !phase.equals(that.phase) : that.phase != null) return false;
    if (reason != null ? !reason.equals(that.reason) : that.reason != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(message, phase, reason, super.hashCode());
  }
}

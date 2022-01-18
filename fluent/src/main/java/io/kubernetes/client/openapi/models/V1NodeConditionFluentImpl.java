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
public class V1NodeConditionFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1NodeConditionFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1NodeConditionFluent<A> {
  public V1NodeConditionFluentImpl() {}

  public V1NodeConditionFluentImpl(io.kubernetes.client.openapi.models.V1NodeCondition instance) {
    this.withLastHeartbeatTime(instance.getLastHeartbeatTime());

    this.withLastTransitionTime(instance.getLastTransitionTime());

    this.withMessage(instance.getMessage());

    this.withReason(instance.getReason());

    this.withStatus(instance.getStatus());

    this.withType(instance.getType());
  }

  private java.time.OffsetDateTime lastHeartbeatTime;
  private java.time.OffsetDateTime lastTransitionTime;
  private java.lang.String message;
  private java.lang.String reason;
  private java.lang.String status;
  private io.kubernetes.client.openapi.models.V1NodeCondition.TypeEnum type;

  public java.time.OffsetDateTime getLastHeartbeatTime() {
    return this.lastHeartbeatTime;
  }

  public A withLastHeartbeatTime(java.time.OffsetDateTime lastHeartbeatTime) {
    this.lastHeartbeatTime = lastHeartbeatTime;
    return (A) this;
  }

  public java.lang.Boolean hasLastHeartbeatTime() {
    return this.lastHeartbeatTime != null;
  }

  public java.time.OffsetDateTime getLastTransitionTime() {
    return this.lastTransitionTime;
  }

  public A withLastTransitionTime(java.time.OffsetDateTime lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
    return (A) this;
  }

  public java.lang.Boolean hasLastTransitionTime() {
    return this.lastTransitionTime != null;
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

  public java.lang.String getStatus() {
    return this.status;
  }

  public A withStatus(java.lang.String status) {
    this.status = status;
    return (A) this;
  }

  public java.lang.Boolean hasStatus() {
    return this.status != null;
  }

  /** Method is deprecated. use withStatus instead. */
  @java.lang.Deprecated
  public A withNewStatus(java.lang.String original) {
    return (A) withStatus(new String(original));
  }

  public io.kubernetes.client.openapi.models.V1NodeCondition.TypeEnum getType() {
    return this.type;
  }

  public A withType(io.kubernetes.client.openapi.models.V1NodeCondition.TypeEnum type) {
    this.type = type;
    return (A) this;
  }

  public java.lang.Boolean hasType() {
    return this.type != null;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1NodeConditionFluentImpl that = (V1NodeConditionFluentImpl) o;
    if (lastHeartbeatTime != null
        ? !lastHeartbeatTime.equals(that.lastHeartbeatTime)
        : that.lastHeartbeatTime != null) return false;
    if (lastTransitionTime != null
        ? !lastTransitionTime.equals(that.lastTransitionTime)
        : that.lastTransitionTime != null) return false;
    if (message != null ? !message.equals(that.message) : that.message != null) return false;
    if (reason != null ? !reason.equals(that.reason) : that.reason != null) return false;
    if (status != null ? !status.equals(that.status) : that.status != null) return false;
    if (type != null ? !type.equals(that.type) : that.type != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        lastHeartbeatTime, lastTransitionTime, message, reason, status, type, super.hashCode());
  }
}

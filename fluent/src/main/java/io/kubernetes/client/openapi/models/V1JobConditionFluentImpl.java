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

import io.kubernetes.client.fluent.BaseFluent;
import java.time.OffsetDateTime;

/** Generated */
@SuppressWarnings(value = "unchecked")
public class V1JobConditionFluentImpl<A extends V1JobConditionFluent<A>> extends BaseFluent<A>
    implements V1JobConditionFluent<A> {
  public V1JobConditionFluentImpl() {}

  public V1JobConditionFluentImpl(io.kubernetes.client.openapi.models.V1JobCondition instance) {
    this.withLastProbeTime(instance.getLastProbeTime());

    this.withLastTransitionTime(instance.getLastTransitionTime());

    this.withMessage(instance.getMessage());

    this.withReason(instance.getReason());

    this.withStatus(instance.getStatus());

    this.withType(instance.getType());
  }

  private OffsetDateTime lastProbeTime;
  private java.time.OffsetDateTime lastTransitionTime;
  private String message;
  private java.lang.String reason;
  private java.lang.String status;
  private java.lang.String type;

  public java.time.OffsetDateTime getLastProbeTime() {
    return this.lastProbeTime;
  }

  public A withLastProbeTime(java.time.OffsetDateTime lastProbeTime) {
    this.lastProbeTime = lastProbeTime;
    return (A) this;
  }

  public Boolean hasLastProbeTime() {
    return this.lastProbeTime != null;
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

  public java.lang.String getType() {
    return this.type;
  }

  public A withType(java.lang.String type) {
    this.type = type;
    return (A) this;
  }

  public java.lang.Boolean hasType() {
    return this.type != null;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1JobConditionFluentImpl that = (V1JobConditionFluentImpl) o;
    if (lastProbeTime != null
        ? !lastProbeTime.equals(that.lastProbeTime)
        : that.lastProbeTime != null) return false;
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
        lastProbeTime, lastTransitionTime, message, reason, status, type, super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (lastProbeTime != null) {
      sb.append("lastProbeTime:");
      sb.append(lastProbeTime + ",");
    }
    if (lastTransitionTime != null) {
      sb.append("lastTransitionTime:");
      sb.append(lastTransitionTime + ",");
    }
    if (message != null) {
      sb.append("message:");
      sb.append(message + ",");
    }
    if (reason != null) {
      sb.append("reason:");
      sb.append(reason + ",");
    }
    if (status != null) {
      sb.append("status:");
      sb.append(status + ",");
    }
    if (type != null) {
      sb.append("type:");
      sb.append(type);
    }
    sb.append("}");
    return sb.toString();
  }
}

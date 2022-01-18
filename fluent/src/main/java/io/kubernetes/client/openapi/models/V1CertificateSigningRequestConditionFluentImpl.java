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
public class V1CertificateSigningRequestConditionFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1CertificateSigningRequestConditionFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1CertificateSigningRequestConditionFluent<A> {
  public V1CertificateSigningRequestConditionFluentImpl() {}

  public V1CertificateSigningRequestConditionFluentImpl(
      io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition instance) {
    this.withLastTransitionTime(instance.getLastTransitionTime());

    this.withLastUpdateTime(instance.getLastUpdateTime());

    this.withMessage(instance.getMessage());

    this.withReason(instance.getReason());

    this.withStatus(instance.getStatus());

    this.withType(instance.getType());
  }

  private java.time.OffsetDateTime lastTransitionTime;
  private java.time.OffsetDateTime lastUpdateTime;
  private java.lang.String message;
  private java.lang.String reason;
  private java.lang.String status;
  private io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition.TypeEnum type;

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

  public java.time.OffsetDateTime getLastUpdateTime() {
    return this.lastUpdateTime;
  }

  public A withLastUpdateTime(java.time.OffsetDateTime lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
    return (A) this;
  }

  public java.lang.Boolean hasLastUpdateTime() {
    return this.lastUpdateTime != null;
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

  public io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition.TypeEnum
      getType() {
    return this.type;
  }

  public A withType(
      io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition.TypeEnum type) {
    this.type = type;
    return (A) this;
  }

  public java.lang.Boolean hasType() {
    return this.type != null;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1CertificateSigningRequestConditionFluentImpl that =
        (V1CertificateSigningRequestConditionFluentImpl) o;
    if (lastTransitionTime != null
        ? !lastTransitionTime.equals(that.lastTransitionTime)
        : that.lastTransitionTime != null) return false;
    if (lastUpdateTime != null
        ? !lastUpdateTime.equals(that.lastUpdateTime)
        : that.lastUpdateTime != null) return false;
    if (message != null ? !message.equals(that.message) : that.message != null) return false;
    if (reason != null ? !reason.equals(that.reason) : that.reason != null) return false;
    if (status != null ? !status.equals(that.status) : that.status != null) return false;
    if (type != null ? !type.equals(that.type) : that.type != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        lastTransitionTime, lastUpdateTime, message, reason, status, type, super.hashCode());
  }
}

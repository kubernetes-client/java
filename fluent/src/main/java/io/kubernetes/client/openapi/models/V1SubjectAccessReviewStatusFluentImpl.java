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
public class V1SubjectAccessReviewStatusFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1SubjectAccessReviewStatusFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1SubjectAccessReviewStatusFluent<A> {
  public V1SubjectAccessReviewStatusFluentImpl() {}

  public V1SubjectAccessReviewStatusFluentImpl(
      io.kubernetes.client.openapi.models.V1SubjectAccessReviewStatus instance) {
    this.withAllowed(instance.getAllowed());

    this.withDenied(instance.getDenied());

    this.withEvaluationError(instance.getEvaluationError());

    this.withReason(instance.getReason());
  }

  private java.lang.Boolean allowed;
  private java.lang.Boolean denied;
  private java.lang.String evaluationError;
  private java.lang.String reason;

  public java.lang.Boolean getAllowed() {
    return this.allowed;
  }

  public A withAllowed(java.lang.Boolean allowed) {
    this.allowed = allowed;
    return (A) this;
  }

  public java.lang.Boolean hasAllowed() {
    return this.allowed != null;
  }

  public java.lang.Boolean getDenied() {
    return this.denied;
  }

  public A withDenied(java.lang.Boolean denied) {
    this.denied = denied;
    return (A) this;
  }

  public java.lang.Boolean hasDenied() {
    return this.denied != null;
  }

  public java.lang.String getEvaluationError() {
    return this.evaluationError;
  }

  public A withEvaluationError(java.lang.String evaluationError) {
    this.evaluationError = evaluationError;
    return (A) this;
  }

  public java.lang.Boolean hasEvaluationError() {
    return this.evaluationError != null;
  }

  /** Method is deprecated. use withEvaluationError instead. */
  @java.lang.Deprecated
  public A withNewEvaluationError(java.lang.String original) {
    return (A) withEvaluationError(new String(original));
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
    V1SubjectAccessReviewStatusFluentImpl that = (V1SubjectAccessReviewStatusFluentImpl) o;
    if (allowed != null ? !allowed.equals(that.allowed) : that.allowed != null) return false;
    if (denied != null ? !denied.equals(that.denied) : that.denied != null) return false;
    if (evaluationError != null
        ? !evaluationError.equals(that.evaluationError)
        : that.evaluationError != null) return false;
    if (reason != null ? !reason.equals(that.reason) : that.reason != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(allowed, denied, evaluationError, reason, super.hashCode());
  }
}

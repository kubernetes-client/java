package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1SubjectAccessReviewStatusFluentImpl<A extends V1SubjectAccessReviewStatusFluent<A>> extends BaseFluent<A> implements V1SubjectAccessReviewStatusFluent<A>{
  public V1SubjectAccessReviewStatusFluentImpl() {
  }
  public V1SubjectAccessReviewStatusFluentImpl(V1SubjectAccessReviewStatus instance) {
    this.withAllowed(instance.getAllowed());

    this.withDenied(instance.getDenied());

    this.withEvaluationError(instance.getEvaluationError());

    this.withReason(instance.getReason());

  }
  private Boolean allowed;
  private Boolean denied;
  private String evaluationError;
  private String reason;
  public Boolean getAllowed() {
    return this.allowed;
  }
  public A withAllowed(Boolean allowed) {
    this.allowed=allowed; return (A) this;
  }
  public Boolean hasAllowed() {
    return this.allowed != null;
  }
  public Boolean getDenied() {
    return this.denied;
  }
  public A withDenied(Boolean denied) {
    this.denied=denied; return (A) this;
  }
  public Boolean hasDenied() {
    return this.denied != null;
  }
  public String getEvaluationError() {
    return this.evaluationError;
  }
  public A withEvaluationError(String evaluationError) {
    this.evaluationError=evaluationError; return (A) this;
  }
  public Boolean hasEvaluationError() {
    return this.evaluationError != null;
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
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1SubjectAccessReviewStatusFluentImpl that = (V1SubjectAccessReviewStatusFluentImpl) o;
    if (allowed != null ? !allowed.equals(that.allowed) :that.allowed != null) return false;
    if (denied != null ? !denied.equals(that.denied) :that.denied != null) return false;
    if (evaluationError != null ? !evaluationError.equals(that.evaluationError) :that.evaluationError != null) return false;
    if (reason != null ? !reason.equals(that.reason) :that.reason != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(allowed,  denied,  evaluationError,  reason,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (allowed != null) { sb.append("allowed:"); sb.append(allowed + ","); }
    if (denied != null) { sb.append("denied:"); sb.append(denied + ","); }
    if (evaluationError != null) { sb.append("evaluationError:"); sb.append(evaluationError + ","); }
    if (reason != null) { sb.append("reason:"); sb.append(reason); }
    sb.append("}");
    return sb.toString();
  }
  public A withAllowed() {
    return withAllowed(true);
  }
  public A withDenied() {
    return withDenied(true);
  }
  
}
package io.kubernetes.client.openapi.models;

import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Objects;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1SubjectAccessReviewStatusFluent<A extends io.kubernetes.client.openapi.models.V1SubjectAccessReviewStatusFluent<A>> extends BaseFluent<A>{
  public V1SubjectAccessReviewStatusFluent() {
  }
  
  public V1SubjectAccessReviewStatusFluent(V1SubjectAccessReviewStatus instance) {
    this.copyInstance(instance);
  }
  private Boolean allowed;
  private Boolean denied;
  private String evaluationError;
  private String reason;
  
  protected void copyInstance(V1SubjectAccessReviewStatus instance) {
    instance = instance != null ? instance : new V1SubjectAccessReviewStatus();
    if (instance != null) {
        this.withAllowed(instance.getAllowed());
        this.withDenied(instance.getDenied());
        this.withEvaluationError(instance.getEvaluationError());
        this.withReason(instance.getReason());
    }
  }
  
  public Boolean getAllowed() {
    return this.allowed;
  }
  
  public A withAllowed(Boolean allowed) {
    this.allowed = allowed;
    return (A) this;
  }
  
  public boolean hasAllowed() {
    return this.allowed != null;
  }
  
  public Boolean getDenied() {
    return this.denied;
  }
  
  public A withDenied(Boolean denied) {
    this.denied = denied;
    return (A) this;
  }
  
  public boolean hasDenied() {
    return this.denied != null;
  }
  
  public String getEvaluationError() {
    return this.evaluationError;
  }
  
  public A withEvaluationError(String evaluationError) {
    this.evaluationError = evaluationError;
    return (A) this;
  }
  
  public boolean hasEvaluationError() {
    return this.evaluationError != null;
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
    V1SubjectAccessReviewStatusFluent that = (V1SubjectAccessReviewStatusFluent) o;
    if (!(Objects.equals(allowed, that.allowed))) {
      return false;
    }
    if (!(Objects.equals(denied, that.denied))) {
      return false;
    }
    if (!(Objects.equals(evaluationError, that.evaluationError))) {
      return false;
    }
    if (!(Objects.equals(reason, that.reason))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(allowed, denied, evaluationError, reason);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(allowed == null)) {
        sb.append("allowed:");
        sb.append(allowed);
        sb.append(",");
    }
    if (!(denied == null)) {
        sb.append("denied:");
        sb.append(denied);
        sb.append(",");
    }
    if (!(evaluationError == null)) {
        sb.append("evaluationError:");
        sb.append(evaluationError);
        sb.append(",");
    }
    if (!(reason == null)) {
        sb.append("reason:");
        sb.append(reason);
    }
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
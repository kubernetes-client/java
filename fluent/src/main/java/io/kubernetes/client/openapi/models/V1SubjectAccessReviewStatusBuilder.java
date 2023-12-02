package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1SubjectAccessReviewStatusBuilder extends V1SubjectAccessReviewStatusFluent<V1SubjectAccessReviewStatusBuilder> implements VisitableBuilder<V1SubjectAccessReviewStatus,V1SubjectAccessReviewStatusBuilder>{
  public V1SubjectAccessReviewStatusBuilder() {
    this(new V1SubjectAccessReviewStatus());
  }
  
  public V1SubjectAccessReviewStatusBuilder(V1SubjectAccessReviewStatusFluent<?> fluent) {
    this(fluent, new V1SubjectAccessReviewStatus());
  }
  
  public V1SubjectAccessReviewStatusBuilder(V1SubjectAccessReviewStatusFluent<?> fluent,V1SubjectAccessReviewStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1SubjectAccessReviewStatusBuilder(V1SubjectAccessReviewStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1SubjectAccessReviewStatusFluent<?> fluent;
  
  public V1SubjectAccessReviewStatus build() {
    V1SubjectAccessReviewStatus buildable = new V1SubjectAccessReviewStatus();
    buildable.setAllowed(fluent.getAllowed());
    buildable.setDenied(fluent.getDenied());
    buildable.setEvaluationError(fluent.getEvaluationError());
    buildable.setReason(fluent.getReason());
    return buildable;
  }
  

}
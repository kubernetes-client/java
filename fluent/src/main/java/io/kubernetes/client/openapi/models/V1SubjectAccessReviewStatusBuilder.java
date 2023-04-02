package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1SubjectAccessReviewStatusBuilder extends V1SubjectAccessReviewStatusFluentImpl<V1SubjectAccessReviewStatusBuilder> implements VisitableBuilder<V1SubjectAccessReviewStatus,V1SubjectAccessReviewStatusBuilder>{
  public V1SubjectAccessReviewStatusBuilder() {
    this(false);
  }
  public V1SubjectAccessReviewStatusBuilder(Boolean validationEnabled) {
    this(new V1SubjectAccessReviewStatus(), validationEnabled);
  }
  public V1SubjectAccessReviewStatusBuilder(V1SubjectAccessReviewStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V1SubjectAccessReviewStatusBuilder(V1SubjectAccessReviewStatusFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1SubjectAccessReviewStatus(), validationEnabled);
  }
  public V1SubjectAccessReviewStatusBuilder(V1SubjectAccessReviewStatusFluent<?> fluent,V1SubjectAccessReviewStatus instance) {
    this(fluent, instance, false);
  }
  public V1SubjectAccessReviewStatusBuilder(V1SubjectAccessReviewStatusFluent<?> fluent,V1SubjectAccessReviewStatus instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withAllowed(instance.getAllowed());

    fluent.withDenied(instance.getDenied());

    fluent.withEvaluationError(instance.getEvaluationError());

    fluent.withReason(instance.getReason());

    this.validationEnabled = validationEnabled; 
  }
  public V1SubjectAccessReviewStatusBuilder(V1SubjectAccessReviewStatus instance) {
    this(instance,false);
  }
  public V1SubjectAccessReviewStatusBuilder(V1SubjectAccessReviewStatus instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withAllowed(instance.getAllowed());

    this.withDenied(instance.getDenied());

    this.withEvaluationError(instance.getEvaluationError());

    this.withReason(instance.getReason());

    this.validationEnabled = validationEnabled; 
  }
  V1SubjectAccessReviewStatusFluent<?> fluent;
  Boolean validationEnabled;
  public V1SubjectAccessReviewStatus build() {
    V1SubjectAccessReviewStatus buildable = new V1SubjectAccessReviewStatus();
    buildable.setAllowed(fluent.getAllowed());
    buildable.setDenied(fluent.getDenied());
    buildable.setEvaluationError(fluent.getEvaluationError());
    buildable.setReason(fluent.getReason());
    return buildable;
  }
  
}
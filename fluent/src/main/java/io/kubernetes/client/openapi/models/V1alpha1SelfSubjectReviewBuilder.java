package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha1SelfSubjectReviewBuilder extends V1alpha1SelfSubjectReviewFluent<V1alpha1SelfSubjectReviewBuilder> implements VisitableBuilder<V1alpha1SelfSubjectReview,V1alpha1SelfSubjectReviewBuilder>{
  public V1alpha1SelfSubjectReviewBuilder() {
    this(new V1alpha1SelfSubjectReview());
  }
  
  public V1alpha1SelfSubjectReviewBuilder(V1alpha1SelfSubjectReviewFluent<?> fluent) {
    this(fluent, new V1alpha1SelfSubjectReview());
  }
  
  public V1alpha1SelfSubjectReviewBuilder(V1alpha1SelfSubjectReviewFluent<?> fluent,V1alpha1SelfSubjectReview instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha1SelfSubjectReviewBuilder(V1alpha1SelfSubjectReview instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha1SelfSubjectReviewFluent<?> fluent;
  
  public V1alpha1SelfSubjectReview build() {
    V1alpha1SelfSubjectReview buildable = new V1alpha1SelfSubjectReview();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  

}
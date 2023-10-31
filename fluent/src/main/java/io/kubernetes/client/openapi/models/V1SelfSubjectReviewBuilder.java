package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1SelfSubjectReviewBuilder extends V1SelfSubjectReviewFluent<V1SelfSubjectReviewBuilder> implements VisitableBuilder<V1SelfSubjectReview,V1SelfSubjectReviewBuilder>{
  public V1SelfSubjectReviewBuilder() {
    this(new V1SelfSubjectReview());
  }
  
  public V1SelfSubjectReviewBuilder(V1SelfSubjectReviewFluent<?> fluent) {
    this(fluent, new V1SelfSubjectReview());
  }
  
  public V1SelfSubjectReviewBuilder(V1SelfSubjectReviewFluent<?> fluent,V1SelfSubjectReview instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1SelfSubjectReviewBuilder(V1SelfSubjectReview instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1SelfSubjectReviewFluent<?> fluent;
  
  public V1SelfSubjectReview build() {
    V1SelfSubjectReview buildable = new V1SelfSubjectReview();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  

}
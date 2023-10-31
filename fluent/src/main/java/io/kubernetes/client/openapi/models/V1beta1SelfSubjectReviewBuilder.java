package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta1SelfSubjectReviewBuilder extends V1beta1SelfSubjectReviewFluent<V1beta1SelfSubjectReviewBuilder> implements VisitableBuilder<V1beta1SelfSubjectReview,V1beta1SelfSubjectReviewBuilder>{
  public V1beta1SelfSubjectReviewBuilder() {
    this(new V1beta1SelfSubjectReview());
  }
  
  public V1beta1SelfSubjectReviewBuilder(V1beta1SelfSubjectReviewFluent<?> fluent) {
    this(fluent, new V1beta1SelfSubjectReview());
  }
  
  public V1beta1SelfSubjectReviewBuilder(V1beta1SelfSubjectReviewFluent<?> fluent,V1beta1SelfSubjectReview instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1SelfSubjectReviewBuilder(V1beta1SelfSubjectReview instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1SelfSubjectReviewFluent<?> fluent;
  
  public V1beta1SelfSubjectReview build() {
    V1beta1SelfSubjectReview buildable = new V1beta1SelfSubjectReview();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  

}
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1LocalSubjectAccessReviewBuilder extends V1LocalSubjectAccessReviewFluent<V1LocalSubjectAccessReviewBuilder> implements VisitableBuilder<V1LocalSubjectAccessReview,V1LocalSubjectAccessReviewBuilder>{
  public V1LocalSubjectAccessReviewBuilder() {
    this(new V1LocalSubjectAccessReview());
  }
  
  public V1LocalSubjectAccessReviewBuilder(V1LocalSubjectAccessReviewFluent<?> fluent) {
    this(fluent, new V1LocalSubjectAccessReview());
  }
  
  public V1LocalSubjectAccessReviewBuilder(V1LocalSubjectAccessReviewFluent<?> fluent,V1LocalSubjectAccessReview instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1LocalSubjectAccessReviewBuilder(V1LocalSubjectAccessReview instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1LocalSubjectAccessReviewFluent<?> fluent;
  
  public V1LocalSubjectAccessReview build() {
    V1LocalSubjectAccessReview buildable = new V1LocalSubjectAccessReview();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  

}
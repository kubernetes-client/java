package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1SubjectAccessReviewBuilder extends V1SubjectAccessReviewFluent<V1SubjectAccessReviewBuilder> implements VisitableBuilder<V1SubjectAccessReview,V1SubjectAccessReviewBuilder>{
  public V1SubjectAccessReviewBuilder() {
    this(new V1SubjectAccessReview());
  }
  
  public V1SubjectAccessReviewBuilder(V1SubjectAccessReviewFluent<?> fluent) {
    this(fluent, new V1SubjectAccessReview());
  }
  
  public V1SubjectAccessReviewBuilder(V1SubjectAccessReviewFluent<?> fluent,V1SubjectAccessReview instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1SubjectAccessReviewBuilder(V1SubjectAccessReview instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1SubjectAccessReviewFluent<?> fluent;
  
  public V1SubjectAccessReview build() {
    V1SubjectAccessReview buildable = new V1SubjectAccessReview();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  

}
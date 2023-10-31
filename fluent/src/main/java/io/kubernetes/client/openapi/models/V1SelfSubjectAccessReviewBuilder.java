package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1SelfSubjectAccessReviewBuilder extends V1SelfSubjectAccessReviewFluent<V1SelfSubjectAccessReviewBuilder> implements VisitableBuilder<V1SelfSubjectAccessReview,V1SelfSubjectAccessReviewBuilder>{
  public V1SelfSubjectAccessReviewBuilder() {
    this(new V1SelfSubjectAccessReview());
  }
  
  public V1SelfSubjectAccessReviewBuilder(V1SelfSubjectAccessReviewFluent<?> fluent) {
    this(fluent, new V1SelfSubjectAccessReview());
  }
  
  public V1SelfSubjectAccessReviewBuilder(V1SelfSubjectAccessReviewFluent<?> fluent,V1SelfSubjectAccessReview instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1SelfSubjectAccessReviewBuilder(V1SelfSubjectAccessReview instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1SelfSubjectAccessReviewFluent<?> fluent;
  
  public V1SelfSubjectAccessReview build() {
    V1SelfSubjectAccessReview buildable = new V1SelfSubjectAccessReview();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  

}
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1TokenReviewBuilder extends V1TokenReviewFluent<V1TokenReviewBuilder> implements VisitableBuilder<V1TokenReview,V1TokenReviewBuilder>{
  public V1TokenReviewBuilder() {
    this(new V1TokenReview());
  }
  
  public V1TokenReviewBuilder(V1TokenReviewFluent<?> fluent) {
    this(fluent, new V1TokenReview());
  }
  
  public V1TokenReviewBuilder(V1TokenReviewFluent<?> fluent,V1TokenReview instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1TokenReviewBuilder(V1TokenReview instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1TokenReviewFluent<?> fluent;
  
  public V1TokenReview build() {
    V1TokenReview buildable = new V1TokenReview();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  

}
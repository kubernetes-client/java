package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1TokenReviewStatusBuilder extends V1TokenReviewStatusFluent<V1TokenReviewStatusBuilder> implements VisitableBuilder<V1TokenReviewStatus,V1TokenReviewStatusBuilder>{
  public V1TokenReviewStatusBuilder() {
    this(new V1TokenReviewStatus());
  }
  
  public V1TokenReviewStatusBuilder(V1TokenReviewStatusFluent<?> fluent) {
    this(fluent, new V1TokenReviewStatus());
  }
  
  public V1TokenReviewStatusBuilder(V1TokenReviewStatusFluent<?> fluent,V1TokenReviewStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1TokenReviewStatusBuilder(V1TokenReviewStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1TokenReviewStatusFluent<?> fluent;
  
  public V1TokenReviewStatus build() {
    V1TokenReviewStatus buildable = new V1TokenReviewStatus();
    buildable.setAudiences(fluent.getAudiences());
    buildable.setAuthenticated(fluent.getAuthenticated());
    buildable.setError(fluent.getError());
    buildable.setUser(fluent.buildUser());
    return buildable;
  }
  

}
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1TokenReviewSpecBuilder extends V1TokenReviewSpecFluent<V1TokenReviewSpecBuilder> implements VisitableBuilder<V1TokenReviewSpec,V1TokenReviewSpecBuilder>{
  public V1TokenReviewSpecBuilder() {
    this(new V1TokenReviewSpec());
  }
  
  public V1TokenReviewSpecBuilder(V1TokenReviewSpecFluent<?> fluent) {
    this(fluent, new V1TokenReviewSpec());
  }
  
  public V1TokenReviewSpecBuilder(V1TokenReviewSpecFluent<?> fluent,V1TokenReviewSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1TokenReviewSpecBuilder(V1TokenReviewSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1TokenReviewSpecFluent<?> fluent;
  
  public V1TokenReviewSpec build() {
    V1TokenReviewSpec buildable = new V1TokenReviewSpec();
    buildable.setAudiences(fluent.getAudiences());
    buildable.setToken(fluent.getToken());
    return buildable;
  }
  

}
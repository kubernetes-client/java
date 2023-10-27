package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1SelfSubjectAccessReviewSpecBuilder extends V1SelfSubjectAccessReviewSpecFluent<V1SelfSubjectAccessReviewSpecBuilder> implements VisitableBuilder<V1SelfSubjectAccessReviewSpec,V1SelfSubjectAccessReviewSpecBuilder>{
  public V1SelfSubjectAccessReviewSpecBuilder() {
    this(new V1SelfSubjectAccessReviewSpec());
  }
  
  public V1SelfSubjectAccessReviewSpecBuilder(V1SelfSubjectAccessReviewSpecFluent<?> fluent) {
    this(fluent, new V1SelfSubjectAccessReviewSpec());
  }
  
  public V1SelfSubjectAccessReviewSpecBuilder(V1SelfSubjectAccessReviewSpecFluent<?> fluent,V1SelfSubjectAccessReviewSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1SelfSubjectAccessReviewSpecBuilder(V1SelfSubjectAccessReviewSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1SelfSubjectAccessReviewSpecFluent<?> fluent;
  
  public V1SelfSubjectAccessReviewSpec build() {
    V1SelfSubjectAccessReviewSpec buildable = new V1SelfSubjectAccessReviewSpec();
    buildable.setNonResourceAttributes(fluent.buildNonResourceAttributes());
    buildable.setResourceAttributes(fluent.buildResourceAttributes());
    return buildable;
  }
  

}
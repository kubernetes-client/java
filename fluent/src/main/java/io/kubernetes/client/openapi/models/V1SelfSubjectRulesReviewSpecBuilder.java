package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1SelfSubjectRulesReviewSpecBuilder extends V1SelfSubjectRulesReviewSpecFluent<V1SelfSubjectRulesReviewSpecBuilder> implements VisitableBuilder<V1SelfSubjectRulesReviewSpec,V1SelfSubjectRulesReviewSpecBuilder>{
  public V1SelfSubjectRulesReviewSpecBuilder() {
    this(new V1SelfSubjectRulesReviewSpec());
  }
  
  public V1SelfSubjectRulesReviewSpecBuilder(V1SelfSubjectRulesReviewSpecFluent<?> fluent) {
    this(fluent, new V1SelfSubjectRulesReviewSpec());
  }
  
  public V1SelfSubjectRulesReviewSpecBuilder(V1SelfSubjectRulesReviewSpecFluent<?> fluent,V1SelfSubjectRulesReviewSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1SelfSubjectRulesReviewSpecBuilder(V1SelfSubjectRulesReviewSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1SelfSubjectRulesReviewSpecFluent<?> fluent;
  
  public V1SelfSubjectRulesReviewSpec build() {
    V1SelfSubjectRulesReviewSpec buildable = new V1SelfSubjectRulesReviewSpec();
    buildable.setNamespace(fluent.getNamespace());
    return buildable;
  }
  

}
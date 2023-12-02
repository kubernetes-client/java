package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1SelfSubjectRulesReviewBuilder extends V1SelfSubjectRulesReviewFluent<V1SelfSubjectRulesReviewBuilder> implements VisitableBuilder<V1SelfSubjectRulesReview,V1SelfSubjectRulesReviewBuilder>{
  public V1SelfSubjectRulesReviewBuilder() {
    this(new V1SelfSubjectRulesReview());
  }
  
  public V1SelfSubjectRulesReviewBuilder(V1SelfSubjectRulesReviewFluent<?> fluent) {
    this(fluent, new V1SelfSubjectRulesReview());
  }
  
  public V1SelfSubjectRulesReviewBuilder(V1SelfSubjectRulesReviewFluent<?> fluent,V1SelfSubjectRulesReview instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1SelfSubjectRulesReviewBuilder(V1SelfSubjectRulesReview instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1SelfSubjectRulesReviewFluent<?> fluent;
  
  public V1SelfSubjectRulesReview build() {
    V1SelfSubjectRulesReview buildable = new V1SelfSubjectRulesReview();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  

}
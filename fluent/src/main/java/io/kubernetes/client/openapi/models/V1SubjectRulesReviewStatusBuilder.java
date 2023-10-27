package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1SubjectRulesReviewStatusBuilder extends V1SubjectRulesReviewStatusFluent<V1SubjectRulesReviewStatusBuilder> implements VisitableBuilder<V1SubjectRulesReviewStatus,V1SubjectRulesReviewStatusBuilder>{
  public V1SubjectRulesReviewStatusBuilder() {
    this(new V1SubjectRulesReviewStatus());
  }
  
  public V1SubjectRulesReviewStatusBuilder(V1SubjectRulesReviewStatusFluent<?> fluent) {
    this(fluent, new V1SubjectRulesReviewStatus());
  }
  
  public V1SubjectRulesReviewStatusBuilder(V1SubjectRulesReviewStatusFluent<?> fluent,V1SubjectRulesReviewStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1SubjectRulesReviewStatusBuilder(V1SubjectRulesReviewStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1SubjectRulesReviewStatusFluent<?> fluent;
  
  public V1SubjectRulesReviewStatus build() {
    V1SubjectRulesReviewStatus buildable = new V1SubjectRulesReviewStatus();
    buildable.setEvaluationError(fluent.getEvaluationError());
    buildable.setIncomplete(fluent.getIncomplete());
    buildable.setNonResourceRules(fluent.buildNonResourceRules());
    buildable.setResourceRules(fluent.buildResourceRules());
    return buildable;
  }
  

}
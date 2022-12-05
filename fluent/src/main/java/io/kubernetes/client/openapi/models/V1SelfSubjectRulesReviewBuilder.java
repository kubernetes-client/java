package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1SelfSubjectRulesReviewBuilder extends V1SelfSubjectRulesReviewFluentImpl<V1SelfSubjectRulesReviewBuilder> implements VisitableBuilder<V1SelfSubjectRulesReview,V1SelfSubjectRulesReviewBuilder>{
  public V1SelfSubjectRulesReviewBuilder() {
    this(false);
  }
  public V1SelfSubjectRulesReviewBuilder(Boolean validationEnabled) {
    this(new V1SelfSubjectRulesReview(), validationEnabled);
  }
  public V1SelfSubjectRulesReviewBuilder(V1SelfSubjectRulesReviewFluent<?> fluent) {
    this(fluent, false);
  }
  public V1SelfSubjectRulesReviewBuilder(V1SelfSubjectRulesReviewFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1SelfSubjectRulesReview(), validationEnabled);
  }
  public V1SelfSubjectRulesReviewBuilder(V1SelfSubjectRulesReviewFluent<?> fluent,V1SelfSubjectRulesReview instance) {
    this(fluent, instance, false);
  }
  public V1SelfSubjectRulesReviewBuilder(V1SelfSubjectRulesReviewFluent<?> fluent,V1SelfSubjectRulesReview instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withSpec(instance.getSpec());

    fluent.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  public V1SelfSubjectRulesReviewBuilder(V1SelfSubjectRulesReview instance) {
    this(instance,false);
  }
  public V1SelfSubjectRulesReviewBuilder(V1SelfSubjectRulesReview instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  V1SelfSubjectRulesReviewFluent<?> fluent;
  Boolean validationEnabled;
  public V1SelfSubjectRulesReview build() {
    V1SelfSubjectRulesReview buildable = new V1SelfSubjectRulesReview();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    buildable.setStatus(fluent.getStatus());
    return buildable;
  }
  
}
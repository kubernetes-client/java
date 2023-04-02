package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1SelfSubjectRulesReviewSpecBuilder extends V1SelfSubjectRulesReviewSpecFluentImpl<V1SelfSubjectRulesReviewSpecBuilder> implements VisitableBuilder<V1SelfSubjectRulesReviewSpec,V1SelfSubjectRulesReviewSpecBuilder>{
  public V1SelfSubjectRulesReviewSpecBuilder() {
    this(false);
  }
  public V1SelfSubjectRulesReviewSpecBuilder(Boolean validationEnabled) {
    this(new V1SelfSubjectRulesReviewSpec(), validationEnabled);
  }
  public V1SelfSubjectRulesReviewSpecBuilder(V1SelfSubjectRulesReviewSpecFluent<?> fluent) {
    this(fluent, false);
  }
  public V1SelfSubjectRulesReviewSpecBuilder(V1SelfSubjectRulesReviewSpecFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1SelfSubjectRulesReviewSpec(), validationEnabled);
  }
  public V1SelfSubjectRulesReviewSpecBuilder(V1SelfSubjectRulesReviewSpecFluent<?> fluent,V1SelfSubjectRulesReviewSpec instance) {
    this(fluent, instance, false);
  }
  public V1SelfSubjectRulesReviewSpecBuilder(V1SelfSubjectRulesReviewSpecFluent<?> fluent,V1SelfSubjectRulesReviewSpec instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withNamespace(instance.getNamespace());

    this.validationEnabled = validationEnabled; 
  }
  public V1SelfSubjectRulesReviewSpecBuilder(V1SelfSubjectRulesReviewSpec instance) {
    this(instance,false);
  }
  public V1SelfSubjectRulesReviewSpecBuilder(V1SelfSubjectRulesReviewSpec instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withNamespace(instance.getNamespace());

    this.validationEnabled = validationEnabled; 
  }
  V1SelfSubjectRulesReviewSpecFluent<?> fluent;
  Boolean validationEnabled;
  public V1SelfSubjectRulesReviewSpec build() {
    V1SelfSubjectRulesReviewSpec buildable = new V1SelfSubjectRulesReviewSpec();
    buildable.setNamespace(fluent.getNamespace());
    return buildable;
  }
  
}
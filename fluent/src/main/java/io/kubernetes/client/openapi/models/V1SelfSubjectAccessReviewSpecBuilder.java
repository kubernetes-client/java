package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1SelfSubjectAccessReviewSpecBuilder extends V1SelfSubjectAccessReviewSpecFluentImpl<V1SelfSubjectAccessReviewSpecBuilder> implements VisitableBuilder<V1SelfSubjectAccessReviewSpec,V1SelfSubjectAccessReviewSpecBuilder>{
  public V1SelfSubjectAccessReviewSpecBuilder() {
    this(false);
  }
  public V1SelfSubjectAccessReviewSpecBuilder(Boolean validationEnabled) {
    this(new V1SelfSubjectAccessReviewSpec(), validationEnabled);
  }
  public V1SelfSubjectAccessReviewSpecBuilder(V1SelfSubjectAccessReviewSpecFluent<?> fluent) {
    this(fluent, false);
  }
  public V1SelfSubjectAccessReviewSpecBuilder(V1SelfSubjectAccessReviewSpecFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1SelfSubjectAccessReviewSpec(), validationEnabled);
  }
  public V1SelfSubjectAccessReviewSpecBuilder(V1SelfSubjectAccessReviewSpecFluent<?> fluent,V1SelfSubjectAccessReviewSpec instance) {
    this(fluent, instance, false);
  }
  public V1SelfSubjectAccessReviewSpecBuilder(V1SelfSubjectAccessReviewSpecFluent<?> fluent,V1SelfSubjectAccessReviewSpec instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withNonResourceAttributes(instance.getNonResourceAttributes());

    fluent.withResourceAttributes(instance.getResourceAttributes());

    this.validationEnabled = validationEnabled; 
  }
  public V1SelfSubjectAccessReviewSpecBuilder(V1SelfSubjectAccessReviewSpec instance) {
    this(instance,false);
  }
  public V1SelfSubjectAccessReviewSpecBuilder(V1SelfSubjectAccessReviewSpec instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withNonResourceAttributes(instance.getNonResourceAttributes());

    this.withResourceAttributes(instance.getResourceAttributes());

    this.validationEnabled = validationEnabled; 
  }
  V1SelfSubjectAccessReviewSpecFluent<?> fluent;
  Boolean validationEnabled;
  public V1SelfSubjectAccessReviewSpec build() {
    V1SelfSubjectAccessReviewSpec buildable = new V1SelfSubjectAccessReviewSpec();
    buildable.setNonResourceAttributes(fluent.getNonResourceAttributes());
    buildable.setResourceAttributes(fluent.getResourceAttributes());
    return buildable;
  }
  
}
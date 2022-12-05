package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1TokenReviewSpecBuilder extends V1TokenReviewSpecFluentImpl<V1TokenReviewSpecBuilder> implements VisitableBuilder<V1TokenReviewSpec,V1TokenReviewSpecBuilder>{
  public V1TokenReviewSpecBuilder() {
    this(false);
  }
  public V1TokenReviewSpecBuilder(Boolean validationEnabled) {
    this(new V1TokenReviewSpec(), validationEnabled);
  }
  public V1TokenReviewSpecBuilder(V1TokenReviewSpecFluent<?> fluent) {
    this(fluent, false);
  }
  public V1TokenReviewSpecBuilder(V1TokenReviewSpecFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1TokenReviewSpec(), validationEnabled);
  }
  public V1TokenReviewSpecBuilder(V1TokenReviewSpecFluent<?> fluent,V1TokenReviewSpec instance) {
    this(fluent, instance, false);
  }
  public V1TokenReviewSpecBuilder(V1TokenReviewSpecFluent<?> fluent,V1TokenReviewSpec instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withAudiences(instance.getAudiences());

    fluent.withToken(instance.getToken());

    this.validationEnabled = validationEnabled; 
  }
  public V1TokenReviewSpecBuilder(V1TokenReviewSpec instance) {
    this(instance,false);
  }
  public V1TokenReviewSpecBuilder(V1TokenReviewSpec instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withAudiences(instance.getAudiences());

    this.withToken(instance.getToken());

    this.validationEnabled = validationEnabled; 
  }
  V1TokenReviewSpecFluent<?> fluent;
  Boolean validationEnabled;
  public V1TokenReviewSpec build() {
    V1TokenReviewSpec buildable = new V1TokenReviewSpec();
    buildable.setAudiences(fluent.getAudiences());
    buildable.setToken(fluent.getToken());
    return buildable;
  }
  
}
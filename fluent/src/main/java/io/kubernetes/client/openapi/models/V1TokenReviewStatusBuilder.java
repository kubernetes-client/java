package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1TokenReviewStatusBuilder extends V1TokenReviewStatusFluentImpl<V1TokenReviewStatusBuilder> implements VisitableBuilder<V1TokenReviewStatus,V1TokenReviewStatusBuilder>{
  public V1TokenReviewStatusBuilder() {
    this(false);
  }
  public V1TokenReviewStatusBuilder(Boolean validationEnabled) {
    this(new V1TokenReviewStatus(), validationEnabled);
  }
  public V1TokenReviewStatusBuilder(V1TokenReviewStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V1TokenReviewStatusBuilder(V1TokenReviewStatusFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1TokenReviewStatus(), validationEnabled);
  }
  public V1TokenReviewStatusBuilder(V1TokenReviewStatusFluent<?> fluent,V1TokenReviewStatus instance) {
    this(fluent, instance, false);
  }
  public V1TokenReviewStatusBuilder(V1TokenReviewStatusFluent<?> fluent,V1TokenReviewStatus instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withAudiences(instance.getAudiences());

    fluent.withAuthenticated(instance.getAuthenticated());

    fluent.withError(instance.getError());

    fluent.withUser(instance.getUser());

    this.validationEnabled = validationEnabled; 
  }
  public V1TokenReviewStatusBuilder(V1TokenReviewStatus instance) {
    this(instance,false);
  }
  public V1TokenReviewStatusBuilder(V1TokenReviewStatus instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withAudiences(instance.getAudiences());

    this.withAuthenticated(instance.getAuthenticated());

    this.withError(instance.getError());

    this.withUser(instance.getUser());

    this.validationEnabled = validationEnabled; 
  }
  V1TokenReviewStatusFluent<?> fluent;
  Boolean validationEnabled;
  public V1TokenReviewStatus build() {
    V1TokenReviewStatus buildable = new V1TokenReviewStatus();
    buildable.setAudiences(fluent.getAudiences());
    buildable.setAuthenticated(fluent.getAuthenticated());
    buildable.setError(fluent.getError());
    buildable.setUser(fluent.getUser());
    return buildable;
  }
  
}
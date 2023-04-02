package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1SelfSubjectAccessReviewBuilder extends V1SelfSubjectAccessReviewFluentImpl<V1SelfSubjectAccessReviewBuilder> implements VisitableBuilder<V1SelfSubjectAccessReview,V1SelfSubjectAccessReviewBuilder>{
  public V1SelfSubjectAccessReviewBuilder() {
    this(false);
  }
  public V1SelfSubjectAccessReviewBuilder(Boolean validationEnabled) {
    this(new V1SelfSubjectAccessReview(), validationEnabled);
  }
  public V1SelfSubjectAccessReviewBuilder(V1SelfSubjectAccessReviewFluent<?> fluent) {
    this(fluent, false);
  }
  public V1SelfSubjectAccessReviewBuilder(V1SelfSubjectAccessReviewFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1SelfSubjectAccessReview(), validationEnabled);
  }
  public V1SelfSubjectAccessReviewBuilder(V1SelfSubjectAccessReviewFluent<?> fluent,V1SelfSubjectAccessReview instance) {
    this(fluent, instance, false);
  }
  public V1SelfSubjectAccessReviewBuilder(V1SelfSubjectAccessReviewFluent<?> fluent,V1SelfSubjectAccessReview instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withSpec(instance.getSpec());

    fluent.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  public V1SelfSubjectAccessReviewBuilder(V1SelfSubjectAccessReview instance) {
    this(instance,false);
  }
  public V1SelfSubjectAccessReviewBuilder(V1SelfSubjectAccessReview instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  V1SelfSubjectAccessReviewFluent<?> fluent;
  Boolean validationEnabled;
  public V1SelfSubjectAccessReview build() {
    V1SelfSubjectAccessReview buildable = new V1SelfSubjectAccessReview();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    buildable.setStatus(fluent.getStatus());
    return buildable;
  }
  
}
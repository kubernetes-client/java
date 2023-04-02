package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1LocalSubjectAccessReviewBuilder extends V1LocalSubjectAccessReviewFluentImpl<V1LocalSubjectAccessReviewBuilder> implements VisitableBuilder<V1LocalSubjectAccessReview,V1LocalSubjectAccessReviewBuilder>{
  public V1LocalSubjectAccessReviewBuilder() {
    this(false);
  }
  public V1LocalSubjectAccessReviewBuilder(Boolean validationEnabled) {
    this(new V1LocalSubjectAccessReview(), validationEnabled);
  }
  public V1LocalSubjectAccessReviewBuilder(V1LocalSubjectAccessReviewFluent<?> fluent) {
    this(fluent, false);
  }
  public V1LocalSubjectAccessReviewBuilder(V1LocalSubjectAccessReviewFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1LocalSubjectAccessReview(), validationEnabled);
  }
  public V1LocalSubjectAccessReviewBuilder(V1LocalSubjectAccessReviewFluent<?> fluent,V1LocalSubjectAccessReview instance) {
    this(fluent, instance, false);
  }
  public V1LocalSubjectAccessReviewBuilder(V1LocalSubjectAccessReviewFluent<?> fluent,V1LocalSubjectAccessReview instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withSpec(instance.getSpec());

    fluent.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  public V1LocalSubjectAccessReviewBuilder(V1LocalSubjectAccessReview instance) {
    this(instance,false);
  }
  public V1LocalSubjectAccessReviewBuilder(V1LocalSubjectAccessReview instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  V1LocalSubjectAccessReviewFluent<?> fluent;
  Boolean validationEnabled;
  public V1LocalSubjectAccessReview build() {
    V1LocalSubjectAccessReview buildable = new V1LocalSubjectAccessReview();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    buildable.setStatus(fluent.getStatus());
    return buildable;
  }
  
}
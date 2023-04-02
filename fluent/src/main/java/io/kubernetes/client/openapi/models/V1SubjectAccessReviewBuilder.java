package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1SubjectAccessReviewBuilder extends V1SubjectAccessReviewFluentImpl<V1SubjectAccessReviewBuilder> implements VisitableBuilder<V1SubjectAccessReview,V1SubjectAccessReviewBuilder>{
  public V1SubjectAccessReviewBuilder() {
    this(false);
  }
  public V1SubjectAccessReviewBuilder(Boolean validationEnabled) {
    this(new V1SubjectAccessReview(), validationEnabled);
  }
  public V1SubjectAccessReviewBuilder(V1SubjectAccessReviewFluent<?> fluent) {
    this(fluent, false);
  }
  public V1SubjectAccessReviewBuilder(V1SubjectAccessReviewFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1SubjectAccessReview(), validationEnabled);
  }
  public V1SubjectAccessReviewBuilder(V1SubjectAccessReviewFluent<?> fluent,V1SubjectAccessReview instance) {
    this(fluent, instance, false);
  }
  public V1SubjectAccessReviewBuilder(V1SubjectAccessReviewFluent<?> fluent,V1SubjectAccessReview instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withSpec(instance.getSpec());

    fluent.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  public V1SubjectAccessReviewBuilder(V1SubjectAccessReview instance) {
    this(instance,false);
  }
  public V1SubjectAccessReviewBuilder(V1SubjectAccessReview instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  V1SubjectAccessReviewFluent<?> fluent;
  Boolean validationEnabled;
  public V1SubjectAccessReview build() {
    V1SubjectAccessReview buildable = new V1SubjectAccessReview();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    buildable.setStatus(fluent.getStatus());
    return buildable;
  }
  
}
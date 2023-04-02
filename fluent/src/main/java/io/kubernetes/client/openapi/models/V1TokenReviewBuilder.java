package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1TokenReviewBuilder extends V1TokenReviewFluentImpl<V1TokenReviewBuilder> implements VisitableBuilder<V1TokenReview,V1TokenReviewBuilder>{
  public V1TokenReviewBuilder() {
    this(false);
  }
  public V1TokenReviewBuilder(Boolean validationEnabled) {
    this(new V1TokenReview(), validationEnabled);
  }
  public V1TokenReviewBuilder(V1TokenReviewFluent<?> fluent) {
    this(fluent, false);
  }
  public V1TokenReviewBuilder(V1TokenReviewFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1TokenReview(), validationEnabled);
  }
  public V1TokenReviewBuilder(V1TokenReviewFluent<?> fluent,V1TokenReview instance) {
    this(fluent, instance, false);
  }
  public V1TokenReviewBuilder(V1TokenReviewFluent<?> fluent,V1TokenReview instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withSpec(instance.getSpec());

    fluent.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  public V1TokenReviewBuilder(V1TokenReview instance) {
    this(instance,false);
  }
  public V1TokenReviewBuilder(V1TokenReview instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  V1TokenReviewFluent<?> fluent;
  Boolean validationEnabled;
  public V1TokenReview build() {
    V1TokenReview buildable = new V1TokenReview();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    buildable.setStatus(fluent.getStatus());
    return buildable;
  }
  
}
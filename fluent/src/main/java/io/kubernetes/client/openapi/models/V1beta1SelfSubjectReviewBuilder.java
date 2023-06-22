package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1beta1SelfSubjectReviewBuilder extends V1beta1SelfSubjectReviewFluentImpl<V1beta1SelfSubjectReviewBuilder> implements VisitableBuilder<V1beta1SelfSubjectReview,V1beta1SelfSubjectReviewBuilder>{
  public V1beta1SelfSubjectReviewBuilder() {
    this(false);
  }
  public V1beta1SelfSubjectReviewBuilder(Boolean validationEnabled) {
    this(new V1beta1SelfSubjectReview(), validationEnabled);
  }
  public V1beta1SelfSubjectReviewBuilder(V1beta1SelfSubjectReviewFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta1SelfSubjectReviewBuilder(V1beta1SelfSubjectReviewFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1beta1SelfSubjectReview(), validationEnabled);
  }
  public V1beta1SelfSubjectReviewBuilder(V1beta1SelfSubjectReviewFluent<?> fluent,V1beta1SelfSubjectReview instance) {
    this(fluent, instance, false);
  }
  public V1beta1SelfSubjectReviewBuilder(V1beta1SelfSubjectReviewFluent<?> fluent,V1beta1SelfSubjectReview instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withApiVersion(instance.getApiVersion());
      fluent.withKind(instance.getKind());
      fluent.withMetadata(instance.getMetadata());
      fluent.withStatus(instance.getStatus());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1beta1SelfSubjectReviewBuilder(V1beta1SelfSubjectReview instance) {
    this(instance,false);
  }
  public V1beta1SelfSubjectReviewBuilder(V1beta1SelfSubjectReview instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withApiVersion(instance.getApiVersion());
      this.withKind(instance.getKind());
      this.withMetadata(instance.getMetadata());
      this.withStatus(instance.getStatus());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1beta1SelfSubjectReviewFluent<?> fluent;
  Boolean validationEnabled;
  public V1beta1SelfSubjectReview build() {
    V1beta1SelfSubjectReview buildable = new V1beta1SelfSubjectReview();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setStatus(fluent.getStatus());
    return buildable;
  }
  
}
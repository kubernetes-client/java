package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1alpha1SelfSubjectReviewBuilder extends V1alpha1SelfSubjectReviewFluentImpl<V1alpha1SelfSubjectReviewBuilder> implements VisitableBuilder<V1alpha1SelfSubjectReview,V1alpha1SelfSubjectReviewBuilder>{
  public V1alpha1SelfSubjectReviewBuilder() {
    this(false);
  }
  public V1alpha1SelfSubjectReviewBuilder(Boolean validationEnabled) {
    this(new V1alpha1SelfSubjectReview(), validationEnabled);
  }
  public V1alpha1SelfSubjectReviewBuilder(V1alpha1SelfSubjectReviewFluent<?> fluent) {
    this(fluent, false);
  }
  public V1alpha1SelfSubjectReviewBuilder(V1alpha1SelfSubjectReviewFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1alpha1SelfSubjectReview(), validationEnabled);
  }
  public V1alpha1SelfSubjectReviewBuilder(V1alpha1SelfSubjectReviewFluent<?> fluent,V1alpha1SelfSubjectReview instance) {
    this(fluent, instance, false);
  }
  public V1alpha1SelfSubjectReviewBuilder(V1alpha1SelfSubjectReviewFluent<?> fluent,V1alpha1SelfSubjectReview instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withApiVersion(instance.getApiVersion());
      fluent.withKind(instance.getKind());
      fluent.withMetadata(instance.getMetadata());
      fluent.withStatus(instance.getStatus());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1alpha1SelfSubjectReviewBuilder(V1alpha1SelfSubjectReview instance) {
    this(instance,false);
  }
  public V1alpha1SelfSubjectReviewBuilder(V1alpha1SelfSubjectReview instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withApiVersion(instance.getApiVersion());
      this.withKind(instance.getKind());
      this.withMetadata(instance.getMetadata());
      this.withStatus(instance.getStatus());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1alpha1SelfSubjectReviewFluent<?> fluent;
  Boolean validationEnabled;
  public V1alpha1SelfSubjectReview build() {
    V1alpha1SelfSubjectReview buildable = new V1alpha1SelfSubjectReview();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setStatus(fluent.getStatus());
    return buildable;
  }
  
}
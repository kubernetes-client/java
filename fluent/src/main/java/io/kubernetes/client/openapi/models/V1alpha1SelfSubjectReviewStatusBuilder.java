package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha1SelfSubjectReviewStatusBuilder extends V1alpha1SelfSubjectReviewStatusFluent<V1alpha1SelfSubjectReviewStatusBuilder> implements VisitableBuilder<V1alpha1SelfSubjectReviewStatus,V1alpha1SelfSubjectReviewStatusBuilder>{
  public V1alpha1SelfSubjectReviewStatusBuilder() {
    this(new V1alpha1SelfSubjectReviewStatus());
  }
  
  public V1alpha1SelfSubjectReviewStatusBuilder(V1alpha1SelfSubjectReviewStatusFluent<?> fluent) {
    this(fluent, new V1alpha1SelfSubjectReviewStatus());
  }
  
  public V1alpha1SelfSubjectReviewStatusBuilder(V1alpha1SelfSubjectReviewStatusFluent<?> fluent,V1alpha1SelfSubjectReviewStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha1SelfSubjectReviewStatusBuilder(V1alpha1SelfSubjectReviewStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha1SelfSubjectReviewStatusFluent<?> fluent;
  
  public V1alpha1SelfSubjectReviewStatus build() {
    V1alpha1SelfSubjectReviewStatus buildable = new V1alpha1SelfSubjectReviewStatus();
    buildable.setUserInfo(fluent.buildUserInfo());
    return buildable;
  }
  

}
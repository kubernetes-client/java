package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta1SelfSubjectReviewStatusBuilder extends V1beta1SelfSubjectReviewStatusFluent<V1beta1SelfSubjectReviewStatusBuilder> implements VisitableBuilder<V1beta1SelfSubjectReviewStatus,V1beta1SelfSubjectReviewStatusBuilder>{
  public V1beta1SelfSubjectReviewStatusBuilder() {
    this(new V1beta1SelfSubjectReviewStatus());
  }
  
  public V1beta1SelfSubjectReviewStatusBuilder(V1beta1SelfSubjectReviewStatusFluent<?> fluent) {
    this(fluent, new V1beta1SelfSubjectReviewStatus());
  }
  
  public V1beta1SelfSubjectReviewStatusBuilder(V1beta1SelfSubjectReviewStatusFluent<?> fluent,V1beta1SelfSubjectReviewStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1SelfSubjectReviewStatusBuilder(V1beta1SelfSubjectReviewStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1SelfSubjectReviewStatusFluent<?> fluent;
  
  public V1beta1SelfSubjectReviewStatus build() {
    V1beta1SelfSubjectReviewStatus buildable = new V1beta1SelfSubjectReviewStatus();
    buildable.setUserInfo(fluent.buildUserInfo());
    return buildable;
  }
  

}
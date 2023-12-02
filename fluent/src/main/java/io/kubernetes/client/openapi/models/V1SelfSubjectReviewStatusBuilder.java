package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1SelfSubjectReviewStatusBuilder extends V1SelfSubjectReviewStatusFluent<V1SelfSubjectReviewStatusBuilder> implements VisitableBuilder<V1SelfSubjectReviewStatus,V1SelfSubjectReviewStatusBuilder>{
  public V1SelfSubjectReviewStatusBuilder() {
    this(new V1SelfSubjectReviewStatus());
  }
  
  public V1SelfSubjectReviewStatusBuilder(V1SelfSubjectReviewStatusFluent<?> fluent) {
    this(fluent, new V1SelfSubjectReviewStatus());
  }
  
  public V1SelfSubjectReviewStatusBuilder(V1SelfSubjectReviewStatusFluent<?> fluent,V1SelfSubjectReviewStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1SelfSubjectReviewStatusBuilder(V1SelfSubjectReviewStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1SelfSubjectReviewStatusFluent<?> fluent;
  
  public V1SelfSubjectReviewStatus build() {
    V1SelfSubjectReviewStatus buildable = new V1SelfSubjectReviewStatus();
    buildable.setUserInfo(fluent.buildUserInfo());
    return buildable;
  }
  

}
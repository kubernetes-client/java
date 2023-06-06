package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1beta1SelfSubjectReviewStatusBuilder extends V1beta1SelfSubjectReviewStatusFluentImpl<V1beta1SelfSubjectReviewStatusBuilder> implements VisitableBuilder<V1beta1SelfSubjectReviewStatus,V1beta1SelfSubjectReviewStatusBuilder>{
  public V1beta1SelfSubjectReviewStatusBuilder() {
    this(false);
  }
  public V1beta1SelfSubjectReviewStatusBuilder(Boolean validationEnabled) {
    this(new V1beta1SelfSubjectReviewStatus(), validationEnabled);
  }
  public V1beta1SelfSubjectReviewStatusBuilder(V1beta1SelfSubjectReviewStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta1SelfSubjectReviewStatusBuilder(V1beta1SelfSubjectReviewStatusFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1beta1SelfSubjectReviewStatus(), validationEnabled);
  }
  public V1beta1SelfSubjectReviewStatusBuilder(V1beta1SelfSubjectReviewStatusFluent<?> fluent,V1beta1SelfSubjectReviewStatus instance) {
    this(fluent, instance, false);
  }
  public V1beta1SelfSubjectReviewStatusBuilder(V1beta1SelfSubjectReviewStatusFluent<?> fluent,V1beta1SelfSubjectReviewStatus instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withUserInfo(instance.getUserInfo());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1beta1SelfSubjectReviewStatusBuilder(V1beta1SelfSubjectReviewStatus instance) {
    this(instance,false);
  }
  public V1beta1SelfSubjectReviewStatusBuilder(V1beta1SelfSubjectReviewStatus instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withUserInfo(instance.getUserInfo());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1beta1SelfSubjectReviewStatusFluent<?> fluent;
  Boolean validationEnabled;
  public V1beta1SelfSubjectReviewStatus build() {
    V1beta1SelfSubjectReviewStatus buildable = new V1beta1SelfSubjectReviewStatus();
    buildable.setUserInfo(fluent.getUserInfo());
    return buildable;
  }
  
}
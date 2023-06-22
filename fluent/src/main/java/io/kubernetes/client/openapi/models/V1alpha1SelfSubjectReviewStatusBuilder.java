package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1alpha1SelfSubjectReviewStatusBuilder extends V1alpha1SelfSubjectReviewStatusFluentImpl<V1alpha1SelfSubjectReviewStatusBuilder> implements VisitableBuilder<V1alpha1SelfSubjectReviewStatus,V1alpha1SelfSubjectReviewStatusBuilder>{
  public V1alpha1SelfSubjectReviewStatusBuilder() {
    this(false);
  }
  public V1alpha1SelfSubjectReviewStatusBuilder(Boolean validationEnabled) {
    this(new V1alpha1SelfSubjectReviewStatus(), validationEnabled);
  }
  public V1alpha1SelfSubjectReviewStatusBuilder(V1alpha1SelfSubjectReviewStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V1alpha1SelfSubjectReviewStatusBuilder(V1alpha1SelfSubjectReviewStatusFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1alpha1SelfSubjectReviewStatus(), validationEnabled);
  }
  public V1alpha1SelfSubjectReviewStatusBuilder(V1alpha1SelfSubjectReviewStatusFluent<?> fluent,V1alpha1SelfSubjectReviewStatus instance) {
    this(fluent, instance, false);
  }
  public V1alpha1SelfSubjectReviewStatusBuilder(V1alpha1SelfSubjectReviewStatusFluent<?> fluent,V1alpha1SelfSubjectReviewStatus instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withUserInfo(instance.getUserInfo());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1alpha1SelfSubjectReviewStatusBuilder(V1alpha1SelfSubjectReviewStatus instance) {
    this(instance,false);
  }
  public V1alpha1SelfSubjectReviewStatusBuilder(V1alpha1SelfSubjectReviewStatus instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withUserInfo(instance.getUserInfo());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1alpha1SelfSubjectReviewStatusFluent<?> fluent;
  Boolean validationEnabled;
  public V1alpha1SelfSubjectReviewStatus build() {
    V1alpha1SelfSubjectReviewStatus buildable = new V1alpha1SelfSubjectReviewStatus();
    buildable.setUserInfo(fluent.getUserInfo());
    return buildable;
  }
  
}
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1SubjectAccessReviewSpecBuilder extends V1SubjectAccessReviewSpecFluent<V1SubjectAccessReviewSpecBuilder> implements VisitableBuilder<V1SubjectAccessReviewSpec,V1SubjectAccessReviewSpecBuilder>{
  public V1SubjectAccessReviewSpecBuilder() {
    this(new V1SubjectAccessReviewSpec());
  }
  
  public V1SubjectAccessReviewSpecBuilder(V1SubjectAccessReviewSpecFluent<?> fluent) {
    this(fluent, new V1SubjectAccessReviewSpec());
  }
  
  public V1SubjectAccessReviewSpecBuilder(V1SubjectAccessReviewSpecFluent<?> fluent,V1SubjectAccessReviewSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1SubjectAccessReviewSpecBuilder(V1SubjectAccessReviewSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1SubjectAccessReviewSpecFluent<?> fluent;
  
  public V1SubjectAccessReviewSpec build() {
    V1SubjectAccessReviewSpec buildable = new V1SubjectAccessReviewSpec();
    buildable.setExtra(fluent.getExtra());
    buildable.setGroups(fluent.getGroups());
    buildable.setNonResourceAttributes(fluent.buildNonResourceAttributes());
    buildable.setResourceAttributes(fluent.buildResourceAttributes());
    buildable.setUid(fluent.getUid());
    buildable.setUser(fluent.getUser());
    return buildable;
  }
  

}
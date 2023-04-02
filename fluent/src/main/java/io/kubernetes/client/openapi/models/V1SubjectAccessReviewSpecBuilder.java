package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1SubjectAccessReviewSpecBuilder extends V1SubjectAccessReviewSpecFluentImpl<V1SubjectAccessReviewSpecBuilder> implements VisitableBuilder<V1SubjectAccessReviewSpec,V1SubjectAccessReviewSpecBuilder>{
  public V1SubjectAccessReviewSpecBuilder() {
    this(false);
  }
  public V1SubjectAccessReviewSpecBuilder(Boolean validationEnabled) {
    this(new V1SubjectAccessReviewSpec(), validationEnabled);
  }
  public V1SubjectAccessReviewSpecBuilder(V1SubjectAccessReviewSpecFluent<?> fluent) {
    this(fluent, false);
  }
  public V1SubjectAccessReviewSpecBuilder(V1SubjectAccessReviewSpecFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1SubjectAccessReviewSpec(), validationEnabled);
  }
  public V1SubjectAccessReviewSpecBuilder(V1SubjectAccessReviewSpecFluent<?> fluent,V1SubjectAccessReviewSpec instance) {
    this(fluent, instance, false);
  }
  public V1SubjectAccessReviewSpecBuilder(V1SubjectAccessReviewSpecFluent<?> fluent,V1SubjectAccessReviewSpec instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withExtra(instance.getExtra());

    fluent.withGroups(instance.getGroups());

    fluent.withNonResourceAttributes(instance.getNonResourceAttributes());

    fluent.withResourceAttributes(instance.getResourceAttributes());

    fluent.withUid(instance.getUid());

    fluent.withUser(instance.getUser());

    this.validationEnabled = validationEnabled; 
  }
  public V1SubjectAccessReviewSpecBuilder(V1SubjectAccessReviewSpec instance) {
    this(instance,false);
  }
  public V1SubjectAccessReviewSpecBuilder(V1SubjectAccessReviewSpec instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withExtra(instance.getExtra());

    this.withGroups(instance.getGroups());

    this.withNonResourceAttributes(instance.getNonResourceAttributes());

    this.withResourceAttributes(instance.getResourceAttributes());

    this.withUid(instance.getUid());

    this.withUser(instance.getUser());

    this.validationEnabled = validationEnabled; 
  }
  V1SubjectAccessReviewSpecFluent<?> fluent;
  Boolean validationEnabled;
  public V1SubjectAccessReviewSpec build() {
    V1SubjectAccessReviewSpec buildable = new V1SubjectAccessReviewSpec();
    buildable.setExtra(fluent.getExtra());
    buildable.setGroups(fluent.getGroups());
    buildable.setNonResourceAttributes(fluent.getNonResourceAttributes());
    buildable.setResourceAttributes(fluent.getResourceAttributes());
    buildable.setUid(fluent.getUid());
    buildable.setUser(fluent.getUser());
    return buildable;
  }
  
}
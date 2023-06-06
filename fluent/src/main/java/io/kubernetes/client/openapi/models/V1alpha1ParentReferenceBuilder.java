package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1alpha1ParentReferenceBuilder extends V1alpha1ParentReferenceFluentImpl<V1alpha1ParentReferenceBuilder> implements VisitableBuilder<V1alpha1ParentReference,V1alpha1ParentReferenceBuilder>{
  public V1alpha1ParentReferenceBuilder() {
    this(false);
  }
  public V1alpha1ParentReferenceBuilder(Boolean validationEnabled) {
    this(new V1alpha1ParentReference(), validationEnabled);
  }
  public V1alpha1ParentReferenceBuilder(V1alpha1ParentReferenceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1alpha1ParentReferenceBuilder(V1alpha1ParentReferenceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1alpha1ParentReference(), validationEnabled);
  }
  public V1alpha1ParentReferenceBuilder(V1alpha1ParentReferenceFluent<?> fluent,V1alpha1ParentReference instance) {
    this(fluent, instance, false);
  }
  public V1alpha1ParentReferenceBuilder(V1alpha1ParentReferenceFluent<?> fluent,V1alpha1ParentReference instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withGroup(instance.getGroup());
      fluent.withName(instance.getName());
      fluent.withNamespace(instance.getNamespace());
      fluent.withResource(instance.getResource());
      fluent.withUid(instance.getUid());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1alpha1ParentReferenceBuilder(V1alpha1ParentReference instance) {
    this(instance,false);
  }
  public V1alpha1ParentReferenceBuilder(V1alpha1ParentReference instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withGroup(instance.getGroup());
      this.withName(instance.getName());
      this.withNamespace(instance.getNamespace());
      this.withResource(instance.getResource());
      this.withUid(instance.getUid());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1alpha1ParentReferenceFluent<?> fluent;
  Boolean validationEnabled;
  public V1alpha1ParentReference build() {
    V1alpha1ParentReference buildable = new V1alpha1ParentReference();
    buildable.setGroup(fluent.getGroup());
    buildable.setName(fluent.getName());
    buildable.setNamespace(fluent.getNamespace());
    buildable.setResource(fluent.getResource());
    buildable.setUid(fluent.getUid());
    return buildable;
  }
  
}
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha1ParentReferenceBuilder extends V1alpha1ParentReferenceFluent<V1alpha1ParentReferenceBuilder> implements VisitableBuilder<V1alpha1ParentReference,V1alpha1ParentReferenceBuilder>{
  public V1alpha1ParentReferenceBuilder() {
    this(new V1alpha1ParentReference());
  }
  
  public V1alpha1ParentReferenceBuilder(V1alpha1ParentReferenceFluent<?> fluent) {
    this(fluent, new V1alpha1ParentReference());
  }
  
  public V1alpha1ParentReferenceBuilder(V1alpha1ParentReferenceFluent<?> fluent,V1alpha1ParentReference instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha1ParentReferenceBuilder(V1alpha1ParentReference instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha1ParentReferenceFluent<?> fluent;
  
  public V1alpha1ParentReference build() {
    V1alpha1ParentReference buildable = new V1alpha1ParentReference();
    buildable.setGroup(fluent.getGroup());
    buildable.setName(fluent.getName());
    buildable.setNamespace(fluent.getNamespace());
    buildable.setResource(fluent.getResource());
    return buildable;
  }
  

}
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta1ParentReferenceBuilder extends V1beta1ParentReferenceFluent<V1beta1ParentReferenceBuilder> implements VisitableBuilder<V1beta1ParentReference,V1beta1ParentReferenceBuilder>{
  public V1beta1ParentReferenceBuilder() {
    this(new V1beta1ParentReference());
  }
  
  public V1beta1ParentReferenceBuilder(V1beta1ParentReferenceFluent<?> fluent) {
    this(fluent, new V1beta1ParentReference());
  }
  
  public V1beta1ParentReferenceBuilder(V1beta1ParentReferenceFluent<?> fluent,V1beta1ParentReference instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1ParentReferenceBuilder(V1beta1ParentReference instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1ParentReferenceFluent<?> fluent;
  
  public V1beta1ParentReference build() {
    V1beta1ParentReference buildable = new V1beta1ParentReference();
    buildable.setGroup(fluent.getGroup());
    buildable.setName(fluent.getName());
    buildable.setNamespace(fluent.getNamespace());
    buildable.setResource(fluent.getResource());
    return buildable;
  }
  

}
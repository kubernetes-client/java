package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ParentReferenceBuilder extends V1ParentReferenceFluent<V1ParentReferenceBuilder> implements VisitableBuilder<V1ParentReference,V1ParentReferenceBuilder>{
  public V1ParentReferenceBuilder() {
    this(new V1ParentReference());
  }
  
  public V1ParentReferenceBuilder(V1ParentReferenceFluent<?> fluent) {
    this(fluent, new V1ParentReference());
  }
  
  public V1ParentReferenceBuilder(V1ParentReferenceFluent<?> fluent,V1ParentReference instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ParentReferenceBuilder(V1ParentReference instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ParentReferenceFluent<?> fluent;
  
  public V1ParentReference build() {
    V1ParentReference buildable = new V1ParentReference();
    buildable.setGroup(fluent.getGroup());
    buildable.setName(fluent.getName());
    buildable.setNamespace(fluent.getNamespace());
    buildable.setResource(fluent.getResource());
    return buildable;
  }
  

}
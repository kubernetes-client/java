package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1BoundObjectReferenceBuilder extends V1BoundObjectReferenceFluent<V1BoundObjectReferenceBuilder> implements VisitableBuilder<V1BoundObjectReference,V1BoundObjectReferenceBuilder>{
  public V1BoundObjectReferenceBuilder() {
    this(new V1BoundObjectReference());
  }
  
  public V1BoundObjectReferenceBuilder(V1BoundObjectReferenceFluent<?> fluent) {
    this(fluent, new V1BoundObjectReference());
  }
  
  public V1BoundObjectReferenceBuilder(V1BoundObjectReferenceFluent<?> fluent,V1BoundObjectReference instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1BoundObjectReferenceBuilder(V1BoundObjectReference instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1BoundObjectReferenceFluent<?> fluent;
  
  public V1BoundObjectReference build() {
    V1BoundObjectReference buildable = new V1BoundObjectReference();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setName(fluent.getName());
    buildable.setUid(fluent.getUid());
    return buildable;
  }
  

}
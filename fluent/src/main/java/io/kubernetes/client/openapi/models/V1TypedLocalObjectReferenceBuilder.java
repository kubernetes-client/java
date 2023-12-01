package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1TypedLocalObjectReferenceBuilder extends V1TypedLocalObjectReferenceFluent<V1TypedLocalObjectReferenceBuilder> implements VisitableBuilder<V1TypedLocalObjectReference,V1TypedLocalObjectReferenceBuilder>{
  public V1TypedLocalObjectReferenceBuilder() {
    this(new V1TypedLocalObjectReference());
  }
  
  public V1TypedLocalObjectReferenceBuilder(V1TypedLocalObjectReferenceFluent<?> fluent) {
    this(fluent, new V1TypedLocalObjectReference());
  }
  
  public V1TypedLocalObjectReferenceBuilder(V1TypedLocalObjectReferenceFluent<?> fluent,V1TypedLocalObjectReference instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1TypedLocalObjectReferenceBuilder(V1TypedLocalObjectReference instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1TypedLocalObjectReferenceFluent<?> fluent;
  
  public V1TypedLocalObjectReference build() {
    V1TypedLocalObjectReference buildable = new V1TypedLocalObjectReference();
    buildable.setApiGroup(fluent.getApiGroup());
    buildable.setKind(fluent.getKind());
    buildable.setName(fluent.getName());
    return buildable;
  }
  

}
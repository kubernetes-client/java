package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1CrossVersionObjectReferenceBuilder extends V1CrossVersionObjectReferenceFluent<V1CrossVersionObjectReferenceBuilder> implements VisitableBuilder<V1CrossVersionObjectReference,V1CrossVersionObjectReferenceBuilder>{
  public V1CrossVersionObjectReferenceBuilder() {
    this(new V1CrossVersionObjectReference());
  }
  
  public V1CrossVersionObjectReferenceBuilder(V1CrossVersionObjectReferenceFluent<?> fluent) {
    this(fluent, new V1CrossVersionObjectReference());
  }
  
  public V1CrossVersionObjectReferenceBuilder(V1CrossVersionObjectReferenceFluent<?> fluent,V1CrossVersionObjectReference instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1CrossVersionObjectReferenceBuilder(V1CrossVersionObjectReference instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1CrossVersionObjectReferenceFluent<?> fluent;
  
  public V1CrossVersionObjectReference build() {
    V1CrossVersionObjectReference buildable = new V1CrossVersionObjectReference();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setName(fluent.getName());
    return buildable;
  }
  

}
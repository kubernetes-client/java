package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V2CrossVersionObjectReferenceBuilder extends V2CrossVersionObjectReferenceFluent<V2CrossVersionObjectReferenceBuilder> implements VisitableBuilder<V2CrossVersionObjectReference,V2CrossVersionObjectReferenceBuilder>{
  public V2CrossVersionObjectReferenceBuilder() {
    this(new V2CrossVersionObjectReference());
  }
  
  public V2CrossVersionObjectReferenceBuilder(V2CrossVersionObjectReferenceFluent<?> fluent) {
    this(fluent, new V2CrossVersionObjectReference());
  }
  
  public V2CrossVersionObjectReferenceBuilder(V2CrossVersionObjectReferenceFluent<?> fluent,V2CrossVersionObjectReference instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V2CrossVersionObjectReferenceBuilder(V2CrossVersionObjectReference instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V2CrossVersionObjectReferenceFluent<?> fluent;
  
  public V2CrossVersionObjectReference build() {
    V2CrossVersionObjectReference buildable = new V2CrossVersionObjectReference();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setName(fluent.getName());
    return buildable;
  }
  

}
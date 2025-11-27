package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1TypedObjectReferenceBuilder extends V1TypedObjectReferenceFluent<V1TypedObjectReferenceBuilder> implements VisitableBuilder<V1TypedObjectReference,V1TypedObjectReferenceBuilder>{

  V1TypedObjectReferenceFluent<?> fluent;

  public V1TypedObjectReferenceBuilder() {
    this(new V1TypedObjectReference());
  }
  
  public V1TypedObjectReferenceBuilder(V1TypedObjectReferenceFluent<?> fluent) {
    this(fluent, new V1TypedObjectReference());
  }
  
  public V1TypedObjectReferenceBuilder(V1TypedObjectReference instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1TypedObjectReferenceBuilder(V1TypedObjectReferenceFluent<?> fluent,V1TypedObjectReference instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1TypedObjectReference build() {
    V1TypedObjectReference buildable = new V1TypedObjectReference();
    buildable.setApiGroup(fluent.getApiGroup());
    buildable.setKind(fluent.getKind());
    buildable.setName(fluent.getName());
    buildable.setNamespace(fluent.getNamespace());
    return buildable;
  }
  
}
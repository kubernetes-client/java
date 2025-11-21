package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1LocalObjectReferenceBuilder extends V1LocalObjectReferenceFluent<V1LocalObjectReferenceBuilder> implements VisitableBuilder<V1LocalObjectReference,V1LocalObjectReferenceBuilder>{

  V1LocalObjectReferenceFluent<?> fluent;

  public V1LocalObjectReferenceBuilder() {
    this(new V1LocalObjectReference());
  }
  
  public V1LocalObjectReferenceBuilder(V1LocalObjectReferenceFluent<?> fluent) {
    this(fluent, new V1LocalObjectReference());
  }
  
  public V1LocalObjectReferenceBuilder(V1LocalObjectReference instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1LocalObjectReferenceBuilder(V1LocalObjectReferenceFluent<?> fluent,V1LocalObjectReference instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1LocalObjectReference build() {
    V1LocalObjectReference buildable = new V1LocalObjectReference();
    buildable.setName(fluent.getName());
    return buildable;
  }
  
}
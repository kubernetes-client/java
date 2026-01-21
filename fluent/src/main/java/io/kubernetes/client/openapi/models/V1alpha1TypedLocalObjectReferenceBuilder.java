package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1alpha1TypedLocalObjectReferenceBuilder extends V1alpha1TypedLocalObjectReferenceFluent<V1alpha1TypedLocalObjectReferenceBuilder> implements VisitableBuilder<V1alpha1TypedLocalObjectReference,V1alpha1TypedLocalObjectReferenceBuilder>{

  V1alpha1TypedLocalObjectReferenceFluent<?> fluent;

  public V1alpha1TypedLocalObjectReferenceBuilder() {
    this(new V1alpha1TypedLocalObjectReference());
  }
  
  public V1alpha1TypedLocalObjectReferenceBuilder(V1alpha1TypedLocalObjectReferenceFluent<?> fluent) {
    this(fluent, new V1alpha1TypedLocalObjectReference());
  }
  
  public V1alpha1TypedLocalObjectReferenceBuilder(V1alpha1TypedLocalObjectReference instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1alpha1TypedLocalObjectReferenceBuilder(V1alpha1TypedLocalObjectReferenceFluent<?> fluent,V1alpha1TypedLocalObjectReference instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1alpha1TypedLocalObjectReference build() {
    V1alpha1TypedLocalObjectReference buildable = new V1alpha1TypedLocalObjectReference();
    buildable.setApiGroup(fluent.getApiGroup());
    buildable.setKind(fluent.getKind());
    buildable.setName(fluent.getName());
    return buildable;
  }
  
}
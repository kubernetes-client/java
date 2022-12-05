package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1TypedLocalObjectReferenceBuilder extends V1TypedLocalObjectReferenceFluentImpl<V1TypedLocalObjectReferenceBuilder> implements VisitableBuilder<V1TypedLocalObjectReference,V1TypedLocalObjectReferenceBuilder>{
  public V1TypedLocalObjectReferenceBuilder() {
    this(false);
  }
  public V1TypedLocalObjectReferenceBuilder(Boolean validationEnabled) {
    this(new V1TypedLocalObjectReference(), validationEnabled);
  }
  public V1TypedLocalObjectReferenceBuilder(V1TypedLocalObjectReferenceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1TypedLocalObjectReferenceBuilder(V1TypedLocalObjectReferenceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1TypedLocalObjectReference(), validationEnabled);
  }
  public V1TypedLocalObjectReferenceBuilder(V1TypedLocalObjectReferenceFluent<?> fluent,V1TypedLocalObjectReference instance) {
    this(fluent, instance, false);
  }
  public V1TypedLocalObjectReferenceBuilder(V1TypedLocalObjectReferenceFluent<?> fluent,V1TypedLocalObjectReference instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiGroup(instance.getApiGroup());

    fluent.withKind(instance.getKind());

    fluent.withName(instance.getName());

    this.validationEnabled = validationEnabled; 
  }
  public V1TypedLocalObjectReferenceBuilder(V1TypedLocalObjectReference instance) {
    this(instance,false);
  }
  public V1TypedLocalObjectReferenceBuilder(V1TypedLocalObjectReference instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiGroup(instance.getApiGroup());

    this.withKind(instance.getKind());

    this.withName(instance.getName());

    this.validationEnabled = validationEnabled; 
  }
  V1TypedLocalObjectReferenceFluent<?> fluent;
  Boolean validationEnabled;
  public V1TypedLocalObjectReference build() {
    V1TypedLocalObjectReference buildable = new V1TypedLocalObjectReference();
    buildable.setApiGroup(fluent.getApiGroup());
    buildable.setKind(fluent.getKind());
    buildable.setName(fluent.getName());
    return buildable;
  }
  
}
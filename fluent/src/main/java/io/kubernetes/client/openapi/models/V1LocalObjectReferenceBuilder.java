package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1LocalObjectReferenceBuilder extends V1LocalObjectReferenceFluentImpl<V1LocalObjectReferenceBuilder> implements VisitableBuilder<V1LocalObjectReference,V1LocalObjectReferenceBuilder>{
  public V1LocalObjectReferenceBuilder() {
    this(false);
  }
  public V1LocalObjectReferenceBuilder(Boolean validationEnabled) {
    this(new V1LocalObjectReference(), validationEnabled);
  }
  public V1LocalObjectReferenceBuilder(V1LocalObjectReferenceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1LocalObjectReferenceBuilder(V1LocalObjectReferenceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1LocalObjectReference(), validationEnabled);
  }
  public V1LocalObjectReferenceBuilder(V1LocalObjectReferenceFluent<?> fluent,V1LocalObjectReference instance) {
    this(fluent, instance, false);
  }
  public V1LocalObjectReferenceBuilder(V1LocalObjectReferenceFluent<?> fluent,V1LocalObjectReference instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withName(instance.getName());

    this.validationEnabled = validationEnabled; 
  }
  public V1LocalObjectReferenceBuilder(V1LocalObjectReference instance) {
    this(instance,false);
  }
  public V1LocalObjectReferenceBuilder(V1LocalObjectReference instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withName(instance.getName());

    this.validationEnabled = validationEnabled; 
  }
  V1LocalObjectReferenceFluent<?> fluent;
  Boolean validationEnabled;
  public V1LocalObjectReference build() {
    V1LocalObjectReference buildable = new V1LocalObjectReference();
    buildable.setName(fluent.getName());
    return buildable;
  }
  
}
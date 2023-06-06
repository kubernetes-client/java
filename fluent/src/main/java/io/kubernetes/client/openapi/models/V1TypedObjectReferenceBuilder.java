package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1TypedObjectReferenceBuilder extends V1TypedObjectReferenceFluentImpl<V1TypedObjectReferenceBuilder> implements VisitableBuilder<V1TypedObjectReference,V1TypedObjectReferenceBuilder>{
  public V1TypedObjectReferenceBuilder() {
    this(false);
  }
  public V1TypedObjectReferenceBuilder(Boolean validationEnabled) {
    this(new V1TypedObjectReference(), validationEnabled);
  }
  public V1TypedObjectReferenceBuilder(V1TypedObjectReferenceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1TypedObjectReferenceBuilder(V1TypedObjectReferenceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1TypedObjectReference(), validationEnabled);
  }
  public V1TypedObjectReferenceBuilder(V1TypedObjectReferenceFluent<?> fluent,V1TypedObjectReference instance) {
    this(fluent, instance, false);
  }
  public V1TypedObjectReferenceBuilder(V1TypedObjectReferenceFluent<?> fluent,V1TypedObjectReference instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withApiGroup(instance.getApiGroup());
      fluent.withKind(instance.getKind());
      fluent.withName(instance.getName());
      fluent.withNamespace(instance.getNamespace());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1TypedObjectReferenceBuilder(V1TypedObjectReference instance) {
    this(instance,false);
  }
  public V1TypedObjectReferenceBuilder(V1TypedObjectReference instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withApiGroup(instance.getApiGroup());
      this.withKind(instance.getKind());
      this.withName(instance.getName());
      this.withNamespace(instance.getNamespace());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1TypedObjectReferenceFluent<?> fluent;
  Boolean validationEnabled;
  public V1TypedObjectReference build() {
    V1TypedObjectReference buildable = new V1TypedObjectReference();
    buildable.setApiGroup(fluent.getApiGroup());
    buildable.setKind(fluent.getKind());
    buildable.setName(fluent.getName());
    buildable.setNamespace(fluent.getNamespace());
    return buildable;
  }
  
}
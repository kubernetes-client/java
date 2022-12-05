package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1BoundObjectReferenceBuilder extends V1BoundObjectReferenceFluentImpl<V1BoundObjectReferenceBuilder> implements VisitableBuilder<V1BoundObjectReference,V1BoundObjectReferenceBuilder>{
  public V1BoundObjectReferenceBuilder() {
    this(false);
  }
  public V1BoundObjectReferenceBuilder(Boolean validationEnabled) {
    this(new V1BoundObjectReference(), validationEnabled);
  }
  public V1BoundObjectReferenceBuilder(V1BoundObjectReferenceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1BoundObjectReferenceBuilder(V1BoundObjectReferenceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1BoundObjectReference(), validationEnabled);
  }
  public V1BoundObjectReferenceBuilder(V1BoundObjectReferenceFluent<?> fluent,V1BoundObjectReference instance) {
    this(fluent, instance, false);
  }
  public V1BoundObjectReferenceBuilder(V1BoundObjectReferenceFluent<?> fluent,V1BoundObjectReference instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withName(instance.getName());

    fluent.withUid(instance.getUid());

    this.validationEnabled = validationEnabled; 
  }
  public V1BoundObjectReferenceBuilder(V1BoundObjectReference instance) {
    this(instance,false);
  }
  public V1BoundObjectReferenceBuilder(V1BoundObjectReference instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withName(instance.getName());

    this.withUid(instance.getUid());

    this.validationEnabled = validationEnabled; 
  }
  V1BoundObjectReferenceFluent<?> fluent;
  Boolean validationEnabled;
  public V1BoundObjectReference build() {
    V1BoundObjectReference buildable = new V1BoundObjectReference();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setName(fluent.getName());
    buildable.setUid(fluent.getUid());
    return buildable;
  }
  
}
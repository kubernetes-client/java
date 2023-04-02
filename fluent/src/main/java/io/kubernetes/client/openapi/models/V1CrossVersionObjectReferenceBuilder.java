package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1CrossVersionObjectReferenceBuilder extends V1CrossVersionObjectReferenceFluentImpl<V1CrossVersionObjectReferenceBuilder> implements VisitableBuilder<V1CrossVersionObjectReference,V1CrossVersionObjectReferenceBuilder>{
  public V1CrossVersionObjectReferenceBuilder() {
    this(false);
  }
  public V1CrossVersionObjectReferenceBuilder(Boolean validationEnabled) {
    this(new V1CrossVersionObjectReference(), validationEnabled);
  }
  public V1CrossVersionObjectReferenceBuilder(V1CrossVersionObjectReferenceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1CrossVersionObjectReferenceBuilder(V1CrossVersionObjectReferenceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1CrossVersionObjectReference(), validationEnabled);
  }
  public V1CrossVersionObjectReferenceBuilder(V1CrossVersionObjectReferenceFluent<?> fluent,V1CrossVersionObjectReference instance) {
    this(fluent, instance, false);
  }
  public V1CrossVersionObjectReferenceBuilder(V1CrossVersionObjectReferenceFluent<?> fluent,V1CrossVersionObjectReference instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withName(instance.getName());

    this.validationEnabled = validationEnabled; 
  }
  public V1CrossVersionObjectReferenceBuilder(V1CrossVersionObjectReference instance) {
    this(instance,false);
  }
  public V1CrossVersionObjectReferenceBuilder(V1CrossVersionObjectReference instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withName(instance.getName());

    this.validationEnabled = validationEnabled; 
  }
  V1CrossVersionObjectReferenceFluent<?> fluent;
  Boolean validationEnabled;
  public V1CrossVersionObjectReference build() {
    V1CrossVersionObjectReference buildable = new V1CrossVersionObjectReference();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setName(fluent.getName());
    return buildable;
  }
  
}
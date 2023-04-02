package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V2beta2CrossVersionObjectReferenceBuilder extends V2beta2CrossVersionObjectReferenceFluentImpl<V2beta2CrossVersionObjectReferenceBuilder> implements VisitableBuilder<V2beta2CrossVersionObjectReference,V2beta2CrossVersionObjectReferenceBuilder>{
  public V2beta2CrossVersionObjectReferenceBuilder() {
    this(false);
  }
  public V2beta2CrossVersionObjectReferenceBuilder(Boolean validationEnabled) {
    this(new V2beta2CrossVersionObjectReference(), validationEnabled);
  }
  public V2beta2CrossVersionObjectReferenceBuilder(V2beta2CrossVersionObjectReferenceFluent<?> fluent) {
    this(fluent, false);
  }
  public V2beta2CrossVersionObjectReferenceBuilder(V2beta2CrossVersionObjectReferenceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V2beta2CrossVersionObjectReference(), validationEnabled);
  }
  public V2beta2CrossVersionObjectReferenceBuilder(V2beta2CrossVersionObjectReferenceFluent<?> fluent,V2beta2CrossVersionObjectReference instance) {
    this(fluent, instance, false);
  }
  public V2beta2CrossVersionObjectReferenceBuilder(V2beta2CrossVersionObjectReferenceFluent<?> fluent,V2beta2CrossVersionObjectReference instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withName(instance.getName());

    this.validationEnabled = validationEnabled; 
  }
  public V2beta2CrossVersionObjectReferenceBuilder(V2beta2CrossVersionObjectReference instance) {
    this(instance,false);
  }
  public V2beta2CrossVersionObjectReferenceBuilder(V2beta2CrossVersionObjectReference instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withName(instance.getName());

    this.validationEnabled = validationEnabled; 
  }
  V2beta2CrossVersionObjectReferenceFluent<?> fluent;
  Boolean validationEnabled;
  public V2beta2CrossVersionObjectReference build() {
    V2beta2CrossVersionObjectReference buildable = new V2beta2CrossVersionObjectReference();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setName(fluent.getName());
    return buildable;
  }
  
}
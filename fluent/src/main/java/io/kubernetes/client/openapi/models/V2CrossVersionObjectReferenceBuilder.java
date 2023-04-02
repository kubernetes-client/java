package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V2CrossVersionObjectReferenceBuilder extends V2CrossVersionObjectReferenceFluentImpl<V2CrossVersionObjectReferenceBuilder> implements VisitableBuilder<V2CrossVersionObjectReference,V2CrossVersionObjectReferenceBuilder>{
  public V2CrossVersionObjectReferenceBuilder() {
    this(false);
  }
  public V2CrossVersionObjectReferenceBuilder(Boolean validationEnabled) {
    this(new V2CrossVersionObjectReference(), validationEnabled);
  }
  public V2CrossVersionObjectReferenceBuilder(V2CrossVersionObjectReferenceFluent<?> fluent) {
    this(fluent, false);
  }
  public V2CrossVersionObjectReferenceBuilder(V2CrossVersionObjectReferenceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V2CrossVersionObjectReference(), validationEnabled);
  }
  public V2CrossVersionObjectReferenceBuilder(V2CrossVersionObjectReferenceFluent<?> fluent,V2CrossVersionObjectReference instance) {
    this(fluent, instance, false);
  }
  public V2CrossVersionObjectReferenceBuilder(V2CrossVersionObjectReferenceFluent<?> fluent,V2CrossVersionObjectReference instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withName(instance.getName());

    this.validationEnabled = validationEnabled; 
  }
  public V2CrossVersionObjectReferenceBuilder(V2CrossVersionObjectReference instance) {
    this(instance,false);
  }
  public V2CrossVersionObjectReferenceBuilder(V2CrossVersionObjectReference instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withName(instance.getName());

    this.validationEnabled = validationEnabled; 
  }
  V2CrossVersionObjectReferenceFluent<?> fluent;
  Boolean validationEnabled;
  public V2CrossVersionObjectReference build() {
    V2CrossVersionObjectReference buildable = new V2CrossVersionObjectReference();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setName(fluent.getName());
    return buildable;
  }
  
}
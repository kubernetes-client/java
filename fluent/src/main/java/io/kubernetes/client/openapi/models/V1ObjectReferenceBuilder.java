package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1ObjectReferenceBuilder extends V1ObjectReferenceFluentImpl<V1ObjectReferenceBuilder> implements VisitableBuilder<V1ObjectReference,V1ObjectReferenceBuilder>{
  public V1ObjectReferenceBuilder() {
    this(false);
  }
  public V1ObjectReferenceBuilder(Boolean validationEnabled) {
    this(new V1ObjectReference(), validationEnabled);
  }
  public V1ObjectReferenceBuilder(V1ObjectReferenceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ObjectReferenceBuilder(V1ObjectReferenceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1ObjectReference(), validationEnabled);
  }
  public V1ObjectReferenceBuilder(V1ObjectReferenceFluent<?> fluent,V1ObjectReference instance) {
    this(fluent, instance, false);
  }
  public V1ObjectReferenceBuilder(V1ObjectReferenceFluent<?> fluent,V1ObjectReference instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withFieldPath(instance.getFieldPath());

    fluent.withKind(instance.getKind());

    fluent.withName(instance.getName());

    fluent.withNamespace(instance.getNamespace());

    fluent.withResourceVersion(instance.getResourceVersion());

    fluent.withUid(instance.getUid());

    this.validationEnabled = validationEnabled; 
  }
  public V1ObjectReferenceBuilder(V1ObjectReference instance) {
    this(instance,false);
  }
  public V1ObjectReferenceBuilder(V1ObjectReference instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withFieldPath(instance.getFieldPath());

    this.withKind(instance.getKind());

    this.withName(instance.getName());

    this.withNamespace(instance.getNamespace());

    this.withResourceVersion(instance.getResourceVersion());

    this.withUid(instance.getUid());

    this.validationEnabled = validationEnabled; 
  }
  V1ObjectReferenceFluent<?> fluent;
  Boolean validationEnabled;
  public V1ObjectReference build() {
    V1ObjectReference buildable = new V1ObjectReference();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setFieldPath(fluent.getFieldPath());
    buildable.setKind(fluent.getKind());
    buildable.setName(fluent.getName());
    buildable.setNamespace(fluent.getNamespace());
    buildable.setResourceVersion(fluent.getResourceVersion());
    buildable.setUid(fluent.getUid());
    return buildable;
  }
  
}
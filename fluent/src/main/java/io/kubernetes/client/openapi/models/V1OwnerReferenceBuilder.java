package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1OwnerReferenceBuilder extends V1OwnerReferenceFluentImpl<V1OwnerReferenceBuilder> implements VisitableBuilder<V1OwnerReference,V1OwnerReferenceBuilder>{
  public V1OwnerReferenceBuilder() {
    this(false);
  }
  public V1OwnerReferenceBuilder(Boolean validationEnabled) {
    this(new V1OwnerReference(), validationEnabled);
  }
  public V1OwnerReferenceBuilder(V1OwnerReferenceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1OwnerReferenceBuilder(V1OwnerReferenceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1OwnerReference(), validationEnabled);
  }
  public V1OwnerReferenceBuilder(V1OwnerReferenceFluent<?> fluent,V1OwnerReference instance) {
    this(fluent, instance, false);
  }
  public V1OwnerReferenceBuilder(V1OwnerReferenceFluent<?> fluent,V1OwnerReference instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withBlockOwnerDeletion(instance.getBlockOwnerDeletion());

    fluent.withController(instance.getController());

    fluent.withKind(instance.getKind());

    fluent.withName(instance.getName());

    fluent.withUid(instance.getUid());

    this.validationEnabled = validationEnabled; 
  }
  public V1OwnerReferenceBuilder(V1OwnerReference instance) {
    this(instance,false);
  }
  public V1OwnerReferenceBuilder(V1OwnerReference instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withBlockOwnerDeletion(instance.getBlockOwnerDeletion());

    this.withController(instance.getController());

    this.withKind(instance.getKind());

    this.withName(instance.getName());

    this.withUid(instance.getUid());

    this.validationEnabled = validationEnabled; 
  }
  V1OwnerReferenceFluent<?> fluent;
  Boolean validationEnabled;
  public V1OwnerReference build() {
    V1OwnerReference buildable = new V1OwnerReference();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setBlockOwnerDeletion(fluent.getBlockOwnerDeletion());
    buildable.setController(fluent.getController());
    buildable.setKind(fluent.getKind());
    buildable.setName(fluent.getName());
    buildable.setUid(fluent.getUid());
    return buildable;
  }
  
}
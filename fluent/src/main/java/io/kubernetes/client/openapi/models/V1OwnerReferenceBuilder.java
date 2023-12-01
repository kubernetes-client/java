package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1OwnerReferenceBuilder extends V1OwnerReferenceFluent<V1OwnerReferenceBuilder> implements VisitableBuilder<V1OwnerReference,V1OwnerReferenceBuilder>{
  public V1OwnerReferenceBuilder() {
    this(new V1OwnerReference());
  }
  
  public V1OwnerReferenceBuilder(V1OwnerReferenceFluent<?> fluent) {
    this(fluent, new V1OwnerReference());
  }
  
  public V1OwnerReferenceBuilder(V1OwnerReferenceFluent<?> fluent,V1OwnerReference instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1OwnerReferenceBuilder(V1OwnerReference instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1OwnerReferenceFluent<?> fluent;
  
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
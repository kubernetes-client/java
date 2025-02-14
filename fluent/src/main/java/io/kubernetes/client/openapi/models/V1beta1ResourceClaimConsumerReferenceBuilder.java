package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta1ResourceClaimConsumerReferenceBuilder extends V1beta1ResourceClaimConsumerReferenceFluent<V1beta1ResourceClaimConsumerReferenceBuilder> implements VisitableBuilder<V1beta1ResourceClaimConsumerReference,V1beta1ResourceClaimConsumerReferenceBuilder>{
  public V1beta1ResourceClaimConsumerReferenceBuilder() {
    this(new V1beta1ResourceClaimConsumerReference());
  }
  
  public V1beta1ResourceClaimConsumerReferenceBuilder(V1beta1ResourceClaimConsumerReferenceFluent<?> fluent) {
    this(fluent, new V1beta1ResourceClaimConsumerReference());
  }
  
  public V1beta1ResourceClaimConsumerReferenceBuilder(V1beta1ResourceClaimConsumerReferenceFluent<?> fluent,V1beta1ResourceClaimConsumerReference instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1ResourceClaimConsumerReferenceBuilder(V1beta1ResourceClaimConsumerReference instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1ResourceClaimConsumerReferenceFluent<?> fluent;
  
  public V1beta1ResourceClaimConsumerReference build() {
    V1beta1ResourceClaimConsumerReference buildable = new V1beta1ResourceClaimConsumerReference();
    buildable.setApiGroup(fluent.getApiGroup());
    buildable.setName(fluent.getName());
    buildable.setResource(fluent.getResource());
    buildable.setUid(fluent.getUid());
    return buildable;
  }
  

}
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta2ResourceClaimConsumerReferenceBuilder extends V1beta2ResourceClaimConsumerReferenceFluent<V1beta2ResourceClaimConsumerReferenceBuilder> implements VisitableBuilder<V1beta2ResourceClaimConsumerReference,V1beta2ResourceClaimConsumerReferenceBuilder>{
  public V1beta2ResourceClaimConsumerReferenceBuilder() {
    this(new V1beta2ResourceClaimConsumerReference());
  }
  
  public V1beta2ResourceClaimConsumerReferenceBuilder(V1beta2ResourceClaimConsumerReferenceFluent<?> fluent) {
    this(fluent, new V1beta2ResourceClaimConsumerReference());
  }
  
  public V1beta2ResourceClaimConsumerReferenceBuilder(V1beta2ResourceClaimConsumerReferenceFluent<?> fluent,V1beta2ResourceClaimConsumerReference instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta2ResourceClaimConsumerReferenceBuilder(V1beta2ResourceClaimConsumerReference instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta2ResourceClaimConsumerReferenceFluent<?> fluent;
  
  public V1beta2ResourceClaimConsumerReference build() {
    V1beta2ResourceClaimConsumerReference buildable = new V1beta2ResourceClaimConsumerReference();
    buildable.setApiGroup(fluent.getApiGroup());
    buildable.setName(fluent.getName());
    buildable.setResource(fluent.getResource());
    buildable.setUid(fluent.getUid());
    return buildable;
  }
  

}
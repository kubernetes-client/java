package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha2ResourceClaimConsumerReferenceBuilder extends V1alpha2ResourceClaimConsumerReferenceFluent<V1alpha2ResourceClaimConsumerReferenceBuilder> implements VisitableBuilder<V1alpha2ResourceClaimConsumerReference,V1alpha2ResourceClaimConsumerReferenceBuilder>{
  public V1alpha2ResourceClaimConsumerReferenceBuilder() {
    this(new V1alpha2ResourceClaimConsumerReference());
  }
  
  public V1alpha2ResourceClaimConsumerReferenceBuilder(V1alpha2ResourceClaimConsumerReferenceFluent<?> fluent) {
    this(fluent, new V1alpha2ResourceClaimConsumerReference());
  }
  
  public V1alpha2ResourceClaimConsumerReferenceBuilder(V1alpha2ResourceClaimConsumerReferenceFluent<?> fluent,V1alpha2ResourceClaimConsumerReference instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha2ResourceClaimConsumerReferenceBuilder(V1alpha2ResourceClaimConsumerReference instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha2ResourceClaimConsumerReferenceFluent<?> fluent;
  
  public V1alpha2ResourceClaimConsumerReference build() {
    V1alpha2ResourceClaimConsumerReference buildable = new V1alpha2ResourceClaimConsumerReference();
    buildable.setApiGroup(fluent.getApiGroup());
    buildable.setName(fluent.getName());
    buildable.setResource(fluent.getResource());
    buildable.setUid(fluent.getUid());
    return buildable;
  }
  

}
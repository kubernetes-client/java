package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha3ResourceClaimConsumerReferenceBuilder extends V1alpha3ResourceClaimConsumerReferenceFluent<V1alpha3ResourceClaimConsumerReferenceBuilder> implements VisitableBuilder<V1alpha3ResourceClaimConsumerReference,V1alpha3ResourceClaimConsumerReferenceBuilder>{
  public V1alpha3ResourceClaimConsumerReferenceBuilder() {
    this(new V1alpha3ResourceClaimConsumerReference());
  }
  
  public V1alpha3ResourceClaimConsumerReferenceBuilder(V1alpha3ResourceClaimConsumerReferenceFluent<?> fluent) {
    this(fluent, new V1alpha3ResourceClaimConsumerReference());
  }
  
  public V1alpha3ResourceClaimConsumerReferenceBuilder(V1alpha3ResourceClaimConsumerReferenceFluent<?> fluent,V1alpha3ResourceClaimConsumerReference instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha3ResourceClaimConsumerReferenceBuilder(V1alpha3ResourceClaimConsumerReference instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha3ResourceClaimConsumerReferenceFluent<?> fluent;
  
  public V1alpha3ResourceClaimConsumerReference build() {
    V1alpha3ResourceClaimConsumerReference buildable = new V1alpha3ResourceClaimConsumerReference();
    buildable.setApiGroup(fluent.getApiGroup());
    buildable.setName(fluent.getName());
    buildable.setResource(fluent.getResource());
    buildable.setUid(fluent.getUid());
    return buildable;
  }
  

}
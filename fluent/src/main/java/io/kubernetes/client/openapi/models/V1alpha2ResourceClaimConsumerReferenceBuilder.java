package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1alpha2ResourceClaimConsumerReferenceBuilder extends V1alpha2ResourceClaimConsumerReferenceFluentImpl<V1alpha2ResourceClaimConsumerReferenceBuilder> implements VisitableBuilder<V1alpha2ResourceClaimConsumerReference,V1alpha2ResourceClaimConsumerReferenceBuilder>{
  public V1alpha2ResourceClaimConsumerReferenceBuilder() {
    this(false);
  }
  public V1alpha2ResourceClaimConsumerReferenceBuilder(Boolean validationEnabled) {
    this(new V1alpha2ResourceClaimConsumerReference(), validationEnabled);
  }
  public V1alpha2ResourceClaimConsumerReferenceBuilder(V1alpha2ResourceClaimConsumerReferenceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1alpha2ResourceClaimConsumerReferenceBuilder(V1alpha2ResourceClaimConsumerReferenceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1alpha2ResourceClaimConsumerReference(), validationEnabled);
  }
  public V1alpha2ResourceClaimConsumerReferenceBuilder(V1alpha2ResourceClaimConsumerReferenceFluent<?> fluent,V1alpha2ResourceClaimConsumerReference instance) {
    this(fluent, instance, false);
  }
  public V1alpha2ResourceClaimConsumerReferenceBuilder(V1alpha2ResourceClaimConsumerReferenceFluent<?> fluent,V1alpha2ResourceClaimConsumerReference instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withApiGroup(instance.getApiGroup());
      fluent.withName(instance.getName());
      fluent.withResource(instance.getResource());
      fluent.withUid(instance.getUid());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1alpha2ResourceClaimConsumerReferenceBuilder(V1alpha2ResourceClaimConsumerReference instance) {
    this(instance,false);
  }
  public V1alpha2ResourceClaimConsumerReferenceBuilder(V1alpha2ResourceClaimConsumerReference instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withApiGroup(instance.getApiGroup());
      this.withName(instance.getName());
      this.withResource(instance.getResource());
      this.withUid(instance.getUid());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1alpha2ResourceClaimConsumerReferenceFluent<?> fluent;
  Boolean validationEnabled;
  public V1alpha2ResourceClaimConsumerReference build() {
    V1alpha2ResourceClaimConsumerReference buildable = new V1alpha2ResourceClaimConsumerReference();
    buildable.setApiGroup(fluent.getApiGroup());
    buildable.setName(fluent.getName());
    buildable.setResource(fluent.getResource());
    buildable.setUid(fluent.getUid());
    return buildable;
  }
  
}
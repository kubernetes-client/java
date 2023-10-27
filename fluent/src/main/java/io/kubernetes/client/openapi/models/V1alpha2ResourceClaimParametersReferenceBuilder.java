package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha2ResourceClaimParametersReferenceBuilder extends V1alpha2ResourceClaimParametersReferenceFluent<V1alpha2ResourceClaimParametersReferenceBuilder> implements VisitableBuilder<V1alpha2ResourceClaimParametersReference,V1alpha2ResourceClaimParametersReferenceBuilder>{
  public V1alpha2ResourceClaimParametersReferenceBuilder() {
    this(new V1alpha2ResourceClaimParametersReference());
  }
  
  public V1alpha2ResourceClaimParametersReferenceBuilder(V1alpha2ResourceClaimParametersReferenceFluent<?> fluent) {
    this(fluent, new V1alpha2ResourceClaimParametersReference());
  }
  
  public V1alpha2ResourceClaimParametersReferenceBuilder(V1alpha2ResourceClaimParametersReferenceFluent<?> fluent,V1alpha2ResourceClaimParametersReference instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha2ResourceClaimParametersReferenceBuilder(V1alpha2ResourceClaimParametersReference instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha2ResourceClaimParametersReferenceFluent<?> fluent;
  
  public V1alpha2ResourceClaimParametersReference build() {
    V1alpha2ResourceClaimParametersReference buildable = new V1alpha2ResourceClaimParametersReference();
    buildable.setApiGroup(fluent.getApiGroup());
    buildable.setKind(fluent.getKind());
    buildable.setName(fluent.getName());
    return buildable;
  }
  

}
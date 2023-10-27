package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha2ResourceClaimBuilder extends V1alpha2ResourceClaimFluent<V1alpha2ResourceClaimBuilder> implements VisitableBuilder<V1alpha2ResourceClaim,V1alpha2ResourceClaimBuilder>{
  public V1alpha2ResourceClaimBuilder() {
    this(new V1alpha2ResourceClaim());
  }
  
  public V1alpha2ResourceClaimBuilder(V1alpha2ResourceClaimFluent<?> fluent) {
    this(fluent, new V1alpha2ResourceClaim());
  }
  
  public V1alpha2ResourceClaimBuilder(V1alpha2ResourceClaimFluent<?> fluent,V1alpha2ResourceClaim instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha2ResourceClaimBuilder(V1alpha2ResourceClaim instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha2ResourceClaimFluent<?> fluent;
  
  public V1alpha2ResourceClaim build() {
    V1alpha2ResourceClaim buildable = new V1alpha2ResourceClaim();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  

}
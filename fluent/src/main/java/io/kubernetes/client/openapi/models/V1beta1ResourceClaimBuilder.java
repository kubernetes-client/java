package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta1ResourceClaimBuilder extends V1beta1ResourceClaimFluent<V1beta1ResourceClaimBuilder> implements VisitableBuilder<V1beta1ResourceClaim,V1beta1ResourceClaimBuilder>{
  public V1beta1ResourceClaimBuilder() {
    this(new V1beta1ResourceClaim());
  }
  
  public V1beta1ResourceClaimBuilder(V1beta1ResourceClaimFluent<?> fluent) {
    this(fluent, new V1beta1ResourceClaim());
  }
  
  public V1beta1ResourceClaimBuilder(V1beta1ResourceClaimFluent<?> fluent,V1beta1ResourceClaim instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1ResourceClaimBuilder(V1beta1ResourceClaim instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1ResourceClaimFluent<?> fluent;
  
  public V1beta1ResourceClaim build() {
    V1beta1ResourceClaim buildable = new V1beta1ResourceClaim();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  

}
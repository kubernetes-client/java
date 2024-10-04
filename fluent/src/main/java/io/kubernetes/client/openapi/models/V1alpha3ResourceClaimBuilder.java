package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha3ResourceClaimBuilder extends V1alpha3ResourceClaimFluent<V1alpha3ResourceClaimBuilder> implements VisitableBuilder<V1alpha3ResourceClaim,V1alpha3ResourceClaimBuilder>{
  public V1alpha3ResourceClaimBuilder() {
    this(new V1alpha3ResourceClaim());
  }
  
  public V1alpha3ResourceClaimBuilder(V1alpha3ResourceClaimFluent<?> fluent) {
    this(fluent, new V1alpha3ResourceClaim());
  }
  
  public V1alpha3ResourceClaimBuilder(V1alpha3ResourceClaimFluent<?> fluent,V1alpha3ResourceClaim instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha3ResourceClaimBuilder(V1alpha3ResourceClaim instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha3ResourceClaimFluent<?> fluent;
  
  public V1alpha3ResourceClaim build() {
    V1alpha3ResourceClaim buildable = new V1alpha3ResourceClaim();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  

}
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1beta2ResourceClaimBuilder extends V1beta2ResourceClaimFluent<V1beta2ResourceClaimBuilder> implements VisitableBuilder<V1beta2ResourceClaim,V1beta2ResourceClaimBuilder>{

  V1beta2ResourceClaimFluent<?> fluent;

  public V1beta2ResourceClaimBuilder() {
    this(new V1beta2ResourceClaim());
  }
  
  public V1beta2ResourceClaimBuilder(V1beta2ResourceClaimFluent<?> fluent) {
    this(fluent, new V1beta2ResourceClaim());
  }
  
  public V1beta2ResourceClaimBuilder(V1beta2ResourceClaim instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta2ResourceClaimBuilder(V1beta2ResourceClaimFluent<?> fluent,V1beta2ResourceClaim instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta2ResourceClaim build() {
    V1beta2ResourceClaim buildable = new V1beta2ResourceClaim();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  
}
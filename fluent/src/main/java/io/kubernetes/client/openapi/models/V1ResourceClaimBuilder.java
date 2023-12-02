package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ResourceClaimBuilder extends V1ResourceClaimFluent<V1ResourceClaimBuilder> implements VisitableBuilder<V1ResourceClaim,V1ResourceClaimBuilder>{
  public V1ResourceClaimBuilder() {
    this(new V1ResourceClaim());
  }
  
  public V1ResourceClaimBuilder(V1ResourceClaimFluent<?> fluent) {
    this(fluent, new V1ResourceClaim());
  }
  
  public V1ResourceClaimBuilder(V1ResourceClaimFluent<?> fluent,V1ResourceClaim instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ResourceClaimBuilder(V1ResourceClaim instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ResourceClaimFluent<?> fluent;
  
  public V1ResourceClaim build() {
    V1ResourceClaim buildable = new V1ResourceClaim();
    buildable.setName(fluent.getName());
    return buildable;
  }
  

}
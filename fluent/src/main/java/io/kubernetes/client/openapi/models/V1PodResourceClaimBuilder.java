package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1PodResourceClaimBuilder extends V1PodResourceClaimFluent<V1PodResourceClaimBuilder> implements VisitableBuilder<V1PodResourceClaim,V1PodResourceClaimBuilder>{
  public V1PodResourceClaimBuilder() {
    this(new V1PodResourceClaim());
  }
  
  public V1PodResourceClaimBuilder(V1PodResourceClaimFluent<?> fluent) {
    this(fluent, new V1PodResourceClaim());
  }
  
  public V1PodResourceClaimBuilder(V1PodResourceClaimFluent<?> fluent,V1PodResourceClaim instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1PodResourceClaimBuilder(V1PodResourceClaim instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1PodResourceClaimFluent<?> fluent;
  
  public V1PodResourceClaim build() {
    V1PodResourceClaim buildable = new V1PodResourceClaim();
    buildable.setName(fluent.getName());
    buildable.setSource(fluent.buildSource());
    return buildable;
  }
  

}
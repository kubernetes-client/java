package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1PodResourceClaimStatusBuilder extends V1PodResourceClaimStatusFluent<V1PodResourceClaimStatusBuilder> implements VisitableBuilder<V1PodResourceClaimStatus,V1PodResourceClaimStatusBuilder>{
  public V1PodResourceClaimStatusBuilder() {
    this(new V1PodResourceClaimStatus());
  }
  
  public V1PodResourceClaimStatusBuilder(V1PodResourceClaimStatusFluent<?> fluent) {
    this(fluent, new V1PodResourceClaimStatus());
  }
  
  public V1PodResourceClaimStatusBuilder(V1PodResourceClaimStatusFluent<?> fluent,V1PodResourceClaimStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1PodResourceClaimStatusBuilder(V1PodResourceClaimStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1PodResourceClaimStatusFluent<?> fluent;
  
  public V1PodResourceClaimStatus build() {
    V1PodResourceClaimStatus buildable = new V1PodResourceClaimStatus();
    buildable.setName(fluent.getName());
    buildable.setResourceClaimName(fluent.getResourceClaimName());
    return buildable;
  }
  

}
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha2ResourceClaimStatusBuilder extends V1alpha2ResourceClaimStatusFluent<V1alpha2ResourceClaimStatusBuilder> implements VisitableBuilder<V1alpha2ResourceClaimStatus,V1alpha2ResourceClaimStatusBuilder>{
  public V1alpha2ResourceClaimStatusBuilder() {
    this(new V1alpha2ResourceClaimStatus());
  }
  
  public V1alpha2ResourceClaimStatusBuilder(V1alpha2ResourceClaimStatusFluent<?> fluent) {
    this(fluent, new V1alpha2ResourceClaimStatus());
  }
  
  public V1alpha2ResourceClaimStatusBuilder(V1alpha2ResourceClaimStatusFluent<?> fluent,V1alpha2ResourceClaimStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha2ResourceClaimStatusBuilder(V1alpha2ResourceClaimStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha2ResourceClaimStatusFluent<?> fluent;
  
  public V1alpha2ResourceClaimStatus build() {
    V1alpha2ResourceClaimStatus buildable = new V1alpha2ResourceClaimStatus();
    buildable.setAllocation(fluent.buildAllocation());
    buildable.setDeallocationRequested(fluent.getDeallocationRequested());
    buildable.setDriverName(fluent.getDriverName());
    buildable.setReservedFor(fluent.buildReservedFor());
    return buildable;
  }
  

}
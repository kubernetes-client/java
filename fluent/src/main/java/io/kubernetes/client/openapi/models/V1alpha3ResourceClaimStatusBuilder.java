package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha3ResourceClaimStatusBuilder extends V1alpha3ResourceClaimStatusFluent<V1alpha3ResourceClaimStatusBuilder> implements VisitableBuilder<V1alpha3ResourceClaimStatus,V1alpha3ResourceClaimStatusBuilder>{
  public V1alpha3ResourceClaimStatusBuilder() {
    this(new V1alpha3ResourceClaimStatus());
  }
  
  public V1alpha3ResourceClaimStatusBuilder(V1alpha3ResourceClaimStatusFluent<?> fluent) {
    this(fluent, new V1alpha3ResourceClaimStatus());
  }
  
  public V1alpha3ResourceClaimStatusBuilder(V1alpha3ResourceClaimStatusFluent<?> fluent,V1alpha3ResourceClaimStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha3ResourceClaimStatusBuilder(V1alpha3ResourceClaimStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha3ResourceClaimStatusFluent<?> fluent;
  
  public V1alpha3ResourceClaimStatus build() {
    V1alpha3ResourceClaimStatus buildable = new V1alpha3ResourceClaimStatus();
    buildable.setAllocation(fluent.buildAllocation());
    buildable.setDeallocationRequested(fluent.getDeallocationRequested());
    buildable.setReservedFor(fluent.buildReservedFor());
    return buildable;
  }
  

}
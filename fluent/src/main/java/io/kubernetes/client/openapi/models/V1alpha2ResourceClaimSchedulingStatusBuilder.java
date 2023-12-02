package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha2ResourceClaimSchedulingStatusBuilder extends V1alpha2ResourceClaimSchedulingStatusFluent<V1alpha2ResourceClaimSchedulingStatusBuilder> implements VisitableBuilder<V1alpha2ResourceClaimSchedulingStatus,V1alpha2ResourceClaimSchedulingStatusBuilder>{
  public V1alpha2ResourceClaimSchedulingStatusBuilder() {
    this(new V1alpha2ResourceClaimSchedulingStatus());
  }
  
  public V1alpha2ResourceClaimSchedulingStatusBuilder(V1alpha2ResourceClaimSchedulingStatusFluent<?> fluent) {
    this(fluent, new V1alpha2ResourceClaimSchedulingStatus());
  }
  
  public V1alpha2ResourceClaimSchedulingStatusBuilder(V1alpha2ResourceClaimSchedulingStatusFluent<?> fluent,V1alpha2ResourceClaimSchedulingStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha2ResourceClaimSchedulingStatusBuilder(V1alpha2ResourceClaimSchedulingStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha2ResourceClaimSchedulingStatusFluent<?> fluent;
  
  public V1alpha2ResourceClaimSchedulingStatus build() {
    V1alpha2ResourceClaimSchedulingStatus buildable = new V1alpha2ResourceClaimSchedulingStatus();
    buildable.setName(fluent.getName());
    buildable.setUnsuitableNodes(fluent.getUnsuitableNodes());
    return buildable;
  }
  

}
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta1ResourceClaimStatusBuilder extends V1beta1ResourceClaimStatusFluent<V1beta1ResourceClaimStatusBuilder> implements VisitableBuilder<V1beta1ResourceClaimStatus,V1beta1ResourceClaimStatusBuilder>{
  public V1beta1ResourceClaimStatusBuilder() {
    this(new V1beta1ResourceClaimStatus());
  }
  
  public V1beta1ResourceClaimStatusBuilder(V1beta1ResourceClaimStatusFluent<?> fluent) {
    this(fluent, new V1beta1ResourceClaimStatus());
  }
  
  public V1beta1ResourceClaimStatusBuilder(V1beta1ResourceClaimStatusFluent<?> fluent,V1beta1ResourceClaimStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1ResourceClaimStatusBuilder(V1beta1ResourceClaimStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1ResourceClaimStatusFluent<?> fluent;
  
  public V1beta1ResourceClaimStatus build() {
    V1beta1ResourceClaimStatus buildable = new V1beta1ResourceClaimStatus();
    buildable.setAllocation(fluent.buildAllocation());
    buildable.setDevices(fluent.buildDevices());
    buildable.setReservedFor(fluent.buildReservedFor());
    return buildable;
  }
  

}
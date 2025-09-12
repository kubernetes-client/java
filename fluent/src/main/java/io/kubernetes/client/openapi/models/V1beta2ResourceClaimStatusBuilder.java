package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1beta2ResourceClaimStatusBuilder extends V1beta2ResourceClaimStatusFluent<V1beta2ResourceClaimStatusBuilder> implements VisitableBuilder<V1beta2ResourceClaimStatus,V1beta2ResourceClaimStatusBuilder>{
  public V1beta2ResourceClaimStatusBuilder() {
    this(new V1beta2ResourceClaimStatus());
  }
  
  public V1beta2ResourceClaimStatusBuilder(V1beta2ResourceClaimStatusFluent<?> fluent) {
    this(fluent, new V1beta2ResourceClaimStatus());
  }
  
  public V1beta2ResourceClaimStatusBuilder(V1beta2ResourceClaimStatusFluent<?> fluent,V1beta2ResourceClaimStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta2ResourceClaimStatusBuilder(V1beta2ResourceClaimStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta2ResourceClaimStatusFluent<?> fluent;
  
  public V1beta2ResourceClaimStatus build() {
    V1beta2ResourceClaimStatus buildable = new V1beta2ResourceClaimStatus();
    buildable.setAllocation(fluent.buildAllocation());
    buildable.setDevices(fluent.buildDevices());
    buildable.setReservedFor(fluent.buildReservedFor());
    return buildable;
  }
  

}
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1ResourceClaimStatusBuilder extends V1ResourceClaimStatusFluent<V1ResourceClaimStatusBuilder> implements VisitableBuilder<V1ResourceClaimStatus,V1ResourceClaimStatusBuilder>{

  V1ResourceClaimStatusFluent<?> fluent;

  public V1ResourceClaimStatusBuilder() {
    this(new V1ResourceClaimStatus());
  }
  
  public V1ResourceClaimStatusBuilder(V1ResourceClaimStatusFluent<?> fluent) {
    this(fluent, new V1ResourceClaimStatus());
  }
  
  public V1ResourceClaimStatusBuilder(V1ResourceClaimStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ResourceClaimStatusBuilder(V1ResourceClaimStatusFluent<?> fluent,V1ResourceClaimStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ResourceClaimStatus build() {
    V1ResourceClaimStatus buildable = new V1ResourceClaimStatus();
    buildable.setAllocation(fluent.buildAllocation());
    buildable.setDevices(fluent.buildDevices());
    buildable.setReservedFor(fluent.buildReservedFor());
    return buildable;
  }
  
}
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1beta2AllocationResultBuilder extends V1beta2AllocationResultFluent<V1beta2AllocationResultBuilder> implements VisitableBuilder<V1beta2AllocationResult,V1beta2AllocationResultBuilder>{

  V1beta2AllocationResultFluent<?> fluent;

  public V1beta2AllocationResultBuilder() {
    this(new V1beta2AllocationResult());
  }
  
  public V1beta2AllocationResultBuilder(V1beta2AllocationResultFluent<?> fluent) {
    this(fluent, new V1beta2AllocationResult());
  }
  
  public V1beta2AllocationResultBuilder(V1beta2AllocationResult instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta2AllocationResultBuilder(V1beta2AllocationResultFluent<?> fluent,V1beta2AllocationResult instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta2AllocationResult build() {
    V1beta2AllocationResult buildable = new V1beta2AllocationResult();
    buildable.setAllocationTimestamp(fluent.getAllocationTimestamp());
    buildable.setDevices(fluent.buildDevices());
    buildable.setNodeSelector(fluent.buildNodeSelector());
    return buildable;
  }
  
}
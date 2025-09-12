package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1AllocationResultBuilder extends V1AllocationResultFluent<V1AllocationResultBuilder> implements VisitableBuilder<V1AllocationResult,V1AllocationResultBuilder>{
  public V1AllocationResultBuilder() {
    this(new V1AllocationResult());
  }
  
  public V1AllocationResultBuilder(V1AllocationResultFluent<?> fluent) {
    this(fluent, new V1AllocationResult());
  }
  
  public V1AllocationResultBuilder(V1AllocationResultFluent<?> fluent,V1AllocationResult instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1AllocationResultBuilder(V1AllocationResult instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1AllocationResultFluent<?> fluent;
  
  public V1AllocationResult build() {
    V1AllocationResult buildable = new V1AllocationResult();
    buildable.setAllocationTimestamp(fluent.getAllocationTimestamp());
    buildable.setDevices(fluent.buildDevices());
    buildable.setNodeSelector(fluent.buildNodeSelector());
    return buildable;
  }
  

}
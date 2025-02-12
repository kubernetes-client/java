package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta1AllocationResultBuilder extends V1beta1AllocationResultFluent<V1beta1AllocationResultBuilder> implements VisitableBuilder<V1beta1AllocationResult,V1beta1AllocationResultBuilder>{
  public V1beta1AllocationResultBuilder() {
    this(new V1beta1AllocationResult());
  }
  
  public V1beta1AllocationResultBuilder(V1beta1AllocationResultFluent<?> fluent) {
    this(fluent, new V1beta1AllocationResult());
  }
  
  public V1beta1AllocationResultBuilder(V1beta1AllocationResultFluent<?> fluent,V1beta1AllocationResult instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1AllocationResultBuilder(V1beta1AllocationResult instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1AllocationResultFluent<?> fluent;
  
  public V1beta1AllocationResult build() {
    V1beta1AllocationResult buildable = new V1beta1AllocationResult();
    buildable.setDevices(fluent.buildDevices());
    buildable.setNodeSelector(fluent.buildNodeSelector());
    return buildable;
  }
  

}
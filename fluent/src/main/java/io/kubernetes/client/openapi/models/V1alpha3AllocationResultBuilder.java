package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha3AllocationResultBuilder extends V1alpha3AllocationResultFluent<V1alpha3AllocationResultBuilder> implements VisitableBuilder<V1alpha3AllocationResult,V1alpha3AllocationResultBuilder>{
  public V1alpha3AllocationResultBuilder() {
    this(new V1alpha3AllocationResult());
  }
  
  public V1alpha3AllocationResultBuilder(V1alpha3AllocationResultFluent<?> fluent) {
    this(fluent, new V1alpha3AllocationResult());
  }
  
  public V1alpha3AllocationResultBuilder(V1alpha3AllocationResultFluent<?> fluent,V1alpha3AllocationResult instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha3AllocationResultBuilder(V1alpha3AllocationResult instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha3AllocationResultFluent<?> fluent;
  
  public V1alpha3AllocationResult build() {
    V1alpha3AllocationResult buildable = new V1alpha3AllocationResult();
    buildable.setController(fluent.getController());
    buildable.setDevices(fluent.buildDevices());
    buildable.setNodeSelector(fluent.buildNodeSelector());
    return buildable;
  }
  

}
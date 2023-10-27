package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha2AllocationResultBuilder extends V1alpha2AllocationResultFluent<V1alpha2AllocationResultBuilder> implements VisitableBuilder<V1alpha2AllocationResult,V1alpha2AllocationResultBuilder>{
  public V1alpha2AllocationResultBuilder() {
    this(new V1alpha2AllocationResult());
  }
  
  public V1alpha2AllocationResultBuilder(V1alpha2AllocationResultFluent<?> fluent) {
    this(fluent, new V1alpha2AllocationResult());
  }
  
  public V1alpha2AllocationResultBuilder(V1alpha2AllocationResultFluent<?> fluent,V1alpha2AllocationResult instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha2AllocationResultBuilder(V1alpha2AllocationResult instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha2AllocationResultFluent<?> fluent;
  
  public V1alpha2AllocationResult build() {
    V1alpha2AllocationResult buildable = new V1alpha2AllocationResult();
    buildable.setAvailableOnNodes(fluent.buildAvailableOnNodes());
    buildable.setResourceHandles(fluent.buildResourceHandles());
    buildable.setShareable(fluent.getShareable());
    return buildable;
  }
  

}
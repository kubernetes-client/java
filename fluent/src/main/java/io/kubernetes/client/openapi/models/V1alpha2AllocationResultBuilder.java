package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1alpha2AllocationResultBuilder extends V1alpha2AllocationResultFluentImpl<V1alpha2AllocationResultBuilder> implements VisitableBuilder<V1alpha2AllocationResult,V1alpha2AllocationResultBuilder>{
  public V1alpha2AllocationResultBuilder() {
    this(false);
  }
  public V1alpha2AllocationResultBuilder(Boolean validationEnabled) {
    this(new V1alpha2AllocationResult(), validationEnabled);
  }
  public V1alpha2AllocationResultBuilder(V1alpha2AllocationResultFluent<?> fluent) {
    this(fluent, false);
  }
  public V1alpha2AllocationResultBuilder(V1alpha2AllocationResultFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1alpha2AllocationResult(), validationEnabled);
  }
  public V1alpha2AllocationResultBuilder(V1alpha2AllocationResultFluent<?> fluent,V1alpha2AllocationResult instance) {
    this(fluent, instance, false);
  }
  public V1alpha2AllocationResultBuilder(V1alpha2AllocationResultFluent<?> fluent,V1alpha2AllocationResult instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withAvailableOnNodes(instance.getAvailableOnNodes());
      fluent.withResourceHandles(instance.getResourceHandles());
      fluent.withShareable(instance.getShareable());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1alpha2AllocationResultBuilder(V1alpha2AllocationResult instance) {
    this(instance,false);
  }
  public V1alpha2AllocationResultBuilder(V1alpha2AllocationResult instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withAvailableOnNodes(instance.getAvailableOnNodes());
      this.withResourceHandles(instance.getResourceHandles());
      this.withShareable(instance.getShareable());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1alpha2AllocationResultFluent<?> fluent;
  Boolean validationEnabled;
  public V1alpha2AllocationResult build() {
    V1alpha2AllocationResult buildable = new V1alpha2AllocationResult();
    buildable.setAvailableOnNodes(fluent.getAvailableOnNodes());
    buildable.setResourceHandles(fluent.getResourceHandles());
    buildable.setShareable(fluent.getShareable());
    return buildable;
  }
  
}
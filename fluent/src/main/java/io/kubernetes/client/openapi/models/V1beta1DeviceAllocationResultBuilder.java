package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta1DeviceAllocationResultBuilder extends V1beta1DeviceAllocationResultFluent<V1beta1DeviceAllocationResultBuilder> implements VisitableBuilder<V1beta1DeviceAllocationResult,V1beta1DeviceAllocationResultBuilder>{
  public V1beta1DeviceAllocationResultBuilder() {
    this(new V1beta1DeviceAllocationResult());
  }
  
  public V1beta1DeviceAllocationResultBuilder(V1beta1DeviceAllocationResultFluent<?> fluent) {
    this(fluent, new V1beta1DeviceAllocationResult());
  }
  
  public V1beta1DeviceAllocationResultBuilder(V1beta1DeviceAllocationResultFluent<?> fluent,V1beta1DeviceAllocationResult instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1DeviceAllocationResultBuilder(V1beta1DeviceAllocationResult instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1DeviceAllocationResultFluent<?> fluent;
  
  public V1beta1DeviceAllocationResult build() {
    V1beta1DeviceAllocationResult buildable = new V1beta1DeviceAllocationResult();
    buildable.setConfig(fluent.buildConfig());
    buildable.setResults(fluent.buildResults());
    return buildable;
  }
  

}
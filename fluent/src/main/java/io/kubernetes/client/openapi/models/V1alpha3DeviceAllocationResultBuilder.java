package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha3DeviceAllocationResultBuilder extends V1alpha3DeviceAllocationResultFluent<V1alpha3DeviceAllocationResultBuilder> implements VisitableBuilder<V1alpha3DeviceAllocationResult,V1alpha3DeviceAllocationResultBuilder>{
  public V1alpha3DeviceAllocationResultBuilder() {
    this(new V1alpha3DeviceAllocationResult());
  }
  
  public V1alpha3DeviceAllocationResultBuilder(V1alpha3DeviceAllocationResultFluent<?> fluent) {
    this(fluent, new V1alpha3DeviceAllocationResult());
  }
  
  public V1alpha3DeviceAllocationResultBuilder(V1alpha3DeviceAllocationResultFluent<?> fluent,V1alpha3DeviceAllocationResult instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha3DeviceAllocationResultBuilder(V1alpha3DeviceAllocationResult instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha3DeviceAllocationResultFluent<?> fluent;
  
  public V1alpha3DeviceAllocationResult build() {
    V1alpha3DeviceAllocationResult buildable = new V1alpha3DeviceAllocationResult();
    buildable.setConfig(fluent.buildConfig());
    buildable.setResults(fluent.buildResults());
    return buildable;
  }
  

}
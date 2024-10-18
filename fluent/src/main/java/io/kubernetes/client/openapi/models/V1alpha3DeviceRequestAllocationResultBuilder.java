package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha3DeviceRequestAllocationResultBuilder extends V1alpha3DeviceRequestAllocationResultFluent<V1alpha3DeviceRequestAllocationResultBuilder> implements VisitableBuilder<V1alpha3DeviceRequestAllocationResult,V1alpha3DeviceRequestAllocationResultBuilder>{
  public V1alpha3DeviceRequestAllocationResultBuilder() {
    this(new V1alpha3DeviceRequestAllocationResult());
  }
  
  public V1alpha3DeviceRequestAllocationResultBuilder(V1alpha3DeviceRequestAllocationResultFluent<?> fluent) {
    this(fluent, new V1alpha3DeviceRequestAllocationResult());
  }
  
  public V1alpha3DeviceRequestAllocationResultBuilder(V1alpha3DeviceRequestAllocationResultFluent<?> fluent,V1alpha3DeviceRequestAllocationResult instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha3DeviceRequestAllocationResultBuilder(V1alpha3DeviceRequestAllocationResult instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha3DeviceRequestAllocationResultFluent<?> fluent;
  
  public V1alpha3DeviceRequestAllocationResult build() {
    V1alpha3DeviceRequestAllocationResult buildable = new V1alpha3DeviceRequestAllocationResult();
    buildable.setDevice(fluent.getDevice());
    buildable.setDriver(fluent.getDriver());
    buildable.setPool(fluent.getPool());
    buildable.setRequest(fluent.getRequest());
    return buildable;
  }
  

}
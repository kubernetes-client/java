package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta2DeviceRequestAllocationResultBuilder extends V1beta2DeviceRequestAllocationResultFluent<V1beta2DeviceRequestAllocationResultBuilder> implements VisitableBuilder<V1beta2DeviceRequestAllocationResult,V1beta2DeviceRequestAllocationResultBuilder>{
  public V1beta2DeviceRequestAllocationResultBuilder() {
    this(new V1beta2DeviceRequestAllocationResult());
  }
  
  public V1beta2DeviceRequestAllocationResultBuilder(V1beta2DeviceRequestAllocationResultFluent<?> fluent) {
    this(fluent, new V1beta2DeviceRequestAllocationResult());
  }
  
  public V1beta2DeviceRequestAllocationResultBuilder(V1beta2DeviceRequestAllocationResultFluent<?> fluent,V1beta2DeviceRequestAllocationResult instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta2DeviceRequestAllocationResultBuilder(V1beta2DeviceRequestAllocationResult instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta2DeviceRequestAllocationResultFluent<?> fluent;
  
  public V1beta2DeviceRequestAllocationResult build() {
    V1beta2DeviceRequestAllocationResult buildable = new V1beta2DeviceRequestAllocationResult();
    buildable.setAdminAccess(fluent.getAdminAccess());
    buildable.setDevice(fluent.getDevice());
    buildable.setDriver(fluent.getDriver());
    buildable.setPool(fluent.getPool());
    buildable.setRequest(fluent.getRequest());
    buildable.setTolerations(fluent.buildTolerations());
    return buildable;
  }
  

}
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta1AllocatedDeviceStatusBuilder extends V1beta1AllocatedDeviceStatusFluent<V1beta1AllocatedDeviceStatusBuilder> implements VisitableBuilder<V1beta1AllocatedDeviceStatus,V1beta1AllocatedDeviceStatusBuilder>{
  public V1beta1AllocatedDeviceStatusBuilder() {
    this(new V1beta1AllocatedDeviceStatus());
  }
  
  public V1beta1AllocatedDeviceStatusBuilder(V1beta1AllocatedDeviceStatusFluent<?> fluent) {
    this(fluent, new V1beta1AllocatedDeviceStatus());
  }
  
  public V1beta1AllocatedDeviceStatusBuilder(V1beta1AllocatedDeviceStatusFluent<?> fluent,V1beta1AllocatedDeviceStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1AllocatedDeviceStatusBuilder(V1beta1AllocatedDeviceStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1AllocatedDeviceStatusFluent<?> fluent;
  
  public V1beta1AllocatedDeviceStatus build() {
    V1beta1AllocatedDeviceStatus buildable = new V1beta1AllocatedDeviceStatus();
    buildable.setConditions(fluent.buildConditions());
    buildable.setData(fluent.getData());
    buildable.setDevice(fluent.getDevice());
    buildable.setDriver(fluent.getDriver());
    buildable.setNetworkData(fluent.buildNetworkData());
    buildable.setPool(fluent.getPool());
    return buildable;
  }
  

}
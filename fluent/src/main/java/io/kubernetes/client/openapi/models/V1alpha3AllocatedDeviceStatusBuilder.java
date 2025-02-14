package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha3AllocatedDeviceStatusBuilder extends V1alpha3AllocatedDeviceStatusFluent<V1alpha3AllocatedDeviceStatusBuilder> implements VisitableBuilder<V1alpha3AllocatedDeviceStatus,V1alpha3AllocatedDeviceStatusBuilder>{
  public V1alpha3AllocatedDeviceStatusBuilder() {
    this(new V1alpha3AllocatedDeviceStatus());
  }
  
  public V1alpha3AllocatedDeviceStatusBuilder(V1alpha3AllocatedDeviceStatusFluent<?> fluent) {
    this(fluent, new V1alpha3AllocatedDeviceStatus());
  }
  
  public V1alpha3AllocatedDeviceStatusBuilder(V1alpha3AllocatedDeviceStatusFluent<?> fluent,V1alpha3AllocatedDeviceStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha3AllocatedDeviceStatusBuilder(V1alpha3AllocatedDeviceStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha3AllocatedDeviceStatusFluent<?> fluent;
  
  public V1alpha3AllocatedDeviceStatus build() {
    V1alpha3AllocatedDeviceStatus buildable = new V1alpha3AllocatedDeviceStatus();
    buildable.setConditions(fluent.buildConditions());
    buildable.setData(fluent.getData());
    buildable.setDevice(fluent.getDevice());
    buildable.setDriver(fluent.getDriver());
    buildable.setNetworkData(fluent.buildNetworkData());
    buildable.setPool(fluent.getPool());
    return buildable;
  }
  

}
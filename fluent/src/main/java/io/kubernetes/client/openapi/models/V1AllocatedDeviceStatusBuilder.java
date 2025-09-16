package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1AllocatedDeviceStatusBuilder extends V1AllocatedDeviceStatusFluent<V1AllocatedDeviceStatusBuilder> implements VisitableBuilder<V1AllocatedDeviceStatus,V1AllocatedDeviceStatusBuilder>{
  public V1AllocatedDeviceStatusBuilder() {
    this(new V1AllocatedDeviceStatus());
  }
  
  public V1AllocatedDeviceStatusBuilder(V1AllocatedDeviceStatusFluent<?> fluent) {
    this(fluent, new V1AllocatedDeviceStatus());
  }
  
  public V1AllocatedDeviceStatusBuilder(V1AllocatedDeviceStatusFluent<?> fluent,V1AllocatedDeviceStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1AllocatedDeviceStatusBuilder(V1AllocatedDeviceStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1AllocatedDeviceStatusFluent<?> fluent;
  
  public V1AllocatedDeviceStatus build() {
    V1AllocatedDeviceStatus buildable = new V1AllocatedDeviceStatus();
    buildable.setConditions(fluent.buildConditions());
    buildable.setData(fluent.getData());
    buildable.setDevice(fluent.getDevice());
    buildable.setDriver(fluent.getDriver());
    buildable.setNetworkData(fluent.buildNetworkData());
    buildable.setPool(fluent.getPool());
    buildable.setShareID(fluent.getShareID());
    return buildable;
  }
  

}
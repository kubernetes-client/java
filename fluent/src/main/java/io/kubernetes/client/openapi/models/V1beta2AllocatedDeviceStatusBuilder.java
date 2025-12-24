package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1beta2AllocatedDeviceStatusBuilder extends V1beta2AllocatedDeviceStatusFluent<V1beta2AllocatedDeviceStatusBuilder> implements VisitableBuilder<V1beta2AllocatedDeviceStatus,V1beta2AllocatedDeviceStatusBuilder>{

  V1beta2AllocatedDeviceStatusFluent<?> fluent;

  public V1beta2AllocatedDeviceStatusBuilder() {
    this(new V1beta2AllocatedDeviceStatus());
  }
  
  public V1beta2AllocatedDeviceStatusBuilder(V1beta2AllocatedDeviceStatusFluent<?> fluent) {
    this(fluent, new V1beta2AllocatedDeviceStatus());
  }
  
  public V1beta2AllocatedDeviceStatusBuilder(V1beta2AllocatedDeviceStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta2AllocatedDeviceStatusBuilder(V1beta2AllocatedDeviceStatusFluent<?> fluent,V1beta2AllocatedDeviceStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta2AllocatedDeviceStatus build() {
    V1beta2AllocatedDeviceStatus buildable = new V1beta2AllocatedDeviceStatus();
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
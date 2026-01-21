package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1NetworkDeviceDataBuilder extends V1NetworkDeviceDataFluent<V1NetworkDeviceDataBuilder> implements VisitableBuilder<V1NetworkDeviceData,V1NetworkDeviceDataBuilder>{

  V1NetworkDeviceDataFluent<?> fluent;

  public V1NetworkDeviceDataBuilder() {
    this(new V1NetworkDeviceData());
  }
  
  public V1NetworkDeviceDataBuilder(V1NetworkDeviceDataFluent<?> fluent) {
    this(fluent, new V1NetworkDeviceData());
  }
  
  public V1NetworkDeviceDataBuilder(V1NetworkDeviceData instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1NetworkDeviceDataBuilder(V1NetworkDeviceDataFluent<?> fluent,V1NetworkDeviceData instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1NetworkDeviceData build() {
    V1NetworkDeviceData buildable = new V1NetworkDeviceData();
    buildable.setHardwareAddress(fluent.getHardwareAddress());
    buildable.setInterfaceName(fluent.getInterfaceName());
    buildable.setIps(fluent.getIps());
    return buildable;
  }
  
}
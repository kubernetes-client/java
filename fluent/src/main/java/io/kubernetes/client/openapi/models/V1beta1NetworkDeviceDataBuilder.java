package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta1NetworkDeviceDataBuilder extends V1beta1NetworkDeviceDataFluent<V1beta1NetworkDeviceDataBuilder> implements VisitableBuilder<V1beta1NetworkDeviceData,V1beta1NetworkDeviceDataBuilder>{
  public V1beta1NetworkDeviceDataBuilder() {
    this(new V1beta1NetworkDeviceData());
  }
  
  public V1beta1NetworkDeviceDataBuilder(V1beta1NetworkDeviceDataFluent<?> fluent) {
    this(fluent, new V1beta1NetworkDeviceData());
  }
  
  public V1beta1NetworkDeviceDataBuilder(V1beta1NetworkDeviceDataFluent<?> fluent,V1beta1NetworkDeviceData instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1NetworkDeviceDataBuilder(V1beta1NetworkDeviceData instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1NetworkDeviceDataFluent<?> fluent;
  
  public V1beta1NetworkDeviceData build() {
    V1beta1NetworkDeviceData buildable = new V1beta1NetworkDeviceData();
    buildable.setHardwareAddress(fluent.getHardwareAddress());
    buildable.setInterfaceName(fluent.getInterfaceName());
    buildable.setIps(fluent.getIps());
    return buildable;
  }
  

}
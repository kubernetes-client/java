package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta2NetworkDeviceDataBuilder extends V1beta2NetworkDeviceDataFluent<V1beta2NetworkDeviceDataBuilder> implements VisitableBuilder<V1beta2NetworkDeviceData,V1beta2NetworkDeviceDataBuilder>{
  public V1beta2NetworkDeviceDataBuilder() {
    this(new V1beta2NetworkDeviceData());
  }
  
  public V1beta2NetworkDeviceDataBuilder(V1beta2NetworkDeviceDataFluent<?> fluent) {
    this(fluent, new V1beta2NetworkDeviceData());
  }
  
  public V1beta2NetworkDeviceDataBuilder(V1beta2NetworkDeviceDataFluent<?> fluent,V1beta2NetworkDeviceData instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta2NetworkDeviceDataBuilder(V1beta2NetworkDeviceData instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta2NetworkDeviceDataFluent<?> fluent;
  
  public V1beta2NetworkDeviceData build() {
    V1beta2NetworkDeviceData buildable = new V1beta2NetworkDeviceData();
    buildable.setHardwareAddress(fluent.getHardwareAddress());
    buildable.setInterfaceName(fluent.getInterfaceName());
    buildable.setIps(fluent.getIps());
    return buildable;
  }
  

}
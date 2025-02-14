package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha3NetworkDeviceDataBuilder extends V1alpha3NetworkDeviceDataFluent<V1alpha3NetworkDeviceDataBuilder> implements VisitableBuilder<V1alpha3NetworkDeviceData,V1alpha3NetworkDeviceDataBuilder>{
  public V1alpha3NetworkDeviceDataBuilder() {
    this(new V1alpha3NetworkDeviceData());
  }
  
  public V1alpha3NetworkDeviceDataBuilder(V1alpha3NetworkDeviceDataFluent<?> fluent) {
    this(fluent, new V1alpha3NetworkDeviceData());
  }
  
  public V1alpha3NetworkDeviceDataBuilder(V1alpha3NetworkDeviceDataFluent<?> fluent,V1alpha3NetworkDeviceData instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha3NetworkDeviceDataBuilder(V1alpha3NetworkDeviceData instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha3NetworkDeviceDataFluent<?> fluent;
  
  public V1alpha3NetworkDeviceData build() {
    V1alpha3NetworkDeviceData buildable = new V1alpha3NetworkDeviceData();
    buildable.setHardwareAddress(fluent.getHardwareAddress());
    buildable.setInterfaceName(fluent.getInterfaceName());
    buildable.setIps(fluent.getIps());
    return buildable;
  }
  

}
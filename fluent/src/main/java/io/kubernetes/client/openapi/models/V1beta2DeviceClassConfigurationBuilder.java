package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta2DeviceClassConfigurationBuilder extends V1beta2DeviceClassConfigurationFluent<V1beta2DeviceClassConfigurationBuilder> implements VisitableBuilder<V1beta2DeviceClassConfiguration,V1beta2DeviceClassConfigurationBuilder>{
  public V1beta2DeviceClassConfigurationBuilder() {
    this(new V1beta2DeviceClassConfiguration());
  }
  
  public V1beta2DeviceClassConfigurationBuilder(V1beta2DeviceClassConfigurationFluent<?> fluent) {
    this(fluent, new V1beta2DeviceClassConfiguration());
  }
  
  public V1beta2DeviceClassConfigurationBuilder(V1beta2DeviceClassConfigurationFluent<?> fluent,V1beta2DeviceClassConfiguration instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta2DeviceClassConfigurationBuilder(V1beta2DeviceClassConfiguration instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta2DeviceClassConfigurationFluent<?> fluent;
  
  public V1beta2DeviceClassConfiguration build() {
    V1beta2DeviceClassConfiguration buildable = new V1beta2DeviceClassConfiguration();
    buildable.setOpaque(fluent.buildOpaque());
    return buildable;
  }
  

}
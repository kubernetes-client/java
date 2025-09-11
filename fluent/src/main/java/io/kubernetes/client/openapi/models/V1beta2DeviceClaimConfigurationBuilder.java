package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1beta2DeviceClaimConfigurationBuilder extends V1beta2DeviceClaimConfigurationFluent<V1beta2DeviceClaimConfigurationBuilder> implements VisitableBuilder<V1beta2DeviceClaimConfiguration,V1beta2DeviceClaimConfigurationBuilder>{
  public V1beta2DeviceClaimConfigurationBuilder() {
    this(new V1beta2DeviceClaimConfiguration());
  }
  
  public V1beta2DeviceClaimConfigurationBuilder(V1beta2DeviceClaimConfigurationFluent<?> fluent) {
    this(fluent, new V1beta2DeviceClaimConfiguration());
  }
  
  public V1beta2DeviceClaimConfigurationBuilder(V1beta2DeviceClaimConfigurationFluent<?> fluent,V1beta2DeviceClaimConfiguration instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta2DeviceClaimConfigurationBuilder(V1beta2DeviceClaimConfiguration instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta2DeviceClaimConfigurationFluent<?> fluent;
  
  public V1beta2DeviceClaimConfiguration build() {
    V1beta2DeviceClaimConfiguration buildable = new V1beta2DeviceClaimConfiguration();
    buildable.setOpaque(fluent.buildOpaque());
    buildable.setRequests(fluent.getRequests());
    return buildable;
  }
  

}
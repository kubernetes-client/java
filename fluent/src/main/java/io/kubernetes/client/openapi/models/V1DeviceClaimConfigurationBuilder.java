package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1DeviceClaimConfigurationBuilder extends V1DeviceClaimConfigurationFluent<V1DeviceClaimConfigurationBuilder> implements VisitableBuilder<V1DeviceClaimConfiguration,V1DeviceClaimConfigurationBuilder>{
  public V1DeviceClaimConfigurationBuilder() {
    this(new V1DeviceClaimConfiguration());
  }
  
  public V1DeviceClaimConfigurationBuilder(V1DeviceClaimConfigurationFluent<?> fluent) {
    this(fluent, new V1DeviceClaimConfiguration());
  }
  
  public V1DeviceClaimConfigurationBuilder(V1DeviceClaimConfigurationFluent<?> fluent,V1DeviceClaimConfiguration instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1DeviceClaimConfigurationBuilder(V1DeviceClaimConfiguration instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1DeviceClaimConfigurationFluent<?> fluent;
  
  public V1DeviceClaimConfiguration build() {
    V1DeviceClaimConfiguration buildable = new V1DeviceClaimConfiguration();
    buildable.setOpaque(fluent.buildOpaque());
    buildable.setRequests(fluent.getRequests());
    return buildable;
  }
  

}
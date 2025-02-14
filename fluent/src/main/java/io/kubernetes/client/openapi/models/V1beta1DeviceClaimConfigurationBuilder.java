package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta1DeviceClaimConfigurationBuilder extends V1beta1DeviceClaimConfigurationFluent<V1beta1DeviceClaimConfigurationBuilder> implements VisitableBuilder<V1beta1DeviceClaimConfiguration,V1beta1DeviceClaimConfigurationBuilder>{
  public V1beta1DeviceClaimConfigurationBuilder() {
    this(new V1beta1DeviceClaimConfiguration());
  }
  
  public V1beta1DeviceClaimConfigurationBuilder(V1beta1DeviceClaimConfigurationFluent<?> fluent) {
    this(fluent, new V1beta1DeviceClaimConfiguration());
  }
  
  public V1beta1DeviceClaimConfigurationBuilder(V1beta1DeviceClaimConfigurationFluent<?> fluent,V1beta1DeviceClaimConfiguration instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1DeviceClaimConfigurationBuilder(V1beta1DeviceClaimConfiguration instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1DeviceClaimConfigurationFluent<?> fluent;
  
  public V1beta1DeviceClaimConfiguration build() {
    V1beta1DeviceClaimConfiguration buildable = new V1beta1DeviceClaimConfiguration();
    buildable.setOpaque(fluent.buildOpaque());
    buildable.setRequests(fluent.getRequests());
    return buildable;
  }
  

}
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha3DeviceClaimConfigurationBuilder extends V1alpha3DeviceClaimConfigurationFluent<V1alpha3DeviceClaimConfigurationBuilder> implements VisitableBuilder<V1alpha3DeviceClaimConfiguration,V1alpha3DeviceClaimConfigurationBuilder>{
  public V1alpha3DeviceClaimConfigurationBuilder() {
    this(new V1alpha3DeviceClaimConfiguration());
  }
  
  public V1alpha3DeviceClaimConfigurationBuilder(V1alpha3DeviceClaimConfigurationFluent<?> fluent) {
    this(fluent, new V1alpha3DeviceClaimConfiguration());
  }
  
  public V1alpha3DeviceClaimConfigurationBuilder(V1alpha3DeviceClaimConfigurationFluent<?> fluent,V1alpha3DeviceClaimConfiguration instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha3DeviceClaimConfigurationBuilder(V1alpha3DeviceClaimConfiguration instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha3DeviceClaimConfigurationFluent<?> fluent;
  
  public V1alpha3DeviceClaimConfiguration build() {
    V1alpha3DeviceClaimConfiguration buildable = new V1alpha3DeviceClaimConfiguration();
    buildable.setOpaque(fluent.buildOpaque());
    buildable.setRequests(fluent.getRequests());
    return buildable;
  }
  

}
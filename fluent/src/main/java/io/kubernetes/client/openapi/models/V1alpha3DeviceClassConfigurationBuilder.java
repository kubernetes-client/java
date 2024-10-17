package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha3DeviceClassConfigurationBuilder extends V1alpha3DeviceClassConfigurationFluent<V1alpha3DeviceClassConfigurationBuilder> implements VisitableBuilder<V1alpha3DeviceClassConfiguration,V1alpha3DeviceClassConfigurationBuilder>{
  public V1alpha3DeviceClassConfigurationBuilder() {
    this(new V1alpha3DeviceClassConfiguration());
  }
  
  public V1alpha3DeviceClassConfigurationBuilder(V1alpha3DeviceClassConfigurationFluent<?> fluent) {
    this(fluent, new V1alpha3DeviceClassConfiguration());
  }
  
  public V1alpha3DeviceClassConfigurationBuilder(V1alpha3DeviceClassConfigurationFluent<?> fluent,V1alpha3DeviceClassConfiguration instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha3DeviceClassConfigurationBuilder(V1alpha3DeviceClassConfiguration instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha3DeviceClassConfigurationFluent<?> fluent;
  
  public V1alpha3DeviceClassConfiguration build() {
    V1alpha3DeviceClassConfiguration buildable = new V1alpha3DeviceClassConfiguration();
    buildable.setOpaque(fluent.buildOpaque());
    return buildable;
  }
  

}
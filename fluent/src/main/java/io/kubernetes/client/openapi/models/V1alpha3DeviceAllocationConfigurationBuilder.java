package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha3DeviceAllocationConfigurationBuilder extends V1alpha3DeviceAllocationConfigurationFluent<V1alpha3DeviceAllocationConfigurationBuilder> implements VisitableBuilder<V1alpha3DeviceAllocationConfiguration,V1alpha3DeviceAllocationConfigurationBuilder>{
  public V1alpha3DeviceAllocationConfigurationBuilder() {
    this(new V1alpha3DeviceAllocationConfiguration());
  }
  
  public V1alpha3DeviceAllocationConfigurationBuilder(V1alpha3DeviceAllocationConfigurationFluent<?> fluent) {
    this(fluent, new V1alpha3DeviceAllocationConfiguration());
  }
  
  public V1alpha3DeviceAllocationConfigurationBuilder(V1alpha3DeviceAllocationConfigurationFluent<?> fluent,V1alpha3DeviceAllocationConfiguration instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha3DeviceAllocationConfigurationBuilder(V1alpha3DeviceAllocationConfiguration instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha3DeviceAllocationConfigurationFluent<?> fluent;
  
  public V1alpha3DeviceAllocationConfiguration build() {
    V1alpha3DeviceAllocationConfiguration buildable = new V1alpha3DeviceAllocationConfiguration();
    buildable.setOpaque(fluent.buildOpaque());
    buildable.setRequests(fluent.getRequests());
    buildable.setSource(fluent.getSource());
    return buildable;
  }
  

}
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta1DeviceAllocationConfigurationBuilder extends V1beta1DeviceAllocationConfigurationFluent<V1beta1DeviceAllocationConfigurationBuilder> implements VisitableBuilder<V1beta1DeviceAllocationConfiguration,V1beta1DeviceAllocationConfigurationBuilder>{
  public V1beta1DeviceAllocationConfigurationBuilder() {
    this(new V1beta1DeviceAllocationConfiguration());
  }
  
  public V1beta1DeviceAllocationConfigurationBuilder(V1beta1DeviceAllocationConfigurationFluent<?> fluent) {
    this(fluent, new V1beta1DeviceAllocationConfiguration());
  }
  
  public V1beta1DeviceAllocationConfigurationBuilder(V1beta1DeviceAllocationConfigurationFluent<?> fluent,V1beta1DeviceAllocationConfiguration instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1DeviceAllocationConfigurationBuilder(V1beta1DeviceAllocationConfiguration instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1DeviceAllocationConfigurationFluent<?> fluent;
  
  public V1beta1DeviceAllocationConfiguration build() {
    V1beta1DeviceAllocationConfiguration buildable = new V1beta1DeviceAllocationConfiguration();
    buildable.setOpaque(fluent.buildOpaque());
    buildable.setRequests(fluent.getRequests());
    buildable.setSource(fluent.getSource());
    return buildable;
  }
  

}
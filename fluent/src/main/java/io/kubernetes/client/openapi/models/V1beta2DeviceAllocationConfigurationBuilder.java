package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1beta2DeviceAllocationConfigurationBuilder extends V1beta2DeviceAllocationConfigurationFluent<V1beta2DeviceAllocationConfigurationBuilder> implements VisitableBuilder<V1beta2DeviceAllocationConfiguration,V1beta2DeviceAllocationConfigurationBuilder>{

  V1beta2DeviceAllocationConfigurationFluent<?> fluent;

  public V1beta2DeviceAllocationConfigurationBuilder() {
    this(new V1beta2DeviceAllocationConfiguration());
  }
  
  public V1beta2DeviceAllocationConfigurationBuilder(V1beta2DeviceAllocationConfigurationFluent<?> fluent) {
    this(fluent, new V1beta2DeviceAllocationConfiguration());
  }
  
  public V1beta2DeviceAllocationConfigurationBuilder(V1beta2DeviceAllocationConfiguration instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta2DeviceAllocationConfigurationBuilder(V1beta2DeviceAllocationConfigurationFluent<?> fluent,V1beta2DeviceAllocationConfiguration instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta2DeviceAllocationConfiguration build() {
    V1beta2DeviceAllocationConfiguration buildable = new V1beta2DeviceAllocationConfiguration();
    buildable.setOpaque(fluent.buildOpaque());
    buildable.setRequests(fluent.getRequests());
    buildable.setSource(fluent.getSource());
    return buildable;
  }
  
}
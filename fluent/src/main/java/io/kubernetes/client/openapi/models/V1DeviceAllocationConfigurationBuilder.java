package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1DeviceAllocationConfigurationBuilder extends V1DeviceAllocationConfigurationFluent<V1DeviceAllocationConfigurationBuilder> implements VisitableBuilder<V1DeviceAllocationConfiguration,V1DeviceAllocationConfigurationBuilder>{
  public V1DeviceAllocationConfigurationBuilder() {
    this(new V1DeviceAllocationConfiguration());
  }
  
  public V1DeviceAllocationConfigurationBuilder(V1DeviceAllocationConfigurationFluent<?> fluent) {
    this(fluent, new V1DeviceAllocationConfiguration());
  }
  
  public V1DeviceAllocationConfigurationBuilder(V1DeviceAllocationConfigurationFluent<?> fluent,V1DeviceAllocationConfiguration instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1DeviceAllocationConfigurationBuilder(V1DeviceAllocationConfiguration instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1DeviceAllocationConfigurationFluent<?> fluent;
  
  public V1DeviceAllocationConfiguration build() {
    V1DeviceAllocationConfiguration buildable = new V1DeviceAllocationConfiguration();
    buildable.setOpaque(fluent.buildOpaque());
    buildable.setRequests(fluent.getRequests());
    buildable.setSource(fluent.getSource());
    return buildable;
  }
  

}
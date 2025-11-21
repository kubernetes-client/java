package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1OpaqueDeviceConfigurationBuilder extends V1OpaqueDeviceConfigurationFluent<V1OpaqueDeviceConfigurationBuilder> implements VisitableBuilder<V1OpaqueDeviceConfiguration,V1OpaqueDeviceConfigurationBuilder>{

  V1OpaqueDeviceConfigurationFluent<?> fluent;

  public V1OpaqueDeviceConfigurationBuilder() {
    this(new V1OpaqueDeviceConfiguration());
  }
  
  public V1OpaqueDeviceConfigurationBuilder(V1OpaqueDeviceConfigurationFluent<?> fluent) {
    this(fluent, new V1OpaqueDeviceConfiguration());
  }
  
  public V1OpaqueDeviceConfigurationBuilder(V1OpaqueDeviceConfiguration instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1OpaqueDeviceConfigurationBuilder(V1OpaqueDeviceConfigurationFluent<?> fluent,V1OpaqueDeviceConfiguration instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1OpaqueDeviceConfiguration build() {
    V1OpaqueDeviceConfiguration buildable = new V1OpaqueDeviceConfiguration();
    buildable.setDriver(fluent.getDriver());
    buildable.setParameters(fluent.getParameters());
    return buildable;
  }
  
}
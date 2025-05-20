package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta2OpaqueDeviceConfigurationBuilder extends V1beta2OpaqueDeviceConfigurationFluent<V1beta2OpaqueDeviceConfigurationBuilder> implements VisitableBuilder<V1beta2OpaqueDeviceConfiguration,V1beta2OpaqueDeviceConfigurationBuilder>{
  public V1beta2OpaqueDeviceConfigurationBuilder() {
    this(new V1beta2OpaqueDeviceConfiguration());
  }
  
  public V1beta2OpaqueDeviceConfigurationBuilder(V1beta2OpaqueDeviceConfigurationFluent<?> fluent) {
    this(fluent, new V1beta2OpaqueDeviceConfiguration());
  }
  
  public V1beta2OpaqueDeviceConfigurationBuilder(V1beta2OpaqueDeviceConfigurationFluent<?> fluent,V1beta2OpaqueDeviceConfiguration instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta2OpaqueDeviceConfigurationBuilder(V1beta2OpaqueDeviceConfiguration instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta2OpaqueDeviceConfigurationFluent<?> fluent;
  
  public V1beta2OpaqueDeviceConfiguration build() {
    V1beta2OpaqueDeviceConfiguration buildable = new V1beta2OpaqueDeviceConfiguration();
    buildable.setDriver(fluent.getDriver());
    buildable.setParameters(fluent.getParameters());
    return buildable;
  }
  

}
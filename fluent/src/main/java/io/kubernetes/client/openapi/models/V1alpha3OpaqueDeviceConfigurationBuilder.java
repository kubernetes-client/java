package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha3OpaqueDeviceConfigurationBuilder extends V1alpha3OpaqueDeviceConfigurationFluent<V1alpha3OpaqueDeviceConfigurationBuilder> implements VisitableBuilder<V1alpha3OpaqueDeviceConfiguration,V1alpha3OpaqueDeviceConfigurationBuilder>{
  public V1alpha3OpaqueDeviceConfigurationBuilder() {
    this(new V1alpha3OpaqueDeviceConfiguration());
  }
  
  public V1alpha3OpaqueDeviceConfigurationBuilder(V1alpha3OpaqueDeviceConfigurationFluent<?> fluent) {
    this(fluent, new V1alpha3OpaqueDeviceConfiguration());
  }
  
  public V1alpha3OpaqueDeviceConfigurationBuilder(V1alpha3OpaqueDeviceConfigurationFluent<?> fluent,V1alpha3OpaqueDeviceConfiguration instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha3OpaqueDeviceConfigurationBuilder(V1alpha3OpaqueDeviceConfiguration instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha3OpaqueDeviceConfigurationFluent<?> fluent;
  
  public V1alpha3OpaqueDeviceConfiguration build() {
    V1alpha3OpaqueDeviceConfiguration buildable = new V1alpha3OpaqueDeviceConfiguration();
    buildable.setDriver(fluent.getDriver());
    buildable.setParameters(fluent.getParameters());
    return buildable;
  }
  

}
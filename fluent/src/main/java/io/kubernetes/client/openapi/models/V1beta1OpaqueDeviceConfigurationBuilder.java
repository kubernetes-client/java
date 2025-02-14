package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta1OpaqueDeviceConfigurationBuilder extends V1beta1OpaqueDeviceConfigurationFluent<V1beta1OpaqueDeviceConfigurationBuilder> implements VisitableBuilder<V1beta1OpaqueDeviceConfiguration,V1beta1OpaqueDeviceConfigurationBuilder>{
  public V1beta1OpaqueDeviceConfigurationBuilder() {
    this(new V1beta1OpaqueDeviceConfiguration());
  }
  
  public V1beta1OpaqueDeviceConfigurationBuilder(V1beta1OpaqueDeviceConfigurationFluent<?> fluent) {
    this(fluent, new V1beta1OpaqueDeviceConfiguration());
  }
  
  public V1beta1OpaqueDeviceConfigurationBuilder(V1beta1OpaqueDeviceConfigurationFluent<?> fluent,V1beta1OpaqueDeviceConfiguration instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1OpaqueDeviceConfigurationBuilder(V1beta1OpaqueDeviceConfiguration instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1OpaqueDeviceConfigurationFluent<?> fluent;
  
  public V1beta1OpaqueDeviceConfiguration build() {
    V1beta1OpaqueDeviceConfiguration buildable = new V1beta1OpaqueDeviceConfiguration();
    buildable.setDriver(fluent.getDriver());
    buildable.setParameters(fluent.getParameters());
    return buildable;
  }
  

}
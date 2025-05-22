package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta2DeviceClassSpecBuilder extends V1beta2DeviceClassSpecFluent<V1beta2DeviceClassSpecBuilder> implements VisitableBuilder<V1beta2DeviceClassSpec,V1beta2DeviceClassSpecBuilder>{
  public V1beta2DeviceClassSpecBuilder() {
    this(new V1beta2DeviceClassSpec());
  }
  
  public V1beta2DeviceClassSpecBuilder(V1beta2DeviceClassSpecFluent<?> fluent) {
    this(fluent, new V1beta2DeviceClassSpec());
  }
  
  public V1beta2DeviceClassSpecBuilder(V1beta2DeviceClassSpecFluent<?> fluent,V1beta2DeviceClassSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta2DeviceClassSpecBuilder(V1beta2DeviceClassSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta2DeviceClassSpecFluent<?> fluent;
  
  public V1beta2DeviceClassSpec build() {
    V1beta2DeviceClassSpec buildable = new V1beta2DeviceClassSpec();
    buildable.setConfig(fluent.buildConfig());
    buildable.setSelectors(fluent.buildSelectors());
    return buildable;
  }
  

}
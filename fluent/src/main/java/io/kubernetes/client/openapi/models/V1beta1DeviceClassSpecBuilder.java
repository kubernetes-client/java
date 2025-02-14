package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta1DeviceClassSpecBuilder extends V1beta1DeviceClassSpecFluent<V1beta1DeviceClassSpecBuilder> implements VisitableBuilder<V1beta1DeviceClassSpec,V1beta1DeviceClassSpecBuilder>{
  public V1beta1DeviceClassSpecBuilder() {
    this(new V1beta1DeviceClassSpec());
  }
  
  public V1beta1DeviceClassSpecBuilder(V1beta1DeviceClassSpecFluent<?> fluent) {
    this(fluent, new V1beta1DeviceClassSpec());
  }
  
  public V1beta1DeviceClassSpecBuilder(V1beta1DeviceClassSpecFluent<?> fluent,V1beta1DeviceClassSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1DeviceClassSpecBuilder(V1beta1DeviceClassSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1DeviceClassSpecFluent<?> fluent;
  
  public V1beta1DeviceClassSpec build() {
    V1beta1DeviceClassSpec buildable = new V1beta1DeviceClassSpec();
    buildable.setConfig(fluent.buildConfig());
    buildable.setSelectors(fluent.buildSelectors());
    return buildable;
  }
  

}
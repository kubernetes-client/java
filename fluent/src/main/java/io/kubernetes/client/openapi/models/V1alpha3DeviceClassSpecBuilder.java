package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha3DeviceClassSpecBuilder extends V1alpha3DeviceClassSpecFluent<V1alpha3DeviceClassSpecBuilder> implements VisitableBuilder<V1alpha3DeviceClassSpec,V1alpha3DeviceClassSpecBuilder>{
  public V1alpha3DeviceClassSpecBuilder() {
    this(new V1alpha3DeviceClassSpec());
  }
  
  public V1alpha3DeviceClassSpecBuilder(V1alpha3DeviceClassSpecFluent<?> fluent) {
    this(fluent, new V1alpha3DeviceClassSpec());
  }
  
  public V1alpha3DeviceClassSpecBuilder(V1alpha3DeviceClassSpecFluent<?> fluent,V1alpha3DeviceClassSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha3DeviceClassSpecBuilder(V1alpha3DeviceClassSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha3DeviceClassSpecFluent<?> fluent;
  
  public V1alpha3DeviceClassSpec build() {
    V1alpha3DeviceClassSpec buildable = new V1alpha3DeviceClassSpec();
    buildable.setConfig(fluent.buildConfig());
    buildable.setSelectors(fluent.buildSelectors());
    buildable.setSuitableNodes(fluent.buildSuitableNodes());
    return buildable;
  }
  

}
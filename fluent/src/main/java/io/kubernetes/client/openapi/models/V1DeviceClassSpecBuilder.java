package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1DeviceClassSpecBuilder extends V1DeviceClassSpecFluent<V1DeviceClassSpecBuilder> implements VisitableBuilder<V1DeviceClassSpec,V1DeviceClassSpecBuilder>{

  V1DeviceClassSpecFluent<?> fluent;

  public V1DeviceClassSpecBuilder() {
    this(new V1DeviceClassSpec());
  }
  
  public V1DeviceClassSpecBuilder(V1DeviceClassSpecFluent<?> fluent) {
    this(fluent, new V1DeviceClassSpec());
  }
  
  public V1DeviceClassSpecBuilder(V1DeviceClassSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1DeviceClassSpecBuilder(V1DeviceClassSpecFluent<?> fluent,V1DeviceClassSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1DeviceClassSpec build() {
    V1DeviceClassSpec buildable = new V1DeviceClassSpec();
    buildable.setConfig(fluent.buildConfig());
    buildable.setExtendedResourceName(fluent.getExtendedResourceName());
    buildable.setSelectors(fluent.buildSelectors());
    return buildable;
  }
  
}
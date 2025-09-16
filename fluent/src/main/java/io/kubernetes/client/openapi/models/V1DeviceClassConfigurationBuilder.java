package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1DeviceClassConfigurationBuilder extends V1DeviceClassConfigurationFluent<V1DeviceClassConfigurationBuilder> implements VisitableBuilder<V1DeviceClassConfiguration,V1DeviceClassConfigurationBuilder>{
  public V1DeviceClassConfigurationBuilder() {
    this(new V1DeviceClassConfiguration());
  }
  
  public V1DeviceClassConfigurationBuilder(V1DeviceClassConfigurationFluent<?> fluent) {
    this(fluent, new V1DeviceClassConfiguration());
  }
  
  public V1DeviceClassConfigurationBuilder(V1DeviceClassConfigurationFluent<?> fluent,V1DeviceClassConfiguration instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1DeviceClassConfigurationBuilder(V1DeviceClassConfiguration instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1DeviceClassConfigurationFluent<?> fluent;
  
  public V1DeviceClassConfiguration build() {
    V1DeviceClassConfiguration buildable = new V1DeviceClassConfiguration();
    buildable.setOpaque(fluent.buildOpaque());
    return buildable;
  }
  

}
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1beta1DeviceClassConfigurationBuilder extends V1beta1DeviceClassConfigurationFluent<V1beta1DeviceClassConfigurationBuilder> implements VisitableBuilder<V1beta1DeviceClassConfiguration,V1beta1DeviceClassConfigurationBuilder>{

  V1beta1DeviceClassConfigurationFluent<?> fluent;

  public V1beta1DeviceClassConfigurationBuilder() {
    this(new V1beta1DeviceClassConfiguration());
  }
  
  public V1beta1DeviceClassConfigurationBuilder(V1beta1DeviceClassConfigurationFluent<?> fluent) {
    this(fluent, new V1beta1DeviceClassConfiguration());
  }
  
  public V1beta1DeviceClassConfigurationBuilder(V1beta1DeviceClassConfiguration instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta1DeviceClassConfigurationBuilder(V1beta1DeviceClassConfigurationFluent<?> fluent,V1beta1DeviceClassConfiguration instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta1DeviceClassConfiguration build() {
    V1beta1DeviceClassConfiguration buildable = new V1beta1DeviceClassConfiguration();
    buildable.setOpaque(fluent.buildOpaque());
    return buildable;
  }
  
}
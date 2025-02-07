package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha3DeviceClassBuilder extends V1alpha3DeviceClassFluent<V1alpha3DeviceClassBuilder> implements VisitableBuilder<V1alpha3DeviceClass,V1alpha3DeviceClassBuilder>{
  public V1alpha3DeviceClassBuilder() {
    this(new V1alpha3DeviceClass());
  }
  
  public V1alpha3DeviceClassBuilder(V1alpha3DeviceClassFluent<?> fluent) {
    this(fluent, new V1alpha3DeviceClass());
  }
  
  public V1alpha3DeviceClassBuilder(V1alpha3DeviceClassFluent<?> fluent,V1alpha3DeviceClass instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha3DeviceClassBuilder(V1alpha3DeviceClass instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha3DeviceClassFluent<?> fluent;
  
  public V1alpha3DeviceClass build() {
    V1alpha3DeviceClass buildable = new V1alpha3DeviceClass();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    return buildable;
  }
  

}
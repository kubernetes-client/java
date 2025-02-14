package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta1DeviceClassBuilder extends V1beta1DeviceClassFluent<V1beta1DeviceClassBuilder> implements VisitableBuilder<V1beta1DeviceClass,V1beta1DeviceClassBuilder>{
  public V1beta1DeviceClassBuilder() {
    this(new V1beta1DeviceClass());
  }
  
  public V1beta1DeviceClassBuilder(V1beta1DeviceClassFluent<?> fluent) {
    this(fluent, new V1beta1DeviceClass());
  }
  
  public V1beta1DeviceClassBuilder(V1beta1DeviceClassFluent<?> fluent,V1beta1DeviceClass instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1DeviceClassBuilder(V1beta1DeviceClass instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1DeviceClassFluent<?> fluent;
  
  public V1beta1DeviceClass build() {
    V1beta1DeviceClass buildable = new V1beta1DeviceClass();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    return buildable;
  }
  

}
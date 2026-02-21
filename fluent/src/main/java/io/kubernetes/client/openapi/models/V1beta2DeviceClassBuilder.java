package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1beta2DeviceClassBuilder extends V1beta2DeviceClassFluent<V1beta2DeviceClassBuilder> implements VisitableBuilder<V1beta2DeviceClass,V1beta2DeviceClassBuilder>{

  V1beta2DeviceClassFluent<?> fluent;

  public V1beta2DeviceClassBuilder() {
    this(new V1beta2DeviceClass());
  }
  
  public V1beta2DeviceClassBuilder(V1beta2DeviceClassFluent<?> fluent) {
    this(fluent, new V1beta2DeviceClass());
  }
  
  public V1beta2DeviceClassBuilder(V1beta2DeviceClass instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta2DeviceClassBuilder(V1beta2DeviceClassFluent<?> fluent,V1beta2DeviceClass instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta2DeviceClass build() {
    V1beta2DeviceClass buildable = new V1beta2DeviceClass();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    return buildable;
  }
  
}
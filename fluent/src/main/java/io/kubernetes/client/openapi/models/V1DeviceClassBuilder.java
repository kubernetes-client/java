package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1DeviceClassBuilder extends V1DeviceClassFluent<V1DeviceClassBuilder> implements VisitableBuilder<V1DeviceClass,V1DeviceClassBuilder>{

  V1DeviceClassFluent<?> fluent;

  public V1DeviceClassBuilder() {
    this(new V1DeviceClass());
  }
  
  public V1DeviceClassBuilder(V1DeviceClassFluent<?> fluent) {
    this(fluent, new V1DeviceClass());
  }
  
  public V1DeviceClassBuilder(V1DeviceClass instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1DeviceClassBuilder(V1DeviceClassFluent<?> fluent,V1DeviceClass instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1DeviceClass build() {
    V1DeviceClass buildable = new V1DeviceClass();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    return buildable;
  }
  
}
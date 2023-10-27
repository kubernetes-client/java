package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ScaleBuilder extends V1ScaleFluent<V1ScaleBuilder> implements VisitableBuilder<V1Scale,V1ScaleBuilder>{
  public V1ScaleBuilder() {
    this(new V1Scale());
  }
  
  public V1ScaleBuilder(V1ScaleFluent<?> fluent) {
    this(fluent, new V1Scale());
  }
  
  public V1ScaleBuilder(V1ScaleFluent<?> fluent,V1Scale instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ScaleBuilder(V1Scale instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ScaleFluent<?> fluent;
  
  public V1Scale build() {
    V1Scale buildable = new V1Scale();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  

}
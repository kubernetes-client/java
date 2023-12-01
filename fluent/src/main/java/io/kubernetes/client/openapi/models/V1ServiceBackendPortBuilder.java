package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ServiceBackendPortBuilder extends V1ServiceBackendPortFluent<V1ServiceBackendPortBuilder> implements VisitableBuilder<V1ServiceBackendPort,V1ServiceBackendPortBuilder>{
  public V1ServiceBackendPortBuilder() {
    this(new V1ServiceBackendPort());
  }
  
  public V1ServiceBackendPortBuilder(V1ServiceBackendPortFluent<?> fluent) {
    this(fluent, new V1ServiceBackendPort());
  }
  
  public V1ServiceBackendPortBuilder(V1ServiceBackendPortFluent<?> fluent,V1ServiceBackendPort instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ServiceBackendPortBuilder(V1ServiceBackendPort instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ServiceBackendPortFluent<?> fluent;
  
  public V1ServiceBackendPort build() {
    V1ServiceBackendPort buildable = new V1ServiceBackendPort();
    buildable.setName(fluent.getName());
    buildable.setNumber(fluent.getNumber());
    return buildable;
  }
  

}
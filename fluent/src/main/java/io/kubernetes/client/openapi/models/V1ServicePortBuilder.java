package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ServicePortBuilder extends V1ServicePortFluent<V1ServicePortBuilder> implements VisitableBuilder<V1ServicePort,V1ServicePortBuilder>{
  public V1ServicePortBuilder() {
    this(new V1ServicePort());
  }
  
  public V1ServicePortBuilder(V1ServicePortFluent<?> fluent) {
    this(fluent, new V1ServicePort());
  }
  
  public V1ServicePortBuilder(V1ServicePortFluent<?> fluent,V1ServicePort instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ServicePortBuilder(V1ServicePort instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ServicePortFluent<?> fluent;
  
  public V1ServicePort build() {
    V1ServicePort buildable = new V1ServicePort();
    buildable.setAppProtocol(fluent.getAppProtocol());
    buildable.setName(fluent.getName());
    buildable.setNodePort(fluent.getNodePort());
    buildable.setPort(fluent.getPort());
    buildable.setProtocol(fluent.getProtocol());
    buildable.setTargetPort(fluent.getTargetPort());
    return buildable;
  }
  

}
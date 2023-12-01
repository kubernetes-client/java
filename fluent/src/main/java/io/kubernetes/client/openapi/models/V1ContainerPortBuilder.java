package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ContainerPortBuilder extends V1ContainerPortFluent<V1ContainerPortBuilder> implements VisitableBuilder<V1ContainerPort,V1ContainerPortBuilder>{
  public V1ContainerPortBuilder() {
    this(new V1ContainerPort());
  }
  
  public V1ContainerPortBuilder(V1ContainerPortFluent<?> fluent) {
    this(fluent, new V1ContainerPort());
  }
  
  public V1ContainerPortBuilder(V1ContainerPortFluent<?> fluent,V1ContainerPort instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ContainerPortBuilder(V1ContainerPort instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ContainerPortFluent<?> fluent;
  
  public V1ContainerPort build() {
    V1ContainerPort buildable = new V1ContainerPort();
    buildable.setContainerPort(fluent.getContainerPort());
    buildable.setHostIP(fluent.getHostIP());
    buildable.setHostPort(fluent.getHostPort());
    buildable.setName(fluent.getName());
    buildable.setProtocol(fluent.getProtocol());
    return buildable;
  }
  

}
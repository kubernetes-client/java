package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ContainerResizePolicyBuilder extends V1ContainerResizePolicyFluent<V1ContainerResizePolicyBuilder> implements VisitableBuilder<V1ContainerResizePolicy,V1ContainerResizePolicyBuilder>{
  public V1ContainerResizePolicyBuilder() {
    this(new V1ContainerResizePolicy());
  }
  
  public V1ContainerResizePolicyBuilder(V1ContainerResizePolicyFluent<?> fluent) {
    this(fluent, new V1ContainerResizePolicy());
  }
  
  public V1ContainerResizePolicyBuilder(V1ContainerResizePolicyFluent<?> fluent,V1ContainerResizePolicy instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ContainerResizePolicyBuilder(V1ContainerResizePolicy instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ContainerResizePolicyFluent<?> fluent;
  
  public V1ContainerResizePolicy build() {
    V1ContainerResizePolicy buildable = new V1ContainerResizePolicy();
    buildable.setResourceName(fluent.getResourceName());
    buildable.setRestartPolicy(fluent.getRestartPolicy());
    return buildable;
  }
  

}
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1NodeRuntimeHandlerBuilder extends V1NodeRuntimeHandlerFluent<V1NodeRuntimeHandlerBuilder> implements VisitableBuilder<V1NodeRuntimeHandler,V1NodeRuntimeHandlerBuilder>{
  public V1NodeRuntimeHandlerBuilder() {
    this(new V1NodeRuntimeHandler());
  }
  
  public V1NodeRuntimeHandlerBuilder(V1NodeRuntimeHandlerFluent<?> fluent) {
    this(fluent, new V1NodeRuntimeHandler());
  }
  
  public V1NodeRuntimeHandlerBuilder(V1NodeRuntimeHandlerFluent<?> fluent,V1NodeRuntimeHandler instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1NodeRuntimeHandlerBuilder(V1NodeRuntimeHandler instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1NodeRuntimeHandlerFluent<?> fluent;
  
  public V1NodeRuntimeHandler build() {
    V1NodeRuntimeHandler buildable = new V1NodeRuntimeHandler();
    buildable.setFeatures(fluent.buildFeatures());
    buildable.setName(fluent.getName());
    return buildable;
  }
  

}
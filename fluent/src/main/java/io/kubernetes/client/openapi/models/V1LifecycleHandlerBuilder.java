package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1LifecycleHandlerBuilder extends V1LifecycleHandlerFluent<V1LifecycleHandlerBuilder> implements VisitableBuilder<V1LifecycleHandler,V1LifecycleHandlerBuilder>{
  public V1LifecycleHandlerBuilder() {
    this(new V1LifecycleHandler());
  }
  
  public V1LifecycleHandlerBuilder(V1LifecycleHandlerFluent<?> fluent) {
    this(fluent, new V1LifecycleHandler());
  }
  
  public V1LifecycleHandlerBuilder(V1LifecycleHandlerFluent<?> fluent,V1LifecycleHandler instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1LifecycleHandlerBuilder(V1LifecycleHandler instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1LifecycleHandlerFluent<?> fluent;
  
  public V1LifecycleHandler build() {
    V1LifecycleHandler buildable = new V1LifecycleHandler();
    buildable.setExec(fluent.buildExec());
    buildable.setHttpGet(fluent.buildHttpGet());
    buildable.setSleep(fluent.buildSleep());
    buildable.setTcpSocket(fluent.buildTcpSocket());
    return buildable;
  }
  

}
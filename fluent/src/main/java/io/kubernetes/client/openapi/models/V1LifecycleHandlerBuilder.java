package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1LifecycleHandlerBuilder extends V1LifecycleHandlerFluentImpl<V1LifecycleHandlerBuilder> implements VisitableBuilder<V1LifecycleHandler,V1LifecycleHandlerBuilder>{
  public V1LifecycleHandlerBuilder() {
    this(false);
  }
  public V1LifecycleHandlerBuilder(Boolean validationEnabled) {
    this(new V1LifecycleHandler(), validationEnabled);
  }
  public V1LifecycleHandlerBuilder(V1LifecycleHandlerFluent<?> fluent) {
    this(fluent, false);
  }
  public V1LifecycleHandlerBuilder(V1LifecycleHandlerFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1LifecycleHandler(), validationEnabled);
  }
  public V1LifecycleHandlerBuilder(V1LifecycleHandlerFluent<?> fluent,V1LifecycleHandler instance) {
    this(fluent, instance, false);
  }
  public V1LifecycleHandlerBuilder(V1LifecycleHandlerFluent<?> fluent,V1LifecycleHandler instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withExec(instance.getExec());

    fluent.withHttpGet(instance.getHttpGet());

    fluent.withTcpSocket(instance.getTcpSocket());

    this.validationEnabled = validationEnabled; 
  }
  public V1LifecycleHandlerBuilder(V1LifecycleHandler instance) {
    this(instance,false);
  }
  public V1LifecycleHandlerBuilder(V1LifecycleHandler instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withExec(instance.getExec());

    this.withHttpGet(instance.getHttpGet());

    this.withTcpSocket(instance.getTcpSocket());

    this.validationEnabled = validationEnabled; 
  }
  V1LifecycleHandlerFluent<?> fluent;
  Boolean validationEnabled;
  public V1LifecycleHandler build() {
    V1LifecycleHandler buildable = new V1LifecycleHandler();
    buildable.setExec(fluent.getExec());
    buildable.setHttpGet(fluent.getHttpGet());
    buildable.setTcpSocket(fluent.getTcpSocket());
    return buildable;
  }
  
}
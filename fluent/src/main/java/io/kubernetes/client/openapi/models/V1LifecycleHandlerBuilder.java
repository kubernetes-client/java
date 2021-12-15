package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1LifecycleHandlerBuilder extends io.kubernetes.client.openapi.models.V1LifecycleHandlerFluentImpl<io.kubernetes.client.openapi.models.V1LifecycleHandlerBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1LifecycleHandler,io.kubernetes.client.openapi.models.V1LifecycleHandlerBuilder>{
  public V1LifecycleHandlerBuilder() {
    this(false);
  }
  public V1LifecycleHandlerBuilder(java.lang.Boolean validationEnabled) {
    this(new V1LifecycleHandler(), validationEnabled);
  }
  public V1LifecycleHandlerBuilder(io.kubernetes.client.openapi.models.V1LifecycleHandlerFluent<?> fluent) {
    this(fluent, false);
  }
  public V1LifecycleHandlerBuilder(io.kubernetes.client.openapi.models.V1LifecycleHandlerFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1LifecycleHandler(), validationEnabled);
  }
  public V1LifecycleHandlerBuilder(io.kubernetes.client.openapi.models.V1LifecycleHandlerFluent<?> fluent,io.kubernetes.client.openapi.models.V1LifecycleHandler instance) {
    this(fluent, instance, false);
  }
  public V1LifecycleHandlerBuilder(io.kubernetes.client.openapi.models.V1LifecycleHandlerFluent<?> fluent,io.kubernetes.client.openapi.models.V1LifecycleHandler instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withExec(instance.getExec());

    fluent.withHttpGet(instance.getHttpGet());

    fluent.withTcpSocket(instance.getTcpSocket());

    this.validationEnabled = validationEnabled; 
  }
  public V1LifecycleHandlerBuilder(io.kubernetes.client.openapi.models.V1LifecycleHandler instance) {
    this(instance,false);
  }
  public V1LifecycleHandlerBuilder(io.kubernetes.client.openapi.models.V1LifecycleHandler instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withExec(instance.getExec());

    this.withHttpGet(instance.getHttpGet());

    this.withTcpSocket(instance.getTcpSocket());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1LifecycleHandlerFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1LifecycleHandler build() {
    V1LifecycleHandler buildable = new V1LifecycleHandler();
    buildable.setExec(fluent.getExec());
    buildable.setHttpGet(fluent.getHttpGet());
    buildable.setTcpSocket(fluent.getTcpSocket());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1LifecycleHandlerBuilder that = (V1LifecycleHandlerBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1ServiceBackendPortBuilder extends V1ServiceBackendPortFluentImpl<V1ServiceBackendPortBuilder> implements VisitableBuilder<V1ServiceBackendPort,V1ServiceBackendPortBuilder>{
  public V1ServiceBackendPortBuilder() {
    this(false);
  }
  public V1ServiceBackendPortBuilder(Boolean validationEnabled) {
    this(new V1ServiceBackendPort(), validationEnabled);
  }
  public V1ServiceBackendPortBuilder(V1ServiceBackendPortFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ServiceBackendPortBuilder(V1ServiceBackendPortFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1ServiceBackendPort(), validationEnabled);
  }
  public V1ServiceBackendPortBuilder(V1ServiceBackendPortFluent<?> fluent,V1ServiceBackendPort instance) {
    this(fluent, instance, false);
  }
  public V1ServiceBackendPortBuilder(V1ServiceBackendPortFluent<?> fluent,V1ServiceBackendPort instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withName(instance.getName());

    fluent.withNumber(instance.getNumber());

    this.validationEnabled = validationEnabled; 
  }
  public V1ServiceBackendPortBuilder(V1ServiceBackendPort instance) {
    this(instance,false);
  }
  public V1ServiceBackendPortBuilder(V1ServiceBackendPort instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withName(instance.getName());

    this.withNumber(instance.getNumber());

    this.validationEnabled = validationEnabled; 
  }
  V1ServiceBackendPortFluent<?> fluent;
  Boolean validationEnabled;
  public V1ServiceBackendPort build() {
    V1ServiceBackendPort buildable = new V1ServiceBackendPort();
    buildable.setName(fluent.getName());
    buildable.setNumber(fluent.getNumber());
    return buildable;
  }
  
}
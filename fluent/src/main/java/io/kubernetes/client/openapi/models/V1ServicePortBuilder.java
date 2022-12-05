package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1ServicePortBuilder extends V1ServicePortFluentImpl<V1ServicePortBuilder> implements VisitableBuilder<V1ServicePort,V1ServicePortBuilder>{
  public V1ServicePortBuilder() {
    this(false);
  }
  public V1ServicePortBuilder(Boolean validationEnabled) {
    this(new V1ServicePort(), validationEnabled);
  }
  public V1ServicePortBuilder(V1ServicePortFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ServicePortBuilder(V1ServicePortFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1ServicePort(), validationEnabled);
  }
  public V1ServicePortBuilder(V1ServicePortFluent<?> fluent,V1ServicePort instance) {
    this(fluent, instance, false);
  }
  public V1ServicePortBuilder(V1ServicePortFluent<?> fluent,V1ServicePort instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withAppProtocol(instance.getAppProtocol());

    fluent.withName(instance.getName());

    fluent.withNodePort(instance.getNodePort());

    fluent.withPort(instance.getPort());

    fluent.withProtocol(instance.getProtocol());

    fluent.withTargetPort(instance.getTargetPort());

    this.validationEnabled = validationEnabled; 
  }
  public V1ServicePortBuilder(V1ServicePort instance) {
    this(instance,false);
  }
  public V1ServicePortBuilder(V1ServicePort instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withAppProtocol(instance.getAppProtocol());

    this.withName(instance.getName());

    this.withNodePort(instance.getNodePort());

    this.withPort(instance.getPort());

    this.withProtocol(instance.getProtocol());

    this.withTargetPort(instance.getTargetPort());

    this.validationEnabled = validationEnabled; 
  }
  V1ServicePortFluent<?> fluent;
  Boolean validationEnabled;
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
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1ContainerPortBuilder extends V1ContainerPortFluentImpl<V1ContainerPortBuilder> implements VisitableBuilder<V1ContainerPort,V1ContainerPortBuilder>{
  public V1ContainerPortBuilder() {
    this(false);
  }
  public V1ContainerPortBuilder(Boolean validationEnabled) {
    this(new V1ContainerPort(), validationEnabled);
  }
  public V1ContainerPortBuilder(V1ContainerPortFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ContainerPortBuilder(V1ContainerPortFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1ContainerPort(), validationEnabled);
  }
  public V1ContainerPortBuilder(V1ContainerPortFluent<?> fluent,V1ContainerPort instance) {
    this(fluent, instance, false);
  }
  public V1ContainerPortBuilder(V1ContainerPortFluent<?> fluent,V1ContainerPort instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withContainerPort(instance.getContainerPort());

    fluent.withHostIP(instance.getHostIP());

    fluent.withHostPort(instance.getHostPort());

    fluent.withName(instance.getName());

    fluent.withProtocol(instance.getProtocol());

    this.validationEnabled = validationEnabled; 
  }
  public V1ContainerPortBuilder(V1ContainerPort instance) {
    this(instance,false);
  }
  public V1ContainerPortBuilder(V1ContainerPort instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withContainerPort(instance.getContainerPort());

    this.withHostIP(instance.getHostIP());

    this.withHostPort(instance.getHostPort());

    this.withName(instance.getName());

    this.withProtocol(instance.getProtocol());

    this.validationEnabled = validationEnabled; 
  }
  V1ContainerPortFluent<?> fluent;
  Boolean validationEnabled;
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
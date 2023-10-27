package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ContainerStateRunningBuilder extends V1ContainerStateRunningFluent<V1ContainerStateRunningBuilder> implements VisitableBuilder<V1ContainerStateRunning,V1ContainerStateRunningBuilder>{
  public V1ContainerStateRunningBuilder() {
    this(new V1ContainerStateRunning());
  }
  
  public V1ContainerStateRunningBuilder(V1ContainerStateRunningFluent<?> fluent) {
    this(fluent, new V1ContainerStateRunning());
  }
  
  public V1ContainerStateRunningBuilder(V1ContainerStateRunningFluent<?> fluent,V1ContainerStateRunning instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ContainerStateRunningBuilder(V1ContainerStateRunning instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ContainerStateRunningFluent<?> fluent;
  
  public V1ContainerStateRunning build() {
    V1ContainerStateRunning buildable = new V1ContainerStateRunning();
    buildable.setStartedAt(fluent.getStartedAt());
    return buildable;
  }
  

}
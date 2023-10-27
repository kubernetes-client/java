package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ContainerStateBuilder extends V1ContainerStateFluent<V1ContainerStateBuilder> implements VisitableBuilder<V1ContainerState,V1ContainerStateBuilder>{
  public V1ContainerStateBuilder() {
    this(new V1ContainerState());
  }
  
  public V1ContainerStateBuilder(V1ContainerStateFluent<?> fluent) {
    this(fluent, new V1ContainerState());
  }
  
  public V1ContainerStateBuilder(V1ContainerStateFluent<?> fluent,V1ContainerState instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ContainerStateBuilder(V1ContainerState instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ContainerStateFluent<?> fluent;
  
  public V1ContainerState build() {
    V1ContainerState buildable = new V1ContainerState();
    buildable.setRunning(fluent.buildRunning());
    buildable.setTerminated(fluent.buildTerminated());
    buildable.setWaiting(fluent.buildWaiting());
    return buildable;
  }
  

}
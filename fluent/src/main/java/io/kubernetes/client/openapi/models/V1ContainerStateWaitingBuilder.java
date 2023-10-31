package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ContainerStateWaitingBuilder extends V1ContainerStateWaitingFluent<V1ContainerStateWaitingBuilder> implements VisitableBuilder<V1ContainerStateWaiting,V1ContainerStateWaitingBuilder>{
  public V1ContainerStateWaitingBuilder() {
    this(new V1ContainerStateWaiting());
  }
  
  public V1ContainerStateWaitingBuilder(V1ContainerStateWaitingFluent<?> fluent) {
    this(fluent, new V1ContainerStateWaiting());
  }
  
  public V1ContainerStateWaitingBuilder(V1ContainerStateWaitingFluent<?> fluent,V1ContainerStateWaiting instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ContainerStateWaitingBuilder(V1ContainerStateWaiting instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ContainerStateWaitingFluent<?> fluent;
  
  public V1ContainerStateWaiting build() {
    V1ContainerStateWaiting buildable = new V1ContainerStateWaiting();
    buildable.setMessage(fluent.getMessage());
    buildable.setReason(fluent.getReason());
    return buildable;
  }
  

}
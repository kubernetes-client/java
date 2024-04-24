package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ContainerStatusBuilder extends V1ContainerStatusFluent<V1ContainerStatusBuilder> implements VisitableBuilder<V1ContainerStatus,V1ContainerStatusBuilder>{
  public V1ContainerStatusBuilder() {
    this(new V1ContainerStatus());
  }
  
  public V1ContainerStatusBuilder(V1ContainerStatusFluent<?> fluent) {
    this(fluent, new V1ContainerStatus());
  }
  
  public V1ContainerStatusBuilder(V1ContainerStatusFluent<?> fluent,V1ContainerStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ContainerStatusBuilder(V1ContainerStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ContainerStatusFluent<?> fluent;
  
  public V1ContainerStatus build() {
    V1ContainerStatus buildable = new V1ContainerStatus();
    buildable.setAllocatedResources(fluent.getAllocatedResources());
    buildable.setContainerID(fluent.getContainerID());
    buildable.setImage(fluent.getImage());
    buildable.setImageID(fluent.getImageID());
    buildable.setLastState(fluent.buildLastState());
    buildable.setName(fluent.getName());
    buildable.setReady(fluent.getReady());
    buildable.setResources(fluent.buildResources());
    buildable.setRestartCount(fluent.getRestartCount());
    buildable.setStarted(fluent.getStarted());
    buildable.setState(fluent.buildState());
    buildable.setVolumeMounts(fluent.buildVolumeMounts());
    return buildable;
  }
  

}
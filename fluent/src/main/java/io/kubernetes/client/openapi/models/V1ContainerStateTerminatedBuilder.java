package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ContainerStateTerminatedBuilder extends V1ContainerStateTerminatedFluent<V1ContainerStateTerminatedBuilder> implements VisitableBuilder<V1ContainerStateTerminated,V1ContainerStateTerminatedBuilder>{
  public V1ContainerStateTerminatedBuilder() {
    this(new V1ContainerStateTerminated());
  }
  
  public V1ContainerStateTerminatedBuilder(V1ContainerStateTerminatedFluent<?> fluent) {
    this(fluent, new V1ContainerStateTerminated());
  }
  
  public V1ContainerStateTerminatedBuilder(V1ContainerStateTerminatedFluent<?> fluent,V1ContainerStateTerminated instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ContainerStateTerminatedBuilder(V1ContainerStateTerminated instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ContainerStateTerminatedFluent<?> fluent;
  
  public V1ContainerStateTerminated build() {
    V1ContainerStateTerminated buildable = new V1ContainerStateTerminated();
    buildable.setContainerID(fluent.getContainerID());
    buildable.setExitCode(fluent.getExitCode());
    buildable.setFinishedAt(fluent.getFinishedAt());
    buildable.setMessage(fluent.getMessage());
    buildable.setReason(fluent.getReason());
    buildable.setSignal(fluent.getSignal());
    buildable.setStartedAt(fluent.getStartedAt());
    return buildable;
  }
  

}
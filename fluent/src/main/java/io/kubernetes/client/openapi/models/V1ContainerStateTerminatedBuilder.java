package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1ContainerStateTerminatedBuilder extends V1ContainerStateTerminatedFluentImpl<V1ContainerStateTerminatedBuilder> implements VisitableBuilder<V1ContainerStateTerminated,V1ContainerStateTerminatedBuilder>{
  public V1ContainerStateTerminatedBuilder() {
    this(false);
  }
  public V1ContainerStateTerminatedBuilder(Boolean validationEnabled) {
    this(new V1ContainerStateTerminated(), validationEnabled);
  }
  public V1ContainerStateTerminatedBuilder(V1ContainerStateTerminatedFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ContainerStateTerminatedBuilder(V1ContainerStateTerminatedFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1ContainerStateTerminated(), validationEnabled);
  }
  public V1ContainerStateTerminatedBuilder(V1ContainerStateTerminatedFluent<?> fluent,V1ContainerStateTerminated instance) {
    this(fluent, instance, false);
  }
  public V1ContainerStateTerminatedBuilder(V1ContainerStateTerminatedFluent<?> fluent,V1ContainerStateTerminated instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withContainerID(instance.getContainerID());

    fluent.withExitCode(instance.getExitCode());

    fluent.withFinishedAt(instance.getFinishedAt());

    fluent.withMessage(instance.getMessage());

    fluent.withReason(instance.getReason());

    fluent.withSignal(instance.getSignal());

    fluent.withStartedAt(instance.getStartedAt());

    this.validationEnabled = validationEnabled; 
  }
  public V1ContainerStateTerminatedBuilder(V1ContainerStateTerminated instance) {
    this(instance,false);
  }
  public V1ContainerStateTerminatedBuilder(V1ContainerStateTerminated instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withContainerID(instance.getContainerID());

    this.withExitCode(instance.getExitCode());

    this.withFinishedAt(instance.getFinishedAt());

    this.withMessage(instance.getMessage());

    this.withReason(instance.getReason());

    this.withSignal(instance.getSignal());

    this.withStartedAt(instance.getStartedAt());

    this.validationEnabled = validationEnabled; 
  }
  V1ContainerStateTerminatedFluent<?> fluent;
  Boolean validationEnabled;
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
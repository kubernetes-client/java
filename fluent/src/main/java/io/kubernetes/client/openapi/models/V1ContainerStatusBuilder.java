package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1ContainerStatusBuilder extends V1ContainerStatusFluentImpl<V1ContainerStatusBuilder> implements VisitableBuilder<V1ContainerStatus,V1ContainerStatusBuilder>{
  public V1ContainerStatusBuilder() {
    this(false);
  }
  public V1ContainerStatusBuilder(Boolean validationEnabled) {
    this(new V1ContainerStatus(), validationEnabled);
  }
  public V1ContainerStatusBuilder(V1ContainerStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ContainerStatusBuilder(V1ContainerStatusFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1ContainerStatus(), validationEnabled);
  }
  public V1ContainerStatusBuilder(V1ContainerStatusFluent<?> fluent,V1ContainerStatus instance) {
    this(fluent, instance, false);
  }
  public V1ContainerStatusBuilder(V1ContainerStatusFluent<?> fluent,V1ContainerStatus instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withContainerID(instance.getContainerID());

    fluent.withImage(instance.getImage());

    fluent.withImageID(instance.getImageID());

    fluent.withLastState(instance.getLastState());

    fluent.withName(instance.getName());

    fluent.withReady(instance.getReady());

    fluent.withRestartCount(instance.getRestartCount());

    fluent.withStarted(instance.getStarted());

    fluent.withState(instance.getState());

    this.validationEnabled = validationEnabled; 
  }
  public V1ContainerStatusBuilder(V1ContainerStatus instance) {
    this(instance,false);
  }
  public V1ContainerStatusBuilder(V1ContainerStatus instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withContainerID(instance.getContainerID());

    this.withImage(instance.getImage());

    this.withImageID(instance.getImageID());

    this.withLastState(instance.getLastState());

    this.withName(instance.getName());

    this.withReady(instance.getReady());

    this.withRestartCount(instance.getRestartCount());

    this.withStarted(instance.getStarted());

    this.withState(instance.getState());

    this.validationEnabled = validationEnabled; 
  }
  V1ContainerStatusFluent<?> fluent;
  Boolean validationEnabled;
  public V1ContainerStatus build() {
    V1ContainerStatus buildable = new V1ContainerStatus();
    buildable.setContainerID(fluent.getContainerID());
    buildable.setImage(fluent.getImage());
    buildable.setImageID(fluent.getImageID());
    buildable.setLastState(fluent.getLastState());
    buildable.setName(fluent.getName());
    buildable.setReady(fluent.getReady());
    buildable.setRestartCount(fluent.getRestartCount());
    buildable.setStarted(fluent.getStarted());
    buildable.setState(fluent.getState());
    return buildable;
  }
  
}
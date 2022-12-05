package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1ContainerStateWaitingBuilder extends V1ContainerStateWaitingFluentImpl<V1ContainerStateWaitingBuilder> implements VisitableBuilder<V1ContainerStateWaiting,V1ContainerStateWaitingBuilder>{
  public V1ContainerStateWaitingBuilder() {
    this(false);
  }
  public V1ContainerStateWaitingBuilder(Boolean validationEnabled) {
    this(new V1ContainerStateWaiting(), validationEnabled);
  }
  public V1ContainerStateWaitingBuilder(V1ContainerStateWaitingFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ContainerStateWaitingBuilder(V1ContainerStateWaitingFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1ContainerStateWaiting(), validationEnabled);
  }
  public V1ContainerStateWaitingBuilder(V1ContainerStateWaitingFluent<?> fluent,V1ContainerStateWaiting instance) {
    this(fluent, instance, false);
  }
  public V1ContainerStateWaitingBuilder(V1ContainerStateWaitingFluent<?> fluent,V1ContainerStateWaiting instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withMessage(instance.getMessage());

    fluent.withReason(instance.getReason());

    this.validationEnabled = validationEnabled; 
  }
  public V1ContainerStateWaitingBuilder(V1ContainerStateWaiting instance) {
    this(instance,false);
  }
  public V1ContainerStateWaitingBuilder(V1ContainerStateWaiting instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withMessage(instance.getMessage());

    this.withReason(instance.getReason());

    this.validationEnabled = validationEnabled; 
  }
  V1ContainerStateWaitingFluent<?> fluent;
  Boolean validationEnabled;
  public V1ContainerStateWaiting build() {
    V1ContainerStateWaiting buildable = new V1ContainerStateWaiting();
    buildable.setMessage(fluent.getMessage());
    buildable.setReason(fluent.getReason());
    return buildable;
  }
  
}
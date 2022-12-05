package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1ContainerStateRunningBuilder extends V1ContainerStateRunningFluentImpl<V1ContainerStateRunningBuilder> implements VisitableBuilder<V1ContainerStateRunning,V1ContainerStateRunningBuilder>{
  public V1ContainerStateRunningBuilder() {
    this(false);
  }
  public V1ContainerStateRunningBuilder(Boolean validationEnabled) {
    this(new V1ContainerStateRunning(), validationEnabled);
  }
  public V1ContainerStateRunningBuilder(V1ContainerStateRunningFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ContainerStateRunningBuilder(V1ContainerStateRunningFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1ContainerStateRunning(), validationEnabled);
  }
  public V1ContainerStateRunningBuilder(V1ContainerStateRunningFluent<?> fluent,V1ContainerStateRunning instance) {
    this(fluent, instance, false);
  }
  public V1ContainerStateRunningBuilder(V1ContainerStateRunningFluent<?> fluent,V1ContainerStateRunning instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withStartedAt(instance.getStartedAt());

    this.validationEnabled = validationEnabled; 
  }
  public V1ContainerStateRunningBuilder(V1ContainerStateRunning instance) {
    this(instance,false);
  }
  public V1ContainerStateRunningBuilder(V1ContainerStateRunning instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withStartedAt(instance.getStartedAt());

    this.validationEnabled = validationEnabled; 
  }
  V1ContainerStateRunningFluent<?> fluent;
  Boolean validationEnabled;
  public V1ContainerStateRunning build() {
    V1ContainerStateRunning buildable = new V1ContainerStateRunning();
    buildable.setStartedAt(fluent.getStartedAt());
    return buildable;
  }
  
}
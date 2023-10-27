package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1DaemonSetStatusBuilder extends V1DaemonSetStatusFluent<V1DaemonSetStatusBuilder> implements VisitableBuilder<V1DaemonSetStatus,V1DaemonSetStatusBuilder>{
  public V1DaemonSetStatusBuilder() {
    this(new V1DaemonSetStatus());
  }
  
  public V1DaemonSetStatusBuilder(V1DaemonSetStatusFluent<?> fluent) {
    this(fluent, new V1DaemonSetStatus());
  }
  
  public V1DaemonSetStatusBuilder(V1DaemonSetStatusFluent<?> fluent,V1DaemonSetStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1DaemonSetStatusBuilder(V1DaemonSetStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1DaemonSetStatusFluent<?> fluent;
  
  public V1DaemonSetStatus build() {
    V1DaemonSetStatus buildable = new V1DaemonSetStatus();
    buildable.setCollisionCount(fluent.getCollisionCount());
    buildable.setConditions(fluent.buildConditions());
    buildable.setCurrentNumberScheduled(fluent.getCurrentNumberScheduled());
    buildable.setDesiredNumberScheduled(fluent.getDesiredNumberScheduled());
    buildable.setNumberAvailable(fluent.getNumberAvailable());
    buildable.setNumberMisscheduled(fluent.getNumberMisscheduled());
    buildable.setNumberReady(fluent.getNumberReady());
    buildable.setNumberUnavailable(fluent.getNumberUnavailable());
    buildable.setObservedGeneration(fluent.getObservedGeneration());
    buildable.setUpdatedNumberScheduled(fluent.getUpdatedNumberScheduled());
    return buildable;
  }
  

}
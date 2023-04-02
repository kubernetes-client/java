package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1DaemonSetStatusBuilder extends V1DaemonSetStatusFluentImpl<V1DaemonSetStatusBuilder> implements VisitableBuilder<V1DaemonSetStatus,V1DaemonSetStatusBuilder>{
  public V1DaemonSetStatusBuilder() {
    this(false);
  }
  public V1DaemonSetStatusBuilder(Boolean validationEnabled) {
    this(new V1DaemonSetStatus(), validationEnabled);
  }
  public V1DaemonSetStatusBuilder(V1DaemonSetStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V1DaemonSetStatusBuilder(V1DaemonSetStatusFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1DaemonSetStatus(), validationEnabled);
  }
  public V1DaemonSetStatusBuilder(V1DaemonSetStatusFluent<?> fluent,V1DaemonSetStatus instance) {
    this(fluent, instance, false);
  }
  public V1DaemonSetStatusBuilder(V1DaemonSetStatusFluent<?> fluent,V1DaemonSetStatus instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withCollisionCount(instance.getCollisionCount());

    fluent.withConditions(instance.getConditions());

    fluent.withCurrentNumberScheduled(instance.getCurrentNumberScheduled());

    fluent.withDesiredNumberScheduled(instance.getDesiredNumberScheduled());

    fluent.withNumberAvailable(instance.getNumberAvailable());

    fluent.withNumberMisscheduled(instance.getNumberMisscheduled());

    fluent.withNumberReady(instance.getNumberReady());

    fluent.withNumberUnavailable(instance.getNumberUnavailable());

    fluent.withObservedGeneration(instance.getObservedGeneration());

    fluent.withUpdatedNumberScheduled(instance.getUpdatedNumberScheduled());

    this.validationEnabled = validationEnabled; 
  }
  public V1DaemonSetStatusBuilder(V1DaemonSetStatus instance) {
    this(instance,false);
  }
  public V1DaemonSetStatusBuilder(V1DaemonSetStatus instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withCollisionCount(instance.getCollisionCount());

    this.withConditions(instance.getConditions());

    this.withCurrentNumberScheduled(instance.getCurrentNumberScheduled());

    this.withDesiredNumberScheduled(instance.getDesiredNumberScheduled());

    this.withNumberAvailable(instance.getNumberAvailable());

    this.withNumberMisscheduled(instance.getNumberMisscheduled());

    this.withNumberReady(instance.getNumberReady());

    this.withNumberUnavailable(instance.getNumberUnavailable());

    this.withObservedGeneration(instance.getObservedGeneration());

    this.withUpdatedNumberScheduled(instance.getUpdatedNumberScheduled());

    this.validationEnabled = validationEnabled; 
  }
  V1DaemonSetStatusFluent<?> fluent;
  Boolean validationEnabled;
  public V1DaemonSetStatus build() {
    V1DaemonSetStatus buildable = new V1DaemonSetStatus();
    buildable.setCollisionCount(fluent.getCollisionCount());
    buildable.setConditions(fluent.getConditions());
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
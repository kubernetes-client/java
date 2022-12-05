package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1JobStatusBuilder extends V1JobStatusFluentImpl<V1JobStatusBuilder> implements VisitableBuilder<V1JobStatus,V1JobStatusBuilder>{
  public V1JobStatusBuilder() {
    this(false);
  }
  public V1JobStatusBuilder(Boolean validationEnabled) {
    this(new V1JobStatus(), validationEnabled);
  }
  public V1JobStatusBuilder(V1JobStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V1JobStatusBuilder(V1JobStatusFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1JobStatus(), validationEnabled);
  }
  public V1JobStatusBuilder(V1JobStatusFluent<?> fluent,V1JobStatus instance) {
    this(fluent, instance, false);
  }
  public V1JobStatusBuilder(V1JobStatusFluent<?> fluent,V1JobStatus instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withActive(instance.getActive());

    fluent.withCompletedIndexes(instance.getCompletedIndexes());

    fluent.withCompletionTime(instance.getCompletionTime());

    fluent.withConditions(instance.getConditions());

    fluent.withFailed(instance.getFailed());

    fluent.withReady(instance.getReady());

    fluent.withStartTime(instance.getStartTime());

    fluent.withSucceeded(instance.getSucceeded());

    fluent.withUncountedTerminatedPods(instance.getUncountedTerminatedPods());

    this.validationEnabled = validationEnabled; 
  }
  public V1JobStatusBuilder(V1JobStatus instance) {
    this(instance,false);
  }
  public V1JobStatusBuilder(V1JobStatus instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withActive(instance.getActive());

    this.withCompletedIndexes(instance.getCompletedIndexes());

    this.withCompletionTime(instance.getCompletionTime());

    this.withConditions(instance.getConditions());

    this.withFailed(instance.getFailed());

    this.withReady(instance.getReady());

    this.withStartTime(instance.getStartTime());

    this.withSucceeded(instance.getSucceeded());

    this.withUncountedTerminatedPods(instance.getUncountedTerminatedPods());

    this.validationEnabled = validationEnabled; 
  }
  V1JobStatusFluent<?> fluent;
  Boolean validationEnabled;
  public V1JobStatus build() {
    V1JobStatus buildable = new V1JobStatus();
    buildable.setActive(fluent.getActive());
    buildable.setCompletedIndexes(fluent.getCompletedIndexes());
    buildable.setCompletionTime(fluent.getCompletionTime());
    buildable.setConditions(fluent.getConditions());
    buildable.setFailed(fluent.getFailed());
    buildable.setReady(fluent.getReady());
    buildable.setStartTime(fluent.getStartTime());
    buildable.setSucceeded(fluent.getSucceeded());
    buildable.setUncountedTerminatedPods(fluent.getUncountedTerminatedPods());
    return buildable;
  }
  
}
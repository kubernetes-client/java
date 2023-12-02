package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1JobStatusBuilder extends V1JobStatusFluent<V1JobStatusBuilder> implements VisitableBuilder<V1JobStatus,V1JobStatusBuilder>{
  public V1JobStatusBuilder() {
    this(new V1JobStatus());
  }
  
  public V1JobStatusBuilder(V1JobStatusFluent<?> fluent) {
    this(fluent, new V1JobStatus());
  }
  
  public V1JobStatusBuilder(V1JobStatusFluent<?> fluent,V1JobStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1JobStatusBuilder(V1JobStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1JobStatusFluent<?> fluent;
  
  public V1JobStatus build() {
    V1JobStatus buildable = new V1JobStatus();
    buildable.setActive(fluent.getActive());
    buildable.setCompletedIndexes(fluent.getCompletedIndexes());
    buildable.setCompletionTime(fluent.getCompletionTime());
    buildable.setConditions(fluent.buildConditions());
    buildable.setFailed(fluent.getFailed());
    buildable.setFailedIndexes(fluent.getFailedIndexes());
    buildable.setReady(fluent.getReady());
    buildable.setStartTime(fluent.getStartTime());
    buildable.setSucceeded(fluent.getSucceeded());
    buildable.setTerminating(fluent.getTerminating());
    buildable.setUncountedTerminatedPods(fluent.buildUncountedTerminatedPods());
    return buildable;
  }
  

}
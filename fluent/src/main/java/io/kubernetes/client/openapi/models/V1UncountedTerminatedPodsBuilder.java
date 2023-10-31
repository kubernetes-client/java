package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1UncountedTerminatedPodsBuilder extends V1UncountedTerminatedPodsFluent<V1UncountedTerminatedPodsBuilder> implements VisitableBuilder<V1UncountedTerminatedPods,V1UncountedTerminatedPodsBuilder>{
  public V1UncountedTerminatedPodsBuilder() {
    this(new V1UncountedTerminatedPods());
  }
  
  public V1UncountedTerminatedPodsBuilder(V1UncountedTerminatedPodsFluent<?> fluent) {
    this(fluent, new V1UncountedTerminatedPods());
  }
  
  public V1UncountedTerminatedPodsBuilder(V1UncountedTerminatedPodsFluent<?> fluent,V1UncountedTerminatedPods instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1UncountedTerminatedPodsBuilder(V1UncountedTerminatedPods instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1UncountedTerminatedPodsFluent<?> fluent;
  
  public V1UncountedTerminatedPods build() {
    V1UncountedTerminatedPods buildable = new V1UncountedTerminatedPods();
    buildable.setFailed(fluent.getFailed());
    buildable.setSucceeded(fluent.getSucceeded());
    return buildable;
  }
  

}
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1UncountedTerminatedPodsBuilder extends V1UncountedTerminatedPodsFluentImpl<V1UncountedTerminatedPodsBuilder> implements VisitableBuilder<V1UncountedTerminatedPods,V1UncountedTerminatedPodsBuilder>{
  public V1UncountedTerminatedPodsBuilder() {
    this(false);
  }
  public V1UncountedTerminatedPodsBuilder(Boolean validationEnabled) {
    this(new V1UncountedTerminatedPods(), validationEnabled);
  }
  public V1UncountedTerminatedPodsBuilder(V1UncountedTerminatedPodsFluent<?> fluent) {
    this(fluent, false);
  }
  public V1UncountedTerminatedPodsBuilder(V1UncountedTerminatedPodsFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1UncountedTerminatedPods(), validationEnabled);
  }
  public V1UncountedTerminatedPodsBuilder(V1UncountedTerminatedPodsFluent<?> fluent,V1UncountedTerminatedPods instance) {
    this(fluent, instance, false);
  }
  public V1UncountedTerminatedPodsBuilder(V1UncountedTerminatedPodsFluent<?> fluent,V1UncountedTerminatedPods instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withFailed(instance.getFailed());

    fluent.withSucceeded(instance.getSucceeded());

    this.validationEnabled = validationEnabled; 
  }
  public V1UncountedTerminatedPodsBuilder(V1UncountedTerminatedPods instance) {
    this(instance,false);
  }
  public V1UncountedTerminatedPodsBuilder(V1UncountedTerminatedPods instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withFailed(instance.getFailed());

    this.withSucceeded(instance.getSucceeded());

    this.validationEnabled = validationEnabled; 
  }
  V1UncountedTerminatedPodsFluent<?> fluent;
  Boolean validationEnabled;
  public V1UncountedTerminatedPods build() {
    V1UncountedTerminatedPods buildable = new V1UncountedTerminatedPods();
    buildable.setFailed(fluent.getFailed());
    buildable.setSucceeded(fluent.getSucceeded());
    return buildable;
  }
  
}
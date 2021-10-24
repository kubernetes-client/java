package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1UncountedTerminatedPodsBuilder extends io.kubernetes.client.openapi.models.V1UncountedTerminatedPodsFluentImpl<io.kubernetes.client.openapi.models.V1UncountedTerminatedPodsBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1UncountedTerminatedPods,io.kubernetes.client.openapi.models.V1UncountedTerminatedPodsBuilder>{
  public V1UncountedTerminatedPodsBuilder() {
    this(false);
  }
  public V1UncountedTerminatedPodsBuilder(java.lang.Boolean validationEnabled) {
    this(new V1UncountedTerminatedPods(), validationEnabled);
  }
  public V1UncountedTerminatedPodsBuilder(io.kubernetes.client.openapi.models.V1UncountedTerminatedPodsFluent<?> fluent) {
    this(fluent, false);
  }
  public V1UncountedTerminatedPodsBuilder(io.kubernetes.client.openapi.models.V1UncountedTerminatedPodsFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1UncountedTerminatedPods(), validationEnabled);
  }
  public V1UncountedTerminatedPodsBuilder(io.kubernetes.client.openapi.models.V1UncountedTerminatedPodsFluent<?> fluent,io.kubernetes.client.openapi.models.V1UncountedTerminatedPods instance) {
    this(fluent, instance, false);
  }
  public V1UncountedTerminatedPodsBuilder(io.kubernetes.client.openapi.models.V1UncountedTerminatedPodsFluent<?> fluent,io.kubernetes.client.openapi.models.V1UncountedTerminatedPods instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withFailed(instance.getFailed());

    fluent.withSucceeded(instance.getSucceeded());

    this.validationEnabled = validationEnabled; 
  }
  public V1UncountedTerminatedPodsBuilder(io.kubernetes.client.openapi.models.V1UncountedTerminatedPods instance) {
    this(instance,false);
  }
  public V1UncountedTerminatedPodsBuilder(io.kubernetes.client.openapi.models.V1UncountedTerminatedPods instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withFailed(instance.getFailed());

    this.withSucceeded(instance.getSucceeded());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1UncountedTerminatedPodsFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1UncountedTerminatedPods build() {
    V1UncountedTerminatedPods buildable = new V1UncountedTerminatedPods();
    buildable.setFailed(fluent.getFailed());
    buildable.setSucceeded(fluent.getSucceeded());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1UncountedTerminatedPodsBuilder that = (V1UncountedTerminatedPodsBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}
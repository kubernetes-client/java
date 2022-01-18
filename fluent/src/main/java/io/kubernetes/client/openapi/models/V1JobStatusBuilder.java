/*
Copyright 2022 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.models;

public class V1JobStatusBuilder
    extends io.kubernetes.client.openapi.models.V1JobStatusFluentImpl<
        io.kubernetes.client.openapi.models.V1JobStatusBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1JobStatus,
        io.kubernetes.client.openapi.models.V1JobStatusBuilder> {
  public V1JobStatusBuilder() {
    this(false);
  }

  public V1JobStatusBuilder(java.lang.Boolean validationEnabled) {
    this(new V1JobStatus(), validationEnabled);
  }

  public V1JobStatusBuilder(io.kubernetes.client.openapi.models.V1JobStatusFluent<?> fluent) {
    this(fluent, false);
  }

  public V1JobStatusBuilder(
      io.kubernetes.client.openapi.models.V1JobStatusFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1JobStatus(), validationEnabled);
  }

  public V1JobStatusBuilder(
      io.kubernetes.client.openapi.models.V1JobStatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1JobStatus instance) {
    this(fluent, instance, false);
  }

  public V1JobStatusBuilder(
      io.kubernetes.client.openapi.models.V1JobStatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1JobStatus instance,
      java.lang.Boolean validationEnabled) {
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

  public V1JobStatusBuilder(io.kubernetes.client.openapi.models.V1JobStatus instance) {
    this(instance, false);
  }

  public V1JobStatusBuilder(
      io.kubernetes.client.openapi.models.V1JobStatus instance,
      java.lang.Boolean validationEnabled) {
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

  io.kubernetes.client.openapi.models.V1JobStatusFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1JobStatus build() {
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

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1JobStatusBuilder that = (V1JobStatusBuilder) o;
    if (fluent != null && fluent != this
        ? !fluent.equals(that.fluent)
        : that.fluent != null && fluent != this) return false;

    if (validationEnabled != null
        ? !validationEnabled.equals(that.validationEnabled)
        : that.validationEnabled != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(fluent, validationEnabled, super.hashCode());
  }
}

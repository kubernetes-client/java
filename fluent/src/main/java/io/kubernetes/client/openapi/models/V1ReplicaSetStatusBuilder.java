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

public class V1ReplicaSetStatusBuilder
    extends io.kubernetes.client.openapi.models.V1ReplicaSetStatusFluentImpl<
        io.kubernetes.client.openapi.models.V1ReplicaSetStatusBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1ReplicaSetStatus,
        io.kubernetes.client.openapi.models.V1ReplicaSetStatusBuilder> {
  public V1ReplicaSetStatusBuilder() {
    this(false);
  }

  public V1ReplicaSetStatusBuilder(java.lang.Boolean validationEnabled) {
    this(new V1ReplicaSetStatus(), validationEnabled);
  }

  public V1ReplicaSetStatusBuilder(
      io.kubernetes.client.openapi.models.V1ReplicaSetStatusFluent<?> fluent) {
    this(fluent, false);
  }

  public V1ReplicaSetStatusBuilder(
      io.kubernetes.client.openapi.models.V1ReplicaSetStatusFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1ReplicaSetStatus(), validationEnabled);
  }

  public V1ReplicaSetStatusBuilder(
      io.kubernetes.client.openapi.models.V1ReplicaSetStatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1ReplicaSetStatus instance) {
    this(fluent, instance, false);
  }

  public V1ReplicaSetStatusBuilder(
      io.kubernetes.client.openapi.models.V1ReplicaSetStatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1ReplicaSetStatus instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withAvailableReplicas(instance.getAvailableReplicas());

    fluent.withConditions(instance.getConditions());

    fluent.withFullyLabeledReplicas(instance.getFullyLabeledReplicas());

    fluent.withObservedGeneration(instance.getObservedGeneration());

    fluent.withReadyReplicas(instance.getReadyReplicas());

    fluent.withReplicas(instance.getReplicas());

    this.validationEnabled = validationEnabled;
  }

  public V1ReplicaSetStatusBuilder(
      io.kubernetes.client.openapi.models.V1ReplicaSetStatus instance) {
    this(instance, false);
  }

  public V1ReplicaSetStatusBuilder(
      io.kubernetes.client.openapi.models.V1ReplicaSetStatus instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withAvailableReplicas(instance.getAvailableReplicas());

    this.withConditions(instance.getConditions());

    this.withFullyLabeledReplicas(instance.getFullyLabeledReplicas());

    this.withObservedGeneration(instance.getObservedGeneration());

    this.withReadyReplicas(instance.getReadyReplicas());

    this.withReplicas(instance.getReplicas());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1ReplicaSetStatusFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1ReplicaSetStatus build() {
    V1ReplicaSetStatus buildable = new V1ReplicaSetStatus();
    buildable.setAvailableReplicas(fluent.getAvailableReplicas());
    buildable.setConditions(fluent.getConditions());
    buildable.setFullyLabeledReplicas(fluent.getFullyLabeledReplicas());
    buildable.setObservedGeneration(fluent.getObservedGeneration());
    buildable.setReadyReplicas(fluent.getReadyReplicas());
    buildable.setReplicas(fluent.getReplicas());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ReplicaSetStatusBuilder that = (V1ReplicaSetStatusBuilder) o;
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

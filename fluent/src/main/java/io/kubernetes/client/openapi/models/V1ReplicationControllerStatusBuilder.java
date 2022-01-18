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

public class V1ReplicationControllerStatusBuilder
    extends io.kubernetes.client.openapi.models.V1ReplicationControllerStatusFluentImpl<
        io.kubernetes.client.openapi.models.V1ReplicationControllerStatusBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1ReplicationControllerStatus,
        io.kubernetes.client.openapi.models.V1ReplicationControllerStatusBuilder> {
  public V1ReplicationControllerStatusBuilder() {
    this(false);
  }

  public V1ReplicationControllerStatusBuilder(java.lang.Boolean validationEnabled) {
    this(new V1ReplicationControllerStatus(), validationEnabled);
  }

  public V1ReplicationControllerStatusBuilder(
      io.kubernetes.client.openapi.models.V1ReplicationControllerStatusFluent<?> fluent) {
    this(fluent, false);
  }

  public V1ReplicationControllerStatusBuilder(
      io.kubernetes.client.openapi.models.V1ReplicationControllerStatusFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1ReplicationControllerStatus(), validationEnabled);
  }

  public V1ReplicationControllerStatusBuilder(
      io.kubernetes.client.openapi.models.V1ReplicationControllerStatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1ReplicationControllerStatus instance) {
    this(fluent, instance, false);
  }

  public V1ReplicationControllerStatusBuilder(
      io.kubernetes.client.openapi.models.V1ReplicationControllerStatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1ReplicationControllerStatus instance,
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

  public V1ReplicationControllerStatusBuilder(
      io.kubernetes.client.openapi.models.V1ReplicationControllerStatus instance) {
    this(instance, false);
  }

  public V1ReplicationControllerStatusBuilder(
      io.kubernetes.client.openapi.models.V1ReplicationControllerStatus instance,
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

  io.kubernetes.client.openapi.models.V1ReplicationControllerStatusFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1ReplicationControllerStatus build() {
    V1ReplicationControllerStatus buildable = new V1ReplicationControllerStatus();
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
    V1ReplicationControllerStatusBuilder that = (V1ReplicationControllerStatusBuilder) o;
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

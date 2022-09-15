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

import io.kubernetes.client.fluent.VisitableBuilder;

public class V1ReplicationControllerStatusBuilder
    extends V1ReplicationControllerStatusFluentImpl<V1ReplicationControllerStatusBuilder>
    implements VisitableBuilder<
        V1ReplicationControllerStatus, V1ReplicationControllerStatusBuilder> {
  public V1ReplicationControllerStatusBuilder() {
    this(false);
  }

  public V1ReplicationControllerStatusBuilder(Boolean validationEnabled) {
    this(new V1ReplicationControllerStatus(), validationEnabled);
  }

  public V1ReplicationControllerStatusBuilder(V1ReplicationControllerStatusFluent<?> fluent) {
    this(fluent, false);
  }

  public V1ReplicationControllerStatusBuilder(
      V1ReplicationControllerStatusFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1ReplicationControllerStatus(), validationEnabled);
  }

  public V1ReplicationControllerStatusBuilder(
      V1ReplicationControllerStatusFluent<?> fluent, V1ReplicationControllerStatus instance) {
    this(fluent, instance, false);
  }

  public V1ReplicationControllerStatusBuilder(
      V1ReplicationControllerStatusFluent<?> fluent,
      V1ReplicationControllerStatus instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withAvailableReplicas(instance.getAvailableReplicas());

    fluent.withConditions(instance.getConditions());

    fluent.withFullyLabeledReplicas(instance.getFullyLabeledReplicas());

    fluent.withObservedGeneration(instance.getObservedGeneration());

    fluent.withReadyReplicas(instance.getReadyReplicas());

    fluent.withReplicas(instance.getReplicas());

    this.validationEnabled = validationEnabled;
  }

  public V1ReplicationControllerStatusBuilder(V1ReplicationControllerStatus instance) {
    this(instance, false);
  }

  public V1ReplicationControllerStatusBuilder(
      V1ReplicationControllerStatus instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withAvailableReplicas(instance.getAvailableReplicas());

    this.withConditions(instance.getConditions());

    this.withFullyLabeledReplicas(instance.getFullyLabeledReplicas());

    this.withObservedGeneration(instance.getObservedGeneration());

    this.withReadyReplicas(instance.getReadyReplicas());

    this.withReplicas(instance.getReplicas());

    this.validationEnabled = validationEnabled;
  }

  V1ReplicationControllerStatusFluent<?> fluent;
  Boolean validationEnabled;

  public V1ReplicationControllerStatus build() {
    V1ReplicationControllerStatus buildable = new V1ReplicationControllerStatus();
    buildable.setAvailableReplicas(fluent.getAvailableReplicas());
    buildable.setConditions(fluent.getConditions());
    buildable.setFullyLabeledReplicas(fluent.getFullyLabeledReplicas());
    buildable.setObservedGeneration(fluent.getObservedGeneration());
    buildable.setReadyReplicas(fluent.getReadyReplicas());
    buildable.setReplicas(fluent.getReplicas());
    return buildable;
  }
}

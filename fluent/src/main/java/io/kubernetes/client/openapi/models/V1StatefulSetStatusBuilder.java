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

public class V1StatefulSetStatusBuilder
    extends V1StatefulSetStatusFluentImpl<V1StatefulSetStatusBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1StatefulSetStatus,
        io.kubernetes.client.openapi.models.V1StatefulSetStatusBuilder> {
  public V1StatefulSetStatusBuilder() {
    this(false);
  }

  public V1StatefulSetStatusBuilder(Boolean validationEnabled) {
    this(new V1StatefulSetStatus(), validationEnabled);
  }

  public V1StatefulSetStatusBuilder(V1StatefulSetStatusFluent<?> fluent) {
    this(fluent, false);
  }

  public V1StatefulSetStatusBuilder(
      io.kubernetes.client.openapi.models.V1StatefulSetStatusFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1StatefulSetStatus(), validationEnabled);
  }

  public V1StatefulSetStatusBuilder(
      io.kubernetes.client.openapi.models.V1StatefulSetStatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1StatefulSetStatus instance) {
    this(fluent, instance, false);
  }

  public V1StatefulSetStatusBuilder(
      io.kubernetes.client.openapi.models.V1StatefulSetStatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1StatefulSetStatus instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withAvailableReplicas(instance.getAvailableReplicas());

    fluent.withCollisionCount(instance.getCollisionCount());

    fluent.withConditions(instance.getConditions());

    fluent.withCurrentReplicas(instance.getCurrentReplicas());

    fluent.withCurrentRevision(instance.getCurrentRevision());

    fluent.withObservedGeneration(instance.getObservedGeneration());

    fluent.withReadyReplicas(instance.getReadyReplicas());

    fluent.withReplicas(instance.getReplicas());

    fluent.withUpdateRevision(instance.getUpdateRevision());

    fluent.withUpdatedReplicas(instance.getUpdatedReplicas());

    this.validationEnabled = validationEnabled;
  }

  public V1StatefulSetStatusBuilder(
      io.kubernetes.client.openapi.models.V1StatefulSetStatus instance) {
    this(instance, false);
  }

  public V1StatefulSetStatusBuilder(
      io.kubernetes.client.openapi.models.V1StatefulSetStatus instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withAvailableReplicas(instance.getAvailableReplicas());

    this.withCollisionCount(instance.getCollisionCount());

    this.withConditions(instance.getConditions());

    this.withCurrentReplicas(instance.getCurrentReplicas());

    this.withCurrentRevision(instance.getCurrentRevision());

    this.withObservedGeneration(instance.getObservedGeneration());

    this.withReadyReplicas(instance.getReadyReplicas());

    this.withReplicas(instance.getReplicas());

    this.withUpdateRevision(instance.getUpdateRevision());

    this.withUpdatedReplicas(instance.getUpdatedReplicas());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1StatefulSetStatusFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1StatefulSetStatus build() {
    V1StatefulSetStatus buildable = new V1StatefulSetStatus();
    buildable.setAvailableReplicas(fluent.getAvailableReplicas());
    buildable.setCollisionCount(fluent.getCollisionCount());
    buildable.setConditions(fluent.getConditions());
    buildable.setCurrentReplicas(fluent.getCurrentReplicas());
    buildable.setCurrentRevision(fluent.getCurrentRevision());
    buildable.setObservedGeneration(fluent.getObservedGeneration());
    buildable.setReadyReplicas(fluent.getReadyReplicas());
    buildable.setReplicas(fluent.getReplicas());
    buildable.setUpdateRevision(fluent.getUpdateRevision());
    buildable.setUpdatedReplicas(fluent.getUpdatedReplicas());
    return buildable;
  }
}

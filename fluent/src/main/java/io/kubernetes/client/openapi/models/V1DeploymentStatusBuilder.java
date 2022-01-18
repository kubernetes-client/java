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

public class V1DeploymentStatusBuilder
    extends io.kubernetes.client.openapi.models.V1DeploymentStatusFluentImpl<
        io.kubernetes.client.openapi.models.V1DeploymentStatusBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1DeploymentStatus,
        io.kubernetes.client.openapi.models.V1DeploymentStatusBuilder> {
  public V1DeploymentStatusBuilder() {
    this(false);
  }

  public V1DeploymentStatusBuilder(java.lang.Boolean validationEnabled) {
    this(new V1DeploymentStatus(), validationEnabled);
  }

  public V1DeploymentStatusBuilder(
      io.kubernetes.client.openapi.models.V1DeploymentStatusFluent<?> fluent) {
    this(fluent, false);
  }

  public V1DeploymentStatusBuilder(
      io.kubernetes.client.openapi.models.V1DeploymentStatusFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1DeploymentStatus(), validationEnabled);
  }

  public V1DeploymentStatusBuilder(
      io.kubernetes.client.openapi.models.V1DeploymentStatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1DeploymentStatus instance) {
    this(fluent, instance, false);
  }

  public V1DeploymentStatusBuilder(
      io.kubernetes.client.openapi.models.V1DeploymentStatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1DeploymentStatus instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withAvailableReplicas(instance.getAvailableReplicas());

    fluent.withCollisionCount(instance.getCollisionCount());

    fluent.withConditions(instance.getConditions());

    fluent.withObservedGeneration(instance.getObservedGeneration());

    fluent.withReadyReplicas(instance.getReadyReplicas());

    fluent.withReplicas(instance.getReplicas());

    fluent.withUnavailableReplicas(instance.getUnavailableReplicas());

    fluent.withUpdatedReplicas(instance.getUpdatedReplicas());

    this.validationEnabled = validationEnabled;
  }

  public V1DeploymentStatusBuilder(
      io.kubernetes.client.openapi.models.V1DeploymentStatus instance) {
    this(instance, false);
  }

  public V1DeploymentStatusBuilder(
      io.kubernetes.client.openapi.models.V1DeploymentStatus instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withAvailableReplicas(instance.getAvailableReplicas());

    this.withCollisionCount(instance.getCollisionCount());

    this.withConditions(instance.getConditions());

    this.withObservedGeneration(instance.getObservedGeneration());

    this.withReadyReplicas(instance.getReadyReplicas());

    this.withReplicas(instance.getReplicas());

    this.withUnavailableReplicas(instance.getUnavailableReplicas());

    this.withUpdatedReplicas(instance.getUpdatedReplicas());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1DeploymentStatusFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1DeploymentStatus build() {
    V1DeploymentStatus buildable = new V1DeploymentStatus();
    buildable.setAvailableReplicas(fluent.getAvailableReplicas());
    buildable.setCollisionCount(fluent.getCollisionCount());
    buildable.setConditions(fluent.getConditions());
    buildable.setObservedGeneration(fluent.getObservedGeneration());
    buildable.setReadyReplicas(fluent.getReadyReplicas());
    buildable.setReplicas(fluent.getReplicas());
    buildable.setUnavailableReplicas(fluent.getUnavailableReplicas());
    buildable.setUpdatedReplicas(fluent.getUpdatedReplicas());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1DeploymentStatusBuilder that = (V1DeploymentStatusBuilder) o;
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

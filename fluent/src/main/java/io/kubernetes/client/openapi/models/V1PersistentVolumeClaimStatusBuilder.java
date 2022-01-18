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

public class V1PersistentVolumeClaimStatusBuilder
    extends io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatusFluentImpl<
        io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatusBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatus,
        io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatusBuilder> {
  public V1PersistentVolumeClaimStatusBuilder() {
    this(false);
  }

  public V1PersistentVolumeClaimStatusBuilder(java.lang.Boolean validationEnabled) {
    this(new V1PersistentVolumeClaimStatus(), validationEnabled);
  }

  public V1PersistentVolumeClaimStatusBuilder(
      io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatusFluent<?> fluent) {
    this(fluent, false);
  }

  public V1PersistentVolumeClaimStatusBuilder(
      io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatusFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1PersistentVolumeClaimStatus(), validationEnabled);
  }

  public V1PersistentVolumeClaimStatusBuilder(
      io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatus instance) {
    this(fluent, instance, false);
  }

  public V1PersistentVolumeClaimStatusBuilder(
      io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatus instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withAccessModes(instance.getAccessModes());

    fluent.withAllocatedResources(instance.getAllocatedResources());

    fluent.withCapacity(instance.getCapacity());

    fluent.withConditions(instance.getConditions());

    fluent.withPhase(instance.getPhase());

    fluent.withResizeStatus(instance.getResizeStatus());

    this.validationEnabled = validationEnabled;
  }

  public V1PersistentVolumeClaimStatusBuilder(
      io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatus instance) {
    this(instance, false);
  }

  public V1PersistentVolumeClaimStatusBuilder(
      io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatus instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withAccessModes(instance.getAccessModes());

    this.withAllocatedResources(instance.getAllocatedResources());

    this.withCapacity(instance.getCapacity());

    this.withConditions(instance.getConditions());

    this.withPhase(instance.getPhase());

    this.withResizeStatus(instance.getResizeStatus());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatusFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatus build() {
    V1PersistentVolumeClaimStatus buildable = new V1PersistentVolumeClaimStatus();
    buildable.setAccessModes(fluent.getAccessModes());
    buildable.setAllocatedResources(fluent.getAllocatedResources());
    buildable.setCapacity(fluent.getCapacity());
    buildable.setConditions(fluent.getConditions());
    buildable.setPhase(fluent.getPhase());
    buildable.setResizeStatus(fluent.getResizeStatus());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1PersistentVolumeClaimStatusBuilder that = (V1PersistentVolumeClaimStatusBuilder) o;
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

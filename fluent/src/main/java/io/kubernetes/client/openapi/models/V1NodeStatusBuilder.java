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

public class V1NodeStatusBuilder
    extends io.kubernetes.client.openapi.models.V1NodeStatusFluentImpl<
        io.kubernetes.client.openapi.models.V1NodeStatusBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1NodeStatus,
        io.kubernetes.client.openapi.models.V1NodeStatusBuilder> {
  public V1NodeStatusBuilder() {
    this(false);
  }

  public V1NodeStatusBuilder(java.lang.Boolean validationEnabled) {
    this(new V1NodeStatus(), validationEnabled);
  }

  public V1NodeStatusBuilder(io.kubernetes.client.openapi.models.V1NodeStatusFluent<?> fluent) {
    this(fluent, false);
  }

  public V1NodeStatusBuilder(
      io.kubernetes.client.openapi.models.V1NodeStatusFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1NodeStatus(), validationEnabled);
  }

  public V1NodeStatusBuilder(
      io.kubernetes.client.openapi.models.V1NodeStatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1NodeStatus instance) {
    this(fluent, instance, false);
  }

  public V1NodeStatusBuilder(
      io.kubernetes.client.openapi.models.V1NodeStatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1NodeStatus instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withAddresses(instance.getAddresses());

    fluent.withAllocatable(instance.getAllocatable());

    fluent.withCapacity(instance.getCapacity());

    fluent.withConditions(instance.getConditions());

    fluent.withConfig(instance.getConfig());

    fluent.withDaemonEndpoints(instance.getDaemonEndpoints());

    fluent.withImages(instance.getImages());

    fluent.withNodeInfo(instance.getNodeInfo());

    fluent.withPhase(instance.getPhase());

    fluent.withVolumesAttached(instance.getVolumesAttached());

    fluent.withVolumesInUse(instance.getVolumesInUse());

    this.validationEnabled = validationEnabled;
  }

  public V1NodeStatusBuilder(io.kubernetes.client.openapi.models.V1NodeStatus instance) {
    this(instance, false);
  }

  public V1NodeStatusBuilder(
      io.kubernetes.client.openapi.models.V1NodeStatus instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withAddresses(instance.getAddresses());

    this.withAllocatable(instance.getAllocatable());

    this.withCapacity(instance.getCapacity());

    this.withConditions(instance.getConditions());

    this.withConfig(instance.getConfig());

    this.withDaemonEndpoints(instance.getDaemonEndpoints());

    this.withImages(instance.getImages());

    this.withNodeInfo(instance.getNodeInfo());

    this.withPhase(instance.getPhase());

    this.withVolumesAttached(instance.getVolumesAttached());

    this.withVolumesInUse(instance.getVolumesInUse());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1NodeStatusFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1NodeStatus build() {
    V1NodeStatus buildable = new V1NodeStatus();
    buildable.setAddresses(fluent.getAddresses());
    buildable.setAllocatable(fluent.getAllocatable());
    buildable.setCapacity(fluent.getCapacity());
    buildable.setConditions(fluent.getConditions());
    buildable.setConfig(fluent.getConfig());
    buildable.setDaemonEndpoints(fluent.getDaemonEndpoints());
    buildable.setImages(fluent.getImages());
    buildable.setNodeInfo(fluent.getNodeInfo());
    buildable.setPhase(fluent.getPhase());
    buildable.setVolumesAttached(fluent.getVolumesAttached());
    buildable.setVolumesInUse(fluent.getVolumesInUse());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1NodeStatusBuilder that = (V1NodeStatusBuilder) o;
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

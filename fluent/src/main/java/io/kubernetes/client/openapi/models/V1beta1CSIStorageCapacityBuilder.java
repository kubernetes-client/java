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

public class V1beta1CSIStorageCapacityBuilder
    extends io.kubernetes.client.openapi.models.V1beta1CSIStorageCapacityFluentImpl<
        io.kubernetes.client.openapi.models.V1beta1CSIStorageCapacityBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1beta1CSIStorageCapacity,
        io.kubernetes.client.openapi.models.V1beta1CSIStorageCapacityBuilder> {
  public V1beta1CSIStorageCapacityBuilder() {
    this(false);
  }

  public V1beta1CSIStorageCapacityBuilder(java.lang.Boolean validationEnabled) {
    this(new V1beta1CSIStorageCapacity(), validationEnabled);
  }

  public V1beta1CSIStorageCapacityBuilder(
      io.kubernetes.client.openapi.models.V1beta1CSIStorageCapacityFluent<?> fluent) {
    this(fluent, false);
  }

  public V1beta1CSIStorageCapacityBuilder(
      io.kubernetes.client.openapi.models.V1beta1CSIStorageCapacityFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1beta1CSIStorageCapacity(), validationEnabled);
  }

  public V1beta1CSIStorageCapacityBuilder(
      io.kubernetes.client.openapi.models.V1beta1CSIStorageCapacityFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta1CSIStorageCapacity instance) {
    this(fluent, instance, false);
  }

  public V1beta1CSIStorageCapacityBuilder(
      io.kubernetes.client.openapi.models.V1beta1CSIStorageCapacityFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta1CSIStorageCapacity instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withCapacity(instance.getCapacity());

    fluent.withKind(instance.getKind());

    fluent.withMaximumVolumeSize(instance.getMaximumVolumeSize());

    fluent.withMetadata(instance.getMetadata());

    fluent.withNodeTopology(instance.getNodeTopology());

    fluent.withStorageClassName(instance.getStorageClassName());

    this.validationEnabled = validationEnabled;
  }

  public V1beta1CSIStorageCapacityBuilder(
      io.kubernetes.client.openapi.models.V1beta1CSIStorageCapacity instance) {
    this(instance, false);
  }

  public V1beta1CSIStorageCapacityBuilder(
      io.kubernetes.client.openapi.models.V1beta1CSIStorageCapacity instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withApiVersion(instance.getApiVersion());

    this.withCapacity(instance.getCapacity());

    this.withKind(instance.getKind());

    this.withMaximumVolumeSize(instance.getMaximumVolumeSize());

    this.withMetadata(instance.getMetadata());

    this.withNodeTopology(instance.getNodeTopology());

    this.withStorageClassName(instance.getStorageClassName());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1beta1CSIStorageCapacityFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1beta1CSIStorageCapacity build() {
    V1beta1CSIStorageCapacity buildable = new V1beta1CSIStorageCapacity();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setCapacity(fluent.getCapacity());
    buildable.setKind(fluent.getKind());
    buildable.setMaximumVolumeSize(fluent.getMaximumVolumeSize());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setNodeTopology(fluent.getNodeTopology());
    buildable.setStorageClassName(fluent.getStorageClassName());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1beta1CSIStorageCapacityBuilder that = (V1beta1CSIStorageCapacityBuilder) o;
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

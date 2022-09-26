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

public class V1CSIStorageCapacityBuilder
    extends V1CSIStorageCapacityFluentImpl<V1CSIStorageCapacityBuilder>
    implements VisitableBuilder<V1CSIStorageCapacity, V1CSIStorageCapacityBuilder> {
  public V1CSIStorageCapacityBuilder() {
    this(false);
  }

  public V1CSIStorageCapacityBuilder(Boolean validationEnabled) {
    this(new V1CSIStorageCapacity(), validationEnabled);
  }

  public V1CSIStorageCapacityBuilder(V1CSIStorageCapacityFluent<?> fluent) {
    this(fluent, false);
  }

  public V1CSIStorageCapacityBuilder(
      V1CSIStorageCapacityFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1CSIStorageCapacity(), validationEnabled);
  }

  public V1CSIStorageCapacityBuilder(
      V1CSIStorageCapacityFluent<?> fluent, V1CSIStorageCapacity instance) {
    this(fluent, instance, false);
  }

  public V1CSIStorageCapacityBuilder(
      V1CSIStorageCapacityFluent<?> fluent,
      V1CSIStorageCapacity instance,
      Boolean validationEnabled) {
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

  public V1CSIStorageCapacityBuilder(V1CSIStorageCapacity instance) {
    this(instance, false);
  }

  public V1CSIStorageCapacityBuilder(V1CSIStorageCapacity instance, Boolean validationEnabled) {
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

  V1CSIStorageCapacityFluent<?> fluent;
  Boolean validationEnabled;

  public V1CSIStorageCapacity build() {
    V1CSIStorageCapacity buildable = new V1CSIStorageCapacity();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setCapacity(fluent.getCapacity());
    buildable.setKind(fluent.getKind());
    buildable.setMaximumVolumeSize(fluent.getMaximumVolumeSize());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setNodeTopology(fluent.getNodeTopology());
    buildable.setStorageClassName(fluent.getStorageClassName());
    return buildable;
  }
}

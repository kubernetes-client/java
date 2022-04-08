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

public class V1CSINodeDriverBuilder extends V1CSINodeDriverFluentImpl<V1CSINodeDriverBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1CSINodeDriver, V1CSINodeDriverBuilder> {
  public V1CSINodeDriverBuilder() {
    this(false);
  }

  public V1CSINodeDriverBuilder(Boolean validationEnabled) {
    this(new V1CSINodeDriver(), validationEnabled);
  }

  public V1CSINodeDriverBuilder(
      io.kubernetes.client.openapi.models.V1CSINodeDriverFluent<?> fluent) {
    this(fluent, false);
  }

  public V1CSINodeDriverBuilder(
      io.kubernetes.client.openapi.models.V1CSINodeDriverFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1CSINodeDriver(), validationEnabled);
  }

  public V1CSINodeDriverBuilder(
      io.kubernetes.client.openapi.models.V1CSINodeDriverFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1CSINodeDriver instance) {
    this(fluent, instance, false);
  }

  public V1CSINodeDriverBuilder(
      io.kubernetes.client.openapi.models.V1CSINodeDriverFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1CSINodeDriver instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withAllocatable(instance.getAllocatable());

    fluent.withName(instance.getName());

    fluent.withNodeID(instance.getNodeID());

    fluent.withTopologyKeys(instance.getTopologyKeys());

    this.validationEnabled = validationEnabled;
  }

  public V1CSINodeDriverBuilder(io.kubernetes.client.openapi.models.V1CSINodeDriver instance) {
    this(instance, false);
  }

  public V1CSINodeDriverBuilder(
      io.kubernetes.client.openapi.models.V1CSINodeDriver instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withAllocatable(instance.getAllocatable());

    this.withName(instance.getName());

    this.withNodeID(instance.getNodeID());

    this.withTopologyKeys(instance.getTopologyKeys());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1CSINodeDriverFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1CSINodeDriver build() {
    V1CSINodeDriver buildable = new V1CSINodeDriver();
    buildable.setAllocatable(fluent.getAllocatable());
    buildable.setName(fluent.getName());
    buildable.setNodeID(fluent.getNodeID());
    buildable.setTopologyKeys(fluent.getTopologyKeys());
    return buildable;
  }
}

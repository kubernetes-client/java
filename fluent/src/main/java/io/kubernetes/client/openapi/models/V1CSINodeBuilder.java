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

public class V1CSINodeBuilder extends V1CSINodeFluentImpl<V1CSINodeBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1CSINode,
        io.kubernetes.client.openapi.models.V1CSINodeBuilder> {
  public V1CSINodeBuilder() {
    this(false);
  }

  public V1CSINodeBuilder(Boolean validationEnabled) {
    this(new V1CSINode(), validationEnabled);
  }

  public V1CSINodeBuilder(V1CSINodeFluent<?> fluent) {
    this(fluent, false);
  }

  public V1CSINodeBuilder(
      io.kubernetes.client.openapi.models.V1CSINodeFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1CSINode(), validationEnabled);
  }

  public V1CSINodeBuilder(
      io.kubernetes.client.openapi.models.V1CSINodeFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1CSINode instance) {
    this(fluent, instance, false);
  }

  public V1CSINodeBuilder(
      io.kubernetes.client.openapi.models.V1CSINodeFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1CSINode instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withSpec(instance.getSpec());

    this.validationEnabled = validationEnabled;
  }

  public V1CSINodeBuilder(io.kubernetes.client.openapi.models.V1CSINode instance) {
    this(instance, false);
  }

  public V1CSINodeBuilder(
      io.kubernetes.client.openapi.models.V1CSINode instance, java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1CSINodeFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1CSINode build() {
    V1CSINode buildable = new V1CSINode();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    return buildable;
  }
}

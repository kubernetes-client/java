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

public class V1ComponentStatusListBuilder
    extends V1ComponentStatusListFluentImpl<V1ComponentStatusListBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1ComponentStatusList, V1ComponentStatusListBuilder> {
  public V1ComponentStatusListBuilder() {
    this(false);
  }

  public V1ComponentStatusListBuilder(Boolean validationEnabled) {
    this(new V1ComponentStatusList(), validationEnabled);
  }

  public V1ComponentStatusListBuilder(V1ComponentStatusListFluent<?> fluent) {
    this(fluent, false);
  }

  public V1ComponentStatusListBuilder(
      io.kubernetes.client.openapi.models.V1ComponentStatusListFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1ComponentStatusList(), validationEnabled);
  }

  public V1ComponentStatusListBuilder(
      io.kubernetes.client.openapi.models.V1ComponentStatusListFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1ComponentStatusList instance) {
    this(fluent, instance, false);
  }

  public V1ComponentStatusListBuilder(
      io.kubernetes.client.openapi.models.V1ComponentStatusListFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1ComponentStatusList instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled;
  }

  public V1ComponentStatusListBuilder(
      io.kubernetes.client.openapi.models.V1ComponentStatusList instance) {
    this(instance, false);
  }

  public V1ComponentStatusListBuilder(
      io.kubernetes.client.openapi.models.V1ComponentStatusList instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1ComponentStatusListFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1ComponentStatusList build() {
    V1ComponentStatusList buildable = new V1ComponentStatusList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
}

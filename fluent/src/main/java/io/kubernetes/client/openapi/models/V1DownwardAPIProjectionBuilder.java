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

public class V1DownwardAPIProjectionBuilder
    extends V1DownwardAPIProjectionFluentImpl<V1DownwardAPIProjectionBuilder>
    implements VisitableBuilder<
        V1DownwardAPIProjection,
        io.kubernetes.client.openapi.models.V1DownwardAPIProjectionBuilder> {
  public V1DownwardAPIProjectionBuilder() {
    this(false);
  }

  public V1DownwardAPIProjectionBuilder(Boolean validationEnabled) {
    this(new V1DownwardAPIProjection(), validationEnabled);
  }

  public V1DownwardAPIProjectionBuilder(V1DownwardAPIProjectionFluent<?> fluent) {
    this(fluent, false);
  }

  public V1DownwardAPIProjectionBuilder(
      io.kubernetes.client.openapi.models.V1DownwardAPIProjectionFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1DownwardAPIProjection(), validationEnabled);
  }

  public V1DownwardAPIProjectionBuilder(
      io.kubernetes.client.openapi.models.V1DownwardAPIProjectionFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1DownwardAPIProjection instance) {
    this(fluent, instance, false);
  }

  public V1DownwardAPIProjectionBuilder(
      io.kubernetes.client.openapi.models.V1DownwardAPIProjectionFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1DownwardAPIProjection instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withItems(instance.getItems());

    this.validationEnabled = validationEnabled;
  }

  public V1DownwardAPIProjectionBuilder(
      io.kubernetes.client.openapi.models.V1DownwardAPIProjection instance) {
    this(instance, false);
  }

  public V1DownwardAPIProjectionBuilder(
      io.kubernetes.client.openapi.models.V1DownwardAPIProjection instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withItems(instance.getItems());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1DownwardAPIProjectionFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1DownwardAPIProjection build() {
    V1DownwardAPIProjection buildable = new V1DownwardAPIProjection();
    buildable.setItems(fluent.getItems());
    return buildable;
  }
}

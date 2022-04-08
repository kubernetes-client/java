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

public class V1RollingUpdateDaemonSetBuilder
    extends V1RollingUpdateDaemonSetFluentImpl<V1RollingUpdateDaemonSetBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSet,
        V1RollingUpdateDaemonSetBuilder> {
  public V1RollingUpdateDaemonSetBuilder() {
    this(false);
  }

  public V1RollingUpdateDaemonSetBuilder(Boolean validationEnabled) {
    this(new V1RollingUpdateDaemonSet(), validationEnabled);
  }

  public V1RollingUpdateDaemonSetBuilder(
      io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSetFluent<?> fluent) {
    this(fluent, false);
  }

  public V1RollingUpdateDaemonSetBuilder(
      io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSetFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1RollingUpdateDaemonSet(), validationEnabled);
  }

  public V1RollingUpdateDaemonSetBuilder(
      io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSetFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSet instance) {
    this(fluent, instance, false);
  }

  public V1RollingUpdateDaemonSetBuilder(
      io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSetFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSet instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withMaxSurge(instance.getMaxSurge());

    fluent.withMaxUnavailable(instance.getMaxUnavailable());

    this.validationEnabled = validationEnabled;
  }

  public V1RollingUpdateDaemonSetBuilder(
      io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSet instance) {
    this(instance, false);
  }

  public V1RollingUpdateDaemonSetBuilder(
      io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSet instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withMaxSurge(instance.getMaxSurge());

    this.withMaxUnavailable(instance.getMaxUnavailable());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSetFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSet build() {
    V1RollingUpdateDaemonSet buildable = new V1RollingUpdateDaemonSet();
    buildable.setMaxSurge(fluent.getMaxSurge());
    buildable.setMaxUnavailable(fluent.getMaxUnavailable());
    return buildable;
  }
}

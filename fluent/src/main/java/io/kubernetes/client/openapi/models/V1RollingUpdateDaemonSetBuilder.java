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

public class V1RollingUpdateDaemonSetBuilder
    extends io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSetFluentImpl<
        io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSetBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSet,
        io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSetBuilder> {
  public V1RollingUpdateDaemonSetBuilder() {
    this(false);
  }

  public V1RollingUpdateDaemonSetBuilder(java.lang.Boolean validationEnabled) {
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

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1RollingUpdateDaemonSetBuilder that = (V1RollingUpdateDaemonSetBuilder) o;
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

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

public class V1PodAffinityBuilder
    extends io.kubernetes.client.openapi.models.V1PodAffinityFluentImpl<
        io.kubernetes.client.openapi.models.V1PodAffinityBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1PodAffinity,
        io.kubernetes.client.openapi.models.V1PodAffinityBuilder> {
  public V1PodAffinityBuilder() {
    this(false);
  }

  public V1PodAffinityBuilder(java.lang.Boolean validationEnabled) {
    this(new V1PodAffinity(), validationEnabled);
  }

  public V1PodAffinityBuilder(io.kubernetes.client.openapi.models.V1PodAffinityFluent<?> fluent) {
    this(fluent, false);
  }

  public V1PodAffinityBuilder(
      io.kubernetes.client.openapi.models.V1PodAffinityFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1PodAffinity(), validationEnabled);
  }

  public V1PodAffinityBuilder(
      io.kubernetes.client.openapi.models.V1PodAffinityFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1PodAffinity instance) {
    this(fluent, instance, false);
  }

  public V1PodAffinityBuilder(
      io.kubernetes.client.openapi.models.V1PodAffinityFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1PodAffinity instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withPreferredDuringSchedulingIgnoredDuringExecution(
        instance.getPreferredDuringSchedulingIgnoredDuringExecution());

    fluent.withRequiredDuringSchedulingIgnoredDuringExecution(
        instance.getRequiredDuringSchedulingIgnoredDuringExecution());

    this.validationEnabled = validationEnabled;
  }

  public V1PodAffinityBuilder(io.kubernetes.client.openapi.models.V1PodAffinity instance) {
    this(instance, false);
  }

  public V1PodAffinityBuilder(
      io.kubernetes.client.openapi.models.V1PodAffinity instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withPreferredDuringSchedulingIgnoredDuringExecution(
        instance.getPreferredDuringSchedulingIgnoredDuringExecution());

    this.withRequiredDuringSchedulingIgnoredDuringExecution(
        instance.getRequiredDuringSchedulingIgnoredDuringExecution());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1PodAffinityFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1PodAffinity build() {
    V1PodAffinity buildable = new V1PodAffinity();
    buildable.setPreferredDuringSchedulingIgnoredDuringExecution(
        fluent.getPreferredDuringSchedulingIgnoredDuringExecution());
    buildable.setRequiredDuringSchedulingIgnoredDuringExecution(
        fluent.getRequiredDuringSchedulingIgnoredDuringExecution());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1PodAffinityBuilder that = (V1PodAffinityBuilder) o;
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

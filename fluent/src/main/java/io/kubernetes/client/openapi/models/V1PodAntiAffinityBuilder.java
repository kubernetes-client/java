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

public class V1PodAntiAffinityBuilder extends V1PodAntiAffinityFluentImpl<V1PodAntiAffinityBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1PodAntiAffinity, V1PodAntiAffinityBuilder> {
  public V1PodAntiAffinityBuilder() {
    this(false);
  }

  public V1PodAntiAffinityBuilder(Boolean validationEnabled) {
    this(new V1PodAntiAffinity(), validationEnabled);
  }

  public V1PodAntiAffinityBuilder(V1PodAntiAffinityFluent<?> fluent) {
    this(fluent, false);
  }

  public V1PodAntiAffinityBuilder(
      io.kubernetes.client.openapi.models.V1PodAntiAffinityFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1PodAntiAffinity(), validationEnabled);
  }

  public V1PodAntiAffinityBuilder(
      io.kubernetes.client.openapi.models.V1PodAntiAffinityFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1PodAntiAffinity instance) {
    this(fluent, instance, false);
  }

  public V1PodAntiAffinityBuilder(
      io.kubernetes.client.openapi.models.V1PodAntiAffinityFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1PodAntiAffinity instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withPreferredDuringSchedulingIgnoredDuringExecution(
        instance.getPreferredDuringSchedulingIgnoredDuringExecution());

    fluent.withRequiredDuringSchedulingIgnoredDuringExecution(
        instance.getRequiredDuringSchedulingIgnoredDuringExecution());

    this.validationEnabled = validationEnabled;
  }

  public V1PodAntiAffinityBuilder(io.kubernetes.client.openapi.models.V1PodAntiAffinity instance) {
    this(instance, false);
  }

  public V1PodAntiAffinityBuilder(
      io.kubernetes.client.openapi.models.V1PodAntiAffinity instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withPreferredDuringSchedulingIgnoredDuringExecution(
        instance.getPreferredDuringSchedulingIgnoredDuringExecution());

    this.withRequiredDuringSchedulingIgnoredDuringExecution(
        instance.getRequiredDuringSchedulingIgnoredDuringExecution());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1PodAntiAffinityFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1PodAntiAffinity build() {
    V1PodAntiAffinity buildable = new V1PodAntiAffinity();
    buildable.setPreferredDuringSchedulingIgnoredDuringExecution(
        fluent.getPreferredDuringSchedulingIgnoredDuringExecution());
    buildable.setRequiredDuringSchedulingIgnoredDuringExecution(
        fluent.getRequiredDuringSchedulingIgnoredDuringExecution());
    return buildable;
  }
}

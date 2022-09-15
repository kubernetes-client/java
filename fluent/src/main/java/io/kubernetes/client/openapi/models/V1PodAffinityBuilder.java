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

public class V1PodAffinityBuilder extends V1PodAffinityFluentImpl<V1PodAffinityBuilder>
    implements VisitableBuilder<V1PodAffinity, V1PodAffinityBuilder> {
  public V1PodAffinityBuilder() {
    this(false);
  }

  public V1PodAffinityBuilder(Boolean validationEnabled) {
    this(new V1PodAffinity(), validationEnabled);
  }

  public V1PodAffinityBuilder(V1PodAffinityFluent<?> fluent) {
    this(fluent, false);
  }

  public V1PodAffinityBuilder(V1PodAffinityFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1PodAffinity(), validationEnabled);
  }

  public V1PodAffinityBuilder(V1PodAffinityFluent<?> fluent, V1PodAffinity instance) {
    this(fluent, instance, false);
  }

  public V1PodAffinityBuilder(
      V1PodAffinityFluent<?> fluent, V1PodAffinity instance, Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withPreferredDuringSchedulingIgnoredDuringExecution(
        instance.getPreferredDuringSchedulingIgnoredDuringExecution());

    fluent.withRequiredDuringSchedulingIgnoredDuringExecution(
        instance.getRequiredDuringSchedulingIgnoredDuringExecution());

    this.validationEnabled = validationEnabled;
  }

  public V1PodAffinityBuilder(V1PodAffinity instance) {
    this(instance, false);
  }

  public V1PodAffinityBuilder(V1PodAffinity instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withPreferredDuringSchedulingIgnoredDuringExecution(
        instance.getPreferredDuringSchedulingIgnoredDuringExecution());

    this.withRequiredDuringSchedulingIgnoredDuringExecution(
        instance.getRequiredDuringSchedulingIgnoredDuringExecution());

    this.validationEnabled = validationEnabled;
  }

  V1PodAffinityFluent<?> fluent;
  Boolean validationEnabled;

  public V1PodAffinity build() {
    V1PodAffinity buildable = new V1PodAffinity();
    buildable.setPreferredDuringSchedulingIgnoredDuringExecution(
        fluent.getPreferredDuringSchedulingIgnoredDuringExecution());
    buildable.setRequiredDuringSchedulingIgnoredDuringExecution(
        fluent.getRequiredDuringSchedulingIgnoredDuringExecution());
    return buildable;
  }
}

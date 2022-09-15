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

public class V1NodeAffinityBuilder extends V1NodeAffinityFluentImpl<V1NodeAffinityBuilder>
    implements VisitableBuilder<V1NodeAffinity, V1NodeAffinityBuilder> {
  public V1NodeAffinityBuilder() {
    this(false);
  }

  public V1NodeAffinityBuilder(Boolean validationEnabled) {
    this(new V1NodeAffinity(), validationEnabled);
  }

  public V1NodeAffinityBuilder(V1NodeAffinityFluent<?> fluent) {
    this(fluent, false);
  }

  public V1NodeAffinityBuilder(V1NodeAffinityFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1NodeAffinity(), validationEnabled);
  }

  public V1NodeAffinityBuilder(V1NodeAffinityFluent<?> fluent, V1NodeAffinity instance) {
    this(fluent, instance, false);
  }

  public V1NodeAffinityBuilder(
      V1NodeAffinityFluent<?> fluent, V1NodeAffinity instance, Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withPreferredDuringSchedulingIgnoredDuringExecution(
        instance.getPreferredDuringSchedulingIgnoredDuringExecution());

    fluent.withRequiredDuringSchedulingIgnoredDuringExecution(
        instance.getRequiredDuringSchedulingIgnoredDuringExecution());

    this.validationEnabled = validationEnabled;
  }

  public V1NodeAffinityBuilder(V1NodeAffinity instance) {
    this(instance, false);
  }

  public V1NodeAffinityBuilder(V1NodeAffinity instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withPreferredDuringSchedulingIgnoredDuringExecution(
        instance.getPreferredDuringSchedulingIgnoredDuringExecution());

    this.withRequiredDuringSchedulingIgnoredDuringExecution(
        instance.getRequiredDuringSchedulingIgnoredDuringExecution());

    this.validationEnabled = validationEnabled;
  }

  V1NodeAffinityFluent<?> fluent;
  Boolean validationEnabled;

  public V1NodeAffinity build() {
    V1NodeAffinity buildable = new V1NodeAffinity();
    buildable.setPreferredDuringSchedulingIgnoredDuringExecution(
        fluent.getPreferredDuringSchedulingIgnoredDuringExecution());
    buildable.setRequiredDuringSchedulingIgnoredDuringExecution(
        fluent.getRequiredDuringSchedulingIgnoredDuringExecution());
    return buildable;
  }
}

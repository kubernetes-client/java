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

public class V1RollingUpdateStatefulSetStrategyBuilder
    extends V1RollingUpdateStatefulSetStrategyFluentImpl<V1RollingUpdateStatefulSetStrategyBuilder>
    implements VisitableBuilder<
        V1RollingUpdateStatefulSetStrategy, V1RollingUpdateStatefulSetStrategyBuilder> {
  public V1RollingUpdateStatefulSetStrategyBuilder() {
    this(false);
  }

  public V1RollingUpdateStatefulSetStrategyBuilder(Boolean validationEnabled) {
    this(new V1RollingUpdateStatefulSetStrategy(), validationEnabled);
  }

  public V1RollingUpdateStatefulSetStrategyBuilder(
      V1RollingUpdateStatefulSetStrategyFluent<?> fluent) {
    this(fluent, false);
  }

  public V1RollingUpdateStatefulSetStrategyBuilder(
      V1RollingUpdateStatefulSetStrategyFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1RollingUpdateStatefulSetStrategy(), validationEnabled);
  }

  public V1RollingUpdateStatefulSetStrategyBuilder(
      V1RollingUpdateStatefulSetStrategyFluent<?> fluent,
      V1RollingUpdateStatefulSetStrategy instance) {
    this(fluent, instance, false);
  }

  public V1RollingUpdateStatefulSetStrategyBuilder(
      V1RollingUpdateStatefulSetStrategyFluent<?> fluent,
      V1RollingUpdateStatefulSetStrategy instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withMaxUnavailable(instance.getMaxUnavailable());

    fluent.withPartition(instance.getPartition());

    this.validationEnabled = validationEnabled;
  }

  public V1RollingUpdateStatefulSetStrategyBuilder(V1RollingUpdateStatefulSetStrategy instance) {
    this(instance, false);
  }

  public V1RollingUpdateStatefulSetStrategyBuilder(
      V1RollingUpdateStatefulSetStrategy instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withMaxUnavailable(instance.getMaxUnavailable());

    this.withPartition(instance.getPartition());

    this.validationEnabled = validationEnabled;
  }

  V1RollingUpdateStatefulSetStrategyFluent<?> fluent;
  Boolean validationEnabled;

  public V1RollingUpdateStatefulSetStrategy build() {
    V1RollingUpdateStatefulSetStrategy buildable = new V1RollingUpdateStatefulSetStrategy();
    buildable.setMaxUnavailable(fluent.getMaxUnavailable());
    buildable.setPartition(fluent.getPartition());
    return buildable;
  }
}

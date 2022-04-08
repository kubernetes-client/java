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

public class V1DaemonSetUpdateStrategyBuilder
    extends V1DaemonSetUpdateStrategyFluentImpl<V1DaemonSetUpdateStrategyBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategy,
        io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategyBuilder> {
  public V1DaemonSetUpdateStrategyBuilder() {
    this(false);
  }

  public V1DaemonSetUpdateStrategyBuilder(Boolean validationEnabled) {
    this(new V1DaemonSetUpdateStrategy(), validationEnabled);
  }

  public V1DaemonSetUpdateStrategyBuilder(V1DaemonSetUpdateStrategyFluent<?> fluent) {
    this(fluent, false);
  }

  public V1DaemonSetUpdateStrategyBuilder(
      io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategyFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1DaemonSetUpdateStrategy(), validationEnabled);
  }

  public V1DaemonSetUpdateStrategyBuilder(
      io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategyFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategy instance) {
    this(fluent, instance, false);
  }

  public V1DaemonSetUpdateStrategyBuilder(
      io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategyFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategy instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withRollingUpdate(instance.getRollingUpdate());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled;
  }

  public V1DaemonSetUpdateStrategyBuilder(
      io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategy instance) {
    this(instance, false);
  }

  public V1DaemonSetUpdateStrategyBuilder(
      io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategy instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withRollingUpdate(instance.getRollingUpdate());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategyFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategy build() {
    V1DaemonSetUpdateStrategy buildable = new V1DaemonSetUpdateStrategy();
    buildable.setRollingUpdate(fluent.getRollingUpdate());
    buildable.setType(fluent.getType());
    return buildable;
  }
}

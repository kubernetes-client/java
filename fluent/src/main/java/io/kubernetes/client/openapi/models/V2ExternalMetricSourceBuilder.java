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

public class V2ExternalMetricSourceBuilder
    extends V2ExternalMetricSourceFluentImpl<V2ExternalMetricSourceBuilder>
    implements VisitableBuilder<
        V2ExternalMetricSource, io.kubernetes.client.openapi.models.V2ExternalMetricSourceBuilder> {
  public V2ExternalMetricSourceBuilder() {
    this(false);
  }

  public V2ExternalMetricSourceBuilder(Boolean validationEnabled) {
    this(new V2ExternalMetricSource(), validationEnabled);
  }

  public V2ExternalMetricSourceBuilder(
      io.kubernetes.client.openapi.models.V2ExternalMetricSourceFluent<?> fluent) {
    this(fluent, false);
  }

  public V2ExternalMetricSourceBuilder(
      io.kubernetes.client.openapi.models.V2ExternalMetricSourceFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V2ExternalMetricSource(), validationEnabled);
  }

  public V2ExternalMetricSourceBuilder(
      io.kubernetes.client.openapi.models.V2ExternalMetricSourceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V2ExternalMetricSource instance) {
    this(fluent, instance, false);
  }

  public V2ExternalMetricSourceBuilder(
      io.kubernetes.client.openapi.models.V2ExternalMetricSourceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V2ExternalMetricSource instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withMetric(instance.getMetric());

    fluent.withTarget(instance.getTarget());

    this.validationEnabled = validationEnabled;
  }

  public V2ExternalMetricSourceBuilder(
      io.kubernetes.client.openapi.models.V2ExternalMetricSource instance) {
    this(instance, false);
  }

  public V2ExternalMetricSourceBuilder(
      io.kubernetes.client.openapi.models.V2ExternalMetricSource instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withMetric(instance.getMetric());

    this.withTarget(instance.getTarget());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V2ExternalMetricSourceFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V2ExternalMetricSource build() {
    V2ExternalMetricSource buildable = new V2ExternalMetricSource();
    buildable.setMetric(fluent.getMetric());
    buildable.setTarget(fluent.getTarget());
    return buildable;
  }
}

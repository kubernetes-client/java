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

public class V2ResourceMetricSourceBuilder
    extends V2ResourceMetricSourceFluentImpl<V2ResourceMetricSourceBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V2ResourceMetricSource,
        io.kubernetes.client.openapi.models.V2ResourceMetricSourceBuilder> {
  public V2ResourceMetricSourceBuilder() {
    this(false);
  }

  public V2ResourceMetricSourceBuilder(Boolean validationEnabled) {
    this(new V2ResourceMetricSource(), validationEnabled);
  }

  public V2ResourceMetricSourceBuilder(V2ResourceMetricSourceFluent<?> fluent) {
    this(fluent, false);
  }

  public V2ResourceMetricSourceBuilder(
      io.kubernetes.client.openapi.models.V2ResourceMetricSourceFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V2ResourceMetricSource(), validationEnabled);
  }

  public V2ResourceMetricSourceBuilder(
      io.kubernetes.client.openapi.models.V2ResourceMetricSourceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V2ResourceMetricSource instance) {
    this(fluent, instance, false);
  }

  public V2ResourceMetricSourceBuilder(
      io.kubernetes.client.openapi.models.V2ResourceMetricSourceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V2ResourceMetricSource instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withName(instance.getName());

    fluent.withTarget(instance.getTarget());

    this.validationEnabled = validationEnabled;
  }

  public V2ResourceMetricSourceBuilder(
      io.kubernetes.client.openapi.models.V2ResourceMetricSource instance) {
    this(instance, false);
  }

  public V2ResourceMetricSourceBuilder(
      io.kubernetes.client.openapi.models.V2ResourceMetricSource instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withName(instance.getName());

    this.withTarget(instance.getTarget());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V2ResourceMetricSourceFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V2ResourceMetricSource build() {
    V2ResourceMetricSource buildable = new V2ResourceMetricSource();
    buildable.setName(fluent.getName());
    buildable.setTarget(fluent.getTarget());
    return buildable;
  }
}

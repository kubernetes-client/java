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

public class V2beta2PodsMetricSourceBuilder
    extends V2beta2PodsMetricSourceFluentImpl<V2beta2PodsMetricSourceBuilder>
    implements VisitableBuilder<V2beta2PodsMetricSource, V2beta2PodsMetricSourceBuilder> {
  public V2beta2PodsMetricSourceBuilder() {
    this(false);
  }

  public V2beta2PodsMetricSourceBuilder(Boolean validationEnabled) {
    this(new V2beta2PodsMetricSource(), validationEnabled);
  }

  public V2beta2PodsMetricSourceBuilder(V2beta2PodsMetricSourceFluent<?> fluent) {
    this(fluent, false);
  }

  public V2beta2PodsMetricSourceBuilder(
      V2beta2PodsMetricSourceFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V2beta2PodsMetricSource(), validationEnabled);
  }

  public V2beta2PodsMetricSourceBuilder(
      V2beta2PodsMetricSourceFluent<?> fluent, V2beta2PodsMetricSource instance) {
    this(fluent, instance, false);
  }

  public V2beta2PodsMetricSourceBuilder(
      V2beta2PodsMetricSourceFluent<?> fluent,
      V2beta2PodsMetricSource instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withMetric(instance.getMetric());

    fluent.withTarget(instance.getTarget());

    this.validationEnabled = validationEnabled;
  }

  public V2beta2PodsMetricSourceBuilder(V2beta2PodsMetricSource instance) {
    this(instance, false);
  }

  public V2beta2PodsMetricSourceBuilder(
      V2beta2PodsMetricSource instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withMetric(instance.getMetric());

    this.withTarget(instance.getTarget());

    this.validationEnabled = validationEnabled;
  }

  V2beta2PodsMetricSourceFluent<?> fluent;
  Boolean validationEnabled;

  public V2beta2PodsMetricSource build() {
    V2beta2PodsMetricSource buildable = new V2beta2PodsMetricSource();
    buildable.setMetric(fluent.getMetric());
    buildable.setTarget(fluent.getTarget());
    return buildable;
  }
}

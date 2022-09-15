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

public class V2beta2ObjectMetricSourceBuilder
    extends V2beta2ObjectMetricSourceFluentImpl<V2beta2ObjectMetricSourceBuilder>
    implements VisitableBuilder<V2beta2ObjectMetricSource, V2beta2ObjectMetricSourceBuilder> {
  public V2beta2ObjectMetricSourceBuilder() {
    this(false);
  }

  public V2beta2ObjectMetricSourceBuilder(Boolean validationEnabled) {
    this(new V2beta2ObjectMetricSource(), validationEnabled);
  }

  public V2beta2ObjectMetricSourceBuilder(V2beta2ObjectMetricSourceFluent<?> fluent) {
    this(fluent, false);
  }

  public V2beta2ObjectMetricSourceBuilder(
      V2beta2ObjectMetricSourceFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V2beta2ObjectMetricSource(), validationEnabled);
  }

  public V2beta2ObjectMetricSourceBuilder(
      V2beta2ObjectMetricSourceFluent<?> fluent, V2beta2ObjectMetricSource instance) {
    this(fluent, instance, false);
  }

  public V2beta2ObjectMetricSourceBuilder(
      V2beta2ObjectMetricSourceFluent<?> fluent,
      V2beta2ObjectMetricSource instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withDescribedObject(instance.getDescribedObject());

    fluent.withMetric(instance.getMetric());

    fluent.withTarget(instance.getTarget());

    this.validationEnabled = validationEnabled;
  }

  public V2beta2ObjectMetricSourceBuilder(V2beta2ObjectMetricSource instance) {
    this(instance, false);
  }

  public V2beta2ObjectMetricSourceBuilder(
      V2beta2ObjectMetricSource instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withDescribedObject(instance.getDescribedObject());

    this.withMetric(instance.getMetric());

    this.withTarget(instance.getTarget());

    this.validationEnabled = validationEnabled;
  }

  V2beta2ObjectMetricSourceFluent<?> fluent;
  Boolean validationEnabled;

  public V2beta2ObjectMetricSource build() {
    V2beta2ObjectMetricSource buildable = new V2beta2ObjectMetricSource();
    buildable.setDescribedObject(fluent.getDescribedObject());
    buildable.setMetric(fluent.getMetric());
    buildable.setTarget(fluent.getTarget());
    return buildable;
  }
}

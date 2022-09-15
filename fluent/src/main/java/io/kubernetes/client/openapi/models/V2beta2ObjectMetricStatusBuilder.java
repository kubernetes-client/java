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

public class V2beta2ObjectMetricStatusBuilder
    extends V2beta2ObjectMetricStatusFluentImpl<V2beta2ObjectMetricStatusBuilder>
    implements VisitableBuilder<V2beta2ObjectMetricStatus, V2beta2ObjectMetricStatusBuilder> {
  public V2beta2ObjectMetricStatusBuilder() {
    this(false);
  }

  public V2beta2ObjectMetricStatusBuilder(Boolean validationEnabled) {
    this(new V2beta2ObjectMetricStatus(), validationEnabled);
  }

  public V2beta2ObjectMetricStatusBuilder(V2beta2ObjectMetricStatusFluent<?> fluent) {
    this(fluent, false);
  }

  public V2beta2ObjectMetricStatusBuilder(
      V2beta2ObjectMetricStatusFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V2beta2ObjectMetricStatus(), validationEnabled);
  }

  public V2beta2ObjectMetricStatusBuilder(
      V2beta2ObjectMetricStatusFluent<?> fluent, V2beta2ObjectMetricStatus instance) {
    this(fluent, instance, false);
  }

  public V2beta2ObjectMetricStatusBuilder(
      V2beta2ObjectMetricStatusFluent<?> fluent,
      V2beta2ObjectMetricStatus instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withCurrent(instance.getCurrent());

    fluent.withDescribedObject(instance.getDescribedObject());

    fluent.withMetric(instance.getMetric());

    this.validationEnabled = validationEnabled;
  }

  public V2beta2ObjectMetricStatusBuilder(V2beta2ObjectMetricStatus instance) {
    this(instance, false);
  }

  public V2beta2ObjectMetricStatusBuilder(
      V2beta2ObjectMetricStatus instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withCurrent(instance.getCurrent());

    this.withDescribedObject(instance.getDescribedObject());

    this.withMetric(instance.getMetric());

    this.validationEnabled = validationEnabled;
  }

  V2beta2ObjectMetricStatusFluent<?> fluent;
  Boolean validationEnabled;

  public V2beta2ObjectMetricStatus build() {
    V2beta2ObjectMetricStatus buildable = new V2beta2ObjectMetricStatus();
    buildable.setCurrent(fluent.getCurrent());
    buildable.setDescribedObject(fluent.getDescribedObject());
    buildable.setMetric(fluent.getMetric());
    return buildable;
  }
}

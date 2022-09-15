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

public class V2MetricValueStatusBuilder
    extends V2MetricValueStatusFluentImpl<V2MetricValueStatusBuilder>
    implements VisitableBuilder<V2MetricValueStatus, V2MetricValueStatusBuilder> {
  public V2MetricValueStatusBuilder() {
    this(false);
  }

  public V2MetricValueStatusBuilder(Boolean validationEnabled) {
    this(new V2MetricValueStatus(), validationEnabled);
  }

  public V2MetricValueStatusBuilder(V2MetricValueStatusFluent<?> fluent) {
    this(fluent, false);
  }

  public V2MetricValueStatusBuilder(
      V2MetricValueStatusFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V2MetricValueStatus(), validationEnabled);
  }

  public V2MetricValueStatusBuilder(
      V2MetricValueStatusFluent<?> fluent, V2MetricValueStatus instance) {
    this(fluent, instance, false);
  }

  public V2MetricValueStatusBuilder(
      V2MetricValueStatusFluent<?> fluent,
      V2MetricValueStatus instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withAverageUtilization(instance.getAverageUtilization());

    fluent.withAverageValue(instance.getAverageValue());

    fluent.withValue(instance.getValue());

    this.validationEnabled = validationEnabled;
  }

  public V2MetricValueStatusBuilder(V2MetricValueStatus instance) {
    this(instance, false);
  }

  public V2MetricValueStatusBuilder(V2MetricValueStatus instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withAverageUtilization(instance.getAverageUtilization());

    this.withAverageValue(instance.getAverageValue());

    this.withValue(instance.getValue());

    this.validationEnabled = validationEnabled;
  }

  V2MetricValueStatusFluent<?> fluent;
  Boolean validationEnabled;

  public V2MetricValueStatus build() {
    V2MetricValueStatus buildable = new V2MetricValueStatus();
    buildable.setAverageUtilization(fluent.getAverageUtilization());
    buildable.setAverageValue(fluent.getAverageValue());
    buildable.setValue(fluent.getValue());
    return buildable;
  }
}

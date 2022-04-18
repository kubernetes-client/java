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

public class V2beta2MetricValueStatusBuilder
    extends V2beta2MetricValueStatusFluentImpl<V2beta2MetricValueStatusBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V2beta2MetricValueStatus,
        V2beta2MetricValueStatusBuilder> {
  public V2beta2MetricValueStatusBuilder() {
    this(false);
  }

  public V2beta2MetricValueStatusBuilder(Boolean validationEnabled) {
    this(new V2beta2MetricValueStatus(), validationEnabled);
  }

  public V2beta2MetricValueStatusBuilder(V2beta2MetricValueStatusFluent<?> fluent) {
    this(fluent, false);
  }

  public V2beta2MetricValueStatusBuilder(
      io.kubernetes.client.openapi.models.V2beta2MetricValueStatusFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V2beta2MetricValueStatus(), validationEnabled);
  }

  public V2beta2MetricValueStatusBuilder(
      io.kubernetes.client.openapi.models.V2beta2MetricValueStatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V2beta2MetricValueStatus instance) {
    this(fluent, instance, false);
  }

  public V2beta2MetricValueStatusBuilder(
      io.kubernetes.client.openapi.models.V2beta2MetricValueStatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V2beta2MetricValueStatus instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withAverageUtilization(instance.getAverageUtilization());

    fluent.withAverageValue(instance.getAverageValue());

    fluent.withValue(instance.getValue());

    this.validationEnabled = validationEnabled;
  }

  public V2beta2MetricValueStatusBuilder(
      io.kubernetes.client.openapi.models.V2beta2MetricValueStatus instance) {
    this(instance, false);
  }

  public V2beta2MetricValueStatusBuilder(
      io.kubernetes.client.openapi.models.V2beta2MetricValueStatus instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withAverageUtilization(instance.getAverageUtilization());

    this.withAverageValue(instance.getAverageValue());

    this.withValue(instance.getValue());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V2beta2MetricValueStatusFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V2beta2MetricValueStatus build() {
    V2beta2MetricValueStatus buildable = new V2beta2MetricValueStatus();
    buildable.setAverageUtilization(fluent.getAverageUtilization());
    buildable.setAverageValue(fluent.getAverageValue());
    buildable.setValue(fluent.getValue());
    return buildable;
  }
}

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

public class V2MetricTargetBuilder extends V2MetricTargetFluentImpl<V2MetricTargetBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V2MetricTarget,
        io.kubernetes.client.openapi.models.V2MetricTargetBuilder> {
  public V2MetricTargetBuilder() {
    this(false);
  }

  public V2MetricTargetBuilder(Boolean validationEnabled) {
    this(new V2MetricTarget(), validationEnabled);
  }

  public V2MetricTargetBuilder(V2MetricTargetFluent<?> fluent) {
    this(fluent, false);
  }

  public V2MetricTargetBuilder(
      io.kubernetes.client.openapi.models.V2MetricTargetFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V2MetricTarget(), validationEnabled);
  }

  public V2MetricTargetBuilder(
      io.kubernetes.client.openapi.models.V2MetricTargetFluent<?> fluent,
      io.kubernetes.client.openapi.models.V2MetricTarget instance) {
    this(fluent, instance, false);
  }

  public V2MetricTargetBuilder(
      io.kubernetes.client.openapi.models.V2MetricTargetFluent<?> fluent,
      io.kubernetes.client.openapi.models.V2MetricTarget instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withAverageUtilization(instance.getAverageUtilization());

    fluent.withAverageValue(instance.getAverageValue());

    fluent.withType(instance.getType());

    fluent.withValue(instance.getValue());

    this.validationEnabled = validationEnabled;
  }

  public V2MetricTargetBuilder(io.kubernetes.client.openapi.models.V2MetricTarget instance) {
    this(instance, false);
  }

  public V2MetricTargetBuilder(
      io.kubernetes.client.openapi.models.V2MetricTarget instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withAverageUtilization(instance.getAverageUtilization());

    this.withAverageValue(instance.getAverageValue());

    this.withType(instance.getType());

    this.withValue(instance.getValue());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V2MetricTargetFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V2MetricTarget build() {
    V2MetricTarget buildable = new V2MetricTarget();
    buildable.setAverageUtilization(fluent.getAverageUtilization());
    buildable.setAverageValue(fluent.getAverageValue());
    buildable.setType(fluent.getType());
    buildable.setValue(fluent.getValue());
    return buildable;
  }
}

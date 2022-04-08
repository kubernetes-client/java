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

public class V2beta1ObjectMetricStatusBuilder
    extends V2beta1ObjectMetricStatusFluentImpl<V2beta1ObjectMetricStatusBuilder>
    implements VisitableBuilder<
        V2beta1ObjectMetricStatus,
        io.kubernetes.client.openapi.models.V2beta1ObjectMetricStatusBuilder> {
  public V2beta1ObjectMetricStatusBuilder() {
    this(false);
  }

  public V2beta1ObjectMetricStatusBuilder(Boolean validationEnabled) {
    this(new V2beta1ObjectMetricStatus(), validationEnabled);
  }

  public V2beta1ObjectMetricStatusBuilder(V2beta1ObjectMetricStatusFluent<?> fluent) {
    this(fluent, false);
  }

  public V2beta1ObjectMetricStatusBuilder(
      io.kubernetes.client.openapi.models.V2beta1ObjectMetricStatusFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V2beta1ObjectMetricStatus(), validationEnabled);
  }

  public V2beta1ObjectMetricStatusBuilder(
      io.kubernetes.client.openapi.models.V2beta1ObjectMetricStatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V2beta1ObjectMetricStatus instance) {
    this(fluent, instance, false);
  }

  public V2beta1ObjectMetricStatusBuilder(
      io.kubernetes.client.openapi.models.V2beta1ObjectMetricStatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V2beta1ObjectMetricStatus instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withAverageValue(instance.getAverageValue());

    fluent.withCurrentValue(instance.getCurrentValue());

    fluent.withMetricName(instance.getMetricName());

    fluent.withSelector(instance.getSelector());

    fluent.withTarget(instance.getTarget());

    this.validationEnabled = validationEnabled;
  }

  public V2beta1ObjectMetricStatusBuilder(
      io.kubernetes.client.openapi.models.V2beta1ObjectMetricStatus instance) {
    this(instance, false);
  }

  public V2beta1ObjectMetricStatusBuilder(
      io.kubernetes.client.openapi.models.V2beta1ObjectMetricStatus instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withAverageValue(instance.getAverageValue());

    this.withCurrentValue(instance.getCurrentValue());

    this.withMetricName(instance.getMetricName());

    this.withSelector(instance.getSelector());

    this.withTarget(instance.getTarget());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V2beta1ObjectMetricStatusFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V2beta1ObjectMetricStatus build() {
    V2beta1ObjectMetricStatus buildable = new V2beta1ObjectMetricStatus();
    buildable.setAverageValue(fluent.getAverageValue());
    buildable.setCurrentValue(fluent.getCurrentValue());
    buildable.setMetricName(fluent.getMetricName());
    buildable.setSelector(fluent.getSelector());
    buildable.setTarget(fluent.getTarget());
    return buildable;
  }
}

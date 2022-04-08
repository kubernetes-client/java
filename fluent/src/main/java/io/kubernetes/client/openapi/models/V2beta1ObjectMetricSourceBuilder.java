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

public class V2beta1ObjectMetricSourceBuilder
    extends V2beta1ObjectMetricSourceFluentImpl<V2beta1ObjectMetricSourceBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V2beta1ObjectMetricSource,
        io.kubernetes.client.openapi.models.V2beta1ObjectMetricSourceBuilder> {
  public V2beta1ObjectMetricSourceBuilder() {
    this(false);
  }

  public V2beta1ObjectMetricSourceBuilder(Boolean validationEnabled) {
    this(new V2beta1ObjectMetricSource(), validationEnabled);
  }

  public V2beta1ObjectMetricSourceBuilder(V2beta1ObjectMetricSourceFluent<?> fluent) {
    this(fluent, false);
  }

  public V2beta1ObjectMetricSourceBuilder(
      io.kubernetes.client.openapi.models.V2beta1ObjectMetricSourceFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V2beta1ObjectMetricSource(), validationEnabled);
  }

  public V2beta1ObjectMetricSourceBuilder(
      io.kubernetes.client.openapi.models.V2beta1ObjectMetricSourceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V2beta1ObjectMetricSource instance) {
    this(fluent, instance, false);
  }

  public V2beta1ObjectMetricSourceBuilder(
      io.kubernetes.client.openapi.models.V2beta1ObjectMetricSourceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V2beta1ObjectMetricSource instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withAverageValue(instance.getAverageValue());

    fluent.withMetricName(instance.getMetricName());

    fluent.withSelector(instance.getSelector());

    fluent.withTarget(instance.getTarget());

    fluent.withTargetValue(instance.getTargetValue());

    this.validationEnabled = validationEnabled;
  }

  public V2beta1ObjectMetricSourceBuilder(
      io.kubernetes.client.openapi.models.V2beta1ObjectMetricSource instance) {
    this(instance, false);
  }

  public V2beta1ObjectMetricSourceBuilder(
      io.kubernetes.client.openapi.models.V2beta1ObjectMetricSource instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withAverageValue(instance.getAverageValue());

    this.withMetricName(instance.getMetricName());

    this.withSelector(instance.getSelector());

    this.withTarget(instance.getTarget());

    this.withTargetValue(instance.getTargetValue());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V2beta1ObjectMetricSourceFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V2beta1ObjectMetricSource build() {
    V2beta1ObjectMetricSource buildable = new V2beta1ObjectMetricSource();
    buildable.setAverageValue(fluent.getAverageValue());
    buildable.setMetricName(fluent.getMetricName());
    buildable.setSelector(fluent.getSelector());
    buildable.setTarget(fluent.getTarget());
    buildable.setTargetValue(fluent.getTargetValue());
    return buildable;
  }
}

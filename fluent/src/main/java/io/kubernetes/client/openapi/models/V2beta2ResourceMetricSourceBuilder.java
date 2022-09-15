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

public class V2beta2ResourceMetricSourceBuilder
    extends V2beta2ResourceMetricSourceFluentImpl<V2beta2ResourceMetricSourceBuilder>
    implements VisitableBuilder<V2beta2ResourceMetricSource, V2beta2ResourceMetricSourceBuilder> {
  public V2beta2ResourceMetricSourceBuilder() {
    this(false);
  }

  public V2beta2ResourceMetricSourceBuilder(Boolean validationEnabled) {
    this(new V2beta2ResourceMetricSource(), validationEnabled);
  }

  public V2beta2ResourceMetricSourceBuilder(V2beta2ResourceMetricSourceFluent<?> fluent) {
    this(fluent, false);
  }

  public V2beta2ResourceMetricSourceBuilder(
      V2beta2ResourceMetricSourceFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V2beta2ResourceMetricSource(), validationEnabled);
  }

  public V2beta2ResourceMetricSourceBuilder(
      V2beta2ResourceMetricSourceFluent<?> fluent, V2beta2ResourceMetricSource instance) {
    this(fluent, instance, false);
  }

  public V2beta2ResourceMetricSourceBuilder(
      V2beta2ResourceMetricSourceFluent<?> fluent,
      V2beta2ResourceMetricSource instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withName(instance.getName());

    fluent.withTarget(instance.getTarget());

    this.validationEnabled = validationEnabled;
  }

  public V2beta2ResourceMetricSourceBuilder(V2beta2ResourceMetricSource instance) {
    this(instance, false);
  }

  public V2beta2ResourceMetricSourceBuilder(
      V2beta2ResourceMetricSource instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withName(instance.getName());

    this.withTarget(instance.getTarget());

    this.validationEnabled = validationEnabled;
  }

  V2beta2ResourceMetricSourceFluent<?> fluent;
  Boolean validationEnabled;

  public V2beta2ResourceMetricSource build() {
    V2beta2ResourceMetricSource buildable = new V2beta2ResourceMetricSource();
    buildable.setName(fluent.getName());
    buildable.setTarget(fluent.getTarget());
    return buildable;
  }
}

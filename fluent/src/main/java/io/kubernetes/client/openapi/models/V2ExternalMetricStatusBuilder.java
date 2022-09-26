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

public class V2ExternalMetricStatusBuilder
    extends V2ExternalMetricStatusFluentImpl<V2ExternalMetricStatusBuilder>
    implements VisitableBuilder<V2ExternalMetricStatus, V2ExternalMetricStatusBuilder> {
  public V2ExternalMetricStatusBuilder() {
    this(false);
  }

  public V2ExternalMetricStatusBuilder(Boolean validationEnabled) {
    this(new V2ExternalMetricStatus(), validationEnabled);
  }

  public V2ExternalMetricStatusBuilder(V2ExternalMetricStatusFluent<?> fluent) {
    this(fluent, false);
  }

  public V2ExternalMetricStatusBuilder(
      V2ExternalMetricStatusFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V2ExternalMetricStatus(), validationEnabled);
  }

  public V2ExternalMetricStatusBuilder(
      V2ExternalMetricStatusFluent<?> fluent, V2ExternalMetricStatus instance) {
    this(fluent, instance, false);
  }

  public V2ExternalMetricStatusBuilder(
      V2ExternalMetricStatusFluent<?> fluent,
      V2ExternalMetricStatus instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withCurrent(instance.getCurrent());

    fluent.withMetric(instance.getMetric());

    this.validationEnabled = validationEnabled;
  }

  public V2ExternalMetricStatusBuilder(V2ExternalMetricStatus instance) {
    this(instance, false);
  }

  public V2ExternalMetricStatusBuilder(V2ExternalMetricStatus instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withCurrent(instance.getCurrent());

    this.withMetric(instance.getMetric());

    this.validationEnabled = validationEnabled;
  }

  V2ExternalMetricStatusFluent<?> fluent;
  Boolean validationEnabled;

  public V2ExternalMetricStatus build() {
    V2ExternalMetricStatus buildable = new V2ExternalMetricStatus();
    buildable.setCurrent(fluent.getCurrent());
    buildable.setMetric(fluent.getMetric());
    return buildable;
  }
}

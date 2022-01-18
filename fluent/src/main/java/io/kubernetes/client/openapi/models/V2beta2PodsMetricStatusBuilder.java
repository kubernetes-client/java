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

public class V2beta2PodsMetricStatusBuilder
    extends io.kubernetes.client.openapi.models.V2beta2PodsMetricStatusFluentImpl<
        io.kubernetes.client.openapi.models.V2beta2PodsMetricStatusBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V2beta2PodsMetricStatus,
        io.kubernetes.client.openapi.models.V2beta2PodsMetricStatusBuilder> {
  public V2beta2PodsMetricStatusBuilder() {
    this(false);
  }

  public V2beta2PodsMetricStatusBuilder(java.lang.Boolean validationEnabled) {
    this(new V2beta2PodsMetricStatus(), validationEnabled);
  }

  public V2beta2PodsMetricStatusBuilder(
      io.kubernetes.client.openapi.models.V2beta2PodsMetricStatusFluent<?> fluent) {
    this(fluent, false);
  }

  public V2beta2PodsMetricStatusBuilder(
      io.kubernetes.client.openapi.models.V2beta2PodsMetricStatusFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V2beta2PodsMetricStatus(), validationEnabled);
  }

  public V2beta2PodsMetricStatusBuilder(
      io.kubernetes.client.openapi.models.V2beta2PodsMetricStatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V2beta2PodsMetricStatus instance) {
    this(fluent, instance, false);
  }

  public V2beta2PodsMetricStatusBuilder(
      io.kubernetes.client.openapi.models.V2beta2PodsMetricStatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V2beta2PodsMetricStatus instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withCurrent(instance.getCurrent());

    fluent.withMetric(instance.getMetric());

    this.validationEnabled = validationEnabled;
  }

  public V2beta2PodsMetricStatusBuilder(
      io.kubernetes.client.openapi.models.V2beta2PodsMetricStatus instance) {
    this(instance, false);
  }

  public V2beta2PodsMetricStatusBuilder(
      io.kubernetes.client.openapi.models.V2beta2PodsMetricStatus instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withCurrent(instance.getCurrent());

    this.withMetric(instance.getMetric());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V2beta2PodsMetricStatusFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V2beta2PodsMetricStatus build() {
    V2beta2PodsMetricStatus buildable = new V2beta2PodsMetricStatus();
    buildable.setCurrent(fluent.getCurrent());
    buildable.setMetric(fluent.getMetric());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V2beta2PodsMetricStatusBuilder that = (V2beta2PodsMetricStatusBuilder) o;
    if (fluent != null && fluent != this
        ? !fluent.equals(that.fluent)
        : that.fluent != null && fluent != this) return false;

    if (validationEnabled != null
        ? !validationEnabled.equals(that.validationEnabled)
        : that.validationEnabled != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(fluent, validationEnabled, super.hashCode());
  }
}

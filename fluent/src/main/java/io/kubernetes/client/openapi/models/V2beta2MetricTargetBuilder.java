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

public class V2beta2MetricTargetBuilder
    extends io.kubernetes.client.openapi.models.V2beta2MetricTargetFluentImpl<
        io.kubernetes.client.openapi.models.V2beta2MetricTargetBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V2beta2MetricTarget,
        io.kubernetes.client.openapi.models.V2beta2MetricTargetBuilder> {
  public V2beta2MetricTargetBuilder() {
    this(false);
  }

  public V2beta2MetricTargetBuilder(java.lang.Boolean validationEnabled) {
    this(new V2beta2MetricTarget(), validationEnabled);
  }

  public V2beta2MetricTargetBuilder(
      io.kubernetes.client.openapi.models.V2beta2MetricTargetFluent<?> fluent) {
    this(fluent, false);
  }

  public V2beta2MetricTargetBuilder(
      io.kubernetes.client.openapi.models.V2beta2MetricTargetFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V2beta2MetricTarget(), validationEnabled);
  }

  public V2beta2MetricTargetBuilder(
      io.kubernetes.client.openapi.models.V2beta2MetricTargetFluent<?> fluent,
      io.kubernetes.client.openapi.models.V2beta2MetricTarget instance) {
    this(fluent, instance, false);
  }

  public V2beta2MetricTargetBuilder(
      io.kubernetes.client.openapi.models.V2beta2MetricTargetFluent<?> fluent,
      io.kubernetes.client.openapi.models.V2beta2MetricTarget instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withAverageUtilization(instance.getAverageUtilization());

    fluent.withAverageValue(instance.getAverageValue());

    fluent.withType(instance.getType());

    fluent.withValue(instance.getValue());

    this.validationEnabled = validationEnabled;
  }

  public V2beta2MetricTargetBuilder(
      io.kubernetes.client.openapi.models.V2beta2MetricTarget instance) {
    this(instance, false);
  }

  public V2beta2MetricTargetBuilder(
      io.kubernetes.client.openapi.models.V2beta2MetricTarget instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withAverageUtilization(instance.getAverageUtilization());

    this.withAverageValue(instance.getAverageValue());

    this.withType(instance.getType());

    this.withValue(instance.getValue());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V2beta2MetricTargetFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V2beta2MetricTarget build() {
    V2beta2MetricTarget buildable = new V2beta2MetricTarget();
    buildable.setAverageUtilization(fluent.getAverageUtilization());
    buildable.setAverageValue(fluent.getAverageValue());
    buildable.setType(fluent.getType());
    buildable.setValue(fluent.getValue());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V2beta2MetricTargetBuilder that = (V2beta2MetricTargetBuilder) o;
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

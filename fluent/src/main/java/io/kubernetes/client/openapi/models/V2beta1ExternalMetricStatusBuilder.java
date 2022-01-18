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

public class V2beta1ExternalMetricStatusBuilder
    extends io.kubernetes.client.openapi.models.V2beta1ExternalMetricStatusFluentImpl<
        io.kubernetes.client.openapi.models.V2beta1ExternalMetricStatusBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V2beta1ExternalMetricStatus,
        io.kubernetes.client.openapi.models.V2beta1ExternalMetricStatusBuilder> {
  public V2beta1ExternalMetricStatusBuilder() {
    this(false);
  }

  public V2beta1ExternalMetricStatusBuilder(java.lang.Boolean validationEnabled) {
    this(new V2beta1ExternalMetricStatus(), validationEnabled);
  }

  public V2beta1ExternalMetricStatusBuilder(
      io.kubernetes.client.openapi.models.V2beta1ExternalMetricStatusFluent<?> fluent) {
    this(fluent, false);
  }

  public V2beta1ExternalMetricStatusBuilder(
      io.kubernetes.client.openapi.models.V2beta1ExternalMetricStatusFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V2beta1ExternalMetricStatus(), validationEnabled);
  }

  public V2beta1ExternalMetricStatusBuilder(
      io.kubernetes.client.openapi.models.V2beta1ExternalMetricStatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V2beta1ExternalMetricStatus instance) {
    this(fluent, instance, false);
  }

  public V2beta1ExternalMetricStatusBuilder(
      io.kubernetes.client.openapi.models.V2beta1ExternalMetricStatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V2beta1ExternalMetricStatus instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withCurrentAverageValue(instance.getCurrentAverageValue());

    fluent.withCurrentValue(instance.getCurrentValue());

    fluent.withMetricName(instance.getMetricName());

    fluent.withMetricSelector(instance.getMetricSelector());

    this.validationEnabled = validationEnabled;
  }

  public V2beta1ExternalMetricStatusBuilder(
      io.kubernetes.client.openapi.models.V2beta1ExternalMetricStatus instance) {
    this(instance, false);
  }

  public V2beta1ExternalMetricStatusBuilder(
      io.kubernetes.client.openapi.models.V2beta1ExternalMetricStatus instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withCurrentAverageValue(instance.getCurrentAverageValue());

    this.withCurrentValue(instance.getCurrentValue());

    this.withMetricName(instance.getMetricName());

    this.withMetricSelector(instance.getMetricSelector());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V2beta1ExternalMetricStatusFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V2beta1ExternalMetricStatus build() {
    V2beta1ExternalMetricStatus buildable = new V2beta1ExternalMetricStatus();
    buildable.setCurrentAverageValue(fluent.getCurrentAverageValue());
    buildable.setCurrentValue(fluent.getCurrentValue());
    buildable.setMetricName(fluent.getMetricName());
    buildable.setMetricSelector(fluent.getMetricSelector());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V2beta1ExternalMetricStatusBuilder that = (V2beta1ExternalMetricStatusBuilder) o;
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

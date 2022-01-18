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

public class V2beta2ResourceMetricStatusBuilder
    extends io.kubernetes.client.openapi.models.V2beta2ResourceMetricStatusFluentImpl<
        io.kubernetes.client.openapi.models.V2beta2ResourceMetricStatusBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V2beta2ResourceMetricStatus,
        io.kubernetes.client.openapi.models.V2beta2ResourceMetricStatusBuilder> {
  public V2beta2ResourceMetricStatusBuilder() {
    this(false);
  }

  public V2beta2ResourceMetricStatusBuilder(java.lang.Boolean validationEnabled) {
    this(new V2beta2ResourceMetricStatus(), validationEnabled);
  }

  public V2beta2ResourceMetricStatusBuilder(
      io.kubernetes.client.openapi.models.V2beta2ResourceMetricStatusFluent<?> fluent) {
    this(fluent, false);
  }

  public V2beta2ResourceMetricStatusBuilder(
      io.kubernetes.client.openapi.models.V2beta2ResourceMetricStatusFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V2beta2ResourceMetricStatus(), validationEnabled);
  }

  public V2beta2ResourceMetricStatusBuilder(
      io.kubernetes.client.openapi.models.V2beta2ResourceMetricStatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V2beta2ResourceMetricStatus instance) {
    this(fluent, instance, false);
  }

  public V2beta2ResourceMetricStatusBuilder(
      io.kubernetes.client.openapi.models.V2beta2ResourceMetricStatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V2beta2ResourceMetricStatus instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withCurrent(instance.getCurrent());

    fluent.withName(instance.getName());

    this.validationEnabled = validationEnabled;
  }

  public V2beta2ResourceMetricStatusBuilder(
      io.kubernetes.client.openapi.models.V2beta2ResourceMetricStatus instance) {
    this(instance, false);
  }

  public V2beta2ResourceMetricStatusBuilder(
      io.kubernetes.client.openapi.models.V2beta2ResourceMetricStatus instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withCurrent(instance.getCurrent());

    this.withName(instance.getName());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V2beta2ResourceMetricStatusFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V2beta2ResourceMetricStatus build() {
    V2beta2ResourceMetricStatus buildable = new V2beta2ResourceMetricStatus();
    buildable.setCurrent(fluent.getCurrent());
    buildable.setName(fluent.getName());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V2beta2ResourceMetricStatusBuilder that = (V2beta2ResourceMetricStatusBuilder) o;
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

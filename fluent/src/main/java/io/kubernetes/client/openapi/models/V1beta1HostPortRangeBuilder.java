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

public class V1beta1HostPortRangeBuilder
    extends io.kubernetes.client.openapi.models.V1beta1HostPortRangeFluentImpl<
        io.kubernetes.client.openapi.models.V1beta1HostPortRangeBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1beta1HostPortRange,
        io.kubernetes.client.openapi.models.V1beta1HostPortRangeBuilder> {
  public V1beta1HostPortRangeBuilder() {
    this(false);
  }

  public V1beta1HostPortRangeBuilder(java.lang.Boolean validationEnabled) {
    this(new V1beta1HostPortRange(), validationEnabled);
  }

  public V1beta1HostPortRangeBuilder(
      io.kubernetes.client.openapi.models.V1beta1HostPortRangeFluent<?> fluent) {
    this(fluent, false);
  }

  public V1beta1HostPortRangeBuilder(
      io.kubernetes.client.openapi.models.V1beta1HostPortRangeFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1beta1HostPortRange(), validationEnabled);
  }

  public V1beta1HostPortRangeBuilder(
      io.kubernetes.client.openapi.models.V1beta1HostPortRangeFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta1HostPortRange instance) {
    this(fluent, instance, false);
  }

  public V1beta1HostPortRangeBuilder(
      io.kubernetes.client.openapi.models.V1beta1HostPortRangeFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta1HostPortRange instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withMax(instance.getMax());

    fluent.withMin(instance.getMin());

    this.validationEnabled = validationEnabled;
  }

  public V1beta1HostPortRangeBuilder(
      io.kubernetes.client.openapi.models.V1beta1HostPortRange instance) {
    this(instance, false);
  }

  public V1beta1HostPortRangeBuilder(
      io.kubernetes.client.openapi.models.V1beta1HostPortRange instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withMax(instance.getMax());

    this.withMin(instance.getMin());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1beta1HostPortRangeFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1beta1HostPortRange build() {
    V1beta1HostPortRange buildable = new V1beta1HostPortRange();
    buildable.setMax(fluent.getMax());
    buildable.setMin(fluent.getMin());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1beta1HostPortRangeBuilder that = (V1beta1HostPortRangeBuilder) o;
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

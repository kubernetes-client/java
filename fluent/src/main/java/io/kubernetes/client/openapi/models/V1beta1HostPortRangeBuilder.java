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

public class V1beta1HostPortRangeBuilder
    extends V1beta1HostPortRangeFluentImpl<V1beta1HostPortRangeBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1beta1HostPortRange,
        io.kubernetes.client.openapi.models.V1beta1HostPortRangeBuilder> {
  public V1beta1HostPortRangeBuilder() {
    this(false);
  }

  public V1beta1HostPortRangeBuilder(Boolean validationEnabled) {
    this(new V1beta1HostPortRange(), validationEnabled);
  }

  public V1beta1HostPortRangeBuilder(V1beta1HostPortRangeFluent<?> fluent) {
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
}

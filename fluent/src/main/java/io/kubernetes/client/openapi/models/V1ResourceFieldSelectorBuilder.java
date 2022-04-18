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

public class V1ResourceFieldSelectorBuilder
    extends V1ResourceFieldSelectorFluentImpl<V1ResourceFieldSelectorBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1ResourceFieldSelector,
        V1ResourceFieldSelectorBuilder> {
  public V1ResourceFieldSelectorBuilder() {
    this(false);
  }

  public V1ResourceFieldSelectorBuilder(Boolean validationEnabled) {
    this(new V1ResourceFieldSelector(), validationEnabled);
  }

  public V1ResourceFieldSelectorBuilder(
      io.kubernetes.client.openapi.models.V1ResourceFieldSelectorFluent<?> fluent) {
    this(fluent, false);
  }

  public V1ResourceFieldSelectorBuilder(
      io.kubernetes.client.openapi.models.V1ResourceFieldSelectorFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1ResourceFieldSelector(), validationEnabled);
  }

  public V1ResourceFieldSelectorBuilder(
      io.kubernetes.client.openapi.models.V1ResourceFieldSelectorFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1ResourceFieldSelector instance) {
    this(fluent, instance, false);
  }

  public V1ResourceFieldSelectorBuilder(
      io.kubernetes.client.openapi.models.V1ResourceFieldSelectorFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1ResourceFieldSelector instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withContainerName(instance.getContainerName());

    fluent.withDivisor(instance.getDivisor());

    fluent.withResource(instance.getResource());

    this.validationEnabled = validationEnabled;
  }

  public V1ResourceFieldSelectorBuilder(
      io.kubernetes.client.openapi.models.V1ResourceFieldSelector instance) {
    this(instance, false);
  }

  public V1ResourceFieldSelectorBuilder(
      io.kubernetes.client.openapi.models.V1ResourceFieldSelector instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withContainerName(instance.getContainerName());

    this.withDivisor(instance.getDivisor());

    this.withResource(instance.getResource());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1ResourceFieldSelectorFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1ResourceFieldSelector build() {
    V1ResourceFieldSelector buildable = new V1ResourceFieldSelector();
    buildable.setContainerName(fluent.getContainerName());
    buildable.setDivisor(fluent.getDivisor());
    buildable.setResource(fluent.getResource());
    return buildable;
  }
}

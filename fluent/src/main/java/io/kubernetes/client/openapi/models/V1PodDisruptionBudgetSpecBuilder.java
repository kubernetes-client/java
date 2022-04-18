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

public class V1PodDisruptionBudgetSpecBuilder
    extends V1PodDisruptionBudgetSpecFluentImpl<V1PodDisruptionBudgetSpecBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1PodDisruptionBudgetSpec,
        io.kubernetes.client.openapi.models.V1PodDisruptionBudgetSpecBuilder> {
  public V1PodDisruptionBudgetSpecBuilder() {
    this(false);
  }

  public V1PodDisruptionBudgetSpecBuilder(Boolean validationEnabled) {
    this(new V1PodDisruptionBudgetSpec(), validationEnabled);
  }

  public V1PodDisruptionBudgetSpecBuilder(V1PodDisruptionBudgetSpecFluent<?> fluent) {
    this(fluent, false);
  }

  public V1PodDisruptionBudgetSpecBuilder(
      io.kubernetes.client.openapi.models.V1PodDisruptionBudgetSpecFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1PodDisruptionBudgetSpec(), validationEnabled);
  }

  public V1PodDisruptionBudgetSpecBuilder(
      io.kubernetes.client.openapi.models.V1PodDisruptionBudgetSpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1PodDisruptionBudgetSpec instance) {
    this(fluent, instance, false);
  }

  public V1PodDisruptionBudgetSpecBuilder(
      io.kubernetes.client.openapi.models.V1PodDisruptionBudgetSpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1PodDisruptionBudgetSpec instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withMaxUnavailable(instance.getMaxUnavailable());

    fluent.withMinAvailable(instance.getMinAvailable());

    fluent.withSelector(instance.getSelector());

    this.validationEnabled = validationEnabled;
  }

  public V1PodDisruptionBudgetSpecBuilder(
      io.kubernetes.client.openapi.models.V1PodDisruptionBudgetSpec instance) {
    this(instance, false);
  }

  public V1PodDisruptionBudgetSpecBuilder(
      io.kubernetes.client.openapi.models.V1PodDisruptionBudgetSpec instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withMaxUnavailable(instance.getMaxUnavailable());

    this.withMinAvailable(instance.getMinAvailable());

    this.withSelector(instance.getSelector());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1PodDisruptionBudgetSpecFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1PodDisruptionBudgetSpec build() {
    V1PodDisruptionBudgetSpec buildable = new V1PodDisruptionBudgetSpec();
    buildable.setMaxUnavailable(fluent.getMaxUnavailable());
    buildable.setMinAvailable(fluent.getMinAvailable());
    buildable.setSelector(fluent.getSelector());
    return buildable;
  }
}

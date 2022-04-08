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

public class V1beta1PodDisruptionBudgetStatusBuilder
    extends V1beta1PodDisruptionBudgetStatusFluentImpl<V1beta1PodDisruptionBudgetStatusBuilder>
    implements VisitableBuilder<
        V1beta1PodDisruptionBudgetStatus,
        io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetStatusBuilder> {
  public V1beta1PodDisruptionBudgetStatusBuilder() {
    this(false);
  }

  public V1beta1PodDisruptionBudgetStatusBuilder(Boolean validationEnabled) {
    this(new V1beta1PodDisruptionBudgetStatus(), validationEnabled);
  }

  public V1beta1PodDisruptionBudgetStatusBuilder(
      io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetStatusFluent<?> fluent) {
    this(fluent, false);
  }

  public V1beta1PodDisruptionBudgetStatusBuilder(
      io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetStatusFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1beta1PodDisruptionBudgetStatus(), validationEnabled);
  }

  public V1beta1PodDisruptionBudgetStatusBuilder(
      io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetStatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetStatus instance) {
    this(fluent, instance, false);
  }

  public V1beta1PodDisruptionBudgetStatusBuilder(
      io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetStatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetStatus instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withConditions(instance.getConditions());

    fluent.withCurrentHealthy(instance.getCurrentHealthy());

    fluent.withDesiredHealthy(instance.getDesiredHealthy());

    fluent.withDisruptedPods(instance.getDisruptedPods());

    fluent.withDisruptionsAllowed(instance.getDisruptionsAllowed());

    fluent.withExpectedPods(instance.getExpectedPods());

    fluent.withObservedGeneration(instance.getObservedGeneration());

    this.validationEnabled = validationEnabled;
  }

  public V1beta1PodDisruptionBudgetStatusBuilder(
      io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetStatus instance) {
    this(instance, false);
  }

  public V1beta1PodDisruptionBudgetStatusBuilder(
      io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetStatus instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withConditions(instance.getConditions());

    this.withCurrentHealthy(instance.getCurrentHealthy());

    this.withDesiredHealthy(instance.getDesiredHealthy());

    this.withDisruptedPods(instance.getDisruptedPods());

    this.withDisruptionsAllowed(instance.getDisruptionsAllowed());

    this.withExpectedPods(instance.getExpectedPods());

    this.withObservedGeneration(instance.getObservedGeneration());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetStatusFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetStatus build() {
    V1beta1PodDisruptionBudgetStatus buildable = new V1beta1PodDisruptionBudgetStatus();
    buildable.setConditions(fluent.getConditions());
    buildable.setCurrentHealthy(fluent.getCurrentHealthy());
    buildable.setDesiredHealthy(fluent.getDesiredHealthy());
    buildable.setDisruptedPods(fluent.getDisruptedPods());
    buildable.setDisruptionsAllowed(fluent.getDisruptionsAllowed());
    buildable.setExpectedPods(fluent.getExpectedPods());
    buildable.setObservedGeneration(fluent.getObservedGeneration());
    return buildable;
  }
}

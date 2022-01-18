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

public class V1PodDisruptionBudgetStatusBuilder
    extends io.kubernetes.client.openapi.models.V1PodDisruptionBudgetStatusFluentImpl<
        io.kubernetes.client.openapi.models.V1PodDisruptionBudgetStatusBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1PodDisruptionBudgetStatus,
        io.kubernetes.client.openapi.models.V1PodDisruptionBudgetStatusBuilder> {
  public V1PodDisruptionBudgetStatusBuilder() {
    this(false);
  }

  public V1PodDisruptionBudgetStatusBuilder(java.lang.Boolean validationEnabled) {
    this(new V1PodDisruptionBudgetStatus(), validationEnabled);
  }

  public V1PodDisruptionBudgetStatusBuilder(
      io.kubernetes.client.openapi.models.V1PodDisruptionBudgetStatusFluent<?> fluent) {
    this(fluent, false);
  }

  public V1PodDisruptionBudgetStatusBuilder(
      io.kubernetes.client.openapi.models.V1PodDisruptionBudgetStatusFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1PodDisruptionBudgetStatus(), validationEnabled);
  }

  public V1PodDisruptionBudgetStatusBuilder(
      io.kubernetes.client.openapi.models.V1PodDisruptionBudgetStatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1PodDisruptionBudgetStatus instance) {
    this(fluent, instance, false);
  }

  public V1PodDisruptionBudgetStatusBuilder(
      io.kubernetes.client.openapi.models.V1PodDisruptionBudgetStatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1PodDisruptionBudgetStatus instance,
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

  public V1PodDisruptionBudgetStatusBuilder(
      io.kubernetes.client.openapi.models.V1PodDisruptionBudgetStatus instance) {
    this(instance, false);
  }

  public V1PodDisruptionBudgetStatusBuilder(
      io.kubernetes.client.openapi.models.V1PodDisruptionBudgetStatus instance,
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

  io.kubernetes.client.openapi.models.V1PodDisruptionBudgetStatusFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1PodDisruptionBudgetStatus build() {
    V1PodDisruptionBudgetStatus buildable = new V1PodDisruptionBudgetStatus();
    buildable.setConditions(fluent.getConditions());
    buildable.setCurrentHealthy(fluent.getCurrentHealthy());
    buildable.setDesiredHealthy(fluent.getDesiredHealthy());
    buildable.setDisruptedPods(fluent.getDisruptedPods());
    buildable.setDisruptionsAllowed(fluent.getDisruptionsAllowed());
    buildable.setExpectedPods(fluent.getExpectedPods());
    buildable.setObservedGeneration(fluent.getObservedGeneration());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1PodDisruptionBudgetStatusBuilder that = (V1PodDisruptionBudgetStatusBuilder) o;
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

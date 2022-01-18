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

public class V2beta1HorizontalPodAutoscalerStatusBuilder
    extends io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerStatusFluentImpl<
        io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerStatusBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerStatus,
        io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerStatusBuilder> {
  public V2beta1HorizontalPodAutoscalerStatusBuilder() {
    this(false);
  }

  public V2beta1HorizontalPodAutoscalerStatusBuilder(java.lang.Boolean validationEnabled) {
    this(new V2beta1HorizontalPodAutoscalerStatus(), validationEnabled);
  }

  public V2beta1HorizontalPodAutoscalerStatusBuilder(
      io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerStatusFluent<?> fluent) {
    this(fluent, false);
  }

  public V2beta1HorizontalPodAutoscalerStatusBuilder(
      io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerStatusFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V2beta1HorizontalPodAutoscalerStatus(), validationEnabled);
  }

  public V2beta1HorizontalPodAutoscalerStatusBuilder(
      io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerStatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerStatus instance) {
    this(fluent, instance, false);
  }

  public V2beta1HorizontalPodAutoscalerStatusBuilder(
      io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerStatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerStatus instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withConditions(instance.getConditions());

    fluent.withCurrentMetrics(instance.getCurrentMetrics());

    fluent.withCurrentReplicas(instance.getCurrentReplicas());

    fluent.withDesiredReplicas(instance.getDesiredReplicas());

    fluent.withLastScaleTime(instance.getLastScaleTime());

    fluent.withObservedGeneration(instance.getObservedGeneration());

    this.validationEnabled = validationEnabled;
  }

  public V2beta1HorizontalPodAutoscalerStatusBuilder(
      io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerStatus instance) {
    this(instance, false);
  }

  public V2beta1HorizontalPodAutoscalerStatusBuilder(
      io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerStatus instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withConditions(instance.getConditions());

    this.withCurrentMetrics(instance.getCurrentMetrics());

    this.withCurrentReplicas(instance.getCurrentReplicas());

    this.withDesiredReplicas(instance.getDesiredReplicas());

    this.withLastScaleTime(instance.getLastScaleTime());

    this.withObservedGeneration(instance.getObservedGeneration());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerStatusFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerStatus build() {
    V2beta1HorizontalPodAutoscalerStatus buildable = new V2beta1HorizontalPodAutoscalerStatus();
    buildable.setConditions(fluent.getConditions());
    buildable.setCurrentMetrics(fluent.getCurrentMetrics());
    buildable.setCurrentReplicas(fluent.getCurrentReplicas());
    buildable.setDesiredReplicas(fluent.getDesiredReplicas());
    buildable.setLastScaleTime(fluent.getLastScaleTime());
    buildable.setObservedGeneration(fluent.getObservedGeneration());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V2beta1HorizontalPodAutoscalerStatusBuilder that =
        (V2beta1HorizontalPodAutoscalerStatusBuilder) o;
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

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

public class V2beta1HorizontalPodAutoscalerStatusBuilder
    extends V2beta1HorizontalPodAutoscalerStatusFluentImpl<
        V2beta1HorizontalPodAutoscalerStatusBuilder>
    implements VisitableBuilder<
        V2beta1HorizontalPodAutoscalerStatus,
        io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerStatusBuilder> {
  public V2beta1HorizontalPodAutoscalerStatusBuilder() {
    this(false);
  }

  public V2beta1HorizontalPodAutoscalerStatusBuilder(Boolean validationEnabled) {
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
}

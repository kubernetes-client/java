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

public class V1HorizontalPodAutoscalerStatusBuilder
    extends V1HorizontalPodAutoscalerStatusFluentImpl<V1HorizontalPodAutoscalerStatusBuilder>
    implements VisitableBuilder<
        V1HorizontalPodAutoscalerStatus, V1HorizontalPodAutoscalerStatusBuilder> {
  public V1HorizontalPodAutoscalerStatusBuilder() {
    this(false);
  }

  public V1HorizontalPodAutoscalerStatusBuilder(Boolean validationEnabled) {
    this(new V1HorizontalPodAutoscalerStatus(), validationEnabled);
  }

  public V1HorizontalPodAutoscalerStatusBuilder(V1HorizontalPodAutoscalerStatusFluent<?> fluent) {
    this(fluent, false);
  }

  public V1HorizontalPodAutoscalerStatusBuilder(
      V1HorizontalPodAutoscalerStatusFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1HorizontalPodAutoscalerStatus(), validationEnabled);
  }

  public V1HorizontalPodAutoscalerStatusBuilder(
      V1HorizontalPodAutoscalerStatusFluent<?> fluent, V1HorizontalPodAutoscalerStatus instance) {
    this(fluent, instance, false);
  }

  public V1HorizontalPodAutoscalerStatusBuilder(
      V1HorizontalPodAutoscalerStatusFluent<?> fluent,
      V1HorizontalPodAutoscalerStatus instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withCurrentCPUUtilizationPercentage(instance.getCurrentCPUUtilizationPercentage());

    fluent.withCurrentReplicas(instance.getCurrentReplicas());

    fluent.withDesiredReplicas(instance.getDesiredReplicas());

    fluent.withLastScaleTime(instance.getLastScaleTime());

    fluent.withObservedGeneration(instance.getObservedGeneration());

    this.validationEnabled = validationEnabled;
  }

  public V1HorizontalPodAutoscalerStatusBuilder(V1HorizontalPodAutoscalerStatus instance) {
    this(instance, false);
  }

  public V1HorizontalPodAutoscalerStatusBuilder(
      V1HorizontalPodAutoscalerStatus instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withCurrentCPUUtilizationPercentage(instance.getCurrentCPUUtilizationPercentage());

    this.withCurrentReplicas(instance.getCurrentReplicas());

    this.withDesiredReplicas(instance.getDesiredReplicas());

    this.withLastScaleTime(instance.getLastScaleTime());

    this.withObservedGeneration(instance.getObservedGeneration());

    this.validationEnabled = validationEnabled;
  }

  V1HorizontalPodAutoscalerStatusFluent<?> fluent;
  Boolean validationEnabled;

  public V1HorizontalPodAutoscalerStatus build() {
    V1HorizontalPodAutoscalerStatus buildable = new V1HorizontalPodAutoscalerStatus();
    buildable.setCurrentCPUUtilizationPercentage(fluent.getCurrentCPUUtilizationPercentage());
    buildable.setCurrentReplicas(fluent.getCurrentReplicas());
    buildable.setDesiredReplicas(fluent.getDesiredReplicas());
    buildable.setLastScaleTime(fluent.getLastScaleTime());
    buildable.setObservedGeneration(fluent.getObservedGeneration());
    return buildable;
  }
}

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

public class V2HorizontalPodAutoscalerStatusBuilder
    extends V2HorizontalPodAutoscalerStatusFluentImpl<V2HorizontalPodAutoscalerStatusBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatus,
        V2HorizontalPodAutoscalerStatusBuilder> {
  public V2HorizontalPodAutoscalerStatusBuilder() {
    this(false);
  }

  public V2HorizontalPodAutoscalerStatusBuilder(Boolean validationEnabled) {
    this(new V2HorizontalPodAutoscalerStatus(), validationEnabled);
  }

  public V2HorizontalPodAutoscalerStatusBuilder(V2HorizontalPodAutoscalerStatusFluent<?> fluent) {
    this(fluent, false);
  }

  public V2HorizontalPodAutoscalerStatusBuilder(
      io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatusFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V2HorizontalPodAutoscalerStatus(), validationEnabled);
  }

  public V2HorizontalPodAutoscalerStatusBuilder(
      io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatus instance) {
    this(fluent, instance, false);
  }

  public V2HorizontalPodAutoscalerStatusBuilder(
      io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatus instance,
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

  public V2HorizontalPodAutoscalerStatusBuilder(
      io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatus instance) {
    this(instance, false);
  }

  public V2HorizontalPodAutoscalerStatusBuilder(
      io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatus instance,
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

  io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatusFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatus build() {
    V2HorizontalPodAutoscalerStatus buildable = new V2HorizontalPodAutoscalerStatus();
    buildable.setConditions(fluent.getConditions());
    buildable.setCurrentMetrics(fluent.getCurrentMetrics());
    buildable.setCurrentReplicas(fluent.getCurrentReplicas());
    buildable.setDesiredReplicas(fluent.getDesiredReplicas());
    buildable.setLastScaleTime(fluent.getLastScaleTime());
    buildable.setObservedGeneration(fluent.getObservedGeneration());
    return buildable;
  }
}

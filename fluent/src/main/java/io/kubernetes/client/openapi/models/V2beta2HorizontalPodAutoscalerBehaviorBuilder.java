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

public class V2beta2HorizontalPodAutoscalerBehaviorBuilder
    extends V2beta2HorizontalPodAutoscalerBehaviorFluentImpl<
        V2beta2HorizontalPodAutoscalerBehaviorBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehavior,
        io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehaviorBuilder> {
  public V2beta2HorizontalPodAutoscalerBehaviorBuilder() {
    this(false);
  }

  public V2beta2HorizontalPodAutoscalerBehaviorBuilder(Boolean validationEnabled) {
    this(new V2beta2HorizontalPodAutoscalerBehavior(), validationEnabled);
  }

  public V2beta2HorizontalPodAutoscalerBehaviorBuilder(
      V2beta2HorizontalPodAutoscalerBehaviorFluent<?> fluent) {
    this(fluent, false);
  }

  public V2beta2HorizontalPodAutoscalerBehaviorBuilder(
      io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehaviorFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V2beta2HorizontalPodAutoscalerBehavior(), validationEnabled);
  }

  public V2beta2HorizontalPodAutoscalerBehaviorBuilder(
      io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehaviorFluent<?> fluent,
      io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehavior instance) {
    this(fluent, instance, false);
  }

  public V2beta2HorizontalPodAutoscalerBehaviorBuilder(
      io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehaviorFluent<?> fluent,
      io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehavior instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withScaleDown(instance.getScaleDown());

    fluent.withScaleUp(instance.getScaleUp());

    this.validationEnabled = validationEnabled;
  }

  public V2beta2HorizontalPodAutoscalerBehaviorBuilder(
      io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehavior instance) {
    this(instance, false);
  }

  public V2beta2HorizontalPodAutoscalerBehaviorBuilder(
      io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehavior instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withScaleDown(instance.getScaleDown());

    this.withScaleUp(instance.getScaleUp());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehaviorFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehavior build() {
    V2beta2HorizontalPodAutoscalerBehavior buildable = new V2beta2HorizontalPodAutoscalerBehavior();
    buildable.setScaleDown(fluent.getScaleDown());
    buildable.setScaleUp(fluent.getScaleUp());
    return buildable;
  }
}

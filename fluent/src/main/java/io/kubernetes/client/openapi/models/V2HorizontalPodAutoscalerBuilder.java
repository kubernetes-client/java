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

public class V2HorizontalPodAutoscalerBuilder
    extends V2HorizontalPodAutoscalerFluentImpl<V2HorizontalPodAutoscalerBuilder>
    implements VisitableBuilder<V2HorizontalPodAutoscaler, V2HorizontalPodAutoscalerBuilder> {
  public V2HorizontalPodAutoscalerBuilder() {
    this(false);
  }

  public V2HorizontalPodAutoscalerBuilder(Boolean validationEnabled) {
    this(new V2HorizontalPodAutoscaler(), validationEnabled);
  }

  public V2HorizontalPodAutoscalerBuilder(V2HorizontalPodAutoscalerFluent<?> fluent) {
    this(fluent, false);
  }

  public V2HorizontalPodAutoscalerBuilder(
      V2HorizontalPodAutoscalerFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V2HorizontalPodAutoscaler(), validationEnabled);
  }

  public V2HorizontalPodAutoscalerBuilder(
      V2HorizontalPodAutoscalerFluent<?> fluent, V2HorizontalPodAutoscaler instance) {
    this(fluent, instance, false);
  }

  public V2HorizontalPodAutoscalerBuilder(
      V2HorizontalPodAutoscalerFluent<?> fluent,
      V2HorizontalPodAutoscaler instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withSpec(instance.getSpec());

    fluent.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled;
  }

  public V2HorizontalPodAutoscalerBuilder(V2HorizontalPodAutoscaler instance) {
    this(instance, false);
  }

  public V2HorizontalPodAutoscalerBuilder(
      V2HorizontalPodAutoscaler instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled;
  }

  V2HorizontalPodAutoscalerFluent<?> fluent;
  Boolean validationEnabled;

  public V2HorizontalPodAutoscaler build() {
    V2HorizontalPodAutoscaler buildable = new V2HorizontalPodAutoscaler();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    buildable.setStatus(fluent.getStatus());
    return buildable;
  }
}

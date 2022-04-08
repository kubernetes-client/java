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

public class V2HorizontalPodAutoscalerListBuilder
    extends V2HorizontalPodAutoscalerListFluentImpl<V2HorizontalPodAutoscalerListBuilder>
    implements VisitableBuilder<
        V2HorizontalPodAutoscalerList,
        io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerListBuilder> {
  public V2HorizontalPodAutoscalerListBuilder() {
    this(false);
  }

  public V2HorizontalPodAutoscalerListBuilder(Boolean validationEnabled) {
    this(new V2HorizontalPodAutoscalerList(), validationEnabled);
  }

  public V2HorizontalPodAutoscalerListBuilder(V2HorizontalPodAutoscalerListFluent<?> fluent) {
    this(fluent, false);
  }

  public V2HorizontalPodAutoscalerListBuilder(
      io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerListFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V2HorizontalPodAutoscalerList(), validationEnabled);
  }

  public V2HorizontalPodAutoscalerListBuilder(
      io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerListFluent<?> fluent,
      io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerList instance) {
    this(fluent, instance, false);
  }

  public V2HorizontalPodAutoscalerListBuilder(
      io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerListFluent<?> fluent,
      io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerList instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled;
  }

  public V2HorizontalPodAutoscalerListBuilder(
      io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerList instance) {
    this(instance, false);
  }

  public V2HorizontalPodAutoscalerListBuilder(
      io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerList instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerListFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerList build() {
    V2HorizontalPodAutoscalerList buildable = new V2HorizontalPodAutoscalerList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
}

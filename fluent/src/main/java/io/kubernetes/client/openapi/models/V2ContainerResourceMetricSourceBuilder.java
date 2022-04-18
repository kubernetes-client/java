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

public class V2ContainerResourceMetricSourceBuilder
    extends V2ContainerResourceMetricSourceFluentImpl<V2ContainerResourceMetricSourceBuilder>
    implements VisitableBuilder<
        V2ContainerResourceMetricSource,
        io.kubernetes.client.openapi.models.V2ContainerResourceMetricSourceBuilder> {
  public V2ContainerResourceMetricSourceBuilder() {
    this(false);
  }

  public V2ContainerResourceMetricSourceBuilder(Boolean validationEnabled) {
    this(new V2ContainerResourceMetricSource(), validationEnabled);
  }

  public V2ContainerResourceMetricSourceBuilder(
      io.kubernetes.client.openapi.models.V2ContainerResourceMetricSourceFluent<?> fluent) {
    this(fluent, false);
  }

  public V2ContainerResourceMetricSourceBuilder(
      io.kubernetes.client.openapi.models.V2ContainerResourceMetricSourceFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V2ContainerResourceMetricSource(), validationEnabled);
  }

  public V2ContainerResourceMetricSourceBuilder(
      io.kubernetes.client.openapi.models.V2ContainerResourceMetricSourceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V2ContainerResourceMetricSource instance) {
    this(fluent, instance, false);
  }

  public V2ContainerResourceMetricSourceBuilder(
      io.kubernetes.client.openapi.models.V2ContainerResourceMetricSourceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V2ContainerResourceMetricSource instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withContainer(instance.getContainer());

    fluent.withName(instance.getName());

    fluent.withTarget(instance.getTarget());

    this.validationEnabled = validationEnabled;
  }

  public V2ContainerResourceMetricSourceBuilder(
      io.kubernetes.client.openapi.models.V2ContainerResourceMetricSource instance) {
    this(instance, false);
  }

  public V2ContainerResourceMetricSourceBuilder(
      io.kubernetes.client.openapi.models.V2ContainerResourceMetricSource instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withContainer(instance.getContainer());

    this.withName(instance.getName());

    this.withTarget(instance.getTarget());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V2ContainerResourceMetricSourceFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V2ContainerResourceMetricSource build() {
    V2ContainerResourceMetricSource buildable = new V2ContainerResourceMetricSource();
    buildable.setContainer(fluent.getContainer());
    buildable.setName(fluent.getName());
    buildable.setTarget(fluent.getTarget());
    return buildable;
  }
}

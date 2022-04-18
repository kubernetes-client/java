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

public class V1PodAffinityTermBuilder extends V1PodAffinityTermFluentImpl<V1PodAffinityTermBuilder>
    implements VisitableBuilder<
        V1PodAffinityTerm, io.kubernetes.client.openapi.models.V1PodAffinityTermBuilder> {
  public V1PodAffinityTermBuilder() {
    this(false);
  }

  public V1PodAffinityTermBuilder(Boolean validationEnabled) {
    this(new V1PodAffinityTerm(), validationEnabled);
  }

  public V1PodAffinityTermBuilder(
      io.kubernetes.client.openapi.models.V1PodAffinityTermFluent<?> fluent) {
    this(fluent, false);
  }

  public V1PodAffinityTermBuilder(
      io.kubernetes.client.openapi.models.V1PodAffinityTermFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1PodAffinityTerm(), validationEnabled);
  }

  public V1PodAffinityTermBuilder(
      io.kubernetes.client.openapi.models.V1PodAffinityTermFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1PodAffinityTerm instance) {
    this(fluent, instance, false);
  }

  public V1PodAffinityTermBuilder(
      io.kubernetes.client.openapi.models.V1PodAffinityTermFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1PodAffinityTerm instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withLabelSelector(instance.getLabelSelector());

    fluent.withNamespaceSelector(instance.getNamespaceSelector());

    fluent.withNamespaces(instance.getNamespaces());

    fluent.withTopologyKey(instance.getTopologyKey());

    this.validationEnabled = validationEnabled;
  }

  public V1PodAffinityTermBuilder(io.kubernetes.client.openapi.models.V1PodAffinityTerm instance) {
    this(instance, false);
  }

  public V1PodAffinityTermBuilder(
      io.kubernetes.client.openapi.models.V1PodAffinityTerm instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withLabelSelector(instance.getLabelSelector());

    this.withNamespaceSelector(instance.getNamespaceSelector());

    this.withNamespaces(instance.getNamespaces());

    this.withTopologyKey(instance.getTopologyKey());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1PodAffinityTermFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1PodAffinityTerm build() {
    V1PodAffinityTerm buildable = new V1PodAffinityTerm();
    buildable.setLabelSelector(fluent.getLabelSelector());
    buildable.setNamespaceSelector(fluent.getNamespaceSelector());
    buildable.setNamespaces(fluent.getNamespaces());
    buildable.setTopologyKey(fluent.getTopologyKey());
    return buildable;
  }
}

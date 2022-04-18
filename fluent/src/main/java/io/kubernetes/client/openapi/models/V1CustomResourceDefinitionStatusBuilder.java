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

public class V1CustomResourceDefinitionStatusBuilder
    extends V1CustomResourceDefinitionStatusFluentImpl<V1CustomResourceDefinitionStatusBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1CustomResourceDefinitionStatus,
        io.kubernetes.client.openapi.models.V1CustomResourceDefinitionStatusBuilder> {
  public V1CustomResourceDefinitionStatusBuilder() {
    this(false);
  }

  public V1CustomResourceDefinitionStatusBuilder(Boolean validationEnabled) {
    this(new V1CustomResourceDefinitionStatus(), validationEnabled);
  }

  public V1CustomResourceDefinitionStatusBuilder(V1CustomResourceDefinitionStatusFluent<?> fluent) {
    this(fluent, false);
  }

  public V1CustomResourceDefinitionStatusBuilder(
      io.kubernetes.client.openapi.models.V1CustomResourceDefinitionStatusFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1CustomResourceDefinitionStatus(), validationEnabled);
  }

  public V1CustomResourceDefinitionStatusBuilder(
      io.kubernetes.client.openapi.models.V1CustomResourceDefinitionStatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1CustomResourceDefinitionStatus instance) {
    this(fluent, instance, false);
  }

  public V1CustomResourceDefinitionStatusBuilder(
      io.kubernetes.client.openapi.models.V1CustomResourceDefinitionStatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1CustomResourceDefinitionStatus instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withAcceptedNames(instance.getAcceptedNames());

    fluent.withConditions(instance.getConditions());

    fluent.withStoredVersions(instance.getStoredVersions());

    this.validationEnabled = validationEnabled;
  }

  public V1CustomResourceDefinitionStatusBuilder(
      io.kubernetes.client.openapi.models.V1CustomResourceDefinitionStatus instance) {
    this(instance, false);
  }

  public V1CustomResourceDefinitionStatusBuilder(
      io.kubernetes.client.openapi.models.V1CustomResourceDefinitionStatus instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withAcceptedNames(instance.getAcceptedNames());

    this.withConditions(instance.getConditions());

    this.withStoredVersions(instance.getStoredVersions());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1CustomResourceDefinitionStatusFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionStatus build() {
    V1CustomResourceDefinitionStatus buildable = new V1CustomResourceDefinitionStatus();
    buildable.setAcceptedNames(fluent.getAcceptedNames());
    buildable.setConditions(fluent.getConditions());
    buildable.setStoredVersions(fluent.getStoredVersions());
    return buildable;
  }
}

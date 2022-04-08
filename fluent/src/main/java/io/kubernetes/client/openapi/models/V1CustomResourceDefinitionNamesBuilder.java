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

public class V1CustomResourceDefinitionNamesBuilder
    extends V1CustomResourceDefinitionNamesFluentImpl<V1CustomResourceDefinitionNamesBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1CustomResourceDefinitionNames,
        io.kubernetes.client.openapi.models.V1CustomResourceDefinitionNamesBuilder> {
  public V1CustomResourceDefinitionNamesBuilder() {
    this(false);
  }

  public V1CustomResourceDefinitionNamesBuilder(Boolean validationEnabled) {
    this(new V1CustomResourceDefinitionNames(), validationEnabled);
  }

  public V1CustomResourceDefinitionNamesBuilder(V1CustomResourceDefinitionNamesFluent<?> fluent) {
    this(fluent, false);
  }

  public V1CustomResourceDefinitionNamesBuilder(
      io.kubernetes.client.openapi.models.V1CustomResourceDefinitionNamesFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1CustomResourceDefinitionNames(), validationEnabled);
  }

  public V1CustomResourceDefinitionNamesBuilder(
      io.kubernetes.client.openapi.models.V1CustomResourceDefinitionNamesFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1CustomResourceDefinitionNames instance) {
    this(fluent, instance, false);
  }

  public V1CustomResourceDefinitionNamesBuilder(
      io.kubernetes.client.openapi.models.V1CustomResourceDefinitionNamesFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1CustomResourceDefinitionNames instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withCategories(instance.getCategories());

    fluent.withKind(instance.getKind());

    fluent.withListKind(instance.getListKind());

    fluent.withPlural(instance.getPlural());

    fluent.withShortNames(instance.getShortNames());

    fluent.withSingular(instance.getSingular());

    this.validationEnabled = validationEnabled;
  }

  public V1CustomResourceDefinitionNamesBuilder(
      io.kubernetes.client.openapi.models.V1CustomResourceDefinitionNames instance) {
    this(instance, false);
  }

  public V1CustomResourceDefinitionNamesBuilder(
      io.kubernetes.client.openapi.models.V1CustomResourceDefinitionNames instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withCategories(instance.getCategories());

    this.withKind(instance.getKind());

    this.withListKind(instance.getListKind());

    this.withPlural(instance.getPlural());

    this.withShortNames(instance.getShortNames());

    this.withSingular(instance.getSingular());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1CustomResourceDefinitionNamesFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionNames build() {
    V1CustomResourceDefinitionNames buildable = new V1CustomResourceDefinitionNames();
    buildable.setCategories(fluent.getCategories());
    buildable.setKind(fluent.getKind());
    buildable.setListKind(fluent.getListKind());
    buildable.setPlural(fluent.getPlural());
    buildable.setShortNames(fluent.getShortNames());
    buildable.setSingular(fluent.getSingular());
    return buildable;
  }
}

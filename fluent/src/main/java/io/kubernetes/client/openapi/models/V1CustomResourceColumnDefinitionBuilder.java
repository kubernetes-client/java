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

public class V1CustomResourceColumnDefinitionBuilder
    extends V1CustomResourceColumnDefinitionFluentImpl<V1CustomResourceColumnDefinitionBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1CustomResourceColumnDefinition,
        io.kubernetes.client.openapi.models.V1CustomResourceColumnDefinitionBuilder> {
  public V1CustomResourceColumnDefinitionBuilder() {
    this(false);
  }

  public V1CustomResourceColumnDefinitionBuilder(Boolean validationEnabled) {
    this(new V1CustomResourceColumnDefinition(), validationEnabled);
  }

  public V1CustomResourceColumnDefinitionBuilder(V1CustomResourceColumnDefinitionFluent<?> fluent) {
    this(fluent, false);
  }

  public V1CustomResourceColumnDefinitionBuilder(
      io.kubernetes.client.openapi.models.V1CustomResourceColumnDefinitionFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1CustomResourceColumnDefinition(), validationEnabled);
  }

  public V1CustomResourceColumnDefinitionBuilder(
      io.kubernetes.client.openapi.models.V1CustomResourceColumnDefinitionFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1CustomResourceColumnDefinition instance) {
    this(fluent, instance, false);
  }

  public V1CustomResourceColumnDefinitionBuilder(
      io.kubernetes.client.openapi.models.V1CustomResourceColumnDefinitionFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1CustomResourceColumnDefinition instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withDescription(instance.getDescription());

    fluent.withFormat(instance.getFormat());

    fluent.withJsonPath(instance.getJsonPath());

    fluent.withName(instance.getName());

    fluent.withPriority(instance.getPriority());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled;
  }

  public V1CustomResourceColumnDefinitionBuilder(
      io.kubernetes.client.openapi.models.V1CustomResourceColumnDefinition instance) {
    this(instance, false);
  }

  public V1CustomResourceColumnDefinitionBuilder(
      io.kubernetes.client.openapi.models.V1CustomResourceColumnDefinition instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withDescription(instance.getDescription());

    this.withFormat(instance.getFormat());

    this.withJsonPath(instance.getJsonPath());

    this.withName(instance.getName());

    this.withPriority(instance.getPriority());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1CustomResourceColumnDefinitionFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1CustomResourceColumnDefinition build() {
    V1CustomResourceColumnDefinition buildable = new V1CustomResourceColumnDefinition();
    buildable.setDescription(fluent.getDescription());
    buildable.setFormat(fluent.getFormat());
    buildable.setJsonPath(fluent.getJsonPath());
    buildable.setName(fluent.getName());
    buildable.setPriority(fluent.getPriority());
    buildable.setType(fluent.getType());
    return buildable;
  }
}

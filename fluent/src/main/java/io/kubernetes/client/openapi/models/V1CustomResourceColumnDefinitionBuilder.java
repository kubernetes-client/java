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

public class V1CustomResourceColumnDefinitionBuilder
    extends io.kubernetes.client.openapi.models.V1CustomResourceColumnDefinitionFluentImpl<
        io.kubernetes.client.openapi.models.V1CustomResourceColumnDefinitionBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1CustomResourceColumnDefinition,
        io.kubernetes.client.openapi.models.V1CustomResourceColumnDefinitionBuilder> {
  public V1CustomResourceColumnDefinitionBuilder() {
    this(false);
  }

  public V1CustomResourceColumnDefinitionBuilder(java.lang.Boolean validationEnabled) {
    this(new V1CustomResourceColumnDefinition(), validationEnabled);
  }

  public V1CustomResourceColumnDefinitionBuilder(
      io.kubernetes.client.openapi.models.V1CustomResourceColumnDefinitionFluent<?> fluent) {
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

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1CustomResourceColumnDefinitionBuilder that = (V1CustomResourceColumnDefinitionBuilder) o;
    if (fluent != null && fluent != this
        ? !fluent.equals(that.fluent)
        : that.fluent != null && fluent != this) return false;

    if (validationEnabled != null
        ? !validationEnabled.equals(that.validationEnabled)
        : that.validationEnabled != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(fluent, validationEnabled, super.hashCode());
  }
}

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

public class V1CustomResourceDefinitionSpecBuilder
    extends io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluentImpl<
        io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpec,
        io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecBuilder> {
  public V1CustomResourceDefinitionSpecBuilder() {
    this(false);
  }

  public V1CustomResourceDefinitionSpecBuilder(java.lang.Boolean validationEnabled) {
    this(new V1CustomResourceDefinitionSpec(), validationEnabled);
  }

  public V1CustomResourceDefinitionSpecBuilder(
      io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluent<?> fluent) {
    this(fluent, false);
  }

  public V1CustomResourceDefinitionSpecBuilder(
      io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1CustomResourceDefinitionSpec(), validationEnabled);
  }

  public V1CustomResourceDefinitionSpecBuilder(
      io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpec instance) {
    this(fluent, instance, false);
  }

  public V1CustomResourceDefinitionSpecBuilder(
      io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpec instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withConversion(instance.getConversion());

    fluent.withGroup(instance.getGroup());

    fluent.withNames(instance.getNames());

    fluent.withPreserveUnknownFields(instance.getPreserveUnknownFields());

    fluent.withScope(instance.getScope());

    fluent.withVersions(instance.getVersions());

    this.validationEnabled = validationEnabled;
  }

  public V1CustomResourceDefinitionSpecBuilder(
      io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpec instance) {
    this(instance, false);
  }

  public V1CustomResourceDefinitionSpecBuilder(
      io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpec instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withConversion(instance.getConversion());

    this.withGroup(instance.getGroup());

    this.withNames(instance.getNames());

    this.withPreserveUnknownFields(instance.getPreserveUnknownFields());

    this.withScope(instance.getScope());

    this.withVersions(instance.getVersions());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpecFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpec build() {
    V1CustomResourceDefinitionSpec buildable = new V1CustomResourceDefinitionSpec();
    buildable.setConversion(fluent.getConversion());
    buildable.setGroup(fluent.getGroup());
    buildable.setNames(fluent.getNames());
    buildable.setPreserveUnknownFields(fluent.getPreserveUnknownFields());
    buildable.setScope(fluent.getScope());
    buildable.setVersions(fluent.getVersions());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1CustomResourceDefinitionSpecBuilder that = (V1CustomResourceDefinitionSpecBuilder) o;
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

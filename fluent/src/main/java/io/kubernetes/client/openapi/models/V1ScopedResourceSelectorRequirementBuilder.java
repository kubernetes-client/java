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

public class V1ScopedResourceSelectorRequirementBuilder
    extends io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirementFluentImpl<
        io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirementBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement,
        io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirementBuilder> {
  public V1ScopedResourceSelectorRequirementBuilder() {
    this(false);
  }

  public V1ScopedResourceSelectorRequirementBuilder(java.lang.Boolean validationEnabled) {
    this(new V1ScopedResourceSelectorRequirement(), validationEnabled);
  }

  public V1ScopedResourceSelectorRequirementBuilder(
      io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirementFluent<?> fluent) {
    this(fluent, false);
  }

  public V1ScopedResourceSelectorRequirementBuilder(
      io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirementFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1ScopedResourceSelectorRequirement(), validationEnabled);
  }

  public V1ScopedResourceSelectorRequirementBuilder(
      io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirementFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement instance) {
    this(fluent, instance, false);
  }

  public V1ScopedResourceSelectorRequirementBuilder(
      io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirementFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withOperator(instance.getOperator());

    fluent.withScopeName(instance.getScopeName());

    fluent.withValues(instance.getValues());

    this.validationEnabled = validationEnabled;
  }

  public V1ScopedResourceSelectorRequirementBuilder(
      io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement instance) {
    this(instance, false);
  }

  public V1ScopedResourceSelectorRequirementBuilder(
      io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withOperator(instance.getOperator());

    this.withScopeName(instance.getScopeName());

    this.withValues(instance.getValues());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirementFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement build() {
    V1ScopedResourceSelectorRequirement buildable = new V1ScopedResourceSelectorRequirement();
    buildable.setOperator(fluent.getOperator());
    buildable.setScopeName(fluent.getScopeName());
    buildable.setValues(fluent.getValues());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ScopedResourceSelectorRequirementBuilder that =
        (V1ScopedResourceSelectorRequirementBuilder) o;
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

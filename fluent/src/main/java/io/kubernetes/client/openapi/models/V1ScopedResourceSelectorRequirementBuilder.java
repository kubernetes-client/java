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

public class V1ScopedResourceSelectorRequirementBuilder
    extends V1ScopedResourceSelectorRequirementFluentImpl<
        V1ScopedResourceSelectorRequirementBuilder>
    implements VisitableBuilder<
        V1ScopedResourceSelectorRequirement, V1ScopedResourceSelectorRequirementBuilder> {
  public V1ScopedResourceSelectorRequirementBuilder() {
    this(false);
  }

  public V1ScopedResourceSelectorRequirementBuilder(Boolean validationEnabled) {
    this(new V1ScopedResourceSelectorRequirement(), validationEnabled);
  }

  public V1ScopedResourceSelectorRequirementBuilder(
      V1ScopedResourceSelectorRequirementFluent<?> fluent) {
    this(fluent, false);
  }

  public V1ScopedResourceSelectorRequirementBuilder(
      V1ScopedResourceSelectorRequirementFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1ScopedResourceSelectorRequirement(), validationEnabled);
  }

  public V1ScopedResourceSelectorRequirementBuilder(
      V1ScopedResourceSelectorRequirementFluent<?> fluent,
      V1ScopedResourceSelectorRequirement instance) {
    this(fluent, instance, false);
  }

  public V1ScopedResourceSelectorRequirementBuilder(
      V1ScopedResourceSelectorRequirementFluent<?> fluent,
      V1ScopedResourceSelectorRequirement instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withOperator(instance.getOperator());

    fluent.withScopeName(instance.getScopeName());

    fluent.withValues(instance.getValues());

    this.validationEnabled = validationEnabled;
  }

  public V1ScopedResourceSelectorRequirementBuilder(V1ScopedResourceSelectorRequirement instance) {
    this(instance, false);
  }

  public V1ScopedResourceSelectorRequirementBuilder(
      V1ScopedResourceSelectorRequirement instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withOperator(instance.getOperator());

    this.withScopeName(instance.getScopeName());

    this.withValues(instance.getValues());

    this.validationEnabled = validationEnabled;
  }

  V1ScopedResourceSelectorRequirementFluent<?> fluent;
  Boolean validationEnabled;

  public V1ScopedResourceSelectorRequirement build() {
    V1ScopedResourceSelectorRequirement buildable = new V1ScopedResourceSelectorRequirement();
    buildable.setOperator(fluent.getOperator());
    buildable.setScopeName(fluent.getScopeName());
    buildable.setValues(fluent.getValues());
    return buildable;
  }
}

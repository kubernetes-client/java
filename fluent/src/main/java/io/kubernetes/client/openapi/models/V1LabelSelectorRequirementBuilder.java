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

public class V1LabelSelectorRequirementBuilder
    extends V1LabelSelectorRequirementFluentImpl<V1LabelSelectorRequirementBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1LabelSelectorRequirement,
        io.kubernetes.client.openapi.models.V1LabelSelectorRequirementBuilder> {
  public V1LabelSelectorRequirementBuilder() {
    this(false);
  }

  public V1LabelSelectorRequirementBuilder(Boolean validationEnabled) {
    this(new V1LabelSelectorRequirement(), validationEnabled);
  }

  public V1LabelSelectorRequirementBuilder(V1LabelSelectorRequirementFluent<?> fluent) {
    this(fluent, false);
  }

  public V1LabelSelectorRequirementBuilder(
      io.kubernetes.client.openapi.models.V1LabelSelectorRequirementFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1LabelSelectorRequirement(), validationEnabled);
  }

  public V1LabelSelectorRequirementBuilder(
      io.kubernetes.client.openapi.models.V1LabelSelectorRequirementFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1LabelSelectorRequirement instance) {
    this(fluent, instance, false);
  }

  public V1LabelSelectorRequirementBuilder(
      io.kubernetes.client.openapi.models.V1LabelSelectorRequirementFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1LabelSelectorRequirement instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withKey(instance.getKey());

    fluent.withOperator(instance.getOperator());

    fluent.withValues(instance.getValues());

    this.validationEnabled = validationEnabled;
  }

  public V1LabelSelectorRequirementBuilder(
      io.kubernetes.client.openapi.models.V1LabelSelectorRequirement instance) {
    this(instance, false);
  }

  public V1LabelSelectorRequirementBuilder(
      io.kubernetes.client.openapi.models.V1LabelSelectorRequirement instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withKey(instance.getKey());

    this.withOperator(instance.getOperator());

    this.withValues(instance.getValues());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1LabelSelectorRequirementFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1LabelSelectorRequirement build() {
    V1LabelSelectorRequirement buildable = new V1LabelSelectorRequirement();
    buildable.setKey(fluent.getKey());
    buildable.setOperator(fluent.getOperator());
    buildable.setValues(fluent.getValues());
    return buildable;
  }
}

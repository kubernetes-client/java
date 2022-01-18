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

public class V1TopologySelectorLabelRequirementBuilder
    extends io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirementFluentImpl<
        io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirementBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement,
        io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirementBuilder> {
  public V1TopologySelectorLabelRequirementBuilder() {
    this(false);
  }

  public V1TopologySelectorLabelRequirementBuilder(java.lang.Boolean validationEnabled) {
    this(new V1TopologySelectorLabelRequirement(), validationEnabled);
  }

  public V1TopologySelectorLabelRequirementBuilder(
      io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirementFluent<?> fluent) {
    this(fluent, false);
  }

  public V1TopologySelectorLabelRequirementBuilder(
      io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirementFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1TopologySelectorLabelRequirement(), validationEnabled);
  }

  public V1TopologySelectorLabelRequirementBuilder(
      io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirementFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement instance) {
    this(fluent, instance, false);
  }

  public V1TopologySelectorLabelRequirementBuilder(
      io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirementFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withKey(instance.getKey());

    fluent.withValues(instance.getValues());

    this.validationEnabled = validationEnabled;
  }

  public V1TopologySelectorLabelRequirementBuilder(
      io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement instance) {
    this(instance, false);
  }

  public V1TopologySelectorLabelRequirementBuilder(
      io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withKey(instance.getKey());

    this.withValues(instance.getValues());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirementFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement build() {
    V1TopologySelectorLabelRequirement buildable = new V1TopologySelectorLabelRequirement();
    buildable.setKey(fluent.getKey());
    buildable.setValues(fluent.getValues());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1TopologySelectorLabelRequirementBuilder that = (V1TopologySelectorLabelRequirementBuilder) o;
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

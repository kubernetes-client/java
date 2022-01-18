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

public class V1CustomResourceValidationBuilder
    extends io.kubernetes.client.openapi.models.V1CustomResourceValidationFluentImpl<
        io.kubernetes.client.openapi.models.V1CustomResourceValidationBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1CustomResourceValidation,
        io.kubernetes.client.openapi.models.V1CustomResourceValidationBuilder> {
  public V1CustomResourceValidationBuilder() {
    this(false);
  }

  public V1CustomResourceValidationBuilder(java.lang.Boolean validationEnabled) {
    this(new V1CustomResourceValidation(), validationEnabled);
  }

  public V1CustomResourceValidationBuilder(
      io.kubernetes.client.openapi.models.V1CustomResourceValidationFluent<?> fluent) {
    this(fluent, false);
  }

  public V1CustomResourceValidationBuilder(
      io.kubernetes.client.openapi.models.V1CustomResourceValidationFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1CustomResourceValidation(), validationEnabled);
  }

  public V1CustomResourceValidationBuilder(
      io.kubernetes.client.openapi.models.V1CustomResourceValidationFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1CustomResourceValidation instance) {
    this(fluent, instance, false);
  }

  public V1CustomResourceValidationBuilder(
      io.kubernetes.client.openapi.models.V1CustomResourceValidationFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1CustomResourceValidation instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withOpenAPIV3Schema(instance.getOpenAPIV3Schema());

    this.validationEnabled = validationEnabled;
  }

  public V1CustomResourceValidationBuilder(
      io.kubernetes.client.openapi.models.V1CustomResourceValidation instance) {
    this(instance, false);
  }

  public V1CustomResourceValidationBuilder(
      io.kubernetes.client.openapi.models.V1CustomResourceValidation instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withOpenAPIV3Schema(instance.getOpenAPIV3Schema());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1CustomResourceValidationFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1CustomResourceValidation build() {
    V1CustomResourceValidation buildable = new V1CustomResourceValidation();
    buildable.setOpenAPIV3Schema(fluent.getOpenAPIV3Schema());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1CustomResourceValidationBuilder that = (V1CustomResourceValidationBuilder) o;
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

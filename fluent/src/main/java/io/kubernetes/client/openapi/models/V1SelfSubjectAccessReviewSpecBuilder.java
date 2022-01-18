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

public class V1SelfSubjectAccessReviewSpecBuilder
    extends io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpecFluentImpl<
        io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpecBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpec,
        io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpecBuilder> {
  public V1SelfSubjectAccessReviewSpecBuilder() {
    this(false);
  }

  public V1SelfSubjectAccessReviewSpecBuilder(java.lang.Boolean validationEnabled) {
    this(new V1SelfSubjectAccessReviewSpec(), validationEnabled);
  }

  public V1SelfSubjectAccessReviewSpecBuilder(
      io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpecFluent<?> fluent) {
    this(fluent, false);
  }

  public V1SelfSubjectAccessReviewSpecBuilder(
      io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpecFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1SelfSubjectAccessReviewSpec(), validationEnabled);
  }

  public V1SelfSubjectAccessReviewSpecBuilder(
      io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpec instance) {
    this(fluent, instance, false);
  }

  public V1SelfSubjectAccessReviewSpecBuilder(
      io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpec instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withNonResourceAttributes(instance.getNonResourceAttributes());

    fluent.withResourceAttributes(instance.getResourceAttributes());

    this.validationEnabled = validationEnabled;
  }

  public V1SelfSubjectAccessReviewSpecBuilder(
      io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpec instance) {
    this(instance, false);
  }

  public V1SelfSubjectAccessReviewSpecBuilder(
      io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpec instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withNonResourceAttributes(instance.getNonResourceAttributes());

    this.withResourceAttributes(instance.getResourceAttributes());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpecFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpec build() {
    V1SelfSubjectAccessReviewSpec buildable = new V1SelfSubjectAccessReviewSpec();
    buildable.setNonResourceAttributes(fluent.getNonResourceAttributes());
    buildable.setResourceAttributes(fluent.getResourceAttributes());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1SelfSubjectAccessReviewSpecBuilder that = (V1SelfSubjectAccessReviewSpecBuilder) o;
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

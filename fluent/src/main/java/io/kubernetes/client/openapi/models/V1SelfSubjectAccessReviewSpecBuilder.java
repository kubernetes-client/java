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

public class V1SelfSubjectAccessReviewSpecBuilder
    extends V1SelfSubjectAccessReviewSpecFluentImpl<V1SelfSubjectAccessReviewSpecBuilder>
    implements VisitableBuilder<
        V1SelfSubjectAccessReviewSpec, V1SelfSubjectAccessReviewSpecBuilder> {
  public V1SelfSubjectAccessReviewSpecBuilder() {
    this(false);
  }

  public V1SelfSubjectAccessReviewSpecBuilder(Boolean validationEnabled) {
    this(new V1SelfSubjectAccessReviewSpec(), validationEnabled);
  }

  public V1SelfSubjectAccessReviewSpecBuilder(V1SelfSubjectAccessReviewSpecFluent<?> fluent) {
    this(fluent, false);
  }

  public V1SelfSubjectAccessReviewSpecBuilder(
      V1SelfSubjectAccessReviewSpecFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1SelfSubjectAccessReviewSpec(), validationEnabled);
  }

  public V1SelfSubjectAccessReviewSpecBuilder(
      V1SelfSubjectAccessReviewSpecFluent<?> fluent, V1SelfSubjectAccessReviewSpec instance) {
    this(fluent, instance, false);
  }

  public V1SelfSubjectAccessReviewSpecBuilder(
      V1SelfSubjectAccessReviewSpecFluent<?> fluent,
      V1SelfSubjectAccessReviewSpec instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withNonResourceAttributes(instance.getNonResourceAttributes());

    fluent.withResourceAttributes(instance.getResourceAttributes());

    this.validationEnabled = validationEnabled;
  }

  public V1SelfSubjectAccessReviewSpecBuilder(V1SelfSubjectAccessReviewSpec instance) {
    this(instance, false);
  }

  public V1SelfSubjectAccessReviewSpecBuilder(
      V1SelfSubjectAccessReviewSpec instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withNonResourceAttributes(instance.getNonResourceAttributes());

    this.withResourceAttributes(instance.getResourceAttributes());

    this.validationEnabled = validationEnabled;
  }

  V1SelfSubjectAccessReviewSpecFluent<?> fluent;
  Boolean validationEnabled;

  public V1SelfSubjectAccessReviewSpec build() {
    V1SelfSubjectAccessReviewSpec buildable = new V1SelfSubjectAccessReviewSpec();
    buildable.setNonResourceAttributes(fluent.getNonResourceAttributes());
    buildable.setResourceAttributes(fluent.getResourceAttributes());
    return buildable;
  }
}

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

public class V1SubjectAccessReviewSpecBuilder
    extends V1SubjectAccessReviewSpecFluentImpl<V1SubjectAccessReviewSpecBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1SubjectAccessReviewSpec,
        io.kubernetes.client.openapi.models.V1SubjectAccessReviewSpecBuilder> {
  public V1SubjectAccessReviewSpecBuilder() {
    this(false);
  }

  public V1SubjectAccessReviewSpecBuilder(Boolean validationEnabled) {
    this(new V1SubjectAccessReviewSpec(), validationEnabled);
  }

  public V1SubjectAccessReviewSpecBuilder(V1SubjectAccessReviewSpecFluent<?> fluent) {
    this(fluent, false);
  }

  public V1SubjectAccessReviewSpecBuilder(
      io.kubernetes.client.openapi.models.V1SubjectAccessReviewSpecFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1SubjectAccessReviewSpec(), validationEnabled);
  }

  public V1SubjectAccessReviewSpecBuilder(
      io.kubernetes.client.openapi.models.V1SubjectAccessReviewSpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1SubjectAccessReviewSpec instance) {
    this(fluent, instance, false);
  }

  public V1SubjectAccessReviewSpecBuilder(
      io.kubernetes.client.openapi.models.V1SubjectAccessReviewSpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1SubjectAccessReviewSpec instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withExtra(instance.getExtra());

    fluent.withGroups(instance.getGroups());

    fluent.withNonResourceAttributes(instance.getNonResourceAttributes());

    fluent.withResourceAttributes(instance.getResourceAttributes());

    fluent.withUid(instance.getUid());

    fluent.withUser(instance.getUser());

    this.validationEnabled = validationEnabled;
  }

  public V1SubjectAccessReviewSpecBuilder(
      io.kubernetes.client.openapi.models.V1SubjectAccessReviewSpec instance) {
    this(instance, false);
  }

  public V1SubjectAccessReviewSpecBuilder(
      io.kubernetes.client.openapi.models.V1SubjectAccessReviewSpec instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withExtra(instance.getExtra());

    this.withGroups(instance.getGroups());

    this.withNonResourceAttributes(instance.getNonResourceAttributes());

    this.withResourceAttributes(instance.getResourceAttributes());

    this.withUid(instance.getUid());

    this.withUser(instance.getUser());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1SubjectAccessReviewSpecFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1SubjectAccessReviewSpec build() {
    V1SubjectAccessReviewSpec buildable = new V1SubjectAccessReviewSpec();
    buildable.setExtra(fluent.getExtra());
    buildable.setGroups(fluent.getGroups());
    buildable.setNonResourceAttributes(fluent.getNonResourceAttributes());
    buildable.setResourceAttributes(fluent.getResourceAttributes());
    buildable.setUid(fluent.getUid());
    buildable.setUser(fluent.getUser());
    return buildable;
  }
}

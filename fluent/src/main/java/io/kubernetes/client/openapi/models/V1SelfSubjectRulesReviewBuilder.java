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

public class V1SelfSubjectRulesReviewBuilder
    extends io.kubernetes.client.openapi.models.V1SelfSubjectRulesReviewFluentImpl<
        io.kubernetes.client.openapi.models.V1SelfSubjectRulesReviewBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1SelfSubjectRulesReview,
        io.kubernetes.client.openapi.models.V1SelfSubjectRulesReviewBuilder> {
  public V1SelfSubjectRulesReviewBuilder() {
    this(false);
  }

  public V1SelfSubjectRulesReviewBuilder(java.lang.Boolean validationEnabled) {
    this(new V1SelfSubjectRulesReview(), validationEnabled);
  }

  public V1SelfSubjectRulesReviewBuilder(
      io.kubernetes.client.openapi.models.V1SelfSubjectRulesReviewFluent<?> fluent) {
    this(fluent, false);
  }

  public V1SelfSubjectRulesReviewBuilder(
      io.kubernetes.client.openapi.models.V1SelfSubjectRulesReviewFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1SelfSubjectRulesReview(), validationEnabled);
  }

  public V1SelfSubjectRulesReviewBuilder(
      io.kubernetes.client.openapi.models.V1SelfSubjectRulesReviewFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1SelfSubjectRulesReview instance) {
    this(fluent, instance, false);
  }

  public V1SelfSubjectRulesReviewBuilder(
      io.kubernetes.client.openapi.models.V1SelfSubjectRulesReviewFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1SelfSubjectRulesReview instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withSpec(instance.getSpec());

    fluent.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled;
  }

  public V1SelfSubjectRulesReviewBuilder(
      io.kubernetes.client.openapi.models.V1SelfSubjectRulesReview instance) {
    this(instance, false);
  }

  public V1SelfSubjectRulesReviewBuilder(
      io.kubernetes.client.openapi.models.V1SelfSubjectRulesReview instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1SelfSubjectRulesReviewFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1SelfSubjectRulesReview build() {
    V1SelfSubjectRulesReview buildable = new V1SelfSubjectRulesReview();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    buildable.setStatus(fluent.getStatus());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1SelfSubjectRulesReviewBuilder that = (V1SelfSubjectRulesReviewBuilder) o;
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

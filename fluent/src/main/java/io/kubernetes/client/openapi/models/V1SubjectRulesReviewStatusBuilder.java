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

public class V1SubjectRulesReviewStatusBuilder
    extends io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatusFluentImpl<
        io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatusBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatus,
        io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatusBuilder> {
  public V1SubjectRulesReviewStatusBuilder() {
    this(false);
  }

  public V1SubjectRulesReviewStatusBuilder(java.lang.Boolean validationEnabled) {
    this(new V1SubjectRulesReviewStatus(), validationEnabled);
  }

  public V1SubjectRulesReviewStatusBuilder(
      io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatusFluent<?> fluent) {
    this(fluent, false);
  }

  public V1SubjectRulesReviewStatusBuilder(
      io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatusFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1SubjectRulesReviewStatus(), validationEnabled);
  }

  public V1SubjectRulesReviewStatusBuilder(
      io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatus instance) {
    this(fluent, instance, false);
  }

  public V1SubjectRulesReviewStatusBuilder(
      io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatus instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withEvaluationError(instance.getEvaluationError());

    fluent.withIncomplete(instance.getIncomplete());

    fluent.withNonResourceRules(instance.getNonResourceRules());

    fluent.withResourceRules(instance.getResourceRules());

    this.validationEnabled = validationEnabled;
  }

  public V1SubjectRulesReviewStatusBuilder(
      io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatus instance) {
    this(instance, false);
  }

  public V1SubjectRulesReviewStatusBuilder(
      io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatus instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withEvaluationError(instance.getEvaluationError());

    this.withIncomplete(instance.getIncomplete());

    this.withNonResourceRules(instance.getNonResourceRules());

    this.withResourceRules(instance.getResourceRules());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatusFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatus build() {
    V1SubjectRulesReviewStatus buildable = new V1SubjectRulesReviewStatus();
    buildable.setEvaluationError(fluent.getEvaluationError());
    buildable.setIncomplete(fluent.getIncomplete());
    buildable.setNonResourceRules(fluent.getNonResourceRules());
    buildable.setResourceRules(fluent.getResourceRules());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1SubjectRulesReviewStatusBuilder that = (V1SubjectRulesReviewStatusBuilder) o;
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

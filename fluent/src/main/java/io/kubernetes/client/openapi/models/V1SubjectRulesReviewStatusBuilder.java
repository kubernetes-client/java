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

public class V1SubjectRulesReviewStatusBuilder
    extends V1SubjectRulesReviewStatusFluentImpl<V1SubjectRulesReviewStatusBuilder>
    implements VisitableBuilder<V1SubjectRulesReviewStatus, V1SubjectRulesReviewStatusBuilder> {
  public V1SubjectRulesReviewStatusBuilder() {
    this(false);
  }

  public V1SubjectRulesReviewStatusBuilder(Boolean validationEnabled) {
    this(new V1SubjectRulesReviewStatus(), validationEnabled);
  }

  public V1SubjectRulesReviewStatusBuilder(V1SubjectRulesReviewStatusFluent<?> fluent) {
    this(fluent, false);
  }

  public V1SubjectRulesReviewStatusBuilder(
      V1SubjectRulesReviewStatusFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1SubjectRulesReviewStatus(), validationEnabled);
  }

  public V1SubjectRulesReviewStatusBuilder(
      V1SubjectRulesReviewStatusFluent<?> fluent, V1SubjectRulesReviewStatus instance) {
    this(fluent, instance, false);
  }

  public V1SubjectRulesReviewStatusBuilder(
      V1SubjectRulesReviewStatusFluent<?> fluent,
      V1SubjectRulesReviewStatus instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withEvaluationError(instance.getEvaluationError());

    fluent.withIncomplete(instance.getIncomplete());

    fluent.withNonResourceRules(instance.getNonResourceRules());

    fluent.withResourceRules(instance.getResourceRules());

    this.validationEnabled = validationEnabled;
  }

  public V1SubjectRulesReviewStatusBuilder(V1SubjectRulesReviewStatus instance) {
    this(instance, false);
  }

  public V1SubjectRulesReviewStatusBuilder(
      V1SubjectRulesReviewStatus instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withEvaluationError(instance.getEvaluationError());

    this.withIncomplete(instance.getIncomplete());

    this.withNonResourceRules(instance.getNonResourceRules());

    this.withResourceRules(instance.getResourceRules());

    this.validationEnabled = validationEnabled;
  }

  V1SubjectRulesReviewStatusFluent<?> fluent;
  Boolean validationEnabled;

  public V1SubjectRulesReviewStatus build() {
    V1SubjectRulesReviewStatus buildable = new V1SubjectRulesReviewStatus();
    buildable.setEvaluationError(fluent.getEvaluationError());
    buildable.setIncomplete(fluent.getIncomplete());
    buildable.setNonResourceRules(fluent.getNonResourceRules());
    buildable.setResourceRules(fluent.getResourceRules());
    return buildable;
  }
}

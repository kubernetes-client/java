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

public class V1SubjectAccessReviewStatusBuilder
    extends V1SubjectAccessReviewStatusFluentImpl<V1SubjectAccessReviewStatusBuilder>
    implements VisitableBuilder<V1SubjectAccessReviewStatus, V1SubjectAccessReviewStatusBuilder> {
  public V1SubjectAccessReviewStatusBuilder() {
    this(false);
  }

  public V1SubjectAccessReviewStatusBuilder(Boolean validationEnabled) {
    this(new V1SubjectAccessReviewStatus(), validationEnabled);
  }

  public V1SubjectAccessReviewStatusBuilder(V1SubjectAccessReviewStatusFluent<?> fluent) {
    this(fluent, false);
  }

  public V1SubjectAccessReviewStatusBuilder(
      V1SubjectAccessReviewStatusFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1SubjectAccessReviewStatus(), validationEnabled);
  }

  public V1SubjectAccessReviewStatusBuilder(
      V1SubjectAccessReviewStatusFluent<?> fluent, V1SubjectAccessReviewStatus instance) {
    this(fluent, instance, false);
  }

  public V1SubjectAccessReviewStatusBuilder(
      V1SubjectAccessReviewStatusFluent<?> fluent,
      V1SubjectAccessReviewStatus instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withAllowed(instance.getAllowed());

    fluent.withDenied(instance.getDenied());

    fluent.withEvaluationError(instance.getEvaluationError());

    fluent.withReason(instance.getReason());

    this.validationEnabled = validationEnabled;
  }

  public V1SubjectAccessReviewStatusBuilder(V1SubjectAccessReviewStatus instance) {
    this(instance, false);
  }

  public V1SubjectAccessReviewStatusBuilder(
      V1SubjectAccessReviewStatus instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withAllowed(instance.getAllowed());

    this.withDenied(instance.getDenied());

    this.withEvaluationError(instance.getEvaluationError());

    this.withReason(instance.getReason());

    this.validationEnabled = validationEnabled;
  }

  V1SubjectAccessReviewStatusFluent<?> fluent;
  Boolean validationEnabled;

  public V1SubjectAccessReviewStatus build() {
    V1SubjectAccessReviewStatus buildable = new V1SubjectAccessReviewStatus();
    buildable.setAllowed(fluent.getAllowed());
    buildable.setDenied(fluent.getDenied());
    buildable.setEvaluationError(fluent.getEvaluationError());
    buildable.setReason(fluent.getReason());
    return buildable;
  }
}

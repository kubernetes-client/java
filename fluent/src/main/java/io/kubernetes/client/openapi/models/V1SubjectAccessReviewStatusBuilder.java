/*
Copyright 2026 The Kubernetes Authors.
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
import java.lang.Object;
public class V1SubjectAccessReviewStatusBuilder extends V1SubjectAccessReviewStatusFluent<V1SubjectAccessReviewStatusBuilder> implements VisitableBuilder<V1SubjectAccessReviewStatus,V1SubjectAccessReviewStatusBuilder>{

  V1SubjectAccessReviewStatusFluent<?> fluent;

  public V1SubjectAccessReviewStatusBuilder() {
    this(new V1SubjectAccessReviewStatus());
  }
  
  public V1SubjectAccessReviewStatusBuilder(V1SubjectAccessReviewStatusFluent<?> fluent) {
    this(fluent, new V1SubjectAccessReviewStatus());
  }
  
  public V1SubjectAccessReviewStatusBuilder(V1SubjectAccessReviewStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1SubjectAccessReviewStatusBuilder(V1SubjectAccessReviewStatusFluent<?> fluent,V1SubjectAccessReviewStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1SubjectAccessReviewStatus build() {
    V1SubjectAccessReviewStatus buildable = new V1SubjectAccessReviewStatus();
    buildable.setAllowed(fluent.getAllowed());
    buildable.setDenied(fluent.getDenied());
    buildable.setEvaluationError(fluent.getEvaluationError());
    buildable.setReason(fluent.getReason());
    return buildable;
  }
  
}
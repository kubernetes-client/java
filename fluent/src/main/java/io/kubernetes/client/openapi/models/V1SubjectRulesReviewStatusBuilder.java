/*
Copyright 2020 The Kubernetes Authors.
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
public class V1SubjectRulesReviewStatusBuilder extends V1SubjectRulesReviewStatusFluent<V1SubjectRulesReviewStatusBuilder> implements VisitableBuilder<V1SubjectRulesReviewStatus,V1SubjectRulesReviewStatusBuilder>{

  V1SubjectRulesReviewStatusFluent<?> fluent;

  public V1SubjectRulesReviewStatusBuilder() {
    this(new V1SubjectRulesReviewStatus());
  }
  
  public V1SubjectRulesReviewStatusBuilder(V1SubjectRulesReviewStatusFluent<?> fluent) {
    this(fluent, new V1SubjectRulesReviewStatus());
  }
  
  public V1SubjectRulesReviewStatusBuilder(V1SubjectRulesReviewStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1SubjectRulesReviewStatusBuilder(V1SubjectRulesReviewStatusFluent<?> fluent,V1SubjectRulesReviewStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1SubjectRulesReviewStatus build() {
    V1SubjectRulesReviewStatus buildable = new V1SubjectRulesReviewStatus();
    buildable.setEvaluationError(fluent.getEvaluationError());
    buildable.setIncomplete(fluent.getIncomplete());
    buildable.setNonResourceRules(fluent.buildNonResourceRules());
    buildable.setResourceRules(fluent.buildResourceRules());
    return buildable;
  }
  
}
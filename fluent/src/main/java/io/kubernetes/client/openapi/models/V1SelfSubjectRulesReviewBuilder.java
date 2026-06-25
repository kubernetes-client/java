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
public class V1SelfSubjectRulesReviewBuilder extends V1SelfSubjectRulesReviewFluent<V1SelfSubjectRulesReviewBuilder> implements VisitableBuilder<V1SelfSubjectRulesReview,V1SelfSubjectRulesReviewBuilder>{

  V1SelfSubjectRulesReviewFluent<?> fluent;

  public V1SelfSubjectRulesReviewBuilder() {
    this(new V1SelfSubjectRulesReview());
  }
  
  public V1SelfSubjectRulesReviewBuilder(V1SelfSubjectRulesReviewFluent<?> fluent) {
    this(fluent, new V1SelfSubjectRulesReview());
  }
  
  public V1SelfSubjectRulesReviewBuilder(V1SelfSubjectRulesReview instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1SelfSubjectRulesReviewBuilder(V1SelfSubjectRulesReviewFluent<?> fluent,V1SelfSubjectRulesReview instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1SelfSubjectRulesReview build() {
    V1SelfSubjectRulesReview buildable = new V1SelfSubjectRulesReview();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  
}
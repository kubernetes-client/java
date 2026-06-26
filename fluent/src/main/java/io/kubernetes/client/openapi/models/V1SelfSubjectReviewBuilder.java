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
public class V1SelfSubjectReviewBuilder extends V1SelfSubjectReviewFluent<V1SelfSubjectReviewBuilder> implements VisitableBuilder<V1SelfSubjectReview,V1SelfSubjectReviewBuilder>{

  V1SelfSubjectReviewFluent<?> fluent;

  public V1SelfSubjectReviewBuilder() {
    this(new V1SelfSubjectReview());
  }
  
  public V1SelfSubjectReviewBuilder(V1SelfSubjectReviewFluent<?> fluent) {
    this(fluent, new V1SelfSubjectReview());
  }
  
  public V1SelfSubjectReviewBuilder(V1SelfSubjectReview instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1SelfSubjectReviewBuilder(V1SelfSubjectReviewFluent<?> fluent,V1SelfSubjectReview instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1SelfSubjectReview build() {
    V1SelfSubjectReview buildable = new V1SelfSubjectReview();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  
}
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
public class V1SelfSubjectReviewStatusBuilder extends V1SelfSubjectReviewStatusFluent<V1SelfSubjectReviewStatusBuilder> implements VisitableBuilder<V1SelfSubjectReviewStatus,V1SelfSubjectReviewStatusBuilder>{

  V1SelfSubjectReviewStatusFluent<?> fluent;

  public V1SelfSubjectReviewStatusBuilder() {
    this(new V1SelfSubjectReviewStatus());
  }
  
  public V1SelfSubjectReviewStatusBuilder(V1SelfSubjectReviewStatusFluent<?> fluent) {
    this(fluent, new V1SelfSubjectReviewStatus());
  }
  
  public V1SelfSubjectReviewStatusBuilder(V1SelfSubjectReviewStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1SelfSubjectReviewStatusBuilder(V1SelfSubjectReviewStatusFluent<?> fluent,V1SelfSubjectReviewStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1SelfSubjectReviewStatus build() {
    V1SelfSubjectReviewStatus buildable = new V1SelfSubjectReviewStatus();
    buildable.setUserInfo(fluent.buildUserInfo());
    return buildable;
  }
  
}
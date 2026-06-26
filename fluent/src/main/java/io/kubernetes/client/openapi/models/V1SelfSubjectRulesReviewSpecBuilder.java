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
public class V1SelfSubjectRulesReviewSpecBuilder extends V1SelfSubjectRulesReviewSpecFluent<V1SelfSubjectRulesReviewSpecBuilder> implements VisitableBuilder<V1SelfSubjectRulesReviewSpec,V1SelfSubjectRulesReviewSpecBuilder>{

  V1SelfSubjectRulesReviewSpecFluent<?> fluent;

  public V1SelfSubjectRulesReviewSpecBuilder() {
    this(new V1SelfSubjectRulesReviewSpec());
  }
  
  public V1SelfSubjectRulesReviewSpecBuilder(V1SelfSubjectRulesReviewSpecFluent<?> fluent) {
    this(fluent, new V1SelfSubjectRulesReviewSpec());
  }
  
  public V1SelfSubjectRulesReviewSpecBuilder(V1SelfSubjectRulesReviewSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1SelfSubjectRulesReviewSpecBuilder(V1SelfSubjectRulesReviewSpecFluent<?> fluent,V1SelfSubjectRulesReviewSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1SelfSubjectRulesReviewSpec build() {
    V1SelfSubjectRulesReviewSpec buildable = new V1SelfSubjectRulesReviewSpec();
    buildable.setNamespace(fluent.getNamespace());
    return buildable;
  }
  
}
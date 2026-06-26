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
public class V1alpha1MatchConditionBuilder extends V1alpha1MatchConditionFluent<V1alpha1MatchConditionBuilder> implements VisitableBuilder<V1alpha1MatchCondition,V1alpha1MatchConditionBuilder>{

  V1alpha1MatchConditionFluent<?> fluent;

  public V1alpha1MatchConditionBuilder() {
    this(new V1alpha1MatchCondition());
  }
  
  public V1alpha1MatchConditionBuilder(V1alpha1MatchConditionFluent<?> fluent) {
    this(fluent, new V1alpha1MatchCondition());
  }
  
  public V1alpha1MatchConditionBuilder(V1alpha1MatchCondition instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1alpha1MatchConditionBuilder(V1alpha1MatchConditionFluent<?> fluent,V1alpha1MatchCondition instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1alpha1MatchCondition build() {
    V1alpha1MatchCondition buildable = new V1alpha1MatchCondition();
    buildable.setExpression(fluent.getExpression());
    buildable.setName(fluent.getName());
    return buildable;
  }
  
}
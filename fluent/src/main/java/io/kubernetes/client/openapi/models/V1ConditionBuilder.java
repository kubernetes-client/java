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
public class V1ConditionBuilder extends V1ConditionFluent<V1ConditionBuilder> implements VisitableBuilder<V1Condition,V1ConditionBuilder>{

  V1ConditionFluent<?> fluent;

  public V1ConditionBuilder() {
    this(new V1Condition());
  }
  
  public V1ConditionBuilder(V1ConditionFluent<?> fluent) {
    this(fluent, new V1Condition());
  }
  
  public V1ConditionBuilder(V1Condition instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ConditionBuilder(V1ConditionFluent<?> fluent,V1Condition instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1Condition build() {
    V1Condition buildable = new V1Condition();
    buildable.setLastTransitionTime(fluent.getLastTransitionTime());
    buildable.setMessage(fluent.getMessage());
    buildable.setObservedGeneration(fluent.getObservedGeneration());
    buildable.setReason(fluent.getReason());
    buildable.setStatus(fluent.getStatus());
    buildable.setType(fluent.getType());
    return buildable;
  }
  
}
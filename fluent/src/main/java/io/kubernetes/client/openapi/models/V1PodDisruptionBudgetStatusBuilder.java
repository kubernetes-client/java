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
public class V1PodDisruptionBudgetStatusBuilder extends V1PodDisruptionBudgetStatusFluent<V1PodDisruptionBudgetStatusBuilder> implements VisitableBuilder<V1PodDisruptionBudgetStatus,V1PodDisruptionBudgetStatusBuilder>{

  V1PodDisruptionBudgetStatusFluent<?> fluent;

  public V1PodDisruptionBudgetStatusBuilder() {
    this(new V1PodDisruptionBudgetStatus());
  }
  
  public V1PodDisruptionBudgetStatusBuilder(V1PodDisruptionBudgetStatusFluent<?> fluent) {
    this(fluent, new V1PodDisruptionBudgetStatus());
  }
  
  public V1PodDisruptionBudgetStatusBuilder(V1PodDisruptionBudgetStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1PodDisruptionBudgetStatusBuilder(V1PodDisruptionBudgetStatusFluent<?> fluent,V1PodDisruptionBudgetStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1PodDisruptionBudgetStatus build() {
    V1PodDisruptionBudgetStatus buildable = new V1PodDisruptionBudgetStatus();
    buildable.setConditions(fluent.buildConditions());
    buildable.setCurrentHealthy(fluent.getCurrentHealthy());
    buildable.setDesiredHealthy(fluent.getDesiredHealthy());
    buildable.setDisruptedPods(fluent.getDisruptedPods());
    buildable.setDisruptionsAllowed(fluent.getDisruptionsAllowed());
    buildable.setExpectedPods(fluent.getExpectedPods());
    buildable.setObservedGeneration(fluent.getObservedGeneration());
    return buildable;
  }
  
}
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
public class V1PodDisruptionBudgetBuilder extends V1PodDisruptionBudgetFluent<V1PodDisruptionBudgetBuilder> implements VisitableBuilder<V1PodDisruptionBudget,V1PodDisruptionBudgetBuilder>{

  V1PodDisruptionBudgetFluent<?> fluent;

  public V1PodDisruptionBudgetBuilder() {
    this(new V1PodDisruptionBudget());
  }
  
  public V1PodDisruptionBudgetBuilder(V1PodDisruptionBudgetFluent<?> fluent) {
    this(fluent, new V1PodDisruptionBudget());
  }
  
  public V1PodDisruptionBudgetBuilder(V1PodDisruptionBudget instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1PodDisruptionBudgetBuilder(V1PodDisruptionBudgetFluent<?> fluent,V1PodDisruptionBudget instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1PodDisruptionBudget build() {
    V1PodDisruptionBudget buildable = new V1PodDisruptionBudget();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  
}
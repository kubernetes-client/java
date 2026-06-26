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
public class V1ExemptPriorityLevelConfigurationBuilder extends V1ExemptPriorityLevelConfigurationFluent<V1ExemptPriorityLevelConfigurationBuilder> implements VisitableBuilder<V1ExemptPriorityLevelConfiguration,V1ExemptPriorityLevelConfigurationBuilder>{

  V1ExemptPriorityLevelConfigurationFluent<?> fluent;

  public V1ExemptPriorityLevelConfigurationBuilder() {
    this(new V1ExemptPriorityLevelConfiguration());
  }
  
  public V1ExemptPriorityLevelConfigurationBuilder(V1ExemptPriorityLevelConfigurationFluent<?> fluent) {
    this(fluent, new V1ExemptPriorityLevelConfiguration());
  }
  
  public V1ExemptPriorityLevelConfigurationBuilder(V1ExemptPriorityLevelConfiguration instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ExemptPriorityLevelConfigurationBuilder(V1ExemptPriorityLevelConfigurationFluent<?> fluent,V1ExemptPriorityLevelConfiguration instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ExemptPriorityLevelConfiguration build() {
    V1ExemptPriorityLevelConfiguration buildable = new V1ExemptPriorityLevelConfiguration();
    buildable.setLendablePercent(fluent.getLendablePercent());
    buildable.setNominalConcurrencyShares(fluent.getNominalConcurrencyShares());
    return buildable;
  }
  
}
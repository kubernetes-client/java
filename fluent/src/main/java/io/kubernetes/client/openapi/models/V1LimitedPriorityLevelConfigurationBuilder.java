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
public class V1LimitedPriorityLevelConfigurationBuilder extends V1LimitedPriorityLevelConfigurationFluent<V1LimitedPriorityLevelConfigurationBuilder> implements VisitableBuilder<V1LimitedPriorityLevelConfiguration,V1LimitedPriorityLevelConfigurationBuilder>{

  V1LimitedPriorityLevelConfigurationFluent<?> fluent;

  public V1LimitedPriorityLevelConfigurationBuilder() {
    this(new V1LimitedPriorityLevelConfiguration());
  }
  
  public V1LimitedPriorityLevelConfigurationBuilder(V1LimitedPriorityLevelConfigurationFluent<?> fluent) {
    this(fluent, new V1LimitedPriorityLevelConfiguration());
  }
  
  public V1LimitedPriorityLevelConfigurationBuilder(V1LimitedPriorityLevelConfiguration instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1LimitedPriorityLevelConfigurationBuilder(V1LimitedPriorityLevelConfigurationFluent<?> fluent,V1LimitedPriorityLevelConfiguration instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1LimitedPriorityLevelConfiguration build() {
    V1LimitedPriorityLevelConfiguration buildable = new V1LimitedPriorityLevelConfiguration();
    buildable.setBorrowingLimitPercent(fluent.getBorrowingLimitPercent());
    buildable.setLendablePercent(fluent.getLendablePercent());
    buildable.setLimitResponse(fluent.buildLimitResponse());
    buildable.setNominalConcurrencyShares(fluent.getNominalConcurrencyShares());
    return buildable;
  }
  
}
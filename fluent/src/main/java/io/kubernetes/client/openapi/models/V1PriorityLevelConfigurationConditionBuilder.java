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
public class V1PriorityLevelConfigurationConditionBuilder extends V1PriorityLevelConfigurationConditionFluent<V1PriorityLevelConfigurationConditionBuilder> implements VisitableBuilder<V1PriorityLevelConfigurationCondition,V1PriorityLevelConfigurationConditionBuilder>{

  V1PriorityLevelConfigurationConditionFluent<?> fluent;

  public V1PriorityLevelConfigurationConditionBuilder() {
    this(new V1PriorityLevelConfigurationCondition());
  }
  
  public V1PriorityLevelConfigurationConditionBuilder(V1PriorityLevelConfigurationConditionFluent<?> fluent) {
    this(fluent, new V1PriorityLevelConfigurationCondition());
  }
  
  public V1PriorityLevelConfigurationConditionBuilder(V1PriorityLevelConfigurationCondition instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1PriorityLevelConfigurationConditionBuilder(V1PriorityLevelConfigurationConditionFluent<?> fluent,V1PriorityLevelConfigurationCondition instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1PriorityLevelConfigurationCondition build() {
    V1PriorityLevelConfigurationCondition buildable = new V1PriorityLevelConfigurationCondition();
    buildable.setLastTransitionTime(fluent.getLastTransitionTime());
    buildable.setMessage(fluent.getMessage());
    buildable.setReason(fluent.getReason());
    buildable.setStatus(fluent.getStatus());
    buildable.setType(fluent.getType());
    return buildable;
  }
  
}
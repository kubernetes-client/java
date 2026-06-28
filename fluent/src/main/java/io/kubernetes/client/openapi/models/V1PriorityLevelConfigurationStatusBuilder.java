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
public class V1PriorityLevelConfigurationStatusBuilder extends V1PriorityLevelConfigurationStatusFluent<V1PriorityLevelConfigurationStatusBuilder> implements VisitableBuilder<V1PriorityLevelConfigurationStatus,V1PriorityLevelConfigurationStatusBuilder>{

  V1PriorityLevelConfigurationStatusFluent<?> fluent;

  public V1PriorityLevelConfigurationStatusBuilder() {
    this(new V1PriorityLevelConfigurationStatus());
  }
  
  public V1PriorityLevelConfigurationStatusBuilder(V1PriorityLevelConfigurationStatusFluent<?> fluent) {
    this(fluent, new V1PriorityLevelConfigurationStatus());
  }
  
  public V1PriorityLevelConfigurationStatusBuilder(V1PriorityLevelConfigurationStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1PriorityLevelConfigurationStatusBuilder(V1PriorityLevelConfigurationStatusFluent<?> fluent,V1PriorityLevelConfigurationStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1PriorityLevelConfigurationStatus build() {
    V1PriorityLevelConfigurationStatus buildable = new V1PriorityLevelConfigurationStatus();
    buildable.setConditions(fluent.buildConditions());
    return buildable;
  }
  
}
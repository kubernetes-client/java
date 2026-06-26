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
public class V1PriorityLevelConfigurationSpecBuilder extends V1PriorityLevelConfigurationSpecFluent<V1PriorityLevelConfigurationSpecBuilder> implements VisitableBuilder<V1PriorityLevelConfigurationSpec,V1PriorityLevelConfigurationSpecBuilder>{

  V1PriorityLevelConfigurationSpecFluent<?> fluent;

  public V1PriorityLevelConfigurationSpecBuilder() {
    this(new V1PriorityLevelConfigurationSpec());
  }
  
  public V1PriorityLevelConfigurationSpecBuilder(V1PriorityLevelConfigurationSpecFluent<?> fluent) {
    this(fluent, new V1PriorityLevelConfigurationSpec());
  }
  
  public V1PriorityLevelConfigurationSpecBuilder(V1PriorityLevelConfigurationSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1PriorityLevelConfigurationSpecBuilder(V1PriorityLevelConfigurationSpecFluent<?> fluent,V1PriorityLevelConfigurationSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1PriorityLevelConfigurationSpec build() {
    V1PriorityLevelConfigurationSpec buildable = new V1PriorityLevelConfigurationSpec();
    buildable.setExempt(fluent.buildExempt());
    buildable.setLimited(fluent.buildLimited());
    buildable.setType(fluent.getType());
    return buildable;
  }
  
}
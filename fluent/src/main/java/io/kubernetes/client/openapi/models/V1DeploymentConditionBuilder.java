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
public class V1DeploymentConditionBuilder extends V1DeploymentConditionFluent<V1DeploymentConditionBuilder> implements VisitableBuilder<V1DeploymentCondition,V1DeploymentConditionBuilder>{

  V1DeploymentConditionFluent<?> fluent;

  public V1DeploymentConditionBuilder() {
    this(new V1DeploymentCondition());
  }
  
  public V1DeploymentConditionBuilder(V1DeploymentConditionFluent<?> fluent) {
    this(fluent, new V1DeploymentCondition());
  }
  
  public V1DeploymentConditionBuilder(V1DeploymentCondition instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1DeploymentConditionBuilder(V1DeploymentConditionFluent<?> fluent,V1DeploymentCondition instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1DeploymentCondition build() {
    V1DeploymentCondition buildable = new V1DeploymentCondition();
    buildable.setLastTransitionTime(fluent.getLastTransitionTime());
    buildable.setLastUpdateTime(fluent.getLastUpdateTime());
    buildable.setMessage(fluent.getMessage());
    buildable.setReason(fluent.getReason());
    buildable.setStatus(fluent.getStatus());
    buildable.setType(fluent.getType());
    return buildable;
  }
  
}
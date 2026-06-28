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
public class V1CustomResourceDefinitionConditionBuilder extends V1CustomResourceDefinitionConditionFluent<V1CustomResourceDefinitionConditionBuilder> implements VisitableBuilder<V1CustomResourceDefinitionCondition,V1CustomResourceDefinitionConditionBuilder>{

  V1CustomResourceDefinitionConditionFluent<?> fluent;

  public V1CustomResourceDefinitionConditionBuilder() {
    this(new V1CustomResourceDefinitionCondition());
  }
  
  public V1CustomResourceDefinitionConditionBuilder(V1CustomResourceDefinitionConditionFluent<?> fluent) {
    this(fluent, new V1CustomResourceDefinitionCondition());
  }
  
  public V1CustomResourceDefinitionConditionBuilder(V1CustomResourceDefinitionCondition instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1CustomResourceDefinitionConditionBuilder(V1CustomResourceDefinitionConditionFluent<?> fluent,V1CustomResourceDefinitionCondition instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1CustomResourceDefinitionCondition build() {
    V1CustomResourceDefinitionCondition buildable = new V1CustomResourceDefinitionCondition();
    buildable.setLastTransitionTime(fluent.getLastTransitionTime());
    buildable.setMessage(fluent.getMessage());
    buildable.setObservedGeneration(fluent.getObservedGeneration());
    buildable.setReason(fluent.getReason());
    buildable.setStatus(fluent.getStatus());
    buildable.setType(fluent.getType());
    return buildable;
  }
  
}
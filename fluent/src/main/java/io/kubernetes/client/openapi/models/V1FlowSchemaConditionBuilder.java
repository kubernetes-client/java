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
public class V1FlowSchemaConditionBuilder extends V1FlowSchemaConditionFluent<V1FlowSchemaConditionBuilder> implements VisitableBuilder<V1FlowSchemaCondition,V1FlowSchemaConditionBuilder>{

  V1FlowSchemaConditionFluent<?> fluent;

  public V1FlowSchemaConditionBuilder() {
    this(new V1FlowSchemaCondition());
  }
  
  public V1FlowSchemaConditionBuilder(V1FlowSchemaConditionFluent<?> fluent) {
    this(fluent, new V1FlowSchemaCondition());
  }
  
  public V1FlowSchemaConditionBuilder(V1FlowSchemaCondition instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1FlowSchemaConditionBuilder(V1FlowSchemaConditionFluent<?> fluent,V1FlowSchemaCondition instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1FlowSchemaCondition build() {
    V1FlowSchemaCondition buildable = new V1FlowSchemaCondition();
    buildable.setLastTransitionTime(fluent.getLastTransitionTime());
    buildable.setMessage(fluent.getMessage());
    buildable.setReason(fluent.getReason());
    buildable.setStatus(fluent.getStatus());
    buildable.setType(fluent.getType());
    return buildable;
  }
  
}
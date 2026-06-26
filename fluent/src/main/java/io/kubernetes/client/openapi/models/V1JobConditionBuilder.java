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
public class V1JobConditionBuilder extends V1JobConditionFluent<V1JobConditionBuilder> implements VisitableBuilder<V1JobCondition,V1JobConditionBuilder>{

  V1JobConditionFluent<?> fluent;

  public V1JobConditionBuilder() {
    this(new V1JobCondition());
  }
  
  public V1JobConditionBuilder(V1JobConditionFluent<?> fluent) {
    this(fluent, new V1JobCondition());
  }
  
  public V1JobConditionBuilder(V1JobCondition instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1JobConditionBuilder(V1JobConditionFluent<?> fluent,V1JobCondition instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1JobCondition build() {
    V1JobCondition buildable = new V1JobCondition();
    buildable.setLastProbeTime(fluent.getLastProbeTime());
    buildable.setLastTransitionTime(fluent.getLastTransitionTime());
    buildable.setMessage(fluent.getMessage());
    buildable.setReason(fluent.getReason());
    buildable.setStatus(fluent.getStatus());
    buildable.setType(fluent.getType());
    return buildable;
  }
  
}
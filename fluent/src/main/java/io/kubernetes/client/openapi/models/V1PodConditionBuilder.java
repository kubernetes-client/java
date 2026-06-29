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
public class V1PodConditionBuilder extends V1PodConditionFluent<V1PodConditionBuilder> implements VisitableBuilder<V1PodCondition,V1PodConditionBuilder>{

  V1PodConditionFluent<?> fluent;

  public V1PodConditionBuilder() {
    this(new V1PodCondition());
  }
  
  public V1PodConditionBuilder(V1PodConditionFluent<?> fluent) {
    this(fluent, new V1PodCondition());
  }
  
  public V1PodConditionBuilder(V1PodCondition instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1PodConditionBuilder(V1PodConditionFluent<?> fluent,V1PodCondition instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1PodCondition build() {
    V1PodCondition buildable = new V1PodCondition();
    buildable.setLastProbeTime(fluent.getLastProbeTime());
    buildable.setLastTransitionTime(fluent.getLastTransitionTime());
    buildable.setMessage(fluent.getMessage());
    buildable.setObservedGeneration(fluent.getObservedGeneration());
    buildable.setReason(fluent.getReason());
    buildable.setStatus(fluent.getStatus());
    buildable.setType(fluent.getType());
    return buildable;
  }
  
}
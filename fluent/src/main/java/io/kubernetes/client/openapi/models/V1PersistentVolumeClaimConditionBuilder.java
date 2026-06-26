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
public class V1PersistentVolumeClaimConditionBuilder extends V1PersistentVolumeClaimConditionFluent<V1PersistentVolumeClaimConditionBuilder> implements VisitableBuilder<V1PersistentVolumeClaimCondition,V1PersistentVolumeClaimConditionBuilder>{

  V1PersistentVolumeClaimConditionFluent<?> fluent;

  public V1PersistentVolumeClaimConditionBuilder() {
    this(new V1PersistentVolumeClaimCondition());
  }
  
  public V1PersistentVolumeClaimConditionBuilder(V1PersistentVolumeClaimConditionFluent<?> fluent) {
    this(fluent, new V1PersistentVolumeClaimCondition());
  }
  
  public V1PersistentVolumeClaimConditionBuilder(V1PersistentVolumeClaimCondition instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1PersistentVolumeClaimConditionBuilder(V1PersistentVolumeClaimConditionFluent<?> fluent,V1PersistentVolumeClaimCondition instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1PersistentVolumeClaimCondition build() {
    V1PersistentVolumeClaimCondition buildable = new V1PersistentVolumeClaimCondition();
    buildable.setLastProbeTime(fluent.getLastProbeTime());
    buildable.setLastTransitionTime(fluent.getLastTransitionTime());
    buildable.setMessage(fluent.getMessage());
    buildable.setReason(fluent.getReason());
    buildable.setStatus(fluent.getStatus());
    buildable.setType(fluent.getType());
    return buildable;
  }
  
}
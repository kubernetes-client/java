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
public class V1PersistentVolumeClaimStatusBuilder extends V1PersistentVolumeClaimStatusFluent<V1PersistentVolumeClaimStatusBuilder> implements VisitableBuilder<V1PersistentVolumeClaimStatus,V1PersistentVolumeClaimStatusBuilder>{

  V1PersistentVolumeClaimStatusFluent<?> fluent;

  public V1PersistentVolumeClaimStatusBuilder() {
    this(new V1PersistentVolumeClaimStatus());
  }
  
  public V1PersistentVolumeClaimStatusBuilder(V1PersistentVolumeClaimStatusFluent<?> fluent) {
    this(fluent, new V1PersistentVolumeClaimStatus());
  }
  
  public V1PersistentVolumeClaimStatusBuilder(V1PersistentVolumeClaimStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1PersistentVolumeClaimStatusBuilder(V1PersistentVolumeClaimStatusFluent<?> fluent,V1PersistentVolumeClaimStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1PersistentVolumeClaimStatus build() {
    V1PersistentVolumeClaimStatus buildable = new V1PersistentVolumeClaimStatus();
    buildable.setAccessModes(fluent.getAccessModes());
    buildable.setAllocatedResourceStatuses(fluent.getAllocatedResourceStatuses());
    buildable.setAllocatedResources(fluent.getAllocatedResources());
    buildable.setCapacity(fluent.getCapacity());
    buildable.setConditions(fluent.buildConditions());
    buildable.setCurrentVolumeAttributesClassName(fluent.getCurrentVolumeAttributesClassName());
    buildable.setModifyVolumeStatus(fluent.buildModifyVolumeStatus());
    buildable.setPhase(fluent.getPhase());
    return buildable;
  }
  
}
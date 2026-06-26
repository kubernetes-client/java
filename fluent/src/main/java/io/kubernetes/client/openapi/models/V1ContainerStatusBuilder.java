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
public class V1ContainerStatusBuilder extends V1ContainerStatusFluent<V1ContainerStatusBuilder> implements VisitableBuilder<V1ContainerStatus,V1ContainerStatusBuilder>{

  V1ContainerStatusFluent<?> fluent;

  public V1ContainerStatusBuilder() {
    this(new V1ContainerStatus());
  }
  
  public V1ContainerStatusBuilder(V1ContainerStatusFluent<?> fluent) {
    this(fluent, new V1ContainerStatus());
  }
  
  public V1ContainerStatusBuilder(V1ContainerStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ContainerStatusBuilder(V1ContainerStatusFluent<?> fluent,V1ContainerStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ContainerStatus build() {
    V1ContainerStatus buildable = new V1ContainerStatus();
    buildable.setAllocatedResources(fluent.getAllocatedResources());
    buildable.setAllocatedResourcesStatus(fluent.buildAllocatedResourcesStatus());
    buildable.setContainerID(fluent.getContainerID());
    buildable.setImage(fluent.getImage());
    buildable.setImageID(fluent.getImageID());
    buildable.setLastState(fluent.buildLastState());
    buildable.setName(fluent.getName());
    buildable.setReady(fluent.getReady());
    buildable.setResources(fluent.buildResources());
    buildable.setRestartCount(fluent.getRestartCount());
    buildable.setStarted(fluent.getStarted());
    buildable.setState(fluent.buildState());
    buildable.setStopSignal(fluent.getStopSignal());
    buildable.setUser(fluent.buildUser());
    buildable.setVolumeMounts(fluent.buildVolumeMounts());
    return buildable;
  }
  
}
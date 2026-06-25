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
public class V1NodeStatusBuilder extends V1NodeStatusFluent<V1NodeStatusBuilder> implements VisitableBuilder<V1NodeStatus,V1NodeStatusBuilder>{

  V1NodeStatusFluent<?> fluent;

  public V1NodeStatusBuilder() {
    this(new V1NodeStatus());
  }
  
  public V1NodeStatusBuilder(V1NodeStatusFluent<?> fluent) {
    this(fluent, new V1NodeStatus());
  }
  
  public V1NodeStatusBuilder(V1NodeStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1NodeStatusBuilder(V1NodeStatusFluent<?> fluent,V1NodeStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1NodeStatus build() {
    V1NodeStatus buildable = new V1NodeStatus();
    buildable.setAddresses(fluent.buildAddresses());
    buildable.setAllocatable(fluent.getAllocatable());
    buildable.setCapacity(fluent.getCapacity());
    buildable.setConditions(fluent.buildConditions());
    buildable.setConfig(fluent.buildConfig());
    buildable.setDaemonEndpoints(fluent.buildDaemonEndpoints());
    buildable.setDeclaredFeatures(fluent.getDeclaredFeatures());
    buildable.setFeatures(fluent.buildFeatures());
    buildable.setImages(fluent.buildImages());
    buildable.setNodeInfo(fluent.buildNodeInfo());
    buildable.setPhase(fluent.getPhase());
    buildable.setRuntimeHandlers(fluent.buildRuntimeHandlers());
    buildable.setVolumesAttached(fluent.buildVolumesAttached());
    buildable.setVolumesInUse(fluent.getVolumesInUse());
    return buildable;
  }
  
}
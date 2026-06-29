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
public class V1DeploymentStatusBuilder extends V1DeploymentStatusFluent<V1DeploymentStatusBuilder> implements VisitableBuilder<V1DeploymentStatus,V1DeploymentStatusBuilder>{

  V1DeploymentStatusFluent<?> fluent;

  public V1DeploymentStatusBuilder() {
    this(new V1DeploymentStatus());
  }
  
  public V1DeploymentStatusBuilder(V1DeploymentStatusFluent<?> fluent) {
    this(fluent, new V1DeploymentStatus());
  }
  
  public V1DeploymentStatusBuilder(V1DeploymentStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1DeploymentStatusBuilder(V1DeploymentStatusFluent<?> fluent,V1DeploymentStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1DeploymentStatus build() {
    V1DeploymentStatus buildable = new V1DeploymentStatus();
    buildable.setAvailableReplicas(fluent.getAvailableReplicas());
    buildable.setCollisionCount(fluent.getCollisionCount());
    buildable.setConditions(fluent.buildConditions());
    buildable.setObservedGeneration(fluent.getObservedGeneration());
    buildable.setReadyReplicas(fluent.getReadyReplicas());
    buildable.setReplicas(fluent.getReplicas());
    buildable.setTerminatingReplicas(fluent.getTerminatingReplicas());
    buildable.setUnavailableReplicas(fluent.getUnavailableReplicas());
    buildable.setUpdatedReplicas(fluent.getUpdatedReplicas());
    return buildable;
  }
  
}
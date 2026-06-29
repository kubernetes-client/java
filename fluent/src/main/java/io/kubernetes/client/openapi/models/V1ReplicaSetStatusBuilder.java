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
public class V1ReplicaSetStatusBuilder extends V1ReplicaSetStatusFluent<V1ReplicaSetStatusBuilder> implements VisitableBuilder<V1ReplicaSetStatus,V1ReplicaSetStatusBuilder>{

  V1ReplicaSetStatusFluent<?> fluent;

  public V1ReplicaSetStatusBuilder() {
    this(new V1ReplicaSetStatus());
  }
  
  public V1ReplicaSetStatusBuilder(V1ReplicaSetStatusFluent<?> fluent) {
    this(fluent, new V1ReplicaSetStatus());
  }
  
  public V1ReplicaSetStatusBuilder(V1ReplicaSetStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ReplicaSetStatusBuilder(V1ReplicaSetStatusFluent<?> fluent,V1ReplicaSetStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ReplicaSetStatus build() {
    V1ReplicaSetStatus buildable = new V1ReplicaSetStatus();
    buildable.setAvailableReplicas(fluent.getAvailableReplicas());
    buildable.setConditions(fluent.buildConditions());
    buildable.setFullyLabeledReplicas(fluent.getFullyLabeledReplicas());
    buildable.setObservedGeneration(fluent.getObservedGeneration());
    buildable.setReadyReplicas(fluent.getReadyReplicas());
    buildable.setReplicas(fluent.getReplicas());
    buildable.setTerminatingReplicas(fluent.getTerminatingReplicas());
    return buildable;
  }
  
}
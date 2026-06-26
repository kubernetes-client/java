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
public class V1StatefulSetStatusBuilder extends V1StatefulSetStatusFluent<V1StatefulSetStatusBuilder> implements VisitableBuilder<V1StatefulSetStatus,V1StatefulSetStatusBuilder>{

  V1StatefulSetStatusFluent<?> fluent;

  public V1StatefulSetStatusBuilder() {
    this(new V1StatefulSetStatus());
  }
  
  public V1StatefulSetStatusBuilder(V1StatefulSetStatusFluent<?> fluent) {
    this(fluent, new V1StatefulSetStatus());
  }
  
  public V1StatefulSetStatusBuilder(V1StatefulSetStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1StatefulSetStatusBuilder(V1StatefulSetStatusFluent<?> fluent,V1StatefulSetStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1StatefulSetStatus build() {
    V1StatefulSetStatus buildable = new V1StatefulSetStatus();
    buildable.setAvailableReplicas(fluent.getAvailableReplicas());
    buildable.setCollisionCount(fluent.getCollisionCount());
    buildable.setConditions(fluent.buildConditions());
    buildable.setCurrentReplicas(fluent.getCurrentReplicas());
    buildable.setCurrentRevision(fluent.getCurrentRevision());
    buildable.setObservedGeneration(fluent.getObservedGeneration());
    buildable.setReadyReplicas(fluent.getReadyReplicas());
    buildable.setReplicas(fluent.getReplicas());
    buildable.setUpdateRevision(fluent.getUpdateRevision());
    buildable.setUpdatedReplicas(fluent.getUpdatedReplicas());
    return buildable;
  }
  
}
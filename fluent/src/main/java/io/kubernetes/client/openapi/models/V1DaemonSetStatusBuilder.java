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
public class V1DaemonSetStatusBuilder extends V1DaemonSetStatusFluent<V1DaemonSetStatusBuilder> implements VisitableBuilder<V1DaemonSetStatus,V1DaemonSetStatusBuilder>{

  V1DaemonSetStatusFluent<?> fluent;

  public V1DaemonSetStatusBuilder() {
    this(new V1DaemonSetStatus());
  }
  
  public V1DaemonSetStatusBuilder(V1DaemonSetStatusFluent<?> fluent) {
    this(fluent, new V1DaemonSetStatus());
  }
  
  public V1DaemonSetStatusBuilder(V1DaemonSetStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1DaemonSetStatusBuilder(V1DaemonSetStatusFluent<?> fluent,V1DaemonSetStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1DaemonSetStatus build() {
    V1DaemonSetStatus buildable = new V1DaemonSetStatus();
    buildable.setCollisionCount(fluent.getCollisionCount());
    buildable.setConditions(fluent.buildConditions());
    buildable.setCurrentNumberScheduled(fluent.getCurrentNumberScheduled());
    buildable.setDesiredNumberScheduled(fluent.getDesiredNumberScheduled());
    buildable.setNumberAvailable(fluent.getNumberAvailable());
    buildable.setNumberMisscheduled(fluent.getNumberMisscheduled());
    buildable.setNumberReady(fluent.getNumberReady());
    buildable.setNumberUnavailable(fluent.getNumberUnavailable());
    buildable.setObservedGeneration(fluent.getObservedGeneration());
    buildable.setUpdatedNumberScheduled(fluent.getUpdatedNumberScheduled());
    return buildable;
  }
  
}
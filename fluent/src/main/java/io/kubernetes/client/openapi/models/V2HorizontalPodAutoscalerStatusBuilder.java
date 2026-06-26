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
public class V2HorizontalPodAutoscalerStatusBuilder extends V2HorizontalPodAutoscalerStatusFluent<V2HorizontalPodAutoscalerStatusBuilder> implements VisitableBuilder<V2HorizontalPodAutoscalerStatus,V2HorizontalPodAutoscalerStatusBuilder>{

  V2HorizontalPodAutoscalerStatusFluent<?> fluent;

  public V2HorizontalPodAutoscalerStatusBuilder() {
    this(new V2HorizontalPodAutoscalerStatus());
  }
  
  public V2HorizontalPodAutoscalerStatusBuilder(V2HorizontalPodAutoscalerStatusFluent<?> fluent) {
    this(fluent, new V2HorizontalPodAutoscalerStatus());
  }
  
  public V2HorizontalPodAutoscalerStatusBuilder(V2HorizontalPodAutoscalerStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V2HorizontalPodAutoscalerStatusBuilder(V2HorizontalPodAutoscalerStatusFluent<?> fluent,V2HorizontalPodAutoscalerStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V2HorizontalPodAutoscalerStatus build() {
    V2HorizontalPodAutoscalerStatus buildable = new V2HorizontalPodAutoscalerStatus();
    buildable.setConditions(fluent.buildConditions());
    buildable.setCurrentMetrics(fluent.buildCurrentMetrics());
    buildable.setCurrentReplicas(fluent.getCurrentReplicas());
    buildable.setDesiredReplicas(fluent.getDesiredReplicas());
    buildable.setLastScaleTime(fluent.getLastScaleTime());
    buildable.setObservedGeneration(fluent.getObservedGeneration());
    return buildable;
  }
  
}
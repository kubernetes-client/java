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
public class V1HorizontalPodAutoscalerStatusBuilder extends V1HorizontalPodAutoscalerStatusFluent<V1HorizontalPodAutoscalerStatusBuilder> implements VisitableBuilder<V1HorizontalPodAutoscalerStatus,V1HorizontalPodAutoscalerStatusBuilder>{

  V1HorizontalPodAutoscalerStatusFluent<?> fluent;

  public V1HorizontalPodAutoscalerStatusBuilder() {
    this(new V1HorizontalPodAutoscalerStatus());
  }
  
  public V1HorizontalPodAutoscalerStatusBuilder(V1HorizontalPodAutoscalerStatusFluent<?> fluent) {
    this(fluent, new V1HorizontalPodAutoscalerStatus());
  }
  
  public V1HorizontalPodAutoscalerStatusBuilder(V1HorizontalPodAutoscalerStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1HorizontalPodAutoscalerStatusBuilder(V1HorizontalPodAutoscalerStatusFluent<?> fluent,V1HorizontalPodAutoscalerStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1HorizontalPodAutoscalerStatus build() {
    V1HorizontalPodAutoscalerStatus buildable = new V1HorizontalPodAutoscalerStatus();
    buildable.setCurrentCPUUtilizationPercentage(fluent.getCurrentCPUUtilizationPercentage());
    buildable.setCurrentReplicas(fluent.getCurrentReplicas());
    buildable.setDesiredReplicas(fluent.getDesiredReplicas());
    buildable.setLastScaleTime(fluent.getLastScaleTime());
    buildable.setObservedGeneration(fluent.getObservedGeneration());
    return buildable;
  }
  
}
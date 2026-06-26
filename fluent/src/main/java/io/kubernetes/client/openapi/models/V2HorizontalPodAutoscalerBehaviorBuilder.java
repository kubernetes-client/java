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
public class V2HorizontalPodAutoscalerBehaviorBuilder extends V2HorizontalPodAutoscalerBehaviorFluent<V2HorizontalPodAutoscalerBehaviorBuilder> implements VisitableBuilder<V2HorizontalPodAutoscalerBehavior,V2HorizontalPodAutoscalerBehaviorBuilder>{

  V2HorizontalPodAutoscalerBehaviorFluent<?> fluent;

  public V2HorizontalPodAutoscalerBehaviorBuilder() {
    this(new V2HorizontalPodAutoscalerBehavior());
  }
  
  public V2HorizontalPodAutoscalerBehaviorBuilder(V2HorizontalPodAutoscalerBehaviorFluent<?> fluent) {
    this(fluent, new V2HorizontalPodAutoscalerBehavior());
  }
  
  public V2HorizontalPodAutoscalerBehaviorBuilder(V2HorizontalPodAutoscalerBehavior instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V2HorizontalPodAutoscalerBehaviorBuilder(V2HorizontalPodAutoscalerBehaviorFluent<?> fluent,V2HorizontalPodAutoscalerBehavior instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V2HorizontalPodAutoscalerBehavior build() {
    V2HorizontalPodAutoscalerBehavior buildable = new V2HorizontalPodAutoscalerBehavior();
    buildable.setScaleDown(fluent.buildScaleDown());
    buildable.setScaleUp(fluent.buildScaleUp());
    return buildable;
  }
  
}
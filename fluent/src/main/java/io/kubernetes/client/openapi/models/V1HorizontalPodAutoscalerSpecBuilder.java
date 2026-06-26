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
public class V1HorizontalPodAutoscalerSpecBuilder extends V1HorizontalPodAutoscalerSpecFluent<V1HorizontalPodAutoscalerSpecBuilder> implements VisitableBuilder<V1HorizontalPodAutoscalerSpec,V1HorizontalPodAutoscalerSpecBuilder>{

  V1HorizontalPodAutoscalerSpecFluent<?> fluent;

  public V1HorizontalPodAutoscalerSpecBuilder() {
    this(new V1HorizontalPodAutoscalerSpec());
  }
  
  public V1HorizontalPodAutoscalerSpecBuilder(V1HorizontalPodAutoscalerSpecFluent<?> fluent) {
    this(fluent, new V1HorizontalPodAutoscalerSpec());
  }
  
  public V1HorizontalPodAutoscalerSpecBuilder(V1HorizontalPodAutoscalerSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1HorizontalPodAutoscalerSpecBuilder(V1HorizontalPodAutoscalerSpecFluent<?> fluent,V1HorizontalPodAutoscalerSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1HorizontalPodAutoscalerSpec build() {
    V1HorizontalPodAutoscalerSpec buildable = new V1HorizontalPodAutoscalerSpec();
    buildable.setMaxReplicas(fluent.getMaxReplicas());
    buildable.setMinReplicas(fluent.getMinReplicas());
    buildable.setScaleTargetRef(fluent.buildScaleTargetRef());
    buildable.setTargetCPUUtilizationPercentage(fluent.getTargetCPUUtilizationPercentage());
    return buildable;
  }
  
}
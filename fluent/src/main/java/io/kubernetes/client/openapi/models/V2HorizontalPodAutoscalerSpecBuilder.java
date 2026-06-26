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
public class V2HorizontalPodAutoscalerSpecBuilder extends V2HorizontalPodAutoscalerSpecFluent<V2HorizontalPodAutoscalerSpecBuilder> implements VisitableBuilder<V2HorizontalPodAutoscalerSpec,V2HorizontalPodAutoscalerSpecBuilder>{

  V2HorizontalPodAutoscalerSpecFluent<?> fluent;

  public V2HorizontalPodAutoscalerSpecBuilder() {
    this(new V2HorizontalPodAutoscalerSpec());
  }
  
  public V2HorizontalPodAutoscalerSpecBuilder(V2HorizontalPodAutoscalerSpecFluent<?> fluent) {
    this(fluent, new V2HorizontalPodAutoscalerSpec());
  }
  
  public V2HorizontalPodAutoscalerSpecBuilder(V2HorizontalPodAutoscalerSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V2HorizontalPodAutoscalerSpecBuilder(V2HorizontalPodAutoscalerSpecFluent<?> fluent,V2HorizontalPodAutoscalerSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V2HorizontalPodAutoscalerSpec build() {
    V2HorizontalPodAutoscalerSpec buildable = new V2HorizontalPodAutoscalerSpec();
    buildable.setBehavior(fluent.buildBehavior());
    buildable.setMaxReplicas(fluent.getMaxReplicas());
    buildable.setMetrics(fluent.buildMetrics());
    buildable.setMinReplicas(fluent.getMinReplicas());
    buildable.setScaleTargetRef(fluent.buildScaleTargetRef());
    return buildable;
  }
  
}
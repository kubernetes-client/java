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
public class V2HorizontalPodAutoscalerBuilder extends V2HorizontalPodAutoscalerFluent<V2HorizontalPodAutoscalerBuilder> implements VisitableBuilder<V2HorizontalPodAutoscaler,V2HorizontalPodAutoscalerBuilder>{

  V2HorizontalPodAutoscalerFluent<?> fluent;

  public V2HorizontalPodAutoscalerBuilder() {
    this(new V2HorizontalPodAutoscaler());
  }
  
  public V2HorizontalPodAutoscalerBuilder(V2HorizontalPodAutoscalerFluent<?> fluent) {
    this(fluent, new V2HorizontalPodAutoscaler());
  }
  
  public V2HorizontalPodAutoscalerBuilder(V2HorizontalPodAutoscaler instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V2HorizontalPodAutoscalerBuilder(V2HorizontalPodAutoscalerFluent<?> fluent,V2HorizontalPodAutoscaler instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V2HorizontalPodAutoscaler build() {
    V2HorizontalPodAutoscaler buildable = new V2HorizontalPodAutoscaler();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  
}
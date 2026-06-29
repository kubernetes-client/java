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
public class V2HorizontalPodAutoscalerListBuilder extends V2HorizontalPodAutoscalerListFluent<V2HorizontalPodAutoscalerListBuilder> implements VisitableBuilder<V2HorizontalPodAutoscalerList,V2HorizontalPodAutoscalerListBuilder>{

  V2HorizontalPodAutoscalerListFluent<?> fluent;

  public V2HorizontalPodAutoscalerListBuilder() {
    this(new V2HorizontalPodAutoscalerList());
  }
  
  public V2HorizontalPodAutoscalerListBuilder(V2HorizontalPodAutoscalerListFluent<?> fluent) {
    this(fluent, new V2HorizontalPodAutoscalerList());
  }
  
  public V2HorizontalPodAutoscalerListBuilder(V2HorizontalPodAutoscalerList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V2HorizontalPodAutoscalerListBuilder(V2HorizontalPodAutoscalerListFluent<?> fluent,V2HorizontalPodAutoscalerList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V2HorizontalPodAutoscalerList build() {
    V2HorizontalPodAutoscalerList buildable = new V2HorizontalPodAutoscalerList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  
}
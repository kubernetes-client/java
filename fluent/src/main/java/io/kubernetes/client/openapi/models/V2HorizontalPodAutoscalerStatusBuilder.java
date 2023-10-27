package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V2HorizontalPodAutoscalerStatusBuilder extends V2HorizontalPodAutoscalerStatusFluent<V2HorizontalPodAutoscalerStatusBuilder> implements VisitableBuilder<V2HorizontalPodAutoscalerStatus,V2HorizontalPodAutoscalerStatusBuilder>{
  public V2HorizontalPodAutoscalerStatusBuilder() {
    this(new V2HorizontalPodAutoscalerStatus());
  }
  
  public V2HorizontalPodAutoscalerStatusBuilder(V2HorizontalPodAutoscalerStatusFluent<?> fluent) {
    this(fluent, new V2HorizontalPodAutoscalerStatus());
  }
  
  public V2HorizontalPodAutoscalerStatusBuilder(V2HorizontalPodAutoscalerStatusFluent<?> fluent,V2HorizontalPodAutoscalerStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V2HorizontalPodAutoscalerStatusBuilder(V2HorizontalPodAutoscalerStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V2HorizontalPodAutoscalerStatusFluent<?> fluent;
  
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
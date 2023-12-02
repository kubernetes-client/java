package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1HorizontalPodAutoscalerStatusBuilder extends V1HorizontalPodAutoscalerStatusFluent<V1HorizontalPodAutoscalerStatusBuilder> implements VisitableBuilder<V1HorizontalPodAutoscalerStatus,V1HorizontalPodAutoscalerStatusBuilder>{
  public V1HorizontalPodAutoscalerStatusBuilder() {
    this(new V1HorizontalPodAutoscalerStatus());
  }
  
  public V1HorizontalPodAutoscalerStatusBuilder(V1HorizontalPodAutoscalerStatusFluent<?> fluent) {
    this(fluent, new V1HorizontalPodAutoscalerStatus());
  }
  
  public V1HorizontalPodAutoscalerStatusBuilder(V1HorizontalPodAutoscalerStatusFluent<?> fluent,V1HorizontalPodAutoscalerStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1HorizontalPodAutoscalerStatusBuilder(V1HorizontalPodAutoscalerStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1HorizontalPodAutoscalerStatusFluent<?> fluent;
  
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
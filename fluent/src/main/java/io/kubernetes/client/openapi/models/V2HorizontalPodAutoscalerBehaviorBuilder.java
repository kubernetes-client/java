package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V2HorizontalPodAutoscalerBehaviorBuilder extends V2HorizontalPodAutoscalerBehaviorFluent<V2HorizontalPodAutoscalerBehaviorBuilder> implements VisitableBuilder<V2HorizontalPodAutoscalerBehavior,V2HorizontalPodAutoscalerBehaviorBuilder>{
  public V2HorizontalPodAutoscalerBehaviorBuilder() {
    this(new V2HorizontalPodAutoscalerBehavior());
  }
  
  public V2HorizontalPodAutoscalerBehaviorBuilder(V2HorizontalPodAutoscalerBehaviorFluent<?> fluent) {
    this(fluent, new V2HorizontalPodAutoscalerBehavior());
  }
  
  public V2HorizontalPodAutoscalerBehaviorBuilder(V2HorizontalPodAutoscalerBehaviorFluent<?> fluent,V2HorizontalPodAutoscalerBehavior instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V2HorizontalPodAutoscalerBehaviorBuilder(V2HorizontalPodAutoscalerBehavior instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V2HorizontalPodAutoscalerBehaviorFluent<?> fluent;
  
  public V2HorizontalPodAutoscalerBehavior build() {
    V2HorizontalPodAutoscalerBehavior buildable = new V2HorizontalPodAutoscalerBehavior();
    buildable.setScaleDown(fluent.buildScaleDown());
    buildable.setScaleUp(fluent.buildScaleUp());
    return buildable;
  }
  

}
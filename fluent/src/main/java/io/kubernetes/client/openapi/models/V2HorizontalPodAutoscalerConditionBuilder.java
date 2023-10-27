package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V2HorizontalPodAutoscalerConditionBuilder extends V2HorizontalPodAutoscalerConditionFluent<V2HorizontalPodAutoscalerConditionBuilder> implements VisitableBuilder<V2HorizontalPodAutoscalerCondition,V2HorizontalPodAutoscalerConditionBuilder>{
  public V2HorizontalPodAutoscalerConditionBuilder() {
    this(new V2HorizontalPodAutoscalerCondition());
  }
  
  public V2HorizontalPodAutoscalerConditionBuilder(V2HorizontalPodAutoscalerConditionFluent<?> fluent) {
    this(fluent, new V2HorizontalPodAutoscalerCondition());
  }
  
  public V2HorizontalPodAutoscalerConditionBuilder(V2HorizontalPodAutoscalerConditionFluent<?> fluent,V2HorizontalPodAutoscalerCondition instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V2HorizontalPodAutoscalerConditionBuilder(V2HorizontalPodAutoscalerCondition instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V2HorizontalPodAutoscalerConditionFluent<?> fluent;
  
  public V2HorizontalPodAutoscalerCondition build() {
    V2HorizontalPodAutoscalerCondition buildable = new V2HorizontalPodAutoscalerCondition();
    buildable.setLastTransitionTime(fluent.getLastTransitionTime());
    buildable.setMessage(fluent.getMessage());
    buildable.setReason(fluent.getReason());
    buildable.setStatus(fluent.getStatus());
    buildable.setType(fluent.getType());
    return buildable;
  }
  

}
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1HorizontalPodAutoscalerBuilder extends V1HorizontalPodAutoscalerFluent<V1HorizontalPodAutoscalerBuilder> implements VisitableBuilder<V1HorizontalPodAutoscaler,V1HorizontalPodAutoscalerBuilder>{
  public V1HorizontalPodAutoscalerBuilder() {
    this(new V1HorizontalPodAutoscaler());
  }
  
  public V1HorizontalPodAutoscalerBuilder(V1HorizontalPodAutoscalerFluent<?> fluent) {
    this(fluent, new V1HorizontalPodAutoscaler());
  }
  
  public V1HorizontalPodAutoscalerBuilder(V1HorizontalPodAutoscalerFluent<?> fluent,V1HorizontalPodAutoscaler instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1HorizontalPodAutoscalerBuilder(V1HorizontalPodAutoscaler instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1HorizontalPodAutoscalerFluent<?> fluent;
  
  public V1HorizontalPodAutoscaler build() {
    V1HorizontalPodAutoscaler buildable = new V1HorizontalPodAutoscaler();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  

}
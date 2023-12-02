package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V2HorizontalPodAutoscalerBuilder extends V2HorizontalPodAutoscalerFluent<V2HorizontalPodAutoscalerBuilder> implements VisitableBuilder<V2HorizontalPodAutoscaler,V2HorizontalPodAutoscalerBuilder>{
  public V2HorizontalPodAutoscalerBuilder() {
    this(new V2HorizontalPodAutoscaler());
  }
  
  public V2HorizontalPodAutoscalerBuilder(V2HorizontalPodAutoscalerFluent<?> fluent) {
    this(fluent, new V2HorizontalPodAutoscaler());
  }
  
  public V2HorizontalPodAutoscalerBuilder(V2HorizontalPodAutoscalerFluent<?> fluent,V2HorizontalPodAutoscaler instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V2HorizontalPodAutoscalerBuilder(V2HorizontalPodAutoscaler instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V2HorizontalPodAutoscalerFluent<?> fluent;
  
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
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1HorizontalPodAutoscalerListBuilder extends V1HorizontalPodAutoscalerListFluent<V1HorizontalPodAutoscalerListBuilder> implements VisitableBuilder<V1HorizontalPodAutoscalerList,V1HorizontalPodAutoscalerListBuilder>{
  public V1HorizontalPodAutoscalerListBuilder() {
    this(new V1HorizontalPodAutoscalerList());
  }
  
  public V1HorizontalPodAutoscalerListBuilder(V1HorizontalPodAutoscalerListFluent<?> fluent) {
    this(fluent, new V1HorizontalPodAutoscalerList());
  }
  
  public V1HorizontalPodAutoscalerListBuilder(V1HorizontalPodAutoscalerListFluent<?> fluent,V1HorizontalPodAutoscalerList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1HorizontalPodAutoscalerListBuilder(V1HorizontalPodAutoscalerList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1HorizontalPodAutoscalerListFluent<?> fluent;
  
  public V1HorizontalPodAutoscalerList build() {
    V1HorizontalPodAutoscalerList buildable = new V1HorizontalPodAutoscalerList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}
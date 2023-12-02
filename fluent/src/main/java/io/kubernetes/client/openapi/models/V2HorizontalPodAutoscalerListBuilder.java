package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V2HorizontalPodAutoscalerListBuilder extends V2HorizontalPodAutoscalerListFluent<V2HorizontalPodAutoscalerListBuilder> implements VisitableBuilder<V2HorizontalPodAutoscalerList,V2HorizontalPodAutoscalerListBuilder>{
  public V2HorizontalPodAutoscalerListBuilder() {
    this(new V2HorizontalPodAutoscalerList());
  }
  
  public V2HorizontalPodAutoscalerListBuilder(V2HorizontalPodAutoscalerListFluent<?> fluent) {
    this(fluent, new V2HorizontalPodAutoscalerList());
  }
  
  public V2HorizontalPodAutoscalerListBuilder(V2HorizontalPodAutoscalerListFluent<?> fluent,V2HorizontalPodAutoscalerList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V2HorizontalPodAutoscalerListBuilder(V2HorizontalPodAutoscalerList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V2HorizontalPodAutoscalerListFluent<?> fluent;
  
  public V2HorizontalPodAutoscalerList build() {
    V2HorizontalPodAutoscalerList buildable = new V2HorizontalPodAutoscalerList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}
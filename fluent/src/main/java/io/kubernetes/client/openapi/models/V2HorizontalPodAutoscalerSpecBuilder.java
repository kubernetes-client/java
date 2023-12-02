package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V2HorizontalPodAutoscalerSpecBuilder extends V2HorizontalPodAutoscalerSpecFluent<V2HorizontalPodAutoscalerSpecBuilder> implements VisitableBuilder<V2HorizontalPodAutoscalerSpec,V2HorizontalPodAutoscalerSpecBuilder>{
  public V2HorizontalPodAutoscalerSpecBuilder() {
    this(new V2HorizontalPodAutoscalerSpec());
  }
  
  public V2HorizontalPodAutoscalerSpecBuilder(V2HorizontalPodAutoscalerSpecFluent<?> fluent) {
    this(fluent, new V2HorizontalPodAutoscalerSpec());
  }
  
  public V2HorizontalPodAutoscalerSpecBuilder(V2HorizontalPodAutoscalerSpecFluent<?> fluent,V2HorizontalPodAutoscalerSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V2HorizontalPodAutoscalerSpecBuilder(V2HorizontalPodAutoscalerSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V2HorizontalPodAutoscalerSpecFluent<?> fluent;
  
  public V2HorizontalPodAutoscalerSpec build() {
    V2HorizontalPodAutoscalerSpec buildable = new V2HorizontalPodAutoscalerSpec();
    buildable.setBehavior(fluent.buildBehavior());
    buildable.setMaxReplicas(fluent.getMaxReplicas());
    buildable.setMetrics(fluent.buildMetrics());
    buildable.setMinReplicas(fluent.getMinReplicas());
    buildable.setScaleTargetRef(fluent.buildScaleTargetRef());
    return buildable;
  }
  

}
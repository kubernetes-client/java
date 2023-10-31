package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1HorizontalPodAutoscalerSpecBuilder extends V1HorizontalPodAutoscalerSpecFluent<V1HorizontalPodAutoscalerSpecBuilder> implements VisitableBuilder<V1HorizontalPodAutoscalerSpec,V1HorizontalPodAutoscalerSpecBuilder>{
  public V1HorizontalPodAutoscalerSpecBuilder() {
    this(new V1HorizontalPodAutoscalerSpec());
  }
  
  public V1HorizontalPodAutoscalerSpecBuilder(V1HorizontalPodAutoscalerSpecFluent<?> fluent) {
    this(fluent, new V1HorizontalPodAutoscalerSpec());
  }
  
  public V1HorizontalPodAutoscalerSpecBuilder(V1HorizontalPodAutoscalerSpecFluent<?> fluent,V1HorizontalPodAutoscalerSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1HorizontalPodAutoscalerSpecBuilder(V1HorizontalPodAutoscalerSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1HorizontalPodAutoscalerSpecFluent<?> fluent;
  
  public V1HorizontalPodAutoscalerSpec build() {
    V1HorizontalPodAutoscalerSpec buildable = new V1HorizontalPodAutoscalerSpec();
    buildable.setMaxReplicas(fluent.getMaxReplicas());
    buildable.setMinReplicas(fluent.getMinReplicas());
    buildable.setScaleTargetRef(fluent.buildScaleTargetRef());
    buildable.setTargetCPUUtilizationPercentage(fluent.getTargetCPUUtilizationPercentage());
    return buildable;
  }
  

}
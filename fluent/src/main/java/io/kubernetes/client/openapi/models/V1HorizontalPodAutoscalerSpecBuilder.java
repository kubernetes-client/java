package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1HorizontalPodAutoscalerSpecBuilder extends V1HorizontalPodAutoscalerSpecFluentImpl<V1HorizontalPodAutoscalerSpecBuilder> implements VisitableBuilder<V1HorizontalPodAutoscalerSpec,V1HorizontalPodAutoscalerSpecBuilder>{
  public V1HorizontalPodAutoscalerSpecBuilder() {
    this(false);
  }
  public V1HorizontalPodAutoscalerSpecBuilder(Boolean validationEnabled) {
    this(new V1HorizontalPodAutoscalerSpec(), validationEnabled);
  }
  public V1HorizontalPodAutoscalerSpecBuilder(V1HorizontalPodAutoscalerSpecFluent<?> fluent) {
    this(fluent, false);
  }
  public V1HorizontalPodAutoscalerSpecBuilder(V1HorizontalPodAutoscalerSpecFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1HorizontalPodAutoscalerSpec(), validationEnabled);
  }
  public V1HorizontalPodAutoscalerSpecBuilder(V1HorizontalPodAutoscalerSpecFluent<?> fluent,V1HorizontalPodAutoscalerSpec instance) {
    this(fluent, instance, false);
  }
  public V1HorizontalPodAutoscalerSpecBuilder(V1HorizontalPodAutoscalerSpecFluent<?> fluent,V1HorizontalPodAutoscalerSpec instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withMaxReplicas(instance.getMaxReplicas());

    fluent.withMinReplicas(instance.getMinReplicas());

    fluent.withScaleTargetRef(instance.getScaleTargetRef());

    fluent.withTargetCPUUtilizationPercentage(instance.getTargetCPUUtilizationPercentage());

    this.validationEnabled = validationEnabled; 
  }
  public V1HorizontalPodAutoscalerSpecBuilder(V1HorizontalPodAutoscalerSpec instance) {
    this(instance,false);
  }
  public V1HorizontalPodAutoscalerSpecBuilder(V1HorizontalPodAutoscalerSpec instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withMaxReplicas(instance.getMaxReplicas());

    this.withMinReplicas(instance.getMinReplicas());

    this.withScaleTargetRef(instance.getScaleTargetRef());

    this.withTargetCPUUtilizationPercentage(instance.getTargetCPUUtilizationPercentage());

    this.validationEnabled = validationEnabled; 
  }
  V1HorizontalPodAutoscalerSpecFluent<?> fluent;
  Boolean validationEnabled;
  public V1HorizontalPodAutoscalerSpec build() {
    V1HorizontalPodAutoscalerSpec buildable = new V1HorizontalPodAutoscalerSpec();
    buildable.setMaxReplicas(fluent.getMaxReplicas());
    buildable.setMinReplicas(fluent.getMinReplicas());
    buildable.setScaleTargetRef(fluent.getScaleTargetRef());
    buildable.setTargetCPUUtilizationPercentage(fluent.getTargetCPUUtilizationPercentage());
    return buildable;
  }
  
}
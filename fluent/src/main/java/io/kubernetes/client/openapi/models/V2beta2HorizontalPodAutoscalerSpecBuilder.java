package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V2beta2HorizontalPodAutoscalerSpecBuilder extends V2beta2HorizontalPodAutoscalerSpecFluentImpl<V2beta2HorizontalPodAutoscalerSpecBuilder> implements VisitableBuilder<V2beta2HorizontalPodAutoscalerSpec,V2beta2HorizontalPodAutoscalerSpecBuilder>{
  public V2beta2HorizontalPodAutoscalerSpecBuilder() {
    this(false);
  }
  public V2beta2HorizontalPodAutoscalerSpecBuilder(Boolean validationEnabled) {
    this(new V2beta2HorizontalPodAutoscalerSpec(), validationEnabled);
  }
  public V2beta2HorizontalPodAutoscalerSpecBuilder(V2beta2HorizontalPodAutoscalerSpecFluent<?> fluent) {
    this(fluent, false);
  }
  public V2beta2HorizontalPodAutoscalerSpecBuilder(V2beta2HorizontalPodAutoscalerSpecFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V2beta2HorizontalPodAutoscalerSpec(), validationEnabled);
  }
  public V2beta2HorizontalPodAutoscalerSpecBuilder(V2beta2HorizontalPodAutoscalerSpecFluent<?> fluent,V2beta2HorizontalPodAutoscalerSpec instance) {
    this(fluent, instance, false);
  }
  public V2beta2HorizontalPodAutoscalerSpecBuilder(V2beta2HorizontalPodAutoscalerSpecFluent<?> fluent,V2beta2HorizontalPodAutoscalerSpec instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withBehavior(instance.getBehavior());

    fluent.withMaxReplicas(instance.getMaxReplicas());

    fluent.withMetrics(instance.getMetrics());

    fluent.withMinReplicas(instance.getMinReplicas());

    fluent.withScaleTargetRef(instance.getScaleTargetRef());

    this.validationEnabled = validationEnabled; 
  }
  public V2beta2HorizontalPodAutoscalerSpecBuilder(V2beta2HorizontalPodAutoscalerSpec instance) {
    this(instance,false);
  }
  public V2beta2HorizontalPodAutoscalerSpecBuilder(V2beta2HorizontalPodAutoscalerSpec instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withBehavior(instance.getBehavior());

    this.withMaxReplicas(instance.getMaxReplicas());

    this.withMetrics(instance.getMetrics());

    this.withMinReplicas(instance.getMinReplicas());

    this.withScaleTargetRef(instance.getScaleTargetRef());

    this.validationEnabled = validationEnabled; 
  }
  V2beta2HorizontalPodAutoscalerSpecFluent<?> fluent;
  Boolean validationEnabled;
  public V2beta2HorizontalPodAutoscalerSpec build() {
    V2beta2HorizontalPodAutoscalerSpec buildable = new V2beta2HorizontalPodAutoscalerSpec();
    buildable.setBehavior(fluent.getBehavior());
    buildable.setMaxReplicas(fluent.getMaxReplicas());
    buildable.setMetrics(fluent.getMetrics());
    buildable.setMinReplicas(fluent.getMinReplicas());
    buildable.setScaleTargetRef(fluent.getScaleTargetRef());
    return buildable;
  }
  
}
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V2HorizontalPodAutoscalerBehaviorBuilder extends V2HorizontalPodAutoscalerBehaviorFluentImpl<V2HorizontalPodAutoscalerBehaviorBuilder> implements VisitableBuilder<V2HorizontalPodAutoscalerBehavior,V2HorizontalPodAutoscalerBehaviorBuilder>{
  public V2HorizontalPodAutoscalerBehaviorBuilder() {
    this(false);
  }
  public V2HorizontalPodAutoscalerBehaviorBuilder(Boolean validationEnabled) {
    this(new V2HorizontalPodAutoscalerBehavior(), validationEnabled);
  }
  public V2HorizontalPodAutoscalerBehaviorBuilder(V2HorizontalPodAutoscalerBehaviorFluent<?> fluent) {
    this(fluent, false);
  }
  public V2HorizontalPodAutoscalerBehaviorBuilder(V2HorizontalPodAutoscalerBehaviorFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V2HorizontalPodAutoscalerBehavior(), validationEnabled);
  }
  public V2HorizontalPodAutoscalerBehaviorBuilder(V2HorizontalPodAutoscalerBehaviorFluent<?> fluent,V2HorizontalPodAutoscalerBehavior instance) {
    this(fluent, instance, false);
  }
  public V2HorizontalPodAutoscalerBehaviorBuilder(V2HorizontalPodAutoscalerBehaviorFluent<?> fluent,V2HorizontalPodAutoscalerBehavior instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withScaleDown(instance.getScaleDown());

    fluent.withScaleUp(instance.getScaleUp());

    this.validationEnabled = validationEnabled; 
  }
  public V2HorizontalPodAutoscalerBehaviorBuilder(V2HorizontalPodAutoscalerBehavior instance) {
    this(instance,false);
  }
  public V2HorizontalPodAutoscalerBehaviorBuilder(V2HorizontalPodAutoscalerBehavior instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withScaleDown(instance.getScaleDown());

    this.withScaleUp(instance.getScaleUp());

    this.validationEnabled = validationEnabled; 
  }
  V2HorizontalPodAutoscalerBehaviorFluent<?> fluent;
  Boolean validationEnabled;
  public V2HorizontalPodAutoscalerBehavior build() {
    V2HorizontalPodAutoscalerBehavior buildable = new V2HorizontalPodAutoscalerBehavior();
    buildable.setScaleDown(fluent.getScaleDown());
    buildable.setScaleUp(fluent.getScaleUp());
    return buildable;
  }
  
}
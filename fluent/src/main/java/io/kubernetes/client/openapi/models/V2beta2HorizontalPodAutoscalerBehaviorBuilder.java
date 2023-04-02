package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V2beta2HorizontalPodAutoscalerBehaviorBuilder extends V2beta2HorizontalPodAutoscalerBehaviorFluentImpl<V2beta2HorizontalPodAutoscalerBehaviorBuilder> implements VisitableBuilder<V2beta2HorizontalPodAutoscalerBehavior,V2beta2HorizontalPodAutoscalerBehaviorBuilder>{
  public V2beta2HorizontalPodAutoscalerBehaviorBuilder() {
    this(false);
  }
  public V2beta2HorizontalPodAutoscalerBehaviorBuilder(Boolean validationEnabled) {
    this(new V2beta2HorizontalPodAutoscalerBehavior(), validationEnabled);
  }
  public V2beta2HorizontalPodAutoscalerBehaviorBuilder(V2beta2HorizontalPodAutoscalerBehaviorFluent<?> fluent) {
    this(fluent, false);
  }
  public V2beta2HorizontalPodAutoscalerBehaviorBuilder(V2beta2HorizontalPodAutoscalerBehaviorFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V2beta2HorizontalPodAutoscalerBehavior(), validationEnabled);
  }
  public V2beta2HorizontalPodAutoscalerBehaviorBuilder(V2beta2HorizontalPodAutoscalerBehaviorFluent<?> fluent,V2beta2HorizontalPodAutoscalerBehavior instance) {
    this(fluent, instance, false);
  }
  public V2beta2HorizontalPodAutoscalerBehaviorBuilder(V2beta2HorizontalPodAutoscalerBehaviorFluent<?> fluent,V2beta2HorizontalPodAutoscalerBehavior instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withScaleDown(instance.getScaleDown());

    fluent.withScaleUp(instance.getScaleUp());

    this.validationEnabled = validationEnabled; 
  }
  public V2beta2HorizontalPodAutoscalerBehaviorBuilder(V2beta2HorizontalPodAutoscalerBehavior instance) {
    this(instance,false);
  }
  public V2beta2HorizontalPodAutoscalerBehaviorBuilder(V2beta2HorizontalPodAutoscalerBehavior instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withScaleDown(instance.getScaleDown());

    this.withScaleUp(instance.getScaleUp());

    this.validationEnabled = validationEnabled; 
  }
  V2beta2HorizontalPodAutoscalerBehaviorFluent<?> fluent;
  Boolean validationEnabled;
  public V2beta2HorizontalPodAutoscalerBehavior build() {
    V2beta2HorizontalPodAutoscalerBehavior buildable = new V2beta2HorizontalPodAutoscalerBehavior();
    buildable.setScaleDown(fluent.getScaleDown());
    buildable.setScaleUp(fluent.getScaleUp());
    return buildable;
  }
  
}
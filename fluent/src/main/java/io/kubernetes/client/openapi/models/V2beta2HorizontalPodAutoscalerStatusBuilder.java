package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V2beta2HorizontalPodAutoscalerStatusBuilder extends V2beta2HorizontalPodAutoscalerStatusFluentImpl<V2beta2HorizontalPodAutoscalerStatusBuilder> implements VisitableBuilder<V2beta2HorizontalPodAutoscalerStatus,V2beta2HorizontalPodAutoscalerStatusBuilder>{
  public V2beta2HorizontalPodAutoscalerStatusBuilder() {
    this(false);
  }
  public V2beta2HorizontalPodAutoscalerStatusBuilder(Boolean validationEnabled) {
    this(new V2beta2HorizontalPodAutoscalerStatus(), validationEnabled);
  }
  public V2beta2HorizontalPodAutoscalerStatusBuilder(V2beta2HorizontalPodAutoscalerStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V2beta2HorizontalPodAutoscalerStatusBuilder(V2beta2HorizontalPodAutoscalerStatusFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V2beta2HorizontalPodAutoscalerStatus(), validationEnabled);
  }
  public V2beta2HorizontalPodAutoscalerStatusBuilder(V2beta2HorizontalPodAutoscalerStatusFluent<?> fluent,V2beta2HorizontalPodAutoscalerStatus instance) {
    this(fluent, instance, false);
  }
  public V2beta2HorizontalPodAutoscalerStatusBuilder(V2beta2HorizontalPodAutoscalerStatusFluent<?> fluent,V2beta2HorizontalPodAutoscalerStatus instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withConditions(instance.getConditions());

    fluent.withCurrentMetrics(instance.getCurrentMetrics());

    fluent.withCurrentReplicas(instance.getCurrentReplicas());

    fluent.withDesiredReplicas(instance.getDesiredReplicas());

    fluent.withLastScaleTime(instance.getLastScaleTime());

    fluent.withObservedGeneration(instance.getObservedGeneration());

    this.validationEnabled = validationEnabled; 
  }
  public V2beta2HorizontalPodAutoscalerStatusBuilder(V2beta2HorizontalPodAutoscalerStatus instance) {
    this(instance,false);
  }
  public V2beta2HorizontalPodAutoscalerStatusBuilder(V2beta2HorizontalPodAutoscalerStatus instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withConditions(instance.getConditions());

    this.withCurrentMetrics(instance.getCurrentMetrics());

    this.withCurrentReplicas(instance.getCurrentReplicas());

    this.withDesiredReplicas(instance.getDesiredReplicas());

    this.withLastScaleTime(instance.getLastScaleTime());

    this.withObservedGeneration(instance.getObservedGeneration());

    this.validationEnabled = validationEnabled; 
  }
  V2beta2HorizontalPodAutoscalerStatusFluent<?> fluent;
  Boolean validationEnabled;
  public V2beta2HorizontalPodAutoscalerStatus build() {
    V2beta2HorizontalPodAutoscalerStatus buildable = new V2beta2HorizontalPodAutoscalerStatus();
    buildable.setConditions(fluent.getConditions());
    buildable.setCurrentMetrics(fluent.getCurrentMetrics());
    buildable.setCurrentReplicas(fluent.getCurrentReplicas());
    buildable.setDesiredReplicas(fluent.getDesiredReplicas());
    buildable.setLastScaleTime(fluent.getLastScaleTime());
    buildable.setObservedGeneration(fluent.getObservedGeneration());
    return buildable;
  }
  
}
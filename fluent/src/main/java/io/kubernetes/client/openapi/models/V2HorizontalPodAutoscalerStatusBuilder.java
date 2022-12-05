package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V2HorizontalPodAutoscalerStatusBuilder extends V2HorizontalPodAutoscalerStatusFluentImpl<V2HorizontalPodAutoscalerStatusBuilder> implements VisitableBuilder<V2HorizontalPodAutoscalerStatus,V2HorizontalPodAutoscalerStatusBuilder>{
  public V2HorizontalPodAutoscalerStatusBuilder() {
    this(false);
  }
  public V2HorizontalPodAutoscalerStatusBuilder(Boolean validationEnabled) {
    this(new V2HorizontalPodAutoscalerStatus(), validationEnabled);
  }
  public V2HorizontalPodAutoscalerStatusBuilder(V2HorizontalPodAutoscalerStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V2HorizontalPodAutoscalerStatusBuilder(V2HorizontalPodAutoscalerStatusFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V2HorizontalPodAutoscalerStatus(), validationEnabled);
  }
  public V2HorizontalPodAutoscalerStatusBuilder(V2HorizontalPodAutoscalerStatusFluent<?> fluent,V2HorizontalPodAutoscalerStatus instance) {
    this(fluent, instance, false);
  }
  public V2HorizontalPodAutoscalerStatusBuilder(V2HorizontalPodAutoscalerStatusFluent<?> fluent,V2HorizontalPodAutoscalerStatus instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withConditions(instance.getConditions());

    fluent.withCurrentMetrics(instance.getCurrentMetrics());

    fluent.withCurrentReplicas(instance.getCurrentReplicas());

    fluent.withDesiredReplicas(instance.getDesiredReplicas());

    fluent.withLastScaleTime(instance.getLastScaleTime());

    fluent.withObservedGeneration(instance.getObservedGeneration());

    this.validationEnabled = validationEnabled; 
  }
  public V2HorizontalPodAutoscalerStatusBuilder(V2HorizontalPodAutoscalerStatus instance) {
    this(instance,false);
  }
  public V2HorizontalPodAutoscalerStatusBuilder(V2HorizontalPodAutoscalerStatus instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withConditions(instance.getConditions());

    this.withCurrentMetrics(instance.getCurrentMetrics());

    this.withCurrentReplicas(instance.getCurrentReplicas());

    this.withDesiredReplicas(instance.getDesiredReplicas());

    this.withLastScaleTime(instance.getLastScaleTime());

    this.withObservedGeneration(instance.getObservedGeneration());

    this.validationEnabled = validationEnabled; 
  }
  V2HorizontalPodAutoscalerStatusFluent<?> fluent;
  Boolean validationEnabled;
  public V2HorizontalPodAutoscalerStatus build() {
    V2HorizontalPodAutoscalerStatus buildable = new V2HorizontalPodAutoscalerStatus();
    buildable.setConditions(fluent.getConditions());
    buildable.setCurrentMetrics(fluent.getCurrentMetrics());
    buildable.setCurrentReplicas(fluent.getCurrentReplicas());
    buildable.setDesiredReplicas(fluent.getDesiredReplicas());
    buildable.setLastScaleTime(fluent.getLastScaleTime());
    buildable.setObservedGeneration(fluent.getObservedGeneration());
    return buildable;
  }
  
}
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V2HorizontalPodAutoscalerConditionBuilder extends V2HorizontalPodAutoscalerConditionFluentImpl<V2HorizontalPodAutoscalerConditionBuilder> implements VisitableBuilder<V2HorizontalPodAutoscalerCondition,V2HorizontalPodAutoscalerConditionBuilder>{
  public V2HorizontalPodAutoscalerConditionBuilder() {
    this(false);
  }
  public V2HorizontalPodAutoscalerConditionBuilder(Boolean validationEnabled) {
    this(new V2HorizontalPodAutoscalerCondition(), validationEnabled);
  }
  public V2HorizontalPodAutoscalerConditionBuilder(V2HorizontalPodAutoscalerConditionFluent<?> fluent) {
    this(fluent, false);
  }
  public V2HorizontalPodAutoscalerConditionBuilder(V2HorizontalPodAutoscalerConditionFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V2HorizontalPodAutoscalerCondition(), validationEnabled);
  }
  public V2HorizontalPodAutoscalerConditionBuilder(V2HorizontalPodAutoscalerConditionFluent<?> fluent,V2HorizontalPodAutoscalerCondition instance) {
    this(fluent, instance, false);
  }
  public V2HorizontalPodAutoscalerConditionBuilder(V2HorizontalPodAutoscalerConditionFluent<?> fluent,V2HorizontalPodAutoscalerCondition instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withLastTransitionTime(instance.getLastTransitionTime());

    fluent.withMessage(instance.getMessage());

    fluent.withReason(instance.getReason());

    fluent.withStatus(instance.getStatus());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  public V2HorizontalPodAutoscalerConditionBuilder(V2HorizontalPodAutoscalerCondition instance) {
    this(instance,false);
  }
  public V2HorizontalPodAutoscalerConditionBuilder(V2HorizontalPodAutoscalerCondition instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withLastTransitionTime(instance.getLastTransitionTime());

    this.withMessage(instance.getMessage());

    this.withReason(instance.getReason());

    this.withStatus(instance.getStatus());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  V2HorizontalPodAutoscalerConditionFluent<?> fluent;
  Boolean validationEnabled;
  public V2HorizontalPodAutoscalerCondition build() {
    V2HorizontalPodAutoscalerCondition buildable = new V2HorizontalPodAutoscalerCondition();
    buildable.setLastTransitionTime(fluent.getLastTransitionTime());
    buildable.setMessage(fluent.getMessage());
    buildable.setReason(fluent.getReason());
    buildable.setStatus(fluent.getStatus());
    buildable.setType(fluent.getType());
    return buildable;
  }
  
}
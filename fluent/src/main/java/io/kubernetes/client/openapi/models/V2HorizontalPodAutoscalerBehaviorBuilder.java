package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V2HorizontalPodAutoscalerBehaviorBuilder extends io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerBehaviorFluentImpl<io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerBehaviorBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerBehavior,io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerBehaviorBuilder>{
  public V2HorizontalPodAutoscalerBehaviorBuilder() {
    this(false);
  }
  public V2HorizontalPodAutoscalerBehaviorBuilder(java.lang.Boolean validationEnabled) {
    this(new V2HorizontalPodAutoscalerBehavior(), validationEnabled);
  }
  public V2HorizontalPodAutoscalerBehaviorBuilder(io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerBehaviorFluent<?> fluent) {
    this(fluent, false);
  }
  public V2HorizontalPodAutoscalerBehaviorBuilder(io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerBehaviorFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V2HorizontalPodAutoscalerBehavior(), validationEnabled);
  }
  public V2HorizontalPodAutoscalerBehaviorBuilder(io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerBehaviorFluent<?> fluent,io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerBehavior instance) {
    this(fluent, instance, false);
  }
  public V2HorizontalPodAutoscalerBehaviorBuilder(io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerBehaviorFluent<?> fluent,io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerBehavior instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withScaleDown(instance.getScaleDown());

    fluent.withScaleUp(instance.getScaleUp());

    this.validationEnabled = validationEnabled; 
  }
  public V2HorizontalPodAutoscalerBehaviorBuilder(io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerBehavior instance) {
    this(instance,false);
  }
  public V2HorizontalPodAutoscalerBehaviorBuilder(io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerBehavior instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withScaleDown(instance.getScaleDown());

    this.withScaleUp(instance.getScaleUp());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerBehaviorFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerBehavior build() {
    V2HorizontalPodAutoscalerBehavior buildable = new V2HorizontalPodAutoscalerBehavior();
    buildable.setScaleDown(fluent.getScaleDown());
    buildable.setScaleUp(fluent.getScaleUp());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V2HorizontalPodAutoscalerBehaviorBuilder that = (V2HorizontalPodAutoscalerBehaviorBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}
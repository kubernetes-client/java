package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.time.OffsetDateTime;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1HorizontalPodAutoscalerStatusFluent<A extends V1HorizontalPodAutoscalerStatusFluent<A>> extends BaseFluent<A>{
  public V1HorizontalPodAutoscalerStatusFluent() {
  }
  
  public V1HorizontalPodAutoscalerStatusFluent(V1HorizontalPodAutoscalerStatus instance) {
    this.copyInstance(instance);
  }
  private Integer currentCPUUtilizationPercentage;
  private Integer currentReplicas;
  private Integer desiredReplicas;
  private OffsetDateTime lastScaleTime;
  private Long observedGeneration;
  
  protected void copyInstance(V1HorizontalPodAutoscalerStatus instance) {
    instance = (instance != null ? instance : new V1HorizontalPodAutoscalerStatus());
    if (instance != null) {
          this.withCurrentCPUUtilizationPercentage(instance.getCurrentCPUUtilizationPercentage());
          this.withCurrentReplicas(instance.getCurrentReplicas());
          this.withDesiredReplicas(instance.getDesiredReplicas());
          this.withLastScaleTime(instance.getLastScaleTime());
          this.withObservedGeneration(instance.getObservedGeneration());
        }
  }
  
  public Integer getCurrentCPUUtilizationPercentage() {
    return this.currentCPUUtilizationPercentage;
  }
  
  public A withCurrentCPUUtilizationPercentage(Integer currentCPUUtilizationPercentage) {
    this.currentCPUUtilizationPercentage = currentCPUUtilizationPercentage;
    return (A) this;
  }
  
  public boolean hasCurrentCPUUtilizationPercentage() {
    return this.currentCPUUtilizationPercentage != null;
  }
  
  public Integer getCurrentReplicas() {
    return this.currentReplicas;
  }
  
  public A withCurrentReplicas(Integer currentReplicas) {
    this.currentReplicas = currentReplicas;
    return (A) this;
  }
  
  public boolean hasCurrentReplicas() {
    return this.currentReplicas != null;
  }
  
  public Integer getDesiredReplicas() {
    return this.desiredReplicas;
  }
  
  public A withDesiredReplicas(Integer desiredReplicas) {
    this.desiredReplicas = desiredReplicas;
    return (A) this;
  }
  
  public boolean hasDesiredReplicas() {
    return this.desiredReplicas != null;
  }
  
  public OffsetDateTime getLastScaleTime() {
    return this.lastScaleTime;
  }
  
  public A withLastScaleTime(OffsetDateTime lastScaleTime) {
    this.lastScaleTime = lastScaleTime;
    return (A) this;
  }
  
  public boolean hasLastScaleTime() {
    return this.lastScaleTime != null;
  }
  
  public Long getObservedGeneration() {
    return this.observedGeneration;
  }
  
  public A withObservedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
    return (A) this;
  }
  
  public boolean hasObservedGeneration() {
    return this.observedGeneration != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1HorizontalPodAutoscalerStatusFluent that = (V1HorizontalPodAutoscalerStatusFluent) o;
    if (!java.util.Objects.equals(currentCPUUtilizationPercentage, that.currentCPUUtilizationPercentage)) return false;
    if (!java.util.Objects.equals(currentReplicas, that.currentReplicas)) return false;
    if (!java.util.Objects.equals(desiredReplicas, that.desiredReplicas)) return false;
    if (!java.util.Objects.equals(lastScaleTime, that.lastScaleTime)) return false;
    if (!java.util.Objects.equals(observedGeneration, that.observedGeneration)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(currentCPUUtilizationPercentage,  currentReplicas,  desiredReplicas,  lastScaleTime,  observedGeneration,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (currentCPUUtilizationPercentage != null) { sb.append("currentCPUUtilizationPercentage:"); sb.append(currentCPUUtilizationPercentage + ","); }
    if (currentReplicas != null) { sb.append("currentReplicas:"); sb.append(currentReplicas + ","); }
    if (desiredReplicas != null) { sb.append("desiredReplicas:"); sb.append(desiredReplicas + ","); }
    if (lastScaleTime != null) { sb.append("lastScaleTime:"); sb.append(lastScaleTime + ","); }
    if (observedGeneration != null) { sb.append("observedGeneration:"); sb.append(observedGeneration); }
    sb.append("}");
    return sb.toString();
  }
  

}
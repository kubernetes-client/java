package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1HorizontalPodAutoscalerStatusFluent<A extends io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerStatusFluent<A>> extends BaseFluent<A>{

  private Integer currentCPUUtilizationPercentage;
  private Integer currentReplicas;
  private Integer desiredReplicas;
  private OffsetDateTime lastScaleTime;
  private Long observedGeneration;

  public V1HorizontalPodAutoscalerStatusFluent() {
  }
  
  public V1HorizontalPodAutoscalerStatusFluent(V1HorizontalPodAutoscalerStatus instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1HorizontalPodAutoscalerStatus instance) {
    instance = instance != null ? instance : new V1HorizontalPodAutoscalerStatus();
    if (instance != null) {
        this.withCurrentCPUUtilizationPercentage(instance.getCurrentCPUUtilizationPercentage());
        this.withCurrentReplicas(instance.getCurrentReplicas());
        this.withDesiredReplicas(instance.getDesiredReplicas());
        this.withLastScaleTime(instance.getLastScaleTime());
        this.withObservedGeneration(instance.getObservedGeneration());
    }
  }
  
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }
    if (!(super.equals(o))) {
      return false;
    }
    V1HorizontalPodAutoscalerStatusFluent that = (V1HorizontalPodAutoscalerStatusFluent) o;
    if (!(Objects.equals(currentCPUUtilizationPercentage, that.currentCPUUtilizationPercentage))) {
      return false;
    }
    if (!(Objects.equals(currentReplicas, that.currentReplicas))) {
      return false;
    }
    if (!(Objects.equals(desiredReplicas, that.desiredReplicas))) {
      return false;
    }
    if (!(Objects.equals(lastScaleTime, that.lastScaleTime))) {
      return false;
    }
    if (!(Objects.equals(observedGeneration, that.observedGeneration))) {
      return false;
    }
    return true;
  }
  
  public Integer getCurrentCPUUtilizationPercentage() {
    return this.currentCPUUtilizationPercentage;
  }
  
  public Integer getCurrentReplicas() {
    return this.currentReplicas;
  }
  
  public Integer getDesiredReplicas() {
    return this.desiredReplicas;
  }
  
  public OffsetDateTime getLastScaleTime() {
    return this.lastScaleTime;
  }
  
  public Long getObservedGeneration() {
    return this.observedGeneration;
  }
  
  public boolean hasCurrentCPUUtilizationPercentage() {
    return this.currentCPUUtilizationPercentage != null;
  }
  
  public boolean hasCurrentReplicas() {
    return this.currentReplicas != null;
  }
  
  public boolean hasDesiredReplicas() {
    return this.desiredReplicas != null;
  }
  
  public boolean hasLastScaleTime() {
    return this.lastScaleTime != null;
  }
  
  public boolean hasObservedGeneration() {
    return this.observedGeneration != null;
  }
  
  public int hashCode() {
    return Objects.hash(currentCPUUtilizationPercentage, currentReplicas, desiredReplicas, lastScaleTime, observedGeneration);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(currentCPUUtilizationPercentage == null)) {
        sb.append("currentCPUUtilizationPercentage:");
        sb.append(currentCPUUtilizationPercentage);
        sb.append(",");
    }
    if (!(currentReplicas == null)) {
        sb.append("currentReplicas:");
        sb.append(currentReplicas);
        sb.append(",");
    }
    if (!(desiredReplicas == null)) {
        sb.append("desiredReplicas:");
        sb.append(desiredReplicas);
        sb.append(",");
    }
    if (!(lastScaleTime == null)) {
        sb.append("lastScaleTime:");
        sb.append(lastScaleTime);
        sb.append(",");
    }
    if (!(observedGeneration == null)) {
        sb.append("observedGeneration:");
        sb.append(observedGeneration);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withCurrentCPUUtilizationPercentage(Integer currentCPUUtilizationPercentage) {
    this.currentCPUUtilizationPercentage = currentCPUUtilizationPercentage;
    return (A) this;
  }
  
  public A withCurrentReplicas(Integer currentReplicas) {
    this.currentReplicas = currentReplicas;
    return (A) this;
  }
  
  public A withDesiredReplicas(Integer desiredReplicas) {
    this.desiredReplicas = desiredReplicas;
    return (A) this;
  }
  
  public A withLastScaleTime(OffsetDateTime lastScaleTime) {
    this.lastScaleTime = lastScaleTime;
    return (A) this;
  }
  
  public A withObservedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
    return (A) this;
  }
  
}
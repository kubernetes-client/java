package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.time.OffsetDateTime;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1HorizontalPodAutoscalerStatusFluentImpl<A extends V1HorizontalPodAutoscalerStatusFluent<A>> extends BaseFluent<A> implements V1HorizontalPodAutoscalerStatusFluent<A>{
  public V1HorizontalPodAutoscalerStatusFluentImpl() {
  }
  public V1HorizontalPodAutoscalerStatusFluentImpl(V1HorizontalPodAutoscalerStatus instance) {
    this.withCurrentCPUUtilizationPercentage(instance.getCurrentCPUUtilizationPercentage());

    this.withCurrentReplicas(instance.getCurrentReplicas());

    this.withDesiredReplicas(instance.getDesiredReplicas());

    this.withLastScaleTime(instance.getLastScaleTime());

    this.withObservedGeneration(instance.getObservedGeneration());

  }
  private Integer currentCPUUtilizationPercentage;
  private Integer currentReplicas;
  private Integer desiredReplicas;
  private OffsetDateTime lastScaleTime;
  private Long observedGeneration;
  public Integer getCurrentCPUUtilizationPercentage() {
    return this.currentCPUUtilizationPercentage;
  }
  public A withCurrentCPUUtilizationPercentage(Integer currentCPUUtilizationPercentage) {
    this.currentCPUUtilizationPercentage=currentCPUUtilizationPercentage; return (A) this;
  }
  public Boolean hasCurrentCPUUtilizationPercentage() {
    return this.currentCPUUtilizationPercentage != null;
  }
  public Integer getCurrentReplicas() {
    return this.currentReplicas;
  }
  public A withCurrentReplicas(Integer currentReplicas) {
    this.currentReplicas=currentReplicas; return (A) this;
  }
  public Boolean hasCurrentReplicas() {
    return this.currentReplicas != null;
  }
  public Integer getDesiredReplicas() {
    return this.desiredReplicas;
  }
  public A withDesiredReplicas(Integer desiredReplicas) {
    this.desiredReplicas=desiredReplicas; return (A) this;
  }
  public Boolean hasDesiredReplicas() {
    return this.desiredReplicas != null;
  }
  public OffsetDateTime getLastScaleTime() {
    return this.lastScaleTime;
  }
  public A withLastScaleTime(OffsetDateTime lastScaleTime) {
    this.lastScaleTime=lastScaleTime; return (A) this;
  }
  public Boolean hasLastScaleTime() {
    return this.lastScaleTime != null;
  }
  public Long getObservedGeneration() {
    return this.observedGeneration;
  }
  public A withObservedGeneration(Long observedGeneration) {
    this.observedGeneration=observedGeneration; return (A) this;
  }
  public Boolean hasObservedGeneration() {
    return this.observedGeneration != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1HorizontalPodAutoscalerStatusFluentImpl that = (V1HorizontalPodAutoscalerStatusFluentImpl) o;
    if (currentCPUUtilizationPercentage != null ? !currentCPUUtilizationPercentage.equals(that.currentCPUUtilizationPercentage) :that.currentCPUUtilizationPercentage != null) return false;
    if (currentReplicas != null ? !currentReplicas.equals(that.currentReplicas) :that.currentReplicas != null) return false;
    if (desiredReplicas != null ? !desiredReplicas.equals(that.desiredReplicas) :that.desiredReplicas != null) return false;
    if (lastScaleTime != null ? !lastScaleTime.equals(that.lastScaleTime) :that.lastScaleTime != null) return false;
    if (observedGeneration != null ? !observedGeneration.equals(that.observedGeneration) :that.observedGeneration != null) return false;
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
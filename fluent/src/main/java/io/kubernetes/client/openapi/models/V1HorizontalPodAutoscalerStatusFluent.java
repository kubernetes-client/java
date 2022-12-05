package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.time.OffsetDateTime;
import io.kubernetes.client.fluent.Fluent;
import java.lang.Long;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1HorizontalPodAutoscalerStatusFluent<A extends V1HorizontalPodAutoscalerStatusFluent<A>> extends Fluent<A>{
  public Integer getCurrentCPUUtilizationPercentage();
  public A withCurrentCPUUtilizationPercentage(Integer currentCPUUtilizationPercentage);
  public Boolean hasCurrentCPUUtilizationPercentage();
  public Integer getCurrentReplicas();
  public A withCurrentReplicas(Integer currentReplicas);
  public Boolean hasCurrentReplicas();
  public Integer getDesiredReplicas();
  public A withDesiredReplicas(Integer desiredReplicas);
  public Boolean hasDesiredReplicas();
  public OffsetDateTime getLastScaleTime();
  public A withLastScaleTime(OffsetDateTime lastScaleTime);
  public Boolean hasLastScaleTime();
  public Long getObservedGeneration();
  public A withObservedGeneration(Long observedGeneration);
  public Boolean hasObservedGeneration();
  
}
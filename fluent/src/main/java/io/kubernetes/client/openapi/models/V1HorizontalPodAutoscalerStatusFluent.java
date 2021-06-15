package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.time.OffsetDateTime;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.Long;
import java.lang.String;
import java.lang.Boolean;

public interface V1HorizontalPodAutoscalerStatusFluent<A extends io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerStatusFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.Integer getCurrentCPUUtilizationPercentage();
    public A withCurrentCPUUtilizationPercentage(java.lang.Integer currentCPUUtilizationPercentage);
    public java.lang.Boolean hasCurrentCPUUtilizationPercentage();
    public java.lang.Integer getCurrentReplicas();
    public A withCurrentReplicas(java.lang.Integer currentReplicas);
    public java.lang.Boolean hasCurrentReplicas();
    public java.lang.Integer getDesiredReplicas();
    public A withDesiredReplicas(java.lang.Integer desiredReplicas);
    public java.lang.Boolean hasDesiredReplicas();
    public java.time.OffsetDateTime getLastScaleTime();
    public A withLastScaleTime(java.time.OffsetDateTime lastScaleTime);
    public java.lang.Boolean hasLastScaleTime();
    public java.lang.Long getObservedGeneration();
    public A withObservedGeneration(java.lang.Long observedGeneration);
    public java.lang.Boolean hasObservedGeneration();
}

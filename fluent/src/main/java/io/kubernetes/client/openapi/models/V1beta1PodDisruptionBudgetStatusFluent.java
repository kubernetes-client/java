package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.time.OffsetDateTime;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.Long;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;
import java.util.LinkedHashMap;

public interface V1beta1PodDisruptionBudgetStatusFluent<A extends io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetStatusFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.Integer getCurrentHealthy();
    public A withCurrentHealthy(java.lang.Integer currentHealthy);
    public java.lang.Boolean hasCurrentHealthy();
    public java.lang.Integer getDesiredHealthy();
    public A withDesiredHealthy(java.lang.Integer desiredHealthy);
    public java.lang.Boolean hasDesiredHealthy();
    public A addToDisruptedPods(java.lang.String key,java.time.OffsetDateTime value);
    public A addToDisruptedPods(java.util.Map<java.lang.String,java.time.OffsetDateTime> map);
    public A removeFromDisruptedPods(java.lang.String key);
    public A removeFromDisruptedPods(java.util.Map<java.lang.String,java.time.OffsetDateTime> map);
    public java.util.Map<java.lang.String,java.time.OffsetDateTime> getDisruptedPods();
    public <K,V>A withDisruptedPods(java.util.Map<java.lang.String,java.time.OffsetDateTime> disruptedPods);
    public java.lang.Boolean hasDisruptedPods();
    public java.lang.Integer getDisruptionsAllowed();
    public A withDisruptionsAllowed(java.lang.Integer disruptionsAllowed);
    public java.lang.Boolean hasDisruptionsAllowed();
    public java.lang.Integer getExpectedPods();
    public A withExpectedPods(java.lang.Integer expectedPods);
    public java.lang.Boolean hasExpectedPods();
    public java.lang.Long getObservedGeneration();
    public A withObservedGeneration(java.lang.Long observedGeneration);
    public java.lang.Boolean hasObservedGeneration();
}

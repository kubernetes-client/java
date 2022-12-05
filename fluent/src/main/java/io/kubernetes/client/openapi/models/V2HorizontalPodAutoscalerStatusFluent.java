package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import java.time.OffsetDateTime;
import java.lang.Long;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V2HorizontalPodAutoscalerStatusFluent<A extends V2HorizontalPodAutoscalerStatusFluent<A>> extends Fluent<A>{
  public A addToConditions(Integer index,V2HorizontalPodAutoscalerCondition item);
  public A setToConditions(Integer index,V2HorizontalPodAutoscalerCondition item);
  public A addToConditions(io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerCondition... items);
  public A addAllToConditions(Collection<V2HorizontalPodAutoscalerCondition> items);
  public A removeFromConditions(io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerCondition... items);
  public A removeAllFromConditions(Collection<V2HorizontalPodAutoscalerCondition> items);
  public A removeMatchingFromConditions(Predicate<V2HorizontalPodAutoscalerConditionBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildConditions instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V2HorizontalPodAutoscalerCondition> getConditions();
  public List<V2HorizontalPodAutoscalerCondition> buildConditions();
  public V2HorizontalPodAutoscalerCondition buildCondition(Integer index);
  public V2HorizontalPodAutoscalerCondition buildFirstCondition();
  public V2HorizontalPodAutoscalerCondition buildLastCondition();
  public V2HorizontalPodAutoscalerCondition buildMatchingCondition(Predicate<V2HorizontalPodAutoscalerConditionBuilder> predicate);
  public Boolean hasMatchingCondition(Predicate<V2HorizontalPodAutoscalerConditionBuilder> predicate);
  public A withConditions(List<V2HorizontalPodAutoscalerCondition> conditions);
  public A withConditions(io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerCondition... conditions);
  public Boolean hasConditions();
  public V2HorizontalPodAutoscalerStatusFluent.ConditionsNested<A> addNewCondition();
  public V2HorizontalPodAutoscalerStatusFluent.ConditionsNested<A> addNewConditionLike(V2HorizontalPodAutoscalerCondition item);
  public V2HorizontalPodAutoscalerStatusFluent.ConditionsNested<A> setNewConditionLike(Integer index,V2HorizontalPodAutoscalerCondition item);
  public V2HorizontalPodAutoscalerStatusFluent.ConditionsNested<A> editCondition(Integer index);
  public V2HorizontalPodAutoscalerStatusFluent.ConditionsNested<A> editFirstCondition();
  public V2HorizontalPodAutoscalerStatusFluent.ConditionsNested<A> editLastCondition();
  public V2HorizontalPodAutoscalerStatusFluent.ConditionsNested<A> editMatchingCondition(Predicate<V2HorizontalPodAutoscalerConditionBuilder> predicate);
  public A addToCurrentMetrics(Integer index,V2MetricStatus item);
  public A setToCurrentMetrics(Integer index,V2MetricStatus item);
  public A addToCurrentMetrics(io.kubernetes.client.openapi.models.V2MetricStatus... items);
  public A addAllToCurrentMetrics(Collection<V2MetricStatus> items);
  public A removeFromCurrentMetrics(io.kubernetes.client.openapi.models.V2MetricStatus... items);
  public A removeAllFromCurrentMetrics(Collection<V2MetricStatus> items);
  public A removeMatchingFromCurrentMetrics(Predicate<V2MetricStatusBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildCurrentMetrics instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V2MetricStatus> getCurrentMetrics();
  public List<V2MetricStatus> buildCurrentMetrics();
  public V2MetricStatus buildCurrentMetric(Integer index);
  public V2MetricStatus buildFirstCurrentMetric();
  public V2MetricStatus buildLastCurrentMetric();
  public V2MetricStatus buildMatchingCurrentMetric(Predicate<V2MetricStatusBuilder> predicate);
  public Boolean hasMatchingCurrentMetric(Predicate<V2MetricStatusBuilder> predicate);
  public A withCurrentMetrics(List<V2MetricStatus> currentMetrics);
  public A withCurrentMetrics(io.kubernetes.client.openapi.models.V2MetricStatus... currentMetrics);
  public Boolean hasCurrentMetrics();
  public V2HorizontalPodAutoscalerStatusFluent.CurrentMetricsNested<A> addNewCurrentMetric();
  public V2HorizontalPodAutoscalerStatusFluent.CurrentMetricsNested<A> addNewCurrentMetricLike(V2MetricStatus item);
  public V2HorizontalPodAutoscalerStatusFluent.CurrentMetricsNested<A> setNewCurrentMetricLike(Integer index,V2MetricStatus item);
  public V2HorizontalPodAutoscalerStatusFluent.CurrentMetricsNested<A> editCurrentMetric(Integer index);
  public V2HorizontalPodAutoscalerStatusFluent.CurrentMetricsNested<A> editFirstCurrentMetric();
  public V2HorizontalPodAutoscalerStatusFluent.CurrentMetricsNested<A> editLastCurrentMetric();
  public V2HorizontalPodAutoscalerStatusFluent.CurrentMetricsNested<A> editMatchingCurrentMetric(Predicate<V2MetricStatusBuilder> predicate);
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
  public interface ConditionsNested<N> extends Nested<N>,V2HorizontalPodAutoscalerConditionFluent<V2HorizontalPodAutoscalerStatusFluent.ConditionsNested<N>>{
    public N and();
    public N endCondition();
    
  }
  public interface CurrentMetricsNested<N> extends Nested<N>,V2MetricStatusFluent<V2HorizontalPodAutoscalerStatusFluent.CurrentMetricsNested<N>>{
    public N and();
    public N endCurrentMetric();
    
  }
  
}
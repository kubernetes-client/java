package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V2HorizontalPodAutoscalerSpecFluent<A extends V2HorizontalPodAutoscalerSpecFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildBehavior instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2HorizontalPodAutoscalerBehavior getBehavior();
  public V2HorizontalPodAutoscalerBehavior buildBehavior();
  public A withBehavior(V2HorizontalPodAutoscalerBehavior behavior);
  public Boolean hasBehavior();
  public V2HorizontalPodAutoscalerSpecFluent.BehaviorNested<A> withNewBehavior();
  public V2HorizontalPodAutoscalerSpecFluent.BehaviorNested<A> withNewBehaviorLike(V2HorizontalPodAutoscalerBehavior item);
  public V2HorizontalPodAutoscalerSpecFluent.BehaviorNested<A> editBehavior();
  public V2HorizontalPodAutoscalerSpecFluent.BehaviorNested<A> editOrNewBehavior();
  public V2HorizontalPodAutoscalerSpecFluent.BehaviorNested<A> editOrNewBehaviorLike(V2HorizontalPodAutoscalerBehavior item);
  public Integer getMaxReplicas();
  public A withMaxReplicas(Integer maxReplicas);
  public Boolean hasMaxReplicas();
  public A addToMetrics(Integer index,V2MetricSpec item);
  public A setToMetrics(Integer index,V2MetricSpec item);
  public A addToMetrics(io.kubernetes.client.openapi.models.V2MetricSpec... items);
  public A addAllToMetrics(Collection<V2MetricSpec> items);
  public A removeFromMetrics(io.kubernetes.client.openapi.models.V2MetricSpec... items);
  public A removeAllFromMetrics(Collection<V2MetricSpec> items);
  public A removeMatchingFromMetrics(Predicate<V2MetricSpecBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildMetrics instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V2MetricSpec> getMetrics();
  public List<V2MetricSpec> buildMetrics();
  public V2MetricSpec buildMetric(Integer index);
  public V2MetricSpec buildFirstMetric();
  public V2MetricSpec buildLastMetric();
  public V2MetricSpec buildMatchingMetric(Predicate<V2MetricSpecBuilder> predicate);
  public Boolean hasMatchingMetric(Predicate<V2MetricSpecBuilder> predicate);
  public A withMetrics(List<V2MetricSpec> metrics);
  public A withMetrics(io.kubernetes.client.openapi.models.V2MetricSpec... metrics);
  public Boolean hasMetrics();
  public V2HorizontalPodAutoscalerSpecFluent.MetricsNested<A> addNewMetric();
  public V2HorizontalPodAutoscalerSpecFluent.MetricsNested<A> addNewMetricLike(V2MetricSpec item);
  public V2HorizontalPodAutoscalerSpecFluent.MetricsNested<A> setNewMetricLike(Integer index,V2MetricSpec item);
  public V2HorizontalPodAutoscalerSpecFluent.MetricsNested<A> editMetric(Integer index);
  public V2HorizontalPodAutoscalerSpecFluent.MetricsNested<A> editFirstMetric();
  public V2HorizontalPodAutoscalerSpecFluent.MetricsNested<A> editLastMetric();
  public V2HorizontalPodAutoscalerSpecFluent.MetricsNested<A> editMatchingMetric(Predicate<V2MetricSpecBuilder> predicate);
  public Integer getMinReplicas();
  public A withMinReplicas(Integer minReplicas);
  public Boolean hasMinReplicas();
  
  /**
   * This method has been deprecated, please use method buildScaleTargetRef instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2CrossVersionObjectReference getScaleTargetRef();
  public V2CrossVersionObjectReference buildScaleTargetRef();
  public A withScaleTargetRef(V2CrossVersionObjectReference scaleTargetRef);
  public Boolean hasScaleTargetRef();
  public V2HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> withNewScaleTargetRef();
  public V2HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> withNewScaleTargetRefLike(V2CrossVersionObjectReference item);
  public V2HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> editScaleTargetRef();
  public V2HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> editOrNewScaleTargetRef();
  public V2HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> editOrNewScaleTargetRefLike(V2CrossVersionObjectReference item);
  public interface BehaviorNested<N> extends Nested<N>,V2HorizontalPodAutoscalerBehaviorFluent<V2HorizontalPodAutoscalerSpecFluent.BehaviorNested<N>>{
    public N and();
    public N endBehavior();
    
  }
  public interface MetricsNested<N> extends Nested<N>,V2MetricSpecFluent<V2HorizontalPodAutoscalerSpecFluent.MetricsNested<N>>{
    public N and();
    public N endMetric();
    
  }
  public interface ScaleTargetRefNested<N> extends Nested<N>,V2CrossVersionObjectReferenceFluent<V2HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<N>>{
    public N and();
    public N endScaleTargetRef();
    
  }
  
}
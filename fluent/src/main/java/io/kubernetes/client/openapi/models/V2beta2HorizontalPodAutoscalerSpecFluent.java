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
public interface V2beta2HorizontalPodAutoscalerSpecFluent<A extends V2beta2HorizontalPodAutoscalerSpecFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildBehavior instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2beta2HorizontalPodAutoscalerBehavior getBehavior();
  public V2beta2HorizontalPodAutoscalerBehavior buildBehavior();
  public A withBehavior(V2beta2HorizontalPodAutoscalerBehavior behavior);
  public Boolean hasBehavior();
  public V2beta2HorizontalPodAutoscalerSpecFluent.BehaviorNested<A> withNewBehavior();
  public V2beta2HorizontalPodAutoscalerSpecFluent.BehaviorNested<A> withNewBehaviorLike(V2beta2HorizontalPodAutoscalerBehavior item);
  public V2beta2HorizontalPodAutoscalerSpecFluent.BehaviorNested<A> editBehavior();
  public V2beta2HorizontalPodAutoscalerSpecFluent.BehaviorNested<A> editOrNewBehavior();
  public V2beta2HorizontalPodAutoscalerSpecFluent.BehaviorNested<A> editOrNewBehaviorLike(V2beta2HorizontalPodAutoscalerBehavior item);
  public Integer getMaxReplicas();
  public A withMaxReplicas(Integer maxReplicas);
  public Boolean hasMaxReplicas();
  public A addToMetrics(Integer index,V2beta2MetricSpec item);
  public A setToMetrics(Integer index,V2beta2MetricSpec item);
  public A addToMetrics(io.kubernetes.client.openapi.models.V2beta2MetricSpec... items);
  public A addAllToMetrics(Collection<V2beta2MetricSpec> items);
  public A removeFromMetrics(io.kubernetes.client.openapi.models.V2beta2MetricSpec... items);
  public A removeAllFromMetrics(Collection<V2beta2MetricSpec> items);
  public A removeMatchingFromMetrics(Predicate<V2beta2MetricSpecBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildMetrics instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V2beta2MetricSpec> getMetrics();
  public List<V2beta2MetricSpec> buildMetrics();
  public V2beta2MetricSpec buildMetric(Integer index);
  public V2beta2MetricSpec buildFirstMetric();
  public V2beta2MetricSpec buildLastMetric();
  public V2beta2MetricSpec buildMatchingMetric(Predicate<V2beta2MetricSpecBuilder> predicate);
  public Boolean hasMatchingMetric(Predicate<V2beta2MetricSpecBuilder> predicate);
  public A withMetrics(List<V2beta2MetricSpec> metrics);
  public A withMetrics(io.kubernetes.client.openapi.models.V2beta2MetricSpec... metrics);
  public Boolean hasMetrics();
  public V2beta2HorizontalPodAutoscalerSpecFluent.MetricsNested<A> addNewMetric();
  public V2beta2HorizontalPodAutoscalerSpecFluent.MetricsNested<A> addNewMetricLike(V2beta2MetricSpec item);
  public V2beta2HorizontalPodAutoscalerSpecFluent.MetricsNested<A> setNewMetricLike(Integer index,V2beta2MetricSpec item);
  public V2beta2HorizontalPodAutoscalerSpecFluent.MetricsNested<A> editMetric(Integer index);
  public V2beta2HorizontalPodAutoscalerSpecFluent.MetricsNested<A> editFirstMetric();
  public V2beta2HorizontalPodAutoscalerSpecFluent.MetricsNested<A> editLastMetric();
  public V2beta2HorizontalPodAutoscalerSpecFluent.MetricsNested<A> editMatchingMetric(Predicate<V2beta2MetricSpecBuilder> predicate);
  public Integer getMinReplicas();
  public A withMinReplicas(Integer minReplicas);
  public Boolean hasMinReplicas();
  
  /**
   * This method has been deprecated, please use method buildScaleTargetRef instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2beta2CrossVersionObjectReference getScaleTargetRef();
  public V2beta2CrossVersionObjectReference buildScaleTargetRef();
  public A withScaleTargetRef(V2beta2CrossVersionObjectReference scaleTargetRef);
  public Boolean hasScaleTargetRef();
  public V2beta2HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> withNewScaleTargetRef();
  public V2beta2HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> withNewScaleTargetRefLike(V2beta2CrossVersionObjectReference item);
  public V2beta2HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> editScaleTargetRef();
  public V2beta2HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> editOrNewScaleTargetRef();
  public V2beta2HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> editOrNewScaleTargetRefLike(V2beta2CrossVersionObjectReference item);
  public interface BehaviorNested<N> extends Nested<N>,V2beta2HorizontalPodAutoscalerBehaviorFluent<V2beta2HorizontalPodAutoscalerSpecFluent.BehaviorNested<N>>{
    public N and();
    public N endBehavior();
    
  }
  public interface MetricsNested<N> extends Nested<N>,V2beta2MetricSpecFluent<V2beta2HorizontalPodAutoscalerSpecFluent.MetricsNested<N>>{
    public N and();
    public N endMetric();
    
  }
  public interface ScaleTargetRefNested<N> extends Nested<N>,V2beta2CrossVersionObjectReferenceFluent<V2beta2HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<N>>{
    public N and();
    public N endScaleTargetRef();
    
  }
  
}
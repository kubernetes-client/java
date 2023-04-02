package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V2HorizontalPodAutoscalerBehaviorFluent<A extends V2HorizontalPodAutoscalerBehaviorFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildScaleDown instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2HPAScalingRules getScaleDown();
  public V2HPAScalingRules buildScaleDown();
  public A withScaleDown(V2HPAScalingRules scaleDown);
  public Boolean hasScaleDown();
  public V2HorizontalPodAutoscalerBehaviorFluent.ScaleDownNested<A> withNewScaleDown();
  public V2HorizontalPodAutoscalerBehaviorFluent.ScaleDownNested<A> withNewScaleDownLike(V2HPAScalingRules item);
  public V2HorizontalPodAutoscalerBehaviorFluent.ScaleDownNested<A> editScaleDown();
  public V2HorizontalPodAutoscalerBehaviorFluent.ScaleDownNested<A> editOrNewScaleDown();
  public V2HorizontalPodAutoscalerBehaviorFluent.ScaleDownNested<A> editOrNewScaleDownLike(V2HPAScalingRules item);
  
  /**
   * This method has been deprecated, please use method buildScaleUp instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2HPAScalingRules getScaleUp();
  public V2HPAScalingRules buildScaleUp();
  public A withScaleUp(V2HPAScalingRules scaleUp);
  public Boolean hasScaleUp();
  public V2HorizontalPodAutoscalerBehaviorFluent.ScaleUpNested<A> withNewScaleUp();
  public V2HorizontalPodAutoscalerBehaviorFluent.ScaleUpNested<A> withNewScaleUpLike(V2HPAScalingRules item);
  public V2HorizontalPodAutoscalerBehaviorFluent.ScaleUpNested<A> editScaleUp();
  public V2HorizontalPodAutoscalerBehaviorFluent.ScaleUpNested<A> editOrNewScaleUp();
  public V2HorizontalPodAutoscalerBehaviorFluent.ScaleUpNested<A> editOrNewScaleUpLike(V2HPAScalingRules item);
  public interface ScaleDownNested<N> extends Nested<N>,V2HPAScalingRulesFluent<V2HorizontalPodAutoscalerBehaviorFluent.ScaleDownNested<N>>{
    public N and();
    public N endScaleDown();
    
  }
  public interface ScaleUpNested<N> extends Nested<N>,V2HPAScalingRulesFluent<V2HorizontalPodAutoscalerBehaviorFluent.ScaleUpNested<N>>{
    public N and();
    public N endScaleUp();
    
  }
  
}
package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V2beta2HorizontalPodAutoscalerBehaviorFluent<A extends V2beta2HorizontalPodAutoscalerBehaviorFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildScaleDown instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2beta2HPAScalingRules getScaleDown();
  public V2beta2HPAScalingRules buildScaleDown();
  public A withScaleDown(V2beta2HPAScalingRules scaleDown);
  public Boolean hasScaleDown();
  public V2beta2HorizontalPodAutoscalerBehaviorFluent.ScaleDownNested<A> withNewScaleDown();
  public V2beta2HorizontalPodAutoscalerBehaviorFluent.ScaleDownNested<A> withNewScaleDownLike(V2beta2HPAScalingRules item);
  public V2beta2HorizontalPodAutoscalerBehaviorFluent.ScaleDownNested<A> editScaleDown();
  public V2beta2HorizontalPodAutoscalerBehaviorFluent.ScaleDownNested<A> editOrNewScaleDown();
  public V2beta2HorizontalPodAutoscalerBehaviorFluent.ScaleDownNested<A> editOrNewScaleDownLike(V2beta2HPAScalingRules item);
  
  /**
   * This method has been deprecated, please use method buildScaleUp instead.
   * @return The buildable object.
   */
  @Deprecated
  public V2beta2HPAScalingRules getScaleUp();
  public V2beta2HPAScalingRules buildScaleUp();
  public A withScaleUp(V2beta2HPAScalingRules scaleUp);
  public Boolean hasScaleUp();
  public V2beta2HorizontalPodAutoscalerBehaviorFluent.ScaleUpNested<A> withNewScaleUp();
  public V2beta2HorizontalPodAutoscalerBehaviorFluent.ScaleUpNested<A> withNewScaleUpLike(V2beta2HPAScalingRules item);
  public V2beta2HorizontalPodAutoscalerBehaviorFluent.ScaleUpNested<A> editScaleUp();
  public V2beta2HorizontalPodAutoscalerBehaviorFluent.ScaleUpNested<A> editOrNewScaleUp();
  public V2beta2HorizontalPodAutoscalerBehaviorFluent.ScaleUpNested<A> editOrNewScaleUpLike(V2beta2HPAScalingRules item);
  public interface ScaleDownNested<N> extends Nested<N>,V2beta2HPAScalingRulesFluent<V2beta2HorizontalPodAutoscalerBehaviorFluent.ScaleDownNested<N>>{
    public N and();
    public N endScaleDown();
    
  }
  public interface ScaleUpNested<N> extends Nested<N>,V2beta2HPAScalingRulesFluent<V2beta2HorizontalPodAutoscalerBehaviorFluent.ScaleUpNested<N>>{
    public N and();
    public N endScaleUp();
    
  }
  
}
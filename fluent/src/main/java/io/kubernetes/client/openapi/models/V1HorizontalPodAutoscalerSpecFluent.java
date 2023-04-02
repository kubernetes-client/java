package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1HorizontalPodAutoscalerSpecFluent<A extends V1HorizontalPodAutoscalerSpecFluent<A>> extends Fluent<A>{
  public Integer getMaxReplicas();
  public A withMaxReplicas(Integer maxReplicas);
  public Boolean hasMaxReplicas();
  public Integer getMinReplicas();
  public A withMinReplicas(Integer minReplicas);
  public Boolean hasMinReplicas();
  
  /**
   * This method has been deprecated, please use method buildScaleTargetRef instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1CrossVersionObjectReference getScaleTargetRef();
  public V1CrossVersionObjectReference buildScaleTargetRef();
  public A withScaleTargetRef(V1CrossVersionObjectReference scaleTargetRef);
  public Boolean hasScaleTargetRef();
  public V1HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> withNewScaleTargetRef();
  public V1HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> withNewScaleTargetRefLike(V1CrossVersionObjectReference item);
  public V1HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> editScaleTargetRef();
  public V1HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> editOrNewScaleTargetRef();
  public V1HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> editOrNewScaleTargetRefLike(V1CrossVersionObjectReference item);
  public Integer getTargetCPUUtilizationPercentage();
  public A withTargetCPUUtilizationPercentage(Integer targetCPUUtilizationPercentage);
  public Boolean hasTargetCPUUtilizationPercentage();
  public interface ScaleTargetRefNested<N> extends Nested<N>,V1CrossVersionObjectReferenceFluent<V1HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<N>>{
    public N and();
    public N endScaleTargetRef();
    
  }
  
}
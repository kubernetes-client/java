package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1HorizontalPodAutoscalerSpecFluentImpl<A extends V1HorizontalPodAutoscalerSpecFluent<A>> extends BaseFluent<A> implements V1HorizontalPodAutoscalerSpecFluent<A>{
  public V1HorizontalPodAutoscalerSpecFluentImpl() {
  }
  public V1HorizontalPodAutoscalerSpecFluentImpl(V1HorizontalPodAutoscalerSpec instance) {
    this.withMaxReplicas(instance.getMaxReplicas());

    this.withMinReplicas(instance.getMinReplicas());

    this.withScaleTargetRef(instance.getScaleTargetRef());

    this.withTargetCPUUtilizationPercentage(instance.getTargetCPUUtilizationPercentage());

  }
  private Integer maxReplicas;
  private Integer minReplicas;
  private V1CrossVersionObjectReferenceBuilder scaleTargetRef;
  private Integer targetCPUUtilizationPercentage;
  public Integer getMaxReplicas() {
    return this.maxReplicas;
  }
  public A withMaxReplicas(Integer maxReplicas) {
    this.maxReplicas=maxReplicas; return (A) this;
  }
  public Boolean hasMaxReplicas() {
    return this.maxReplicas != null;
  }
  public Integer getMinReplicas() {
    return this.minReplicas;
  }
  public A withMinReplicas(Integer minReplicas) {
    this.minReplicas=minReplicas; return (A) this;
  }
  public Boolean hasMinReplicas() {
    return this.minReplicas != null;
  }
  
  /**
   * This method has been deprecated, please use method buildScaleTargetRef instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1CrossVersionObjectReference getScaleTargetRef() {
    return this.scaleTargetRef!=null ?this.scaleTargetRef.build():null;
  }
  public V1CrossVersionObjectReference buildScaleTargetRef() {
    return this.scaleTargetRef!=null ?this.scaleTargetRef.build():null;
  }
  public A withScaleTargetRef(V1CrossVersionObjectReference scaleTargetRef) {
    _visitables.get("scaleTargetRef").remove(this.scaleTargetRef);
    if (scaleTargetRef!=null){ this.scaleTargetRef= new V1CrossVersionObjectReferenceBuilder(scaleTargetRef); _visitables.get("scaleTargetRef").add(this.scaleTargetRef);} else { this.scaleTargetRef = null; _visitables.get("scaleTargetRef").remove(this.scaleTargetRef); } return (A) this;
  }
  public Boolean hasScaleTargetRef() {
    return this.scaleTargetRef != null;
  }
  public V1HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> withNewScaleTargetRef() {
    return new V1HorizontalPodAutoscalerSpecFluentImpl.ScaleTargetRefNestedImpl();
  }
  public V1HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> withNewScaleTargetRefLike(V1CrossVersionObjectReference item) {
    return new V1HorizontalPodAutoscalerSpecFluentImpl.ScaleTargetRefNestedImpl(item);
  }
  public V1HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> editScaleTargetRef() {
    return withNewScaleTargetRefLike(getScaleTargetRef());
  }
  public V1HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> editOrNewScaleTargetRef() {
    return withNewScaleTargetRefLike(getScaleTargetRef() != null ? getScaleTargetRef(): new V1CrossVersionObjectReferenceBuilder().build());
  }
  public V1HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> editOrNewScaleTargetRefLike(V1CrossVersionObjectReference item) {
    return withNewScaleTargetRefLike(getScaleTargetRef() != null ? getScaleTargetRef(): item);
  }
  public Integer getTargetCPUUtilizationPercentage() {
    return this.targetCPUUtilizationPercentage;
  }
  public A withTargetCPUUtilizationPercentage(Integer targetCPUUtilizationPercentage) {
    this.targetCPUUtilizationPercentage=targetCPUUtilizationPercentage; return (A) this;
  }
  public Boolean hasTargetCPUUtilizationPercentage() {
    return this.targetCPUUtilizationPercentage != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1HorizontalPodAutoscalerSpecFluentImpl that = (V1HorizontalPodAutoscalerSpecFluentImpl) o;
    if (maxReplicas != null ? !maxReplicas.equals(that.maxReplicas) :that.maxReplicas != null) return false;
    if (minReplicas != null ? !minReplicas.equals(that.minReplicas) :that.minReplicas != null) return false;
    if (scaleTargetRef != null ? !scaleTargetRef.equals(that.scaleTargetRef) :that.scaleTargetRef != null) return false;
    if (targetCPUUtilizationPercentage != null ? !targetCPUUtilizationPercentage.equals(that.targetCPUUtilizationPercentage) :that.targetCPUUtilizationPercentage != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(maxReplicas,  minReplicas,  scaleTargetRef,  targetCPUUtilizationPercentage,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (maxReplicas != null) { sb.append("maxReplicas:"); sb.append(maxReplicas + ","); }
    if (minReplicas != null) { sb.append("minReplicas:"); sb.append(minReplicas + ","); }
    if (scaleTargetRef != null) { sb.append("scaleTargetRef:"); sb.append(scaleTargetRef + ","); }
    if (targetCPUUtilizationPercentage != null) { sb.append("targetCPUUtilizationPercentage:"); sb.append(targetCPUUtilizationPercentage); }
    sb.append("}");
    return sb.toString();
  }
  class ScaleTargetRefNestedImpl<N> extends V1CrossVersionObjectReferenceFluentImpl<V1HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<N>> implements V1HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<N>,Nested<N>{
    ScaleTargetRefNestedImpl(V1CrossVersionObjectReference item) {
      this.builder = new V1CrossVersionObjectReferenceBuilder(this, item);
    }
    ScaleTargetRefNestedImpl() {
      this.builder = new V1CrossVersionObjectReferenceBuilder(this);
    }
    V1CrossVersionObjectReferenceBuilder builder;
    public N and() {
      return (N) V1HorizontalPodAutoscalerSpecFluentImpl.this.withScaleTargetRef(builder.build());
    }
    public N endScaleTargetRef() {
      return and();
    }
    
  }
  
}
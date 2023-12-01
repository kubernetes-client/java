package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Integer;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1HorizontalPodAutoscalerSpecFluent<A extends V1HorizontalPodAutoscalerSpecFluent<A>> extends BaseFluent<A>{
  public V1HorizontalPodAutoscalerSpecFluent() {
  }
  
  public V1HorizontalPodAutoscalerSpecFluent(V1HorizontalPodAutoscalerSpec instance) {
    this.copyInstance(instance);
  }
  private Integer maxReplicas;
  private Integer minReplicas;
  private V1CrossVersionObjectReferenceBuilder scaleTargetRef;
  private Integer targetCPUUtilizationPercentage;
  
  protected void copyInstance(V1HorizontalPodAutoscalerSpec instance) {
    instance = (instance != null ? instance : new V1HorizontalPodAutoscalerSpec());
    if (instance != null) {
          this.withMaxReplicas(instance.getMaxReplicas());
          this.withMinReplicas(instance.getMinReplicas());
          this.withScaleTargetRef(instance.getScaleTargetRef());
          this.withTargetCPUUtilizationPercentage(instance.getTargetCPUUtilizationPercentage());
        }
  }
  
  public Integer getMaxReplicas() {
    return this.maxReplicas;
  }
  
  public A withMaxReplicas(Integer maxReplicas) {
    this.maxReplicas = maxReplicas;
    return (A) this;
  }
  
  public boolean hasMaxReplicas() {
    return this.maxReplicas != null;
  }
  
  public Integer getMinReplicas() {
    return this.minReplicas;
  }
  
  public A withMinReplicas(Integer minReplicas) {
    this.minReplicas = minReplicas;
    return (A) this;
  }
  
  public boolean hasMinReplicas() {
    return this.minReplicas != null;
  }
  
  public V1CrossVersionObjectReference buildScaleTargetRef() {
    return this.scaleTargetRef != null ? this.scaleTargetRef.build() : null;
  }
  
  public A withScaleTargetRef(V1CrossVersionObjectReference scaleTargetRef) {
    this._visitables.remove("scaleTargetRef");
    if (scaleTargetRef != null) {
        this.scaleTargetRef = new V1CrossVersionObjectReferenceBuilder(scaleTargetRef);
        this._visitables.get("scaleTargetRef").add(this.scaleTargetRef);
    } else {
        this.scaleTargetRef = null;
        this._visitables.get("scaleTargetRef").remove(this.scaleTargetRef);
    }
    return (A) this;
  }
  
  public boolean hasScaleTargetRef() {
    return this.scaleTargetRef != null;
  }
  
  public ScaleTargetRefNested<A> withNewScaleTargetRef() {
    return new ScaleTargetRefNested(null);
  }
  
  public ScaleTargetRefNested<A> withNewScaleTargetRefLike(V1CrossVersionObjectReference item) {
    return new ScaleTargetRefNested(item);
  }
  
  public ScaleTargetRefNested<A> editScaleTargetRef() {
    return withNewScaleTargetRefLike(java.util.Optional.ofNullable(buildScaleTargetRef()).orElse(null));
  }
  
  public ScaleTargetRefNested<A> editOrNewScaleTargetRef() {
    return withNewScaleTargetRefLike(java.util.Optional.ofNullable(buildScaleTargetRef()).orElse(new V1CrossVersionObjectReferenceBuilder().build()));
  }
  
  public ScaleTargetRefNested<A> editOrNewScaleTargetRefLike(V1CrossVersionObjectReference item) {
    return withNewScaleTargetRefLike(java.util.Optional.ofNullable(buildScaleTargetRef()).orElse(item));
  }
  
  public Integer getTargetCPUUtilizationPercentage() {
    return this.targetCPUUtilizationPercentage;
  }
  
  public A withTargetCPUUtilizationPercentage(Integer targetCPUUtilizationPercentage) {
    this.targetCPUUtilizationPercentage = targetCPUUtilizationPercentage;
    return (A) this;
  }
  
  public boolean hasTargetCPUUtilizationPercentage() {
    return this.targetCPUUtilizationPercentage != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1HorizontalPodAutoscalerSpecFluent that = (V1HorizontalPodAutoscalerSpecFluent) o;
    if (!java.util.Objects.equals(maxReplicas, that.maxReplicas)) return false;
    if (!java.util.Objects.equals(minReplicas, that.minReplicas)) return false;
    if (!java.util.Objects.equals(scaleTargetRef, that.scaleTargetRef)) return false;
    if (!java.util.Objects.equals(targetCPUUtilizationPercentage, that.targetCPUUtilizationPercentage)) return false;
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
  public class ScaleTargetRefNested<N> extends V1CrossVersionObjectReferenceFluent<ScaleTargetRefNested<N>> implements Nested<N>{
    ScaleTargetRefNested(V1CrossVersionObjectReference item) {
      this.builder = new V1CrossVersionObjectReferenceBuilder(this, item);
    }
    V1CrossVersionObjectReferenceBuilder builder;
    
    public N and() {
      return (N) V1HorizontalPodAutoscalerSpecFluent.this.withScaleTargetRef(builder.build());
    }
    
    public N endScaleTargetRef() {
      return and();
    }
    
  
  }

}
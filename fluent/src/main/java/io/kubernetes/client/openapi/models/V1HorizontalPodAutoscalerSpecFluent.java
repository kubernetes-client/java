package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1HorizontalPodAutoscalerSpecFluent<A extends io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpecFluent<A>> extends BaseFluent<A>{

  private Integer maxReplicas;
  private Integer minReplicas;
  private V1CrossVersionObjectReferenceBuilder scaleTargetRef;
  private Integer targetCPUUtilizationPercentage;

  public V1HorizontalPodAutoscalerSpecFluent() {
  }
  
  public V1HorizontalPodAutoscalerSpecFluent(V1HorizontalPodAutoscalerSpec instance) {
    this.copyInstance(instance);
  }

  public V1CrossVersionObjectReference buildScaleTargetRef() {
    return this.scaleTargetRef != null ? this.scaleTargetRef.build() : null;
  }
  
  protected void copyInstance(V1HorizontalPodAutoscalerSpec instance) {
    instance = instance != null ? instance : new V1HorizontalPodAutoscalerSpec();
    if (instance != null) {
        this.withMaxReplicas(instance.getMaxReplicas());
        this.withMinReplicas(instance.getMinReplicas());
        this.withScaleTargetRef(instance.getScaleTargetRef());
        this.withTargetCPUUtilizationPercentage(instance.getTargetCPUUtilizationPercentage());
    }
  }
  
  public ScaleTargetRefNested<A> editOrNewScaleTargetRef() {
    return this.withNewScaleTargetRefLike(Optional.ofNullable(this.buildScaleTargetRef()).orElse(new V1CrossVersionObjectReferenceBuilder().build()));
  }
  
  public ScaleTargetRefNested<A> editOrNewScaleTargetRefLike(V1CrossVersionObjectReference item) {
    return this.withNewScaleTargetRefLike(Optional.ofNullable(this.buildScaleTargetRef()).orElse(item));
  }
  
  public ScaleTargetRefNested<A> editScaleTargetRef() {
    return this.withNewScaleTargetRefLike(Optional.ofNullable(this.buildScaleTargetRef()).orElse(null));
  }
  
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }
    if (!(super.equals(o))) {
      return false;
    }
    V1HorizontalPodAutoscalerSpecFluent that = (V1HorizontalPodAutoscalerSpecFluent) o;
    if (!(Objects.equals(maxReplicas, that.maxReplicas))) {
      return false;
    }
    if (!(Objects.equals(minReplicas, that.minReplicas))) {
      return false;
    }
    if (!(Objects.equals(scaleTargetRef, that.scaleTargetRef))) {
      return false;
    }
    if (!(Objects.equals(targetCPUUtilizationPercentage, that.targetCPUUtilizationPercentage))) {
      return false;
    }
    return true;
  }
  
  public Integer getMaxReplicas() {
    return this.maxReplicas;
  }
  
  public Integer getMinReplicas() {
    return this.minReplicas;
  }
  
  public Integer getTargetCPUUtilizationPercentage() {
    return this.targetCPUUtilizationPercentage;
  }
  
  public boolean hasMaxReplicas() {
    return this.maxReplicas != null;
  }
  
  public boolean hasMinReplicas() {
    return this.minReplicas != null;
  }
  
  public boolean hasScaleTargetRef() {
    return this.scaleTargetRef != null;
  }
  
  public boolean hasTargetCPUUtilizationPercentage() {
    return this.targetCPUUtilizationPercentage != null;
  }
  
  public int hashCode() {
    return Objects.hash(maxReplicas, minReplicas, scaleTargetRef, targetCPUUtilizationPercentage);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(maxReplicas == null)) {
        sb.append("maxReplicas:");
        sb.append(maxReplicas);
        sb.append(",");
    }
    if (!(minReplicas == null)) {
        sb.append("minReplicas:");
        sb.append(minReplicas);
        sb.append(",");
    }
    if (!(scaleTargetRef == null)) {
        sb.append("scaleTargetRef:");
        sb.append(scaleTargetRef);
        sb.append(",");
    }
    if (!(targetCPUUtilizationPercentage == null)) {
        sb.append("targetCPUUtilizationPercentage:");
        sb.append(targetCPUUtilizationPercentage);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withMaxReplicas(Integer maxReplicas) {
    this.maxReplicas = maxReplicas;
    return (A) this;
  }
  
  public A withMinReplicas(Integer minReplicas) {
    this.minReplicas = minReplicas;
    return (A) this;
  }
  
  public ScaleTargetRefNested<A> withNewScaleTargetRef() {
    return new ScaleTargetRefNested(null);
  }
  
  public ScaleTargetRefNested<A> withNewScaleTargetRefLike(V1CrossVersionObjectReference item) {
    return new ScaleTargetRefNested(item);
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
  
  public A withTargetCPUUtilizationPercentage(Integer targetCPUUtilizationPercentage) {
    this.targetCPUUtilizationPercentage = targetCPUUtilizationPercentage;
    return (A) this;
  }
  public class ScaleTargetRefNested<N> extends V1CrossVersionObjectReferenceFluent<ScaleTargetRefNested<N>> implements Nested<N>{
  
    V1CrossVersionObjectReferenceBuilder builder;
  
    ScaleTargetRefNested(V1CrossVersionObjectReference item) {
      this.builder = new V1CrossVersionObjectReferenceBuilder(this, item);
    }
  
    public N and() {
      return (N) V1HorizontalPodAutoscalerSpecFluent.this.withScaleTargetRef(builder.build());
    }
    
    public N endScaleTargetRef() {
      return and();
    }
    
  }
}
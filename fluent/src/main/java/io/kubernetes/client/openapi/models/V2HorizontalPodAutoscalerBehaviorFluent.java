package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V2HorizontalPodAutoscalerBehaviorFluent<A extends V2HorizontalPodAutoscalerBehaviorFluent<A>> extends BaseFluent<A>{
  public V2HorizontalPodAutoscalerBehaviorFluent() {
  }
  
  public V2HorizontalPodAutoscalerBehaviorFluent(V2HorizontalPodAutoscalerBehavior instance) {
    this.copyInstance(instance);
  }
  private V2HPAScalingRulesBuilder scaleDown;
  private V2HPAScalingRulesBuilder scaleUp;
  
  protected void copyInstance(V2HorizontalPodAutoscalerBehavior instance) {
    instance = (instance != null ? instance : new V2HorizontalPodAutoscalerBehavior());
    if (instance != null) {
          this.withScaleDown(instance.getScaleDown());
          this.withScaleUp(instance.getScaleUp());
        }
  }
  
  public V2HPAScalingRules buildScaleDown() {
    return this.scaleDown != null ? this.scaleDown.build() : null;
  }
  
  public A withScaleDown(V2HPAScalingRules scaleDown) {
    this._visitables.remove("scaleDown");
    if (scaleDown != null) {
        this.scaleDown = new V2HPAScalingRulesBuilder(scaleDown);
        this._visitables.get("scaleDown").add(this.scaleDown);
    } else {
        this.scaleDown = null;
        this._visitables.get("scaleDown").remove(this.scaleDown);
    }
    return (A) this;
  }
  
  public boolean hasScaleDown() {
    return this.scaleDown != null;
  }
  
  public ScaleDownNested<A> withNewScaleDown() {
    return new ScaleDownNested(null);
  }
  
  public ScaleDownNested<A> withNewScaleDownLike(V2HPAScalingRules item) {
    return new ScaleDownNested(item);
  }
  
  public ScaleDownNested<A> editScaleDown() {
    return withNewScaleDownLike(java.util.Optional.ofNullable(buildScaleDown()).orElse(null));
  }
  
  public ScaleDownNested<A> editOrNewScaleDown() {
    return withNewScaleDownLike(java.util.Optional.ofNullable(buildScaleDown()).orElse(new V2HPAScalingRulesBuilder().build()));
  }
  
  public ScaleDownNested<A> editOrNewScaleDownLike(V2HPAScalingRules item) {
    return withNewScaleDownLike(java.util.Optional.ofNullable(buildScaleDown()).orElse(item));
  }
  
  public V2HPAScalingRules buildScaleUp() {
    return this.scaleUp != null ? this.scaleUp.build() : null;
  }
  
  public A withScaleUp(V2HPAScalingRules scaleUp) {
    this._visitables.remove("scaleUp");
    if (scaleUp != null) {
        this.scaleUp = new V2HPAScalingRulesBuilder(scaleUp);
        this._visitables.get("scaleUp").add(this.scaleUp);
    } else {
        this.scaleUp = null;
        this._visitables.get("scaleUp").remove(this.scaleUp);
    }
    return (A) this;
  }
  
  public boolean hasScaleUp() {
    return this.scaleUp != null;
  }
  
  public ScaleUpNested<A> withNewScaleUp() {
    return new ScaleUpNested(null);
  }
  
  public ScaleUpNested<A> withNewScaleUpLike(V2HPAScalingRules item) {
    return new ScaleUpNested(item);
  }
  
  public ScaleUpNested<A> editScaleUp() {
    return withNewScaleUpLike(java.util.Optional.ofNullable(buildScaleUp()).orElse(null));
  }
  
  public ScaleUpNested<A> editOrNewScaleUp() {
    return withNewScaleUpLike(java.util.Optional.ofNullable(buildScaleUp()).orElse(new V2HPAScalingRulesBuilder().build()));
  }
  
  public ScaleUpNested<A> editOrNewScaleUpLike(V2HPAScalingRules item) {
    return withNewScaleUpLike(java.util.Optional.ofNullable(buildScaleUp()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V2HorizontalPodAutoscalerBehaviorFluent that = (V2HorizontalPodAutoscalerBehaviorFluent) o;
    if (!java.util.Objects.equals(scaleDown, that.scaleDown)) return false;
    if (!java.util.Objects.equals(scaleUp, that.scaleUp)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(scaleDown,  scaleUp,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (scaleDown != null) { sb.append("scaleDown:"); sb.append(scaleDown + ","); }
    if (scaleUp != null) { sb.append("scaleUp:"); sb.append(scaleUp); }
    sb.append("}");
    return sb.toString();
  }
  public class ScaleDownNested<N> extends V2HPAScalingRulesFluent<ScaleDownNested<N>> implements Nested<N>{
    ScaleDownNested(V2HPAScalingRules item) {
      this.builder = new V2HPAScalingRulesBuilder(this, item);
    }
    V2HPAScalingRulesBuilder builder;
    
    public N and() {
      return (N) V2HorizontalPodAutoscalerBehaviorFluent.this.withScaleDown(builder.build());
    }
    
    public N endScaleDown() {
      return and();
    }
    
  
  }
  public class ScaleUpNested<N> extends V2HPAScalingRulesFluent<ScaleUpNested<N>> implements Nested<N>{
    ScaleUpNested(V2HPAScalingRules item) {
      this.builder = new V2HPAScalingRulesBuilder(this, item);
    }
    V2HPAScalingRulesBuilder builder;
    
    public N and() {
      return (N) V2HorizontalPodAutoscalerBehaviorFluent.this.withScaleUp(builder.build());
    }
    
    public N endScaleUp() {
      return and();
    }
    
  
  }

}
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
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
public class V2HorizontalPodAutoscalerBehaviorFluent<A extends io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerBehaviorFluent<A>> extends BaseFluent<A>{

  private V2HPAScalingRulesBuilder scaleDown;
  private V2HPAScalingRulesBuilder scaleUp;

  public V2HorizontalPodAutoscalerBehaviorFluent() {
  }
  
  public V2HorizontalPodAutoscalerBehaviorFluent(V2HorizontalPodAutoscalerBehavior instance) {
    this.copyInstance(instance);
  }

  public V2HPAScalingRules buildScaleDown() {
    return this.scaleDown != null ? this.scaleDown.build() : null;
  }
  
  public V2HPAScalingRules buildScaleUp() {
    return this.scaleUp != null ? this.scaleUp.build() : null;
  }
  
  protected void copyInstance(V2HorizontalPodAutoscalerBehavior instance) {
    instance = instance != null ? instance : new V2HorizontalPodAutoscalerBehavior();
    if (instance != null) {
        this.withScaleDown(instance.getScaleDown());
        this.withScaleUp(instance.getScaleUp());
    }
  }
  
  public ScaleDownNested<A> editOrNewScaleDown() {
    return this.withNewScaleDownLike(Optional.ofNullable(this.buildScaleDown()).orElse(new V2HPAScalingRulesBuilder().build()));
  }
  
  public ScaleDownNested<A> editOrNewScaleDownLike(V2HPAScalingRules item) {
    return this.withNewScaleDownLike(Optional.ofNullable(this.buildScaleDown()).orElse(item));
  }
  
  public ScaleUpNested<A> editOrNewScaleUp() {
    return this.withNewScaleUpLike(Optional.ofNullable(this.buildScaleUp()).orElse(new V2HPAScalingRulesBuilder().build()));
  }
  
  public ScaleUpNested<A> editOrNewScaleUpLike(V2HPAScalingRules item) {
    return this.withNewScaleUpLike(Optional.ofNullable(this.buildScaleUp()).orElse(item));
  }
  
  public ScaleDownNested<A> editScaleDown() {
    return this.withNewScaleDownLike(Optional.ofNullable(this.buildScaleDown()).orElse(null));
  }
  
  public ScaleUpNested<A> editScaleUp() {
    return this.withNewScaleUpLike(Optional.ofNullable(this.buildScaleUp()).orElse(null));
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
    V2HorizontalPodAutoscalerBehaviorFluent that = (V2HorizontalPodAutoscalerBehaviorFluent) o;
    if (!(Objects.equals(scaleDown, that.scaleDown))) {
      return false;
    }
    if (!(Objects.equals(scaleUp, that.scaleUp))) {
      return false;
    }
    return true;
  }
  
  public boolean hasScaleDown() {
    return this.scaleDown != null;
  }
  
  public boolean hasScaleUp() {
    return this.scaleUp != null;
  }
  
  public int hashCode() {
    return Objects.hash(scaleDown, scaleUp);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(scaleDown == null)) {
        sb.append("scaleDown:");
        sb.append(scaleDown);
        sb.append(",");
    }
    if (!(scaleUp == null)) {
        sb.append("scaleUp:");
        sb.append(scaleUp);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public ScaleDownNested<A> withNewScaleDown() {
    return new ScaleDownNested(null);
  }
  
  public ScaleDownNested<A> withNewScaleDownLike(V2HPAScalingRules item) {
    return new ScaleDownNested(item);
  }
  
  public ScaleUpNested<A> withNewScaleUp() {
    return new ScaleUpNested(null);
  }
  
  public ScaleUpNested<A> withNewScaleUpLike(V2HPAScalingRules item) {
    return new ScaleUpNested(item);
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
  public class ScaleDownNested<N> extends V2HPAScalingRulesFluent<ScaleDownNested<N>> implements Nested<N>{
  
    V2HPAScalingRulesBuilder builder;
  
    ScaleDownNested(V2HPAScalingRules item) {
      this.builder = new V2HPAScalingRulesBuilder(this, item);
    }
  
    public N and() {
      return (N) V2HorizontalPodAutoscalerBehaviorFluent.this.withScaleDown(builder.build());
    }
    
    public N endScaleDown() {
      return and();
    }
    
  }
  public class ScaleUpNested<N> extends V2HPAScalingRulesFluent<ScaleUpNested<N>> implements Nested<N>{
  
    V2HPAScalingRulesBuilder builder;
  
    ScaleUpNested(V2HPAScalingRules item) {
      this.builder = new V2HPAScalingRulesBuilder(this, item);
    }
  
    public N and() {
      return (N) V2HorizontalPodAutoscalerBehaviorFluent.this.withScaleUp(builder.build());
    }
    
    public N endScaleUp() {
      return and();
    }
    
  }
}
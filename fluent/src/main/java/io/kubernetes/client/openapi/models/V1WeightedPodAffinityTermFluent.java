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
public class V1WeightedPodAffinityTermFluent<A extends V1WeightedPodAffinityTermFluent<A>> extends BaseFluent<A>{
  public V1WeightedPodAffinityTermFluent() {
  }
  
  public V1WeightedPodAffinityTermFluent(V1WeightedPodAffinityTerm instance) {
    this.copyInstance(instance);
  }
  private V1PodAffinityTermBuilder podAffinityTerm;
  private Integer weight;
  
  protected void copyInstance(V1WeightedPodAffinityTerm instance) {
    instance = (instance != null ? instance : new V1WeightedPodAffinityTerm());
    if (instance != null) {
          this.withPodAffinityTerm(instance.getPodAffinityTerm());
          this.withWeight(instance.getWeight());
        }
  }
  
  public V1PodAffinityTerm buildPodAffinityTerm() {
    return this.podAffinityTerm != null ? this.podAffinityTerm.build() : null;
  }
  
  public A withPodAffinityTerm(V1PodAffinityTerm podAffinityTerm) {
    this._visitables.remove("podAffinityTerm");
    if (podAffinityTerm != null) {
        this.podAffinityTerm = new V1PodAffinityTermBuilder(podAffinityTerm);
        this._visitables.get("podAffinityTerm").add(this.podAffinityTerm);
    } else {
        this.podAffinityTerm = null;
        this._visitables.get("podAffinityTerm").remove(this.podAffinityTerm);
    }
    return (A) this;
  }
  
  public boolean hasPodAffinityTerm() {
    return this.podAffinityTerm != null;
  }
  
  public PodAffinityTermNested<A> withNewPodAffinityTerm() {
    return new PodAffinityTermNested(null);
  }
  
  public PodAffinityTermNested<A> withNewPodAffinityTermLike(V1PodAffinityTerm item) {
    return new PodAffinityTermNested(item);
  }
  
  public PodAffinityTermNested<A> editPodAffinityTerm() {
    return withNewPodAffinityTermLike(java.util.Optional.ofNullable(buildPodAffinityTerm()).orElse(null));
  }
  
  public PodAffinityTermNested<A> editOrNewPodAffinityTerm() {
    return withNewPodAffinityTermLike(java.util.Optional.ofNullable(buildPodAffinityTerm()).orElse(new V1PodAffinityTermBuilder().build()));
  }
  
  public PodAffinityTermNested<A> editOrNewPodAffinityTermLike(V1PodAffinityTerm item) {
    return withNewPodAffinityTermLike(java.util.Optional.ofNullable(buildPodAffinityTerm()).orElse(item));
  }
  
  public Integer getWeight() {
    return this.weight;
  }
  
  public A withWeight(Integer weight) {
    this.weight = weight;
    return (A) this;
  }
  
  public boolean hasWeight() {
    return this.weight != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1WeightedPodAffinityTermFluent that = (V1WeightedPodAffinityTermFluent) o;
    if (!java.util.Objects.equals(podAffinityTerm, that.podAffinityTerm)) return false;
    if (!java.util.Objects.equals(weight, that.weight)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(podAffinityTerm,  weight,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (podAffinityTerm != null) { sb.append("podAffinityTerm:"); sb.append(podAffinityTerm + ","); }
    if (weight != null) { sb.append("weight:"); sb.append(weight); }
    sb.append("}");
    return sb.toString();
  }
  public class PodAffinityTermNested<N> extends V1PodAffinityTermFluent<PodAffinityTermNested<N>> implements Nested<N>{
    PodAffinityTermNested(V1PodAffinityTerm item) {
      this.builder = new V1PodAffinityTermBuilder(this, item);
    }
    V1PodAffinityTermBuilder builder;
    
    public N and() {
      return (N) V1WeightedPodAffinityTermFluent.this.withPodAffinityTerm(builder.build());
    }
    
    public N endPodAffinityTerm() {
      return and();
    }
    
  
  }

}
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
public class V1WeightedPodAffinityTermFluent<A extends io.kubernetes.client.openapi.models.V1WeightedPodAffinityTermFluent<A>> extends BaseFluent<A>{

  private V1PodAffinityTermBuilder podAffinityTerm;
  private Integer weight;

  public V1WeightedPodAffinityTermFluent() {
  }
  
  public V1WeightedPodAffinityTermFluent(V1WeightedPodAffinityTerm instance) {
    this.copyInstance(instance);
  }

  public V1PodAffinityTerm buildPodAffinityTerm() {
    return this.podAffinityTerm != null ? this.podAffinityTerm.build() : null;
  }
  
  protected void copyInstance(V1WeightedPodAffinityTerm instance) {
    instance = instance != null ? instance : new V1WeightedPodAffinityTerm();
    if (instance != null) {
        this.withPodAffinityTerm(instance.getPodAffinityTerm());
        this.withWeight(instance.getWeight());
    }
  }
  
  public PodAffinityTermNested<A> editOrNewPodAffinityTerm() {
    return this.withNewPodAffinityTermLike(Optional.ofNullable(this.buildPodAffinityTerm()).orElse(new V1PodAffinityTermBuilder().build()));
  }
  
  public PodAffinityTermNested<A> editOrNewPodAffinityTermLike(V1PodAffinityTerm item) {
    return this.withNewPodAffinityTermLike(Optional.ofNullable(this.buildPodAffinityTerm()).orElse(item));
  }
  
  public PodAffinityTermNested<A> editPodAffinityTerm() {
    return this.withNewPodAffinityTermLike(Optional.ofNullable(this.buildPodAffinityTerm()).orElse(null));
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
    V1WeightedPodAffinityTermFluent that = (V1WeightedPodAffinityTermFluent) o;
    if (!(Objects.equals(podAffinityTerm, that.podAffinityTerm))) {
      return false;
    }
    if (!(Objects.equals(weight, that.weight))) {
      return false;
    }
    return true;
  }
  
  public Integer getWeight() {
    return this.weight;
  }
  
  public boolean hasPodAffinityTerm() {
    return this.podAffinityTerm != null;
  }
  
  public boolean hasWeight() {
    return this.weight != null;
  }
  
  public int hashCode() {
    return Objects.hash(podAffinityTerm, weight);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(podAffinityTerm == null)) {
        sb.append("podAffinityTerm:");
        sb.append(podAffinityTerm);
        sb.append(",");
    }
    if (!(weight == null)) {
        sb.append("weight:");
        sb.append(weight);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public PodAffinityTermNested<A> withNewPodAffinityTerm() {
    return new PodAffinityTermNested(null);
  }
  
  public PodAffinityTermNested<A> withNewPodAffinityTermLike(V1PodAffinityTerm item) {
    return new PodAffinityTermNested(item);
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
  
  public A withWeight(Integer weight) {
    this.weight = weight;
    return (A) this;
  }
  public class PodAffinityTermNested<N> extends V1PodAffinityTermFluent<PodAffinityTermNested<N>> implements Nested<N>{
  
    V1PodAffinityTermBuilder builder;
  
    PodAffinityTermNested(V1PodAffinityTerm item) {
      this.builder = new V1PodAffinityTermBuilder(this, item);
    }
  
    public N and() {
      return (N) V1WeightedPodAffinityTermFluent.this.withPodAffinityTerm(builder.build());
    }
    
    public N endPodAffinityTerm() {
      return and();
    }
    
  }
}
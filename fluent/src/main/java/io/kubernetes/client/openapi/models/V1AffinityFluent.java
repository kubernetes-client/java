package io.kubernetes.client.openapi.models;

import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Optional;
import java.util.Objects;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1AffinityFluent<A extends io.kubernetes.client.openapi.models.V1AffinityFluent<A>> extends BaseFluent<A>{
  public V1AffinityFluent() {
  }
  
  public V1AffinityFluent(V1Affinity instance) {
    this.copyInstance(instance);
  }
  private V1NodeAffinityBuilder nodeAffinity;
  private V1PodAffinityBuilder podAffinity;
  private V1PodAntiAffinityBuilder podAntiAffinity;
  
  protected void copyInstance(V1Affinity instance) {
    instance = instance != null ? instance : new V1Affinity();
    if (instance != null) {
        this.withNodeAffinity(instance.getNodeAffinity());
        this.withPodAffinity(instance.getPodAffinity());
        this.withPodAntiAffinity(instance.getPodAntiAffinity());
    }
  }
  
  public V1NodeAffinity buildNodeAffinity() {
    return this.nodeAffinity != null ? this.nodeAffinity.build() : null;
  }
  
  public A withNodeAffinity(V1NodeAffinity nodeAffinity) {
    this._visitables.remove("nodeAffinity");
    if (nodeAffinity != null) {
        this.nodeAffinity = new V1NodeAffinityBuilder(nodeAffinity);
        this._visitables.get("nodeAffinity").add(this.nodeAffinity);
    } else {
        this.nodeAffinity = null;
        this._visitables.get("nodeAffinity").remove(this.nodeAffinity);
    }
    return (A) this;
  }
  
  public boolean hasNodeAffinity() {
    return this.nodeAffinity != null;
  }
  
  public NodeAffinityNested<A> withNewNodeAffinity() {
    return new NodeAffinityNested(null);
  }
  
  public NodeAffinityNested<A> withNewNodeAffinityLike(V1NodeAffinity item) {
    return new NodeAffinityNested(item);
  }
  
  public NodeAffinityNested<A> editNodeAffinity() {
    return this.withNewNodeAffinityLike(Optional.ofNullable(this.buildNodeAffinity()).orElse(null));
  }
  
  public NodeAffinityNested<A> editOrNewNodeAffinity() {
    return this.withNewNodeAffinityLike(Optional.ofNullable(this.buildNodeAffinity()).orElse(new V1NodeAffinityBuilder().build()));
  }
  
  public NodeAffinityNested<A> editOrNewNodeAffinityLike(V1NodeAffinity item) {
    return this.withNewNodeAffinityLike(Optional.ofNullable(this.buildNodeAffinity()).orElse(item));
  }
  
  public V1PodAffinity buildPodAffinity() {
    return this.podAffinity != null ? this.podAffinity.build() : null;
  }
  
  public A withPodAffinity(V1PodAffinity podAffinity) {
    this._visitables.remove("podAffinity");
    if (podAffinity != null) {
        this.podAffinity = new V1PodAffinityBuilder(podAffinity);
        this._visitables.get("podAffinity").add(this.podAffinity);
    } else {
        this.podAffinity = null;
        this._visitables.get("podAffinity").remove(this.podAffinity);
    }
    return (A) this;
  }
  
  public boolean hasPodAffinity() {
    return this.podAffinity != null;
  }
  
  public PodAffinityNested<A> withNewPodAffinity() {
    return new PodAffinityNested(null);
  }
  
  public PodAffinityNested<A> withNewPodAffinityLike(V1PodAffinity item) {
    return new PodAffinityNested(item);
  }
  
  public PodAffinityNested<A> editPodAffinity() {
    return this.withNewPodAffinityLike(Optional.ofNullable(this.buildPodAffinity()).orElse(null));
  }
  
  public PodAffinityNested<A> editOrNewPodAffinity() {
    return this.withNewPodAffinityLike(Optional.ofNullable(this.buildPodAffinity()).orElse(new V1PodAffinityBuilder().build()));
  }
  
  public PodAffinityNested<A> editOrNewPodAffinityLike(V1PodAffinity item) {
    return this.withNewPodAffinityLike(Optional.ofNullable(this.buildPodAffinity()).orElse(item));
  }
  
  public V1PodAntiAffinity buildPodAntiAffinity() {
    return this.podAntiAffinity != null ? this.podAntiAffinity.build() : null;
  }
  
  public A withPodAntiAffinity(V1PodAntiAffinity podAntiAffinity) {
    this._visitables.remove("podAntiAffinity");
    if (podAntiAffinity != null) {
        this.podAntiAffinity = new V1PodAntiAffinityBuilder(podAntiAffinity);
        this._visitables.get("podAntiAffinity").add(this.podAntiAffinity);
    } else {
        this.podAntiAffinity = null;
        this._visitables.get("podAntiAffinity").remove(this.podAntiAffinity);
    }
    return (A) this;
  }
  
  public boolean hasPodAntiAffinity() {
    return this.podAntiAffinity != null;
  }
  
  public PodAntiAffinityNested<A> withNewPodAntiAffinity() {
    return new PodAntiAffinityNested(null);
  }
  
  public PodAntiAffinityNested<A> withNewPodAntiAffinityLike(V1PodAntiAffinity item) {
    return new PodAntiAffinityNested(item);
  }
  
  public PodAntiAffinityNested<A> editPodAntiAffinity() {
    return this.withNewPodAntiAffinityLike(Optional.ofNullable(this.buildPodAntiAffinity()).orElse(null));
  }
  
  public PodAntiAffinityNested<A> editOrNewPodAntiAffinity() {
    return this.withNewPodAntiAffinityLike(Optional.ofNullable(this.buildPodAntiAffinity()).orElse(new V1PodAntiAffinityBuilder().build()));
  }
  
  public PodAntiAffinityNested<A> editOrNewPodAntiAffinityLike(V1PodAntiAffinity item) {
    return this.withNewPodAntiAffinityLike(Optional.ofNullable(this.buildPodAntiAffinity()).orElse(item));
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
    V1AffinityFluent that = (V1AffinityFluent) o;
    if (!(Objects.equals(nodeAffinity, that.nodeAffinity))) {
      return false;
    }
    if (!(Objects.equals(podAffinity, that.podAffinity))) {
      return false;
    }
    if (!(Objects.equals(podAntiAffinity, that.podAntiAffinity))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(nodeAffinity, podAffinity, podAntiAffinity);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(nodeAffinity == null)) {
        sb.append("nodeAffinity:");
        sb.append(nodeAffinity);
        sb.append(",");
    }
    if (!(podAffinity == null)) {
        sb.append("podAffinity:");
        sb.append(podAffinity);
        sb.append(",");
    }
    if (!(podAntiAffinity == null)) {
        sb.append("podAntiAffinity:");
        sb.append(podAntiAffinity);
    }
    sb.append("}");
    return sb.toString();
  }
  public class NodeAffinityNested<N> extends V1NodeAffinityFluent<NodeAffinityNested<N>> implements Nested<N>{
    NodeAffinityNested(V1NodeAffinity item) {
      this.builder = new V1NodeAffinityBuilder(this, item);
    }
    V1NodeAffinityBuilder builder;
    
    public N and() {
      return (N) V1AffinityFluent.this.withNodeAffinity(builder.build());
    }
    
    public N endNodeAffinity() {
      return and();
    }
    
  
  }
  public class PodAffinityNested<N> extends V1PodAffinityFluent<PodAffinityNested<N>> implements Nested<N>{
    PodAffinityNested(V1PodAffinity item) {
      this.builder = new V1PodAffinityBuilder(this, item);
    }
    V1PodAffinityBuilder builder;
    
    public N and() {
      return (N) V1AffinityFluent.this.withPodAffinity(builder.build());
    }
    
    public N endPodAffinity() {
      return and();
    }
    
  
  }
  public class PodAntiAffinityNested<N> extends V1PodAntiAffinityFluent<PodAntiAffinityNested<N>> implements Nested<N>{
    PodAntiAffinityNested(V1PodAntiAffinity item) {
      this.builder = new V1PodAntiAffinityBuilder(this, item);
    }
    V1PodAntiAffinityBuilder builder;
    
    public N and() {
      return (N) V1AffinityFluent.this.withPodAntiAffinity(builder.build());
    }
    
    public N endPodAntiAffinity() {
      return and();
    }
    
  
  }

}
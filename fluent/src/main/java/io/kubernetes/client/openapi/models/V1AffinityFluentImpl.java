package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Boolean;
import java.lang.Object;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1AffinityFluentImpl<A extends V1AffinityFluent<A>> extends BaseFluent<A> implements V1AffinityFluent<A>{
  public V1AffinityFluentImpl() {
  }
  public V1AffinityFluentImpl(V1Affinity instance) {
    this.withNodeAffinity(instance.getNodeAffinity());

    this.withPodAffinity(instance.getPodAffinity());

    this.withPodAntiAffinity(instance.getPodAntiAffinity());

  }
  private V1NodeAffinityBuilder nodeAffinity;
  private V1PodAffinityBuilder podAffinity;
  private V1PodAntiAffinityBuilder podAntiAffinity;
  
  /**
   * This method has been deprecated, please use method buildNodeAffinity instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1NodeAffinity getNodeAffinity() {
    return this.nodeAffinity!=null ?this.nodeAffinity.build():null;
  }
  public V1NodeAffinity buildNodeAffinity() {
    return this.nodeAffinity!=null ?this.nodeAffinity.build():null;
  }
  public A withNodeAffinity(V1NodeAffinity nodeAffinity) {
    _visitables.get("nodeAffinity").remove(this.nodeAffinity);
    if (nodeAffinity!=null){ this.nodeAffinity= new V1NodeAffinityBuilder(nodeAffinity); _visitables.get("nodeAffinity").add(this.nodeAffinity);} else { this.nodeAffinity = null; _visitables.get("nodeAffinity").remove(this.nodeAffinity); } return (A) this;
  }
  public Boolean hasNodeAffinity() {
    return this.nodeAffinity != null;
  }
  public V1AffinityFluent.NodeAffinityNested<A> withNewNodeAffinity() {
    return new V1AffinityFluentImpl.NodeAffinityNestedImpl();
  }
  public V1AffinityFluent.NodeAffinityNested<A> withNewNodeAffinityLike(V1NodeAffinity item) {
    return new V1AffinityFluentImpl.NodeAffinityNestedImpl(item);
  }
  public V1AffinityFluent.NodeAffinityNested<A> editNodeAffinity() {
    return withNewNodeAffinityLike(getNodeAffinity());
  }
  public V1AffinityFluent.NodeAffinityNested<A> editOrNewNodeAffinity() {
    return withNewNodeAffinityLike(getNodeAffinity() != null ? getNodeAffinity(): new V1NodeAffinityBuilder().build());
  }
  public V1AffinityFluent.NodeAffinityNested<A> editOrNewNodeAffinityLike(V1NodeAffinity item) {
    return withNewNodeAffinityLike(getNodeAffinity() != null ? getNodeAffinity(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildPodAffinity instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1PodAffinity getPodAffinity() {
    return this.podAffinity!=null ?this.podAffinity.build():null;
  }
  public V1PodAffinity buildPodAffinity() {
    return this.podAffinity!=null ?this.podAffinity.build():null;
  }
  public A withPodAffinity(V1PodAffinity podAffinity) {
    _visitables.get("podAffinity").remove(this.podAffinity);
    if (podAffinity!=null){ this.podAffinity= new V1PodAffinityBuilder(podAffinity); _visitables.get("podAffinity").add(this.podAffinity);} else { this.podAffinity = null; _visitables.get("podAffinity").remove(this.podAffinity); } return (A) this;
  }
  public Boolean hasPodAffinity() {
    return this.podAffinity != null;
  }
  public V1AffinityFluent.PodAffinityNested<A> withNewPodAffinity() {
    return new V1AffinityFluentImpl.PodAffinityNestedImpl();
  }
  public V1AffinityFluent.PodAffinityNested<A> withNewPodAffinityLike(V1PodAffinity item) {
    return new V1AffinityFluentImpl.PodAffinityNestedImpl(item);
  }
  public V1AffinityFluent.PodAffinityNested<A> editPodAffinity() {
    return withNewPodAffinityLike(getPodAffinity());
  }
  public V1AffinityFluent.PodAffinityNested<A> editOrNewPodAffinity() {
    return withNewPodAffinityLike(getPodAffinity() != null ? getPodAffinity(): new V1PodAffinityBuilder().build());
  }
  public V1AffinityFluent.PodAffinityNested<A> editOrNewPodAffinityLike(V1PodAffinity item) {
    return withNewPodAffinityLike(getPodAffinity() != null ? getPodAffinity(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildPodAntiAffinity instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1PodAntiAffinity getPodAntiAffinity() {
    return this.podAntiAffinity!=null ?this.podAntiAffinity.build():null;
  }
  public V1PodAntiAffinity buildPodAntiAffinity() {
    return this.podAntiAffinity!=null ?this.podAntiAffinity.build():null;
  }
  public A withPodAntiAffinity(V1PodAntiAffinity podAntiAffinity) {
    _visitables.get("podAntiAffinity").remove(this.podAntiAffinity);
    if (podAntiAffinity!=null){ this.podAntiAffinity= new V1PodAntiAffinityBuilder(podAntiAffinity); _visitables.get("podAntiAffinity").add(this.podAntiAffinity);} else { this.podAntiAffinity = null; _visitables.get("podAntiAffinity").remove(this.podAntiAffinity); } return (A) this;
  }
  public Boolean hasPodAntiAffinity() {
    return this.podAntiAffinity != null;
  }
  public V1AffinityFluent.PodAntiAffinityNested<A> withNewPodAntiAffinity() {
    return new V1AffinityFluentImpl.PodAntiAffinityNestedImpl();
  }
  public V1AffinityFluent.PodAntiAffinityNested<A> withNewPodAntiAffinityLike(V1PodAntiAffinity item) {
    return new V1AffinityFluentImpl.PodAntiAffinityNestedImpl(item);
  }
  public V1AffinityFluent.PodAntiAffinityNested<A> editPodAntiAffinity() {
    return withNewPodAntiAffinityLike(getPodAntiAffinity());
  }
  public V1AffinityFluent.PodAntiAffinityNested<A> editOrNewPodAntiAffinity() {
    return withNewPodAntiAffinityLike(getPodAntiAffinity() != null ? getPodAntiAffinity(): new V1PodAntiAffinityBuilder().build());
  }
  public V1AffinityFluent.PodAntiAffinityNested<A> editOrNewPodAntiAffinityLike(V1PodAntiAffinity item) {
    return withNewPodAntiAffinityLike(getPodAntiAffinity() != null ? getPodAntiAffinity(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1AffinityFluentImpl that = (V1AffinityFluentImpl) o;
    if (nodeAffinity != null ? !nodeAffinity.equals(that.nodeAffinity) :that.nodeAffinity != null) return false;
    if (podAffinity != null ? !podAffinity.equals(that.podAffinity) :that.podAffinity != null) return false;
    if (podAntiAffinity != null ? !podAntiAffinity.equals(that.podAntiAffinity) :that.podAntiAffinity != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(nodeAffinity,  podAffinity,  podAntiAffinity,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (nodeAffinity != null) { sb.append("nodeAffinity:"); sb.append(nodeAffinity + ","); }
    if (podAffinity != null) { sb.append("podAffinity:"); sb.append(podAffinity + ","); }
    if (podAntiAffinity != null) { sb.append("podAntiAffinity:"); sb.append(podAntiAffinity); }
    sb.append("}");
    return sb.toString();
  }
  class NodeAffinityNestedImpl<N> extends V1NodeAffinityFluentImpl<V1AffinityFluent.NodeAffinityNested<N>> implements V1AffinityFluent.NodeAffinityNested<N>,Nested<N>{
    NodeAffinityNestedImpl(V1NodeAffinity item) {
      this.builder = new V1NodeAffinityBuilder(this, item);
    }
    NodeAffinityNestedImpl() {
      this.builder = new V1NodeAffinityBuilder(this);
    }
    V1NodeAffinityBuilder builder;
    public N and() {
      return (N) V1AffinityFluentImpl.this.withNodeAffinity(builder.build());
    }
    public N endNodeAffinity() {
      return and();
    }
    
  }
  class PodAffinityNestedImpl<N> extends V1PodAffinityFluentImpl<V1AffinityFluent.PodAffinityNested<N>> implements V1AffinityFluent.PodAffinityNested<N>,Nested<N>{
    PodAffinityNestedImpl(V1PodAffinity item) {
      this.builder = new V1PodAffinityBuilder(this, item);
    }
    PodAffinityNestedImpl() {
      this.builder = new V1PodAffinityBuilder(this);
    }
    V1PodAffinityBuilder builder;
    public N and() {
      return (N) V1AffinityFluentImpl.this.withPodAffinity(builder.build());
    }
    public N endPodAffinity() {
      return and();
    }
    
  }
  class PodAntiAffinityNestedImpl<N> extends V1PodAntiAffinityFluentImpl<V1AffinityFluent.PodAntiAffinityNested<N>> implements V1AffinityFluent.PodAntiAffinityNested<N>,Nested<N>{
    PodAntiAffinityNestedImpl(V1PodAntiAffinity item) {
      this.builder = new V1PodAntiAffinityBuilder(this, item);
    }
    PodAntiAffinityNestedImpl() {
      this.builder = new V1PodAntiAffinityBuilder(this);
    }
    V1PodAntiAffinityBuilder builder;
    public N and() {
      return (N) V1AffinityFluentImpl.this.withPodAntiAffinity(builder.build());
    }
    public N endPodAntiAffinity() {
      return and();
    }
    
  }
  
}
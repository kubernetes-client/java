package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1IngressStatusFluentImpl<A extends V1IngressStatusFluent<A>> extends BaseFluent<A> implements V1IngressStatusFluent<A>{
  public V1IngressStatusFluentImpl() {
  }
  public V1IngressStatusFluentImpl(V1IngressStatus instance) {
    this.withLoadBalancer(instance.getLoadBalancer());

  }
  private V1LoadBalancerStatusBuilder loadBalancer;
  
  /**
   * This method has been deprecated, please use method buildLoadBalancer instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1LoadBalancerStatus getLoadBalancer() {
    return this.loadBalancer!=null ?this.loadBalancer.build():null;
  }
  public V1LoadBalancerStatus buildLoadBalancer() {
    return this.loadBalancer!=null ?this.loadBalancer.build():null;
  }
  public A withLoadBalancer(V1LoadBalancerStatus loadBalancer) {
    _visitables.get("loadBalancer").remove(this.loadBalancer);
    if (loadBalancer!=null){ this.loadBalancer= new V1LoadBalancerStatusBuilder(loadBalancer); _visitables.get("loadBalancer").add(this.loadBalancer);} else { this.loadBalancer = null; _visitables.get("loadBalancer").remove(this.loadBalancer); } return (A) this;
  }
  public Boolean hasLoadBalancer() {
    return this.loadBalancer != null;
  }
  public V1IngressStatusFluent.LoadBalancerNested<A> withNewLoadBalancer() {
    return new V1IngressStatusFluentImpl.LoadBalancerNestedImpl();
  }
  public V1IngressStatusFluent.LoadBalancerNested<A> withNewLoadBalancerLike(V1LoadBalancerStatus item) {
    return new V1IngressStatusFluentImpl.LoadBalancerNestedImpl(item);
  }
  public V1IngressStatusFluent.LoadBalancerNested<A> editLoadBalancer() {
    return withNewLoadBalancerLike(getLoadBalancer());
  }
  public V1IngressStatusFluent.LoadBalancerNested<A> editOrNewLoadBalancer() {
    return withNewLoadBalancerLike(getLoadBalancer() != null ? getLoadBalancer(): new V1LoadBalancerStatusBuilder().build());
  }
  public V1IngressStatusFluent.LoadBalancerNested<A> editOrNewLoadBalancerLike(V1LoadBalancerStatus item) {
    return withNewLoadBalancerLike(getLoadBalancer() != null ? getLoadBalancer(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1IngressStatusFluentImpl that = (V1IngressStatusFluentImpl) o;
    if (loadBalancer != null ? !loadBalancer.equals(that.loadBalancer) :that.loadBalancer != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(loadBalancer,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (loadBalancer != null) { sb.append("loadBalancer:"); sb.append(loadBalancer); }
    sb.append("}");
    return sb.toString();
  }
  class LoadBalancerNestedImpl<N> extends V1LoadBalancerStatusFluentImpl<V1IngressStatusFluent.LoadBalancerNested<N>> implements V1IngressStatusFluent.LoadBalancerNested<N>,Nested<N>{
    LoadBalancerNestedImpl(V1LoadBalancerStatus item) {
      this.builder = new V1LoadBalancerStatusBuilder(this, item);
    }
    LoadBalancerNestedImpl() {
      this.builder = new V1LoadBalancerStatusBuilder(this);
    }
    V1LoadBalancerStatusBuilder builder;
    public N and() {
      return (N) V1IngressStatusFluentImpl.this.withLoadBalancer(builder.build());
    }
    public N endLoadBalancer() {
      return and();
    }
    
  }
  
}
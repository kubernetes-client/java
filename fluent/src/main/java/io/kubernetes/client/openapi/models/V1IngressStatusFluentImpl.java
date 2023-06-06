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
    if (instance != null) {
      this.withLoadBalancer(instance.getLoadBalancer());
    }
  }
  private V1IngressLoadBalancerStatusBuilder loadBalancer;
  
  /**
   * This method has been deprecated, please use method buildLoadBalancer instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1IngressLoadBalancerStatus getLoadBalancer() {
    return this.loadBalancer!=null ?this.loadBalancer.build():null;
  }
  public V1IngressLoadBalancerStatus buildLoadBalancer() {
    return this.loadBalancer!=null ?this.loadBalancer.build():null;
  }
  public A withLoadBalancer(V1IngressLoadBalancerStatus loadBalancer) {
    _visitables.get("loadBalancer").remove(this.loadBalancer);
    if (loadBalancer!=null){ this.loadBalancer= new V1IngressLoadBalancerStatusBuilder(loadBalancer); _visitables.get("loadBalancer").add(this.loadBalancer);} else { this.loadBalancer = null; _visitables.get("loadBalancer").remove(this.loadBalancer); } return (A) this;
  }
  public Boolean hasLoadBalancer() {
    return this.loadBalancer != null;
  }
  public V1IngressStatusFluentImpl.LoadBalancerNested<A> withNewLoadBalancer() {
    return new V1IngressStatusFluentImpl.LoadBalancerNestedImpl();
  }
  public V1IngressStatusFluentImpl.LoadBalancerNested<A> withNewLoadBalancerLike(V1IngressLoadBalancerStatus item) {
    return new V1IngressStatusFluentImpl.LoadBalancerNestedImpl(item);
  }
  public V1IngressStatusFluentImpl.LoadBalancerNested<A> editLoadBalancer() {
    return withNewLoadBalancerLike(getLoadBalancer());
  }
  public V1IngressStatusFluentImpl.LoadBalancerNested<A> editOrNewLoadBalancer() {
    return withNewLoadBalancerLike(getLoadBalancer() != null ? getLoadBalancer(): new V1IngressLoadBalancerStatusBuilder().build());
  }
  public V1IngressStatusFluentImpl.LoadBalancerNested<A> editOrNewLoadBalancerLike(V1IngressLoadBalancerStatus item) {
    return withNewLoadBalancerLike(getLoadBalancer() != null ? getLoadBalancer(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1IngressStatusFluentImpl that = (V1IngressStatusFluentImpl) o;
    if (!java.util.Objects.equals(loadBalancer, that.loadBalancer)) return false;

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
  class LoadBalancerNestedImpl<N> extends V1IngressLoadBalancerStatusFluentImpl<V1IngressStatusFluentImpl.LoadBalancerNested<N>> implements V1IngressStatusFluentImpl.LoadBalancerNested<N>,Nested<N>{
    LoadBalancerNestedImpl(V1IngressLoadBalancerStatus item) {
      this.builder = new V1IngressLoadBalancerStatusBuilder(this, item);
    }
    LoadBalancerNestedImpl() {
      this.builder = new V1IngressLoadBalancerStatusBuilder(this);
    }
    V1IngressLoadBalancerStatusBuilder builder;
    public N and() {
      return (N) V1IngressStatusFluentImpl.this.withLoadBalancer(builder.build());
    }
    public N endLoadBalancer() {
      return and();
    }
    
  }
  
}
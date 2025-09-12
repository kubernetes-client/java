package io.kubernetes.client.openapi.models;

import java.lang.StringBuilder;
import java.util.Optional;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Objects;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1IngressStatusFluent<A extends io.kubernetes.client.openapi.models.V1IngressStatusFluent<A>> extends BaseFluent<A>{
  public V1IngressStatusFluent() {
  }
  
  public V1IngressStatusFluent(V1IngressStatus instance) {
    this.copyInstance(instance);
  }
  private V1IngressLoadBalancerStatusBuilder loadBalancer;
  
  protected void copyInstance(V1IngressStatus instance) {
    instance = instance != null ? instance : new V1IngressStatus();
    if (instance != null) {
      this.withLoadBalancer(instance.getLoadBalancer());
    }
  }
  
  public V1IngressLoadBalancerStatus buildLoadBalancer() {
    return this.loadBalancer != null ? this.loadBalancer.build() : null;
  }
  
  public A withLoadBalancer(V1IngressLoadBalancerStatus loadBalancer) {
    this._visitables.remove("loadBalancer");
    if (loadBalancer != null) {
        this.loadBalancer = new V1IngressLoadBalancerStatusBuilder(loadBalancer);
        this._visitables.get("loadBalancer").add(this.loadBalancer);
    } else {
        this.loadBalancer = null;
        this._visitables.get("loadBalancer").remove(this.loadBalancer);
    }
    return (A) this;
  }
  
  public boolean hasLoadBalancer() {
    return this.loadBalancer != null;
  }
  
  public LoadBalancerNested<A> withNewLoadBalancer() {
    return new LoadBalancerNested(null);
  }
  
  public LoadBalancerNested<A> withNewLoadBalancerLike(V1IngressLoadBalancerStatus item) {
    return new LoadBalancerNested(item);
  }
  
  public LoadBalancerNested<A> editLoadBalancer() {
    return this.withNewLoadBalancerLike(Optional.ofNullable(this.buildLoadBalancer()).orElse(null));
  }
  
  public LoadBalancerNested<A> editOrNewLoadBalancer() {
    return this.withNewLoadBalancerLike(Optional.ofNullable(this.buildLoadBalancer()).orElse(new V1IngressLoadBalancerStatusBuilder().build()));
  }
  
  public LoadBalancerNested<A> editOrNewLoadBalancerLike(V1IngressLoadBalancerStatus item) {
    return this.withNewLoadBalancerLike(Optional.ofNullable(this.buildLoadBalancer()).orElse(item));
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
    V1IngressStatusFluent that = (V1IngressStatusFluent) o;
    if (!(Objects.equals(loadBalancer, that.loadBalancer))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(loadBalancer);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(loadBalancer == null)) {
        sb.append("loadBalancer:");
        sb.append(loadBalancer);
    }
    sb.append("}");
    return sb.toString();
  }
  public class LoadBalancerNested<N> extends V1IngressLoadBalancerStatusFluent<LoadBalancerNested<N>> implements Nested<N>{
    LoadBalancerNested(V1IngressLoadBalancerStatus item) {
      this.builder = new V1IngressLoadBalancerStatusBuilder(this, item);
    }
    V1IngressLoadBalancerStatusBuilder builder;
    
    public N and() {
      return (N) V1IngressStatusFluent.this.withLoadBalancer(builder.build());
    }
    
    public N endLoadBalancer() {
      return and();
    }
    
  
  }

}
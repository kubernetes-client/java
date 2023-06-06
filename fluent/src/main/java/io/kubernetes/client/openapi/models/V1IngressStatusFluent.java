package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1IngressStatusFluent<A extends V1IngressStatusFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildLoadBalancer instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1IngressLoadBalancerStatus getLoadBalancer();
  public V1IngressLoadBalancerStatus buildLoadBalancer();
  public A withLoadBalancer(V1IngressLoadBalancerStatus loadBalancer);
  public Boolean hasLoadBalancer();
  public V1IngressStatusFluent.LoadBalancerNested<A> withNewLoadBalancer();
  public V1IngressStatusFluent.LoadBalancerNested<A> withNewLoadBalancerLike(V1IngressLoadBalancerStatus item);
  public V1IngressStatusFluent.LoadBalancerNested<A> editLoadBalancer();
  public V1IngressStatusFluent.LoadBalancerNested<A> editOrNewLoadBalancer();
  public V1IngressStatusFluent.LoadBalancerNested<A> editOrNewLoadBalancerLike(V1IngressLoadBalancerStatus item);
  public interface LoadBalancerNested<N> extends Nested<N>,V1IngressLoadBalancerStatusFluent<V1IngressStatusFluent.LoadBalancerNested<N>>{
    public N and();
    public N endLoadBalancer();
    
  }
  
}
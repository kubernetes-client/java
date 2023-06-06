package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1IngressLoadBalancerStatusFluent<A extends V1IngressLoadBalancerStatusFluent<A>> extends Fluent<A>{
  public A addToIngress(int index,V1IngressLoadBalancerIngress item);
  public A setToIngress(int index,V1IngressLoadBalancerIngress item);
  public A addToIngress(io.kubernetes.client.openapi.models.V1IngressLoadBalancerIngress... items);
  public A addAllToIngress(Collection<V1IngressLoadBalancerIngress> items);
  public A removeFromIngress(io.kubernetes.client.openapi.models.V1IngressLoadBalancerIngress... items);
  public A removeAllFromIngress(Collection<V1IngressLoadBalancerIngress> items);
  public A removeMatchingFromIngress(Predicate<V1IngressLoadBalancerIngressBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildIngress instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1IngressLoadBalancerIngress> getIngress();
  public List<V1IngressLoadBalancerIngress> buildIngress();
  public V1IngressLoadBalancerIngress buildIngress(int index);
  public V1IngressLoadBalancerIngress buildFirstIngress();
  public V1IngressLoadBalancerIngress buildLastIngress();
  public V1IngressLoadBalancerIngress buildMatchingIngress(Predicate<V1IngressLoadBalancerIngressBuilder> predicate);
  public Boolean hasMatchingIngress(Predicate<V1IngressLoadBalancerIngressBuilder> predicate);
  public A withIngress(List<V1IngressLoadBalancerIngress> ingress);
  public A withIngress(io.kubernetes.client.openapi.models.V1IngressLoadBalancerIngress... ingress);
  public Boolean hasIngress();
  public V1IngressLoadBalancerStatusFluent.IngressNested<A> addNewIngress();
  public V1IngressLoadBalancerStatusFluent.IngressNested<A> addNewIngressLike(V1IngressLoadBalancerIngress item);
  public V1IngressLoadBalancerStatusFluent.IngressNested<A> setNewIngressLike(int index,V1IngressLoadBalancerIngress item);
  public V1IngressLoadBalancerStatusFluent.IngressNested<A> editIngress(int index);
  public V1IngressLoadBalancerStatusFluent.IngressNested<A> editFirstIngress();
  public V1IngressLoadBalancerStatusFluent.IngressNested<A> editLastIngress();
  public V1IngressLoadBalancerStatusFluent.IngressNested<A> editMatchingIngress(Predicate<V1IngressLoadBalancerIngressBuilder> predicate);
  public interface IngressNested<N> extends Nested<N>,V1IngressLoadBalancerIngressFluent<V1IngressLoadBalancerStatusFluent.IngressNested<N>>{
    public N and();
    public N endIngress();
    
  }
  
}
package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1IngressRuleFluent<A extends V1IngressRuleFluent<A>> extends Fluent<A>{
  public String getHost();
  public A withHost(String host);
  public Boolean hasHost();
  
  /**
   * This method has been deprecated, please use method buildHttp instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1HTTPIngressRuleValue getHttp();
  public V1HTTPIngressRuleValue buildHttp();
  public A withHttp(V1HTTPIngressRuleValue http);
  public Boolean hasHttp();
  public V1IngressRuleFluent.HttpNested<A> withNewHttp();
  public V1IngressRuleFluent.HttpNested<A> withNewHttpLike(V1HTTPIngressRuleValue item);
  public V1IngressRuleFluent.HttpNested<A> editHttp();
  public V1IngressRuleFluent.HttpNested<A> editOrNewHttp();
  public V1IngressRuleFluent.HttpNested<A> editOrNewHttpLike(V1HTTPIngressRuleValue item);
  public interface HttpNested<N> extends Nested<N>,V1HTTPIngressRuleValueFluent<V1IngressRuleFluent.HttpNested<N>>{
    public N and();
    public N endHttp();
    
  }
  
}
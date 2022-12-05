package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1beta1LimitResponseFluent<A extends V1beta1LimitResponseFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildQueuing instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1beta1QueuingConfiguration getQueuing();
  public V1beta1QueuingConfiguration buildQueuing();
  public A withQueuing(V1beta1QueuingConfiguration queuing);
  public Boolean hasQueuing();
  public V1beta1LimitResponseFluent.QueuingNested<A> withNewQueuing();
  public V1beta1LimitResponseFluent.QueuingNested<A> withNewQueuingLike(V1beta1QueuingConfiguration item);
  public V1beta1LimitResponseFluent.QueuingNested<A> editQueuing();
  public V1beta1LimitResponseFluent.QueuingNested<A> editOrNewQueuing();
  public V1beta1LimitResponseFluent.QueuingNested<A> editOrNewQueuingLike(V1beta1QueuingConfiguration item);
  public String getType();
  public A withType(String type);
  public Boolean hasType();
  public interface QueuingNested<N> extends Nested<N>,V1beta1QueuingConfigurationFluent<V1beta1LimitResponseFluent.QueuingNested<N>>{
    public N and();
    public N endQueuing();
    
  }
  
}
package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1beta2LimitResponseFluent<A extends V1beta2LimitResponseFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildQueuing instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1beta2QueuingConfiguration getQueuing();
  public V1beta2QueuingConfiguration buildQueuing();
  public A withQueuing(V1beta2QueuingConfiguration queuing);
  public Boolean hasQueuing();
  public V1beta2LimitResponseFluent.QueuingNested<A> withNewQueuing();
  public V1beta2LimitResponseFluent.QueuingNested<A> withNewQueuingLike(V1beta2QueuingConfiguration item);
  public V1beta2LimitResponseFluent.QueuingNested<A> editQueuing();
  public V1beta2LimitResponseFluent.QueuingNested<A> editOrNewQueuing();
  public V1beta2LimitResponseFluent.QueuingNested<A> editOrNewQueuingLike(V1beta2QueuingConfiguration item);
  public String getType();
  public A withType(String type);
  public Boolean hasType();
  public interface QueuingNested<N> extends Nested<N>,V1beta2QueuingConfigurationFluent<V1beta2LimitResponseFluent.QueuingNested<N>>{
    public N and();
    public N endQueuing();
    
  }
  
}
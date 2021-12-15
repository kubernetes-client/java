package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1beta2LimitResponseFluent<A extends io.kubernetes.client.openapi.models.V1beta2LimitResponseFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildQueuing instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1beta2QueuingConfiguration getQueuing();
  public io.kubernetes.client.openapi.models.V1beta2QueuingConfiguration buildQueuing();
  public A withQueuing(io.kubernetes.client.openapi.models.V1beta2QueuingConfiguration queuing);
  public java.lang.Boolean hasQueuing();
  public io.kubernetes.client.openapi.models.V1beta2LimitResponseFluent.QueuingNested<A> withNewQueuing();
  public io.kubernetes.client.openapi.models.V1beta2LimitResponseFluent.QueuingNested<A> withNewQueuingLike(io.kubernetes.client.openapi.models.V1beta2QueuingConfiguration item);
  public io.kubernetes.client.openapi.models.V1beta2LimitResponseFluent.QueuingNested<A> editQueuing();
  public io.kubernetes.client.openapi.models.V1beta2LimitResponseFluent.QueuingNested<A> editOrNewQueuing();
  public io.kubernetes.client.openapi.models.V1beta2LimitResponseFluent.QueuingNested<A> editOrNewQueuingLike(io.kubernetes.client.openapi.models.V1beta2QueuingConfiguration item);
  public java.lang.String getType();
  public A withType(java.lang.String type);
  public java.lang.Boolean hasType();
  
  /**
   * Method is deprecated. use withType instead.
   */
  @java.lang.Deprecated
  public A withNewType(java.lang.String original);
  public interface QueuingNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1beta2QueuingConfigurationFluent<io.kubernetes.client.openapi.models.V1beta2LimitResponseFluent.QueuingNested<N>>{
    public N and();
    public N endQueuing();
    
  }
  
}
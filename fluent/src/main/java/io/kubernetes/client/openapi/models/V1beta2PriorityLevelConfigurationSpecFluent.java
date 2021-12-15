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
public interface V1beta2PriorityLevelConfigurationSpecFluent<A extends io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationSpecFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildLimited instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1beta2LimitedPriorityLevelConfiguration getLimited();
  public io.kubernetes.client.openapi.models.V1beta2LimitedPriorityLevelConfiguration buildLimited();
  public A withLimited(io.kubernetes.client.openapi.models.V1beta2LimitedPriorityLevelConfiguration limited);
  public java.lang.Boolean hasLimited();
  public io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationSpecFluent.LimitedNested<A> withNewLimited();
  public io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationSpecFluent.LimitedNested<A> withNewLimitedLike(io.kubernetes.client.openapi.models.V1beta2LimitedPriorityLevelConfiguration item);
  public io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationSpecFluent.LimitedNested<A> editLimited();
  public io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationSpecFluent.LimitedNested<A> editOrNewLimited();
  public io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationSpecFluent.LimitedNested<A> editOrNewLimitedLike(io.kubernetes.client.openapi.models.V1beta2LimitedPriorityLevelConfiguration item);
  public java.lang.String getType();
  public A withType(java.lang.String type);
  public java.lang.Boolean hasType();
  
  /**
   * Method is deprecated. use withType instead.
   */
  @java.lang.Deprecated
  public A withNewType(java.lang.String original);
  public interface LimitedNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1beta2LimitedPriorityLevelConfigurationFluent<io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationSpecFluent.LimitedNested<N>>{
    public N and();
    public N endLimited();
    
  }
  
}
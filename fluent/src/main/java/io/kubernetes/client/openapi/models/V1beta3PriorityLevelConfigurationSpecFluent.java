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
public interface V1beta3PriorityLevelConfigurationSpecFluent<A extends V1beta3PriorityLevelConfigurationSpecFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildLimited instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1beta3LimitedPriorityLevelConfiguration getLimited();
  public V1beta3LimitedPriorityLevelConfiguration buildLimited();
  public A withLimited(V1beta3LimitedPriorityLevelConfiguration limited);
  public Boolean hasLimited();
  public V1beta3PriorityLevelConfigurationSpecFluent.LimitedNested<A> withNewLimited();
  public V1beta3PriorityLevelConfigurationSpecFluent.LimitedNested<A> withNewLimitedLike(V1beta3LimitedPriorityLevelConfiguration item);
  public V1beta3PriorityLevelConfigurationSpecFluent.LimitedNested<A> editLimited();
  public V1beta3PriorityLevelConfigurationSpecFluent.LimitedNested<A> editOrNewLimited();
  public V1beta3PriorityLevelConfigurationSpecFluent.LimitedNested<A> editOrNewLimitedLike(V1beta3LimitedPriorityLevelConfiguration item);
  public String getType();
  public A withType(String type);
  public Boolean hasType();
  public interface LimitedNested<N> extends Nested<N>,V1beta3LimitedPriorityLevelConfigurationFluent<V1beta3PriorityLevelConfigurationSpecFluent.LimitedNested<N>>{
    public N and();
    public N endLimited();
    
  }
  
}
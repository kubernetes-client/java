package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1beta1LimitedPriorityLevelConfigurationFluent<A extends V1beta1LimitedPriorityLevelConfigurationFluent<A>> extends Fluent<A>{
  public Integer getAssuredConcurrencyShares();
  public A withAssuredConcurrencyShares(Integer assuredConcurrencyShares);
  public Boolean hasAssuredConcurrencyShares();
  
  /**
   * This method has been deprecated, please use method buildLimitResponse instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1beta1LimitResponse getLimitResponse();
  public V1beta1LimitResponse buildLimitResponse();
  public A withLimitResponse(V1beta1LimitResponse limitResponse);
  public Boolean hasLimitResponse();
  public V1beta1LimitedPriorityLevelConfigurationFluent.LimitResponseNested<A> withNewLimitResponse();
  public V1beta1LimitedPriorityLevelConfigurationFluent.LimitResponseNested<A> withNewLimitResponseLike(V1beta1LimitResponse item);
  public V1beta1LimitedPriorityLevelConfigurationFluent.LimitResponseNested<A> editLimitResponse();
  public V1beta1LimitedPriorityLevelConfigurationFluent.LimitResponseNested<A> editOrNewLimitResponse();
  public V1beta1LimitedPriorityLevelConfigurationFluent.LimitResponseNested<A> editOrNewLimitResponseLike(V1beta1LimitResponse item);
  public interface LimitResponseNested<N> extends Nested<N>,V1beta1LimitResponseFluent<V1beta1LimitedPriorityLevelConfigurationFluent.LimitResponseNested<N>>{
    public N and();
    public N endLimitResponse();
    
  }
  
}
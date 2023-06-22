package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1beta3LimitedPriorityLevelConfigurationFluent<A extends V1beta3LimitedPriorityLevelConfigurationFluent<A>> extends Fluent<A>{
  public Integer getBorrowingLimitPercent();
  public A withBorrowingLimitPercent(Integer borrowingLimitPercent);
  public Boolean hasBorrowingLimitPercent();
  public Integer getLendablePercent();
  public A withLendablePercent(Integer lendablePercent);
  public Boolean hasLendablePercent();
  
  /**
   * This method has been deprecated, please use method buildLimitResponse instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1beta3LimitResponse getLimitResponse();
  public V1beta3LimitResponse buildLimitResponse();
  public A withLimitResponse(V1beta3LimitResponse limitResponse);
  public Boolean hasLimitResponse();
  public V1beta3LimitedPriorityLevelConfigurationFluent.LimitResponseNested<A> withNewLimitResponse();
  public V1beta3LimitedPriorityLevelConfigurationFluent.LimitResponseNested<A> withNewLimitResponseLike(V1beta3LimitResponse item);
  public V1beta3LimitedPriorityLevelConfigurationFluent.LimitResponseNested<A> editLimitResponse();
  public V1beta3LimitedPriorityLevelConfigurationFluent.LimitResponseNested<A> editOrNewLimitResponse();
  public V1beta3LimitedPriorityLevelConfigurationFluent.LimitResponseNested<A> editOrNewLimitResponseLike(V1beta3LimitResponse item);
  public Integer getNominalConcurrencyShares();
  public A withNominalConcurrencyShares(Integer nominalConcurrencyShares);
  public Boolean hasNominalConcurrencyShares();
  public interface LimitResponseNested<N> extends Nested<N>,V1beta3LimitResponseFluent<V1beta3LimitedPriorityLevelConfigurationFluent.LimitResponseNested<N>>{
    public N and();
    public N endLimitResponse();
    
  }
  
}
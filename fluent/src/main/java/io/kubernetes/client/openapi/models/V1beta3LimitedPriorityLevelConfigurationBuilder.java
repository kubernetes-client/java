package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta3LimitedPriorityLevelConfigurationBuilder extends V1beta3LimitedPriorityLevelConfigurationFluent<V1beta3LimitedPriorityLevelConfigurationBuilder> implements VisitableBuilder<V1beta3LimitedPriorityLevelConfiguration,V1beta3LimitedPriorityLevelConfigurationBuilder>{
  public V1beta3LimitedPriorityLevelConfigurationBuilder() {
    this(new V1beta3LimitedPriorityLevelConfiguration());
  }
  
  public V1beta3LimitedPriorityLevelConfigurationBuilder(V1beta3LimitedPriorityLevelConfigurationFluent<?> fluent) {
    this(fluent, new V1beta3LimitedPriorityLevelConfiguration());
  }
  
  public V1beta3LimitedPriorityLevelConfigurationBuilder(V1beta3LimitedPriorityLevelConfigurationFluent<?> fluent,V1beta3LimitedPriorityLevelConfiguration instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta3LimitedPriorityLevelConfigurationBuilder(V1beta3LimitedPriorityLevelConfiguration instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta3LimitedPriorityLevelConfigurationFluent<?> fluent;
  
  public V1beta3LimitedPriorityLevelConfiguration build() {
    V1beta3LimitedPriorityLevelConfiguration buildable = new V1beta3LimitedPriorityLevelConfiguration();
    buildable.setBorrowingLimitPercent(fluent.getBorrowingLimitPercent());
    buildable.setLendablePercent(fluent.getLendablePercent());
    buildable.setLimitResponse(fluent.buildLimitResponse());
    buildable.setNominalConcurrencyShares(fluent.getNominalConcurrencyShares());
    return buildable;
  }
  

}
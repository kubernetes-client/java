package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1LimitedPriorityLevelConfigurationBuilder extends V1LimitedPriorityLevelConfigurationFluent<V1LimitedPriorityLevelConfigurationBuilder> implements VisitableBuilder<V1LimitedPriorityLevelConfiguration,V1LimitedPriorityLevelConfigurationBuilder>{
  public V1LimitedPriorityLevelConfigurationBuilder() {
    this(new V1LimitedPriorityLevelConfiguration());
  }
  
  public V1LimitedPriorityLevelConfigurationBuilder(V1LimitedPriorityLevelConfigurationFluent<?> fluent) {
    this(fluent, new V1LimitedPriorityLevelConfiguration());
  }
  
  public V1LimitedPriorityLevelConfigurationBuilder(V1LimitedPriorityLevelConfigurationFluent<?> fluent,V1LimitedPriorityLevelConfiguration instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1LimitedPriorityLevelConfigurationBuilder(V1LimitedPriorityLevelConfiguration instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1LimitedPriorityLevelConfigurationFluent<?> fluent;
  
  public V1LimitedPriorityLevelConfiguration build() {
    V1LimitedPriorityLevelConfiguration buildable = new V1LimitedPriorityLevelConfiguration();
    buildable.setBorrowingLimitPercent(fluent.getBorrowingLimitPercent());
    buildable.setLendablePercent(fluent.getLendablePercent());
    buildable.setLimitResponse(fluent.buildLimitResponse());
    buildable.setNominalConcurrencyShares(fluent.getNominalConcurrencyShares());
    return buildable;
  }
  

}
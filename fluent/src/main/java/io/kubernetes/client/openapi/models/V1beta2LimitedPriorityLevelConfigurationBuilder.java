package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta2LimitedPriorityLevelConfigurationBuilder extends V1beta2LimitedPriorityLevelConfigurationFluent<V1beta2LimitedPriorityLevelConfigurationBuilder> implements VisitableBuilder<V1beta2LimitedPriorityLevelConfiguration,V1beta2LimitedPriorityLevelConfigurationBuilder>{
  public V1beta2LimitedPriorityLevelConfigurationBuilder() {
    this(new V1beta2LimitedPriorityLevelConfiguration());
  }
  
  public V1beta2LimitedPriorityLevelConfigurationBuilder(V1beta2LimitedPriorityLevelConfigurationFluent<?> fluent) {
    this(fluent, new V1beta2LimitedPriorityLevelConfiguration());
  }
  
  public V1beta2LimitedPriorityLevelConfigurationBuilder(V1beta2LimitedPriorityLevelConfigurationFluent<?> fluent,V1beta2LimitedPriorityLevelConfiguration instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta2LimitedPriorityLevelConfigurationBuilder(V1beta2LimitedPriorityLevelConfiguration instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta2LimitedPriorityLevelConfigurationFluent<?> fluent;
  
  public V1beta2LimitedPriorityLevelConfiguration build() {
    V1beta2LimitedPriorityLevelConfiguration buildable = new V1beta2LimitedPriorityLevelConfiguration();
    buildable.setAssuredConcurrencyShares(fluent.getAssuredConcurrencyShares());
    buildable.setBorrowingLimitPercent(fluent.getBorrowingLimitPercent());
    buildable.setLendablePercent(fluent.getLendablePercent());
    buildable.setLimitResponse(fluent.buildLimitResponse());
    return buildable;
  }
  

}
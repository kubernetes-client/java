package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1beta3LimitedPriorityLevelConfigurationBuilder extends V1beta3LimitedPriorityLevelConfigurationFluentImpl<V1beta3LimitedPriorityLevelConfigurationBuilder> implements VisitableBuilder<V1beta3LimitedPriorityLevelConfiguration,V1beta3LimitedPriorityLevelConfigurationBuilder>{
  public V1beta3LimitedPriorityLevelConfigurationBuilder() {
    this(false);
  }
  public V1beta3LimitedPriorityLevelConfigurationBuilder(Boolean validationEnabled) {
    this(new V1beta3LimitedPriorityLevelConfiguration(), validationEnabled);
  }
  public V1beta3LimitedPriorityLevelConfigurationBuilder(V1beta3LimitedPriorityLevelConfigurationFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta3LimitedPriorityLevelConfigurationBuilder(V1beta3LimitedPriorityLevelConfigurationFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1beta3LimitedPriorityLevelConfiguration(), validationEnabled);
  }
  public V1beta3LimitedPriorityLevelConfigurationBuilder(V1beta3LimitedPriorityLevelConfigurationFluent<?> fluent,V1beta3LimitedPriorityLevelConfiguration instance) {
    this(fluent, instance, false);
  }
  public V1beta3LimitedPriorityLevelConfigurationBuilder(V1beta3LimitedPriorityLevelConfigurationFluent<?> fluent,V1beta3LimitedPriorityLevelConfiguration instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withBorrowingLimitPercent(instance.getBorrowingLimitPercent());
      fluent.withLendablePercent(instance.getLendablePercent());
      fluent.withLimitResponse(instance.getLimitResponse());
      fluent.withNominalConcurrencyShares(instance.getNominalConcurrencyShares());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1beta3LimitedPriorityLevelConfigurationBuilder(V1beta3LimitedPriorityLevelConfiguration instance) {
    this(instance,false);
  }
  public V1beta3LimitedPriorityLevelConfigurationBuilder(V1beta3LimitedPriorityLevelConfiguration instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withBorrowingLimitPercent(instance.getBorrowingLimitPercent());
      this.withLendablePercent(instance.getLendablePercent());
      this.withLimitResponse(instance.getLimitResponse());
      this.withNominalConcurrencyShares(instance.getNominalConcurrencyShares());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1beta3LimitedPriorityLevelConfigurationFluent<?> fluent;
  Boolean validationEnabled;
  public V1beta3LimitedPriorityLevelConfiguration build() {
    V1beta3LimitedPriorityLevelConfiguration buildable = new V1beta3LimitedPriorityLevelConfiguration();
    buildable.setBorrowingLimitPercent(fluent.getBorrowingLimitPercent());
    buildable.setLendablePercent(fluent.getLendablePercent());
    buildable.setLimitResponse(fluent.getLimitResponse());
    buildable.setNominalConcurrencyShares(fluent.getNominalConcurrencyShares());
    return buildable;
  }
  
}
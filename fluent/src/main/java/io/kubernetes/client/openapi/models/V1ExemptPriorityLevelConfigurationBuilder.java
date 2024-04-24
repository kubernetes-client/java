package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ExemptPriorityLevelConfigurationBuilder extends V1ExemptPriorityLevelConfigurationFluent<V1ExemptPriorityLevelConfigurationBuilder> implements VisitableBuilder<V1ExemptPriorityLevelConfiguration,V1ExemptPriorityLevelConfigurationBuilder>{
  public V1ExemptPriorityLevelConfigurationBuilder() {
    this(new V1ExemptPriorityLevelConfiguration());
  }
  
  public V1ExemptPriorityLevelConfigurationBuilder(V1ExemptPriorityLevelConfigurationFluent<?> fluent) {
    this(fluent, new V1ExemptPriorityLevelConfiguration());
  }
  
  public V1ExemptPriorityLevelConfigurationBuilder(V1ExemptPriorityLevelConfigurationFluent<?> fluent,V1ExemptPriorityLevelConfiguration instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ExemptPriorityLevelConfigurationBuilder(V1ExemptPriorityLevelConfiguration instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ExemptPriorityLevelConfigurationFluent<?> fluent;
  
  public V1ExemptPriorityLevelConfiguration build() {
    V1ExemptPriorityLevelConfiguration buildable = new V1ExemptPriorityLevelConfiguration();
    buildable.setLendablePercent(fluent.getLendablePercent());
    buildable.setNominalConcurrencyShares(fluent.getNominalConcurrencyShares());
    return buildable;
  }
  

}
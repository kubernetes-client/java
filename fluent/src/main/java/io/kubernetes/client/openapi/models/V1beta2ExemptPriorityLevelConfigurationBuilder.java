package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta2ExemptPriorityLevelConfigurationBuilder extends V1beta2ExemptPriorityLevelConfigurationFluent<V1beta2ExemptPriorityLevelConfigurationBuilder> implements VisitableBuilder<V1beta2ExemptPriorityLevelConfiguration,V1beta2ExemptPriorityLevelConfigurationBuilder>{
  public V1beta2ExemptPriorityLevelConfigurationBuilder() {
    this(new V1beta2ExemptPriorityLevelConfiguration());
  }
  
  public V1beta2ExemptPriorityLevelConfigurationBuilder(V1beta2ExemptPriorityLevelConfigurationFluent<?> fluent) {
    this(fluent, new V1beta2ExemptPriorityLevelConfiguration());
  }
  
  public V1beta2ExemptPriorityLevelConfigurationBuilder(V1beta2ExemptPriorityLevelConfigurationFluent<?> fluent,V1beta2ExemptPriorityLevelConfiguration instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta2ExemptPriorityLevelConfigurationBuilder(V1beta2ExemptPriorityLevelConfiguration instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta2ExemptPriorityLevelConfigurationFluent<?> fluent;
  
  public V1beta2ExemptPriorityLevelConfiguration build() {
    V1beta2ExemptPriorityLevelConfiguration buildable = new V1beta2ExemptPriorityLevelConfiguration();
    buildable.setLendablePercent(fluent.getLendablePercent());
    buildable.setNominalConcurrencyShares(fluent.getNominalConcurrencyShares());
    return buildable;
  }
  

}
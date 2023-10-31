package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta3ExemptPriorityLevelConfigurationBuilder extends V1beta3ExemptPriorityLevelConfigurationFluent<V1beta3ExemptPriorityLevelConfigurationBuilder> implements VisitableBuilder<V1beta3ExemptPriorityLevelConfiguration,V1beta3ExemptPriorityLevelConfigurationBuilder>{
  public V1beta3ExemptPriorityLevelConfigurationBuilder() {
    this(new V1beta3ExemptPriorityLevelConfiguration());
  }
  
  public V1beta3ExemptPriorityLevelConfigurationBuilder(V1beta3ExemptPriorityLevelConfigurationFluent<?> fluent) {
    this(fluent, new V1beta3ExemptPriorityLevelConfiguration());
  }
  
  public V1beta3ExemptPriorityLevelConfigurationBuilder(V1beta3ExemptPriorityLevelConfigurationFluent<?> fluent,V1beta3ExemptPriorityLevelConfiguration instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta3ExemptPriorityLevelConfigurationBuilder(V1beta3ExemptPriorityLevelConfiguration instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta3ExemptPriorityLevelConfigurationFluent<?> fluent;
  
  public V1beta3ExemptPriorityLevelConfiguration build() {
    V1beta3ExemptPriorityLevelConfiguration buildable = new V1beta3ExemptPriorityLevelConfiguration();
    buildable.setLendablePercent(fluent.getLendablePercent());
    buildable.setNominalConcurrencyShares(fluent.getNominalConcurrencyShares());
    return buildable;
  }
  

}
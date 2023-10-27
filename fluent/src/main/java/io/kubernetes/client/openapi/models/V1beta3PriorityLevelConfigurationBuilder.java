package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta3PriorityLevelConfigurationBuilder extends V1beta3PriorityLevelConfigurationFluent<V1beta3PriorityLevelConfigurationBuilder> implements VisitableBuilder<V1beta3PriorityLevelConfiguration,V1beta3PriorityLevelConfigurationBuilder>{
  public V1beta3PriorityLevelConfigurationBuilder() {
    this(new V1beta3PriorityLevelConfiguration());
  }
  
  public V1beta3PriorityLevelConfigurationBuilder(V1beta3PriorityLevelConfigurationFluent<?> fluent) {
    this(fluent, new V1beta3PriorityLevelConfiguration());
  }
  
  public V1beta3PriorityLevelConfigurationBuilder(V1beta3PriorityLevelConfigurationFluent<?> fluent,V1beta3PriorityLevelConfiguration instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta3PriorityLevelConfigurationBuilder(V1beta3PriorityLevelConfiguration instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta3PriorityLevelConfigurationFluent<?> fluent;
  
  public V1beta3PriorityLevelConfiguration build() {
    V1beta3PriorityLevelConfiguration buildable = new V1beta3PriorityLevelConfiguration();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  

}
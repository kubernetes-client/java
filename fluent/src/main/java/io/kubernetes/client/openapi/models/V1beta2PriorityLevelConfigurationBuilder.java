package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta2PriorityLevelConfigurationBuilder extends V1beta2PriorityLevelConfigurationFluent<V1beta2PriorityLevelConfigurationBuilder> implements VisitableBuilder<V1beta2PriorityLevelConfiguration,V1beta2PriorityLevelConfigurationBuilder>{
  public V1beta2PriorityLevelConfigurationBuilder() {
    this(new V1beta2PriorityLevelConfiguration());
  }
  
  public V1beta2PriorityLevelConfigurationBuilder(V1beta2PriorityLevelConfigurationFluent<?> fluent) {
    this(fluent, new V1beta2PriorityLevelConfiguration());
  }
  
  public V1beta2PriorityLevelConfigurationBuilder(V1beta2PriorityLevelConfigurationFluent<?> fluent,V1beta2PriorityLevelConfiguration instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta2PriorityLevelConfigurationBuilder(V1beta2PriorityLevelConfiguration instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta2PriorityLevelConfigurationFluent<?> fluent;
  
  public V1beta2PriorityLevelConfiguration build() {
    V1beta2PriorityLevelConfiguration buildable = new V1beta2PriorityLevelConfiguration();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  

}
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1PriorityLevelConfigurationBuilder extends V1PriorityLevelConfigurationFluent<V1PriorityLevelConfigurationBuilder> implements VisitableBuilder<V1PriorityLevelConfiguration,V1PriorityLevelConfigurationBuilder>{
  public V1PriorityLevelConfigurationBuilder() {
    this(new V1PriorityLevelConfiguration());
  }
  
  public V1PriorityLevelConfigurationBuilder(V1PriorityLevelConfigurationFluent<?> fluent) {
    this(fluent, new V1PriorityLevelConfiguration());
  }
  
  public V1PriorityLevelConfigurationBuilder(V1PriorityLevelConfigurationFluent<?> fluent,V1PriorityLevelConfiguration instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1PriorityLevelConfigurationBuilder(V1PriorityLevelConfiguration instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1PriorityLevelConfigurationFluent<?> fluent;
  
  public V1PriorityLevelConfiguration build() {
    V1PriorityLevelConfiguration buildable = new V1PriorityLevelConfiguration();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  

}
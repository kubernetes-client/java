package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta2PriorityLevelConfigurationSpecBuilder extends V1beta2PriorityLevelConfigurationSpecFluent<V1beta2PriorityLevelConfigurationSpecBuilder> implements VisitableBuilder<V1beta2PriorityLevelConfigurationSpec,V1beta2PriorityLevelConfigurationSpecBuilder>{
  public V1beta2PriorityLevelConfigurationSpecBuilder() {
    this(new V1beta2PriorityLevelConfigurationSpec());
  }
  
  public V1beta2PriorityLevelConfigurationSpecBuilder(V1beta2PriorityLevelConfigurationSpecFluent<?> fluent) {
    this(fluent, new V1beta2PriorityLevelConfigurationSpec());
  }
  
  public V1beta2PriorityLevelConfigurationSpecBuilder(V1beta2PriorityLevelConfigurationSpecFluent<?> fluent,V1beta2PriorityLevelConfigurationSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta2PriorityLevelConfigurationSpecBuilder(V1beta2PriorityLevelConfigurationSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta2PriorityLevelConfigurationSpecFluent<?> fluent;
  
  public V1beta2PriorityLevelConfigurationSpec build() {
    V1beta2PriorityLevelConfigurationSpec buildable = new V1beta2PriorityLevelConfigurationSpec();
    buildable.setExempt(fluent.buildExempt());
    buildable.setLimited(fluent.buildLimited());
    buildable.setType(fluent.getType());
    return buildable;
  }
  

}
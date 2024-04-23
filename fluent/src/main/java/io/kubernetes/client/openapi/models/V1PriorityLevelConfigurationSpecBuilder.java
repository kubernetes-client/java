package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1PriorityLevelConfigurationSpecBuilder extends V1PriorityLevelConfigurationSpecFluent<V1PriorityLevelConfigurationSpecBuilder> implements VisitableBuilder<V1PriorityLevelConfigurationSpec,V1PriorityLevelConfigurationSpecBuilder>{
  public V1PriorityLevelConfigurationSpecBuilder() {
    this(new V1PriorityLevelConfigurationSpec());
  }
  
  public V1PriorityLevelConfigurationSpecBuilder(V1PriorityLevelConfigurationSpecFluent<?> fluent) {
    this(fluent, new V1PriorityLevelConfigurationSpec());
  }
  
  public V1PriorityLevelConfigurationSpecBuilder(V1PriorityLevelConfigurationSpecFluent<?> fluent,V1PriorityLevelConfigurationSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1PriorityLevelConfigurationSpecBuilder(V1PriorityLevelConfigurationSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1PriorityLevelConfigurationSpecFluent<?> fluent;
  
  public V1PriorityLevelConfigurationSpec build() {
    V1PriorityLevelConfigurationSpec buildable = new V1PriorityLevelConfigurationSpec();
    buildable.setExempt(fluent.buildExempt());
    buildable.setLimited(fluent.buildLimited());
    buildable.setType(fluent.getType());
    return buildable;
  }
  

}
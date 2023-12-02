package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta3PriorityLevelConfigurationSpecBuilder extends V1beta3PriorityLevelConfigurationSpecFluent<V1beta3PriorityLevelConfigurationSpecBuilder> implements VisitableBuilder<V1beta3PriorityLevelConfigurationSpec,V1beta3PriorityLevelConfigurationSpecBuilder>{
  public V1beta3PriorityLevelConfigurationSpecBuilder() {
    this(new V1beta3PriorityLevelConfigurationSpec());
  }
  
  public V1beta3PriorityLevelConfigurationSpecBuilder(V1beta3PriorityLevelConfigurationSpecFluent<?> fluent) {
    this(fluent, new V1beta3PriorityLevelConfigurationSpec());
  }
  
  public V1beta3PriorityLevelConfigurationSpecBuilder(V1beta3PriorityLevelConfigurationSpecFluent<?> fluent,V1beta3PriorityLevelConfigurationSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta3PriorityLevelConfigurationSpecBuilder(V1beta3PriorityLevelConfigurationSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta3PriorityLevelConfigurationSpecFluent<?> fluent;
  
  public V1beta3PriorityLevelConfigurationSpec build() {
    V1beta3PriorityLevelConfigurationSpec buildable = new V1beta3PriorityLevelConfigurationSpec();
    buildable.setExempt(fluent.buildExempt());
    buildable.setLimited(fluent.buildLimited());
    buildable.setType(fluent.getType());
    return buildable;
  }
  

}
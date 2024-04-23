package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1PriorityLevelConfigurationReferenceBuilder extends V1PriorityLevelConfigurationReferenceFluent<V1PriorityLevelConfigurationReferenceBuilder> implements VisitableBuilder<V1PriorityLevelConfigurationReference,V1PriorityLevelConfigurationReferenceBuilder>{
  public V1PriorityLevelConfigurationReferenceBuilder() {
    this(new V1PriorityLevelConfigurationReference());
  }
  
  public V1PriorityLevelConfigurationReferenceBuilder(V1PriorityLevelConfigurationReferenceFluent<?> fluent) {
    this(fluent, new V1PriorityLevelConfigurationReference());
  }
  
  public V1PriorityLevelConfigurationReferenceBuilder(V1PriorityLevelConfigurationReferenceFluent<?> fluent,V1PriorityLevelConfigurationReference instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1PriorityLevelConfigurationReferenceBuilder(V1PriorityLevelConfigurationReference instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1PriorityLevelConfigurationReferenceFluent<?> fluent;
  
  public V1PriorityLevelConfigurationReference build() {
    V1PriorityLevelConfigurationReference buildable = new V1PriorityLevelConfigurationReference();
    buildable.setName(fluent.getName());
    return buildable;
  }
  

}
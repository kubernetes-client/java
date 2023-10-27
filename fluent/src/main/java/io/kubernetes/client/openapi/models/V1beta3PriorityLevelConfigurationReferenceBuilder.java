package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta3PriorityLevelConfigurationReferenceBuilder extends V1beta3PriorityLevelConfigurationReferenceFluent<V1beta3PriorityLevelConfigurationReferenceBuilder> implements VisitableBuilder<V1beta3PriorityLevelConfigurationReference,V1beta3PriorityLevelConfigurationReferenceBuilder>{
  public V1beta3PriorityLevelConfigurationReferenceBuilder() {
    this(new V1beta3PriorityLevelConfigurationReference());
  }
  
  public V1beta3PriorityLevelConfigurationReferenceBuilder(V1beta3PriorityLevelConfigurationReferenceFluent<?> fluent) {
    this(fluent, new V1beta3PriorityLevelConfigurationReference());
  }
  
  public V1beta3PriorityLevelConfigurationReferenceBuilder(V1beta3PriorityLevelConfigurationReferenceFluent<?> fluent,V1beta3PriorityLevelConfigurationReference instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta3PriorityLevelConfigurationReferenceBuilder(V1beta3PriorityLevelConfigurationReference instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta3PriorityLevelConfigurationReferenceFluent<?> fluent;
  
  public V1beta3PriorityLevelConfigurationReference build() {
    V1beta3PriorityLevelConfigurationReference buildable = new V1beta3PriorityLevelConfigurationReference();
    buildable.setName(fluent.getName());
    return buildable;
  }
  

}
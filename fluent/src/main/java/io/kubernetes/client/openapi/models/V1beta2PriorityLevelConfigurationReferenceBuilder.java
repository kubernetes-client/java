package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta2PriorityLevelConfigurationReferenceBuilder extends V1beta2PriorityLevelConfigurationReferenceFluent<V1beta2PriorityLevelConfigurationReferenceBuilder> implements VisitableBuilder<V1beta2PriorityLevelConfigurationReference,V1beta2PriorityLevelConfigurationReferenceBuilder>{
  public V1beta2PriorityLevelConfigurationReferenceBuilder() {
    this(new V1beta2PriorityLevelConfigurationReference());
  }
  
  public V1beta2PriorityLevelConfigurationReferenceBuilder(V1beta2PriorityLevelConfigurationReferenceFluent<?> fluent) {
    this(fluent, new V1beta2PriorityLevelConfigurationReference());
  }
  
  public V1beta2PriorityLevelConfigurationReferenceBuilder(V1beta2PriorityLevelConfigurationReferenceFluent<?> fluent,V1beta2PriorityLevelConfigurationReference instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta2PriorityLevelConfigurationReferenceBuilder(V1beta2PriorityLevelConfigurationReference instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta2PriorityLevelConfigurationReferenceFluent<?> fluent;
  
  public V1beta2PriorityLevelConfigurationReference build() {
    V1beta2PriorityLevelConfigurationReference buildable = new V1beta2PriorityLevelConfigurationReference();
    buildable.setName(fluent.getName());
    return buildable;
  }
  

}
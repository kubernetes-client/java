package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta2PriorityLevelConfigurationListBuilder extends V1beta2PriorityLevelConfigurationListFluent<V1beta2PriorityLevelConfigurationListBuilder> implements VisitableBuilder<V1beta2PriorityLevelConfigurationList,V1beta2PriorityLevelConfigurationListBuilder>{
  public V1beta2PriorityLevelConfigurationListBuilder() {
    this(new V1beta2PriorityLevelConfigurationList());
  }
  
  public V1beta2PriorityLevelConfigurationListBuilder(V1beta2PriorityLevelConfigurationListFluent<?> fluent) {
    this(fluent, new V1beta2PriorityLevelConfigurationList());
  }
  
  public V1beta2PriorityLevelConfigurationListBuilder(V1beta2PriorityLevelConfigurationListFluent<?> fluent,V1beta2PriorityLevelConfigurationList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta2PriorityLevelConfigurationListBuilder(V1beta2PriorityLevelConfigurationList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta2PriorityLevelConfigurationListFluent<?> fluent;
  
  public V1beta2PriorityLevelConfigurationList build() {
    V1beta2PriorityLevelConfigurationList buildable = new V1beta2PriorityLevelConfigurationList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}
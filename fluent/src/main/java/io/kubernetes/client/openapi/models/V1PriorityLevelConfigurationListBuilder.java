package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1PriorityLevelConfigurationListBuilder extends V1PriorityLevelConfigurationListFluent<V1PriorityLevelConfigurationListBuilder> implements VisitableBuilder<V1PriorityLevelConfigurationList,V1PriorityLevelConfigurationListBuilder>{
  public V1PriorityLevelConfigurationListBuilder() {
    this(new V1PriorityLevelConfigurationList());
  }
  
  public V1PriorityLevelConfigurationListBuilder(V1PriorityLevelConfigurationListFluent<?> fluent) {
    this(fluent, new V1PriorityLevelConfigurationList());
  }
  
  public V1PriorityLevelConfigurationListBuilder(V1PriorityLevelConfigurationListFluent<?> fluent,V1PriorityLevelConfigurationList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1PriorityLevelConfigurationListBuilder(V1PriorityLevelConfigurationList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1PriorityLevelConfigurationListFluent<?> fluent;
  
  public V1PriorityLevelConfigurationList build() {
    V1PriorityLevelConfigurationList buildable = new V1PriorityLevelConfigurationList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}
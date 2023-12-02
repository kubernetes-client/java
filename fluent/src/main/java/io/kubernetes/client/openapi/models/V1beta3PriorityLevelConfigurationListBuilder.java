package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta3PriorityLevelConfigurationListBuilder extends V1beta3PriorityLevelConfigurationListFluent<V1beta3PriorityLevelConfigurationListBuilder> implements VisitableBuilder<V1beta3PriorityLevelConfigurationList,V1beta3PriorityLevelConfigurationListBuilder>{
  public V1beta3PriorityLevelConfigurationListBuilder() {
    this(new V1beta3PriorityLevelConfigurationList());
  }
  
  public V1beta3PriorityLevelConfigurationListBuilder(V1beta3PriorityLevelConfigurationListFluent<?> fluent) {
    this(fluent, new V1beta3PriorityLevelConfigurationList());
  }
  
  public V1beta3PriorityLevelConfigurationListBuilder(V1beta3PriorityLevelConfigurationListFluent<?> fluent,V1beta3PriorityLevelConfigurationList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta3PriorityLevelConfigurationListBuilder(V1beta3PriorityLevelConfigurationList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta3PriorityLevelConfigurationListFluent<?> fluent;
  
  public V1beta3PriorityLevelConfigurationList build() {
    V1beta3PriorityLevelConfigurationList buildable = new V1beta3PriorityLevelConfigurationList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}
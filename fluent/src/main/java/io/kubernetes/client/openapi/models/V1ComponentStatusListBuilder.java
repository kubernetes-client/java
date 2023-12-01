package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ComponentStatusListBuilder extends V1ComponentStatusListFluent<V1ComponentStatusListBuilder> implements VisitableBuilder<V1ComponentStatusList,V1ComponentStatusListBuilder>{
  public V1ComponentStatusListBuilder() {
    this(new V1ComponentStatusList());
  }
  
  public V1ComponentStatusListBuilder(V1ComponentStatusListFluent<?> fluent) {
    this(fluent, new V1ComponentStatusList());
  }
  
  public V1ComponentStatusListBuilder(V1ComponentStatusListFluent<?> fluent,V1ComponentStatusList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ComponentStatusListBuilder(V1ComponentStatusList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ComponentStatusListFluent<?> fluent;
  
  public V1ComponentStatusList build() {
    V1ComponentStatusList buildable = new V1ComponentStatusList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}
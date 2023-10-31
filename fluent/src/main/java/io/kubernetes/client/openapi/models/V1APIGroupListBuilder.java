package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1APIGroupListBuilder extends V1APIGroupListFluent<V1APIGroupListBuilder> implements VisitableBuilder<V1APIGroupList,V1APIGroupListBuilder>{
  public V1APIGroupListBuilder() {
    this(new V1APIGroupList());
  }
  
  public V1APIGroupListBuilder(V1APIGroupListFluent<?> fluent) {
    this(fluent, new V1APIGroupList());
  }
  
  public V1APIGroupListBuilder(V1APIGroupListFluent<?> fluent,V1APIGroupList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1APIGroupListBuilder(V1APIGroupList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1APIGroupListFluent<?> fluent;
  
  public V1APIGroupList build() {
    V1APIGroupList buildable = new V1APIGroupList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setGroups(fluent.buildGroups());
    buildable.setKind(fluent.getKind());
    return buildable;
  }
  

}
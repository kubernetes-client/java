package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1RoleListBuilder extends V1RoleListFluent<V1RoleListBuilder> implements VisitableBuilder<V1RoleList,V1RoleListBuilder>{
  public V1RoleListBuilder() {
    this(new V1RoleList());
  }
  
  public V1RoleListBuilder(V1RoleListFluent<?> fluent) {
    this(fluent, new V1RoleList());
  }
  
  public V1RoleListBuilder(V1RoleListFluent<?> fluent,V1RoleList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1RoleListBuilder(V1RoleList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1RoleListFluent<?> fluent;
  
  public V1RoleList build() {
    V1RoleList buildable = new V1RoleList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}
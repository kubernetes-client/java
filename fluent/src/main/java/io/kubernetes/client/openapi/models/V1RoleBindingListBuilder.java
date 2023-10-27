package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1RoleBindingListBuilder extends V1RoleBindingListFluent<V1RoleBindingListBuilder> implements VisitableBuilder<V1RoleBindingList,V1RoleBindingListBuilder>{
  public V1RoleBindingListBuilder() {
    this(new V1RoleBindingList());
  }
  
  public V1RoleBindingListBuilder(V1RoleBindingListFluent<?> fluent) {
    this(fluent, new V1RoleBindingList());
  }
  
  public V1RoleBindingListBuilder(V1RoleBindingListFluent<?> fluent,V1RoleBindingList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1RoleBindingListBuilder(V1RoleBindingList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1RoleBindingListFluent<?> fluent;
  
  public V1RoleBindingList build() {
    V1RoleBindingList buildable = new V1RoleBindingList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}
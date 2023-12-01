package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ClusterRoleBindingListBuilder extends V1ClusterRoleBindingListFluent<V1ClusterRoleBindingListBuilder> implements VisitableBuilder<V1ClusterRoleBindingList,V1ClusterRoleBindingListBuilder>{
  public V1ClusterRoleBindingListBuilder() {
    this(new V1ClusterRoleBindingList());
  }
  
  public V1ClusterRoleBindingListBuilder(V1ClusterRoleBindingListFluent<?> fluent) {
    this(fluent, new V1ClusterRoleBindingList());
  }
  
  public V1ClusterRoleBindingListBuilder(V1ClusterRoleBindingListFluent<?> fluent,V1ClusterRoleBindingList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ClusterRoleBindingListBuilder(V1ClusterRoleBindingList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ClusterRoleBindingListFluent<?> fluent;
  
  public V1ClusterRoleBindingList build() {
    V1ClusterRoleBindingList buildable = new V1ClusterRoleBindingList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ClusterRoleListBuilder extends V1ClusterRoleListFluent<V1ClusterRoleListBuilder> implements VisitableBuilder<V1ClusterRoleList,V1ClusterRoleListBuilder>{
  public V1ClusterRoleListBuilder() {
    this(new V1ClusterRoleList());
  }
  
  public V1ClusterRoleListBuilder(V1ClusterRoleListFluent<?> fluent) {
    this(fluent, new V1ClusterRoleList());
  }
  
  public V1ClusterRoleListBuilder(V1ClusterRoleListFluent<?> fluent,V1ClusterRoleList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ClusterRoleListBuilder(V1ClusterRoleList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ClusterRoleListFluent<?> fluent;
  
  public V1ClusterRoleList build() {
    V1ClusterRoleList buildable = new V1ClusterRoleList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ClusterRoleBuilder extends V1ClusterRoleFluent<V1ClusterRoleBuilder> implements VisitableBuilder<V1ClusterRole,V1ClusterRoleBuilder>{
  public V1ClusterRoleBuilder() {
    this(new V1ClusterRole());
  }
  
  public V1ClusterRoleBuilder(V1ClusterRoleFluent<?> fluent) {
    this(fluent, new V1ClusterRole());
  }
  
  public V1ClusterRoleBuilder(V1ClusterRoleFluent<?> fluent,V1ClusterRole instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ClusterRoleBuilder(V1ClusterRole instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ClusterRoleFluent<?> fluent;
  
  public V1ClusterRole build() {
    V1ClusterRole buildable = new V1ClusterRole();
    buildable.setAggregationRule(fluent.buildAggregationRule());
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setRules(fluent.buildRules());
    return buildable;
  }
  

}
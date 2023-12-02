package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ClusterRoleBindingBuilder extends V1ClusterRoleBindingFluent<V1ClusterRoleBindingBuilder> implements VisitableBuilder<V1ClusterRoleBinding,V1ClusterRoleBindingBuilder>{
  public V1ClusterRoleBindingBuilder() {
    this(new V1ClusterRoleBinding());
  }
  
  public V1ClusterRoleBindingBuilder(V1ClusterRoleBindingFluent<?> fluent) {
    this(fluent, new V1ClusterRoleBinding());
  }
  
  public V1ClusterRoleBindingBuilder(V1ClusterRoleBindingFluent<?> fluent,V1ClusterRoleBinding instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ClusterRoleBindingBuilder(V1ClusterRoleBinding instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ClusterRoleBindingFluent<?> fluent;
  
  public V1ClusterRoleBinding build() {
    V1ClusterRoleBinding buildable = new V1ClusterRoleBinding();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setRoleRef(fluent.buildRoleRef());
    buildable.setSubjects(fluent.buildSubjects());
    return buildable;
  }
  

}
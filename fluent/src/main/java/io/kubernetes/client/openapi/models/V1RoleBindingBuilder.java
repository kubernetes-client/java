package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1RoleBindingBuilder extends V1RoleBindingFluent<V1RoleBindingBuilder> implements VisitableBuilder<V1RoleBinding,V1RoleBindingBuilder>{
  public V1RoleBindingBuilder() {
    this(new V1RoleBinding());
  }
  
  public V1RoleBindingBuilder(V1RoleBindingFluent<?> fluent) {
    this(fluent, new V1RoleBinding());
  }
  
  public V1RoleBindingBuilder(V1RoleBindingFluent<?> fluent,V1RoleBinding instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1RoleBindingBuilder(V1RoleBinding instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1RoleBindingFluent<?> fluent;
  
  public V1RoleBinding build() {
    V1RoleBinding buildable = new V1RoleBinding();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setRoleRef(fluent.buildRoleRef());
    buildable.setSubjects(fluent.buildSubjects());
    return buildable;
  }
  

}
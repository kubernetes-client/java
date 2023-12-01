package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1RoleBuilder extends V1RoleFluent<V1RoleBuilder> implements VisitableBuilder<V1Role,V1RoleBuilder>{
  public V1RoleBuilder() {
    this(new V1Role());
  }
  
  public V1RoleBuilder(V1RoleFluent<?> fluent) {
    this(fluent, new V1Role());
  }
  
  public V1RoleBuilder(V1RoleFluent<?> fluent,V1Role instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1RoleBuilder(V1Role instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1RoleFluent<?> fluent;
  
  public V1Role build() {
    V1Role buildable = new V1Role();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setRules(fluent.buildRules());
    return buildable;
  }
  

}
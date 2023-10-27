package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1RoleRefBuilder extends V1RoleRefFluent<V1RoleRefBuilder> implements VisitableBuilder<V1RoleRef,V1RoleRefBuilder>{
  public V1RoleRefBuilder() {
    this(new V1RoleRef());
  }
  
  public V1RoleRefBuilder(V1RoleRefFluent<?> fluent) {
    this(fluent, new V1RoleRef());
  }
  
  public V1RoleRefBuilder(V1RoleRefFluent<?> fluent,V1RoleRef instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1RoleRefBuilder(V1RoleRef instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1RoleRefFluent<?> fluent;
  
  public V1RoleRef build() {
    V1RoleRef buildable = new V1RoleRef();
    buildable.setApiGroup(fluent.getApiGroup());
    buildable.setKind(fluent.getKind());
    buildable.setName(fluent.getName());
    return buildable;
  }
  

}
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1RoleRefBuilder extends V1RoleRefFluentImpl<V1RoleRefBuilder> implements VisitableBuilder<V1RoleRef,V1RoleRefBuilder>{
  public V1RoleRefBuilder() {
    this(false);
  }
  public V1RoleRefBuilder(Boolean validationEnabled) {
    this(new V1RoleRef(), validationEnabled);
  }
  public V1RoleRefBuilder(V1RoleRefFluent<?> fluent) {
    this(fluent, false);
  }
  public V1RoleRefBuilder(V1RoleRefFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1RoleRef(), validationEnabled);
  }
  public V1RoleRefBuilder(V1RoleRefFluent<?> fluent,V1RoleRef instance) {
    this(fluent, instance, false);
  }
  public V1RoleRefBuilder(V1RoleRefFluent<?> fluent,V1RoleRef instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiGroup(instance.getApiGroup());

    fluent.withKind(instance.getKind());

    fluent.withName(instance.getName());

    this.validationEnabled = validationEnabled; 
  }
  public V1RoleRefBuilder(V1RoleRef instance) {
    this(instance,false);
  }
  public V1RoleRefBuilder(V1RoleRef instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiGroup(instance.getApiGroup());

    this.withKind(instance.getKind());

    this.withName(instance.getName());

    this.validationEnabled = validationEnabled; 
  }
  V1RoleRefFluent<?> fluent;
  Boolean validationEnabled;
  public V1RoleRef build() {
    V1RoleRef buildable = new V1RoleRef();
    buildable.setApiGroup(fluent.getApiGroup());
    buildable.setKind(fluent.getKind());
    buildable.setName(fluent.getName());
    return buildable;
  }
  
}
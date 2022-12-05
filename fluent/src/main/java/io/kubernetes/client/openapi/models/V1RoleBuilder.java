package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1RoleBuilder extends V1RoleFluentImpl<V1RoleBuilder> implements VisitableBuilder<V1Role,V1RoleBuilder>{
  public V1RoleBuilder() {
    this(false);
  }
  public V1RoleBuilder(Boolean validationEnabled) {
    this(new V1Role(), validationEnabled);
  }
  public V1RoleBuilder(V1RoleFluent<?> fluent) {
    this(fluent, false);
  }
  public V1RoleBuilder(V1RoleFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1Role(), validationEnabled);
  }
  public V1RoleBuilder(V1RoleFluent<?> fluent,V1Role instance) {
    this(fluent, instance, false);
  }
  public V1RoleBuilder(V1RoleFluent<?> fluent,V1Role instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withRules(instance.getRules());

    this.validationEnabled = validationEnabled; 
  }
  public V1RoleBuilder(V1Role instance) {
    this(instance,false);
  }
  public V1RoleBuilder(V1Role instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withRules(instance.getRules());

    this.validationEnabled = validationEnabled; 
  }
  V1RoleFluent<?> fluent;
  Boolean validationEnabled;
  public V1Role build() {
    V1Role buildable = new V1Role();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setRules(fluent.getRules());
    return buildable;
  }
  
}
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1RoleBindingBuilder extends V1RoleBindingFluentImpl<V1RoleBindingBuilder> implements VisitableBuilder<V1RoleBinding,V1RoleBindingBuilder>{
  public V1RoleBindingBuilder() {
    this(false);
  }
  public V1RoleBindingBuilder(Boolean validationEnabled) {
    this(new V1RoleBinding(), validationEnabled);
  }
  public V1RoleBindingBuilder(V1RoleBindingFluent<?> fluent) {
    this(fluent, false);
  }
  public V1RoleBindingBuilder(V1RoleBindingFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1RoleBinding(), validationEnabled);
  }
  public V1RoleBindingBuilder(V1RoleBindingFluent<?> fluent,V1RoleBinding instance) {
    this(fluent, instance, false);
  }
  public V1RoleBindingBuilder(V1RoleBindingFluent<?> fluent,V1RoleBinding instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withRoleRef(instance.getRoleRef());

    fluent.withSubjects(instance.getSubjects());

    this.validationEnabled = validationEnabled; 
  }
  public V1RoleBindingBuilder(V1RoleBinding instance) {
    this(instance,false);
  }
  public V1RoleBindingBuilder(V1RoleBinding instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withRoleRef(instance.getRoleRef());

    this.withSubjects(instance.getSubjects());

    this.validationEnabled = validationEnabled; 
  }
  V1RoleBindingFluent<?> fluent;
  Boolean validationEnabled;
  public V1RoleBinding build() {
    V1RoleBinding buildable = new V1RoleBinding();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setRoleRef(fluent.getRoleRef());
    buildable.setSubjects(fluent.getSubjects());
    return buildable;
  }
  
}
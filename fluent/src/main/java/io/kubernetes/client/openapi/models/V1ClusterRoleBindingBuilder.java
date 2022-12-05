package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1ClusterRoleBindingBuilder extends V1ClusterRoleBindingFluentImpl<V1ClusterRoleBindingBuilder> implements VisitableBuilder<V1ClusterRoleBinding,V1ClusterRoleBindingBuilder>{
  public V1ClusterRoleBindingBuilder() {
    this(false);
  }
  public V1ClusterRoleBindingBuilder(Boolean validationEnabled) {
    this(new V1ClusterRoleBinding(), validationEnabled);
  }
  public V1ClusterRoleBindingBuilder(V1ClusterRoleBindingFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ClusterRoleBindingBuilder(V1ClusterRoleBindingFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1ClusterRoleBinding(), validationEnabled);
  }
  public V1ClusterRoleBindingBuilder(V1ClusterRoleBindingFluent<?> fluent,V1ClusterRoleBinding instance) {
    this(fluent, instance, false);
  }
  public V1ClusterRoleBindingBuilder(V1ClusterRoleBindingFluent<?> fluent,V1ClusterRoleBinding instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withRoleRef(instance.getRoleRef());

    fluent.withSubjects(instance.getSubjects());

    this.validationEnabled = validationEnabled; 
  }
  public V1ClusterRoleBindingBuilder(V1ClusterRoleBinding instance) {
    this(instance,false);
  }
  public V1ClusterRoleBindingBuilder(V1ClusterRoleBinding instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withRoleRef(instance.getRoleRef());

    this.withSubjects(instance.getSubjects());

    this.validationEnabled = validationEnabled; 
  }
  V1ClusterRoleBindingFluent<?> fluent;
  Boolean validationEnabled;
  public V1ClusterRoleBinding build() {
    V1ClusterRoleBinding buildable = new V1ClusterRoleBinding();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setRoleRef(fluent.getRoleRef());
    buildable.setSubjects(fluent.getSubjects());
    return buildable;
  }
  
}
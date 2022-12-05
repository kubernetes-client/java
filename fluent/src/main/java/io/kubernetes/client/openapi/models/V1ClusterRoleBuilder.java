package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1ClusterRoleBuilder extends V1ClusterRoleFluentImpl<V1ClusterRoleBuilder> implements VisitableBuilder<V1ClusterRole,V1ClusterRoleBuilder>{
  public V1ClusterRoleBuilder() {
    this(false);
  }
  public V1ClusterRoleBuilder(Boolean validationEnabled) {
    this(new V1ClusterRole(), validationEnabled);
  }
  public V1ClusterRoleBuilder(V1ClusterRoleFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ClusterRoleBuilder(V1ClusterRoleFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1ClusterRole(), validationEnabled);
  }
  public V1ClusterRoleBuilder(V1ClusterRoleFluent<?> fluent,V1ClusterRole instance) {
    this(fluent, instance, false);
  }
  public V1ClusterRoleBuilder(V1ClusterRoleFluent<?> fluent,V1ClusterRole instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withAggregationRule(instance.getAggregationRule());

    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withRules(instance.getRules());

    this.validationEnabled = validationEnabled; 
  }
  public V1ClusterRoleBuilder(V1ClusterRole instance) {
    this(instance,false);
  }
  public V1ClusterRoleBuilder(V1ClusterRole instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withAggregationRule(instance.getAggregationRule());

    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withRules(instance.getRules());

    this.validationEnabled = validationEnabled; 
  }
  V1ClusterRoleFluent<?> fluent;
  Boolean validationEnabled;
  public V1ClusterRole build() {
    V1ClusterRole buildable = new V1ClusterRole();
    buildable.setAggregationRule(fluent.getAggregationRule());
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setRules(fluent.getRules());
    return buildable;
  }
  
}
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1ClusterRoleListBuilder extends V1ClusterRoleListFluentImpl<V1ClusterRoleListBuilder> implements VisitableBuilder<V1ClusterRoleList,V1ClusterRoleListBuilder>{
  public V1ClusterRoleListBuilder() {
    this(false);
  }
  public V1ClusterRoleListBuilder(Boolean validationEnabled) {
    this(new V1ClusterRoleList(), validationEnabled);
  }
  public V1ClusterRoleListBuilder(V1ClusterRoleListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ClusterRoleListBuilder(V1ClusterRoleListFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1ClusterRoleList(), validationEnabled);
  }
  public V1ClusterRoleListBuilder(V1ClusterRoleListFluent<?> fluent,V1ClusterRoleList instance) {
    this(fluent, instance, false);
  }
  public V1ClusterRoleListBuilder(V1ClusterRoleListFluent<?> fluent,V1ClusterRoleList instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  public V1ClusterRoleListBuilder(V1ClusterRoleList instance) {
    this(instance,false);
  }
  public V1ClusterRoleListBuilder(V1ClusterRoleList instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  V1ClusterRoleListFluent<?> fluent;
  Boolean validationEnabled;
  public V1ClusterRoleList build() {
    V1ClusterRoleList buildable = new V1ClusterRoleList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  
}
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1ClusterRoleBindingListBuilder extends V1ClusterRoleBindingListFluentImpl<V1ClusterRoleBindingListBuilder> implements VisitableBuilder<V1ClusterRoleBindingList,V1ClusterRoleBindingListBuilder>{
  public V1ClusterRoleBindingListBuilder() {
    this(false);
  }
  public V1ClusterRoleBindingListBuilder(Boolean validationEnabled) {
    this(new V1ClusterRoleBindingList(), validationEnabled);
  }
  public V1ClusterRoleBindingListBuilder(V1ClusterRoleBindingListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ClusterRoleBindingListBuilder(V1ClusterRoleBindingListFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1ClusterRoleBindingList(), validationEnabled);
  }
  public V1ClusterRoleBindingListBuilder(V1ClusterRoleBindingListFluent<?> fluent,V1ClusterRoleBindingList instance) {
    this(fluent, instance, false);
  }
  public V1ClusterRoleBindingListBuilder(V1ClusterRoleBindingListFluent<?> fluent,V1ClusterRoleBindingList instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  public V1ClusterRoleBindingListBuilder(V1ClusterRoleBindingList instance) {
    this(instance,false);
  }
  public V1ClusterRoleBindingListBuilder(V1ClusterRoleBindingList instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  V1ClusterRoleBindingListFluent<?> fluent;
  Boolean validationEnabled;
  public V1ClusterRoleBindingList build() {
    V1ClusterRoleBindingList buildable = new V1ClusterRoleBindingList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  
}
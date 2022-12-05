package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1RoleListBuilder extends V1RoleListFluentImpl<V1RoleListBuilder> implements VisitableBuilder<V1RoleList,V1RoleListBuilder>{
  public V1RoleListBuilder() {
    this(false);
  }
  public V1RoleListBuilder(Boolean validationEnabled) {
    this(new V1RoleList(), validationEnabled);
  }
  public V1RoleListBuilder(V1RoleListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1RoleListBuilder(V1RoleListFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1RoleList(), validationEnabled);
  }
  public V1RoleListBuilder(V1RoleListFluent<?> fluent,V1RoleList instance) {
    this(fluent, instance, false);
  }
  public V1RoleListBuilder(V1RoleListFluent<?> fluent,V1RoleList instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  public V1RoleListBuilder(V1RoleList instance) {
    this(instance,false);
  }
  public V1RoleListBuilder(V1RoleList instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  V1RoleListFluent<?> fluent;
  Boolean validationEnabled;
  public V1RoleList build() {
    V1RoleList buildable = new V1RoleList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  
}
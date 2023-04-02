package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1APIGroupListBuilder extends V1APIGroupListFluentImpl<V1APIGroupListBuilder> implements VisitableBuilder<V1APIGroupList,V1APIGroupListBuilder>{
  public V1APIGroupListBuilder() {
    this(false);
  }
  public V1APIGroupListBuilder(Boolean validationEnabled) {
    this(new V1APIGroupList(), validationEnabled);
  }
  public V1APIGroupListBuilder(V1APIGroupListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1APIGroupListBuilder(V1APIGroupListFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1APIGroupList(), validationEnabled);
  }
  public V1APIGroupListBuilder(V1APIGroupListFluent<?> fluent,V1APIGroupList instance) {
    this(fluent, instance, false);
  }
  public V1APIGroupListBuilder(V1APIGroupListFluent<?> fluent,V1APIGroupList instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withGroups(instance.getGroups());

    fluent.withKind(instance.getKind());

    this.validationEnabled = validationEnabled; 
  }
  public V1APIGroupListBuilder(V1APIGroupList instance) {
    this(instance,false);
  }
  public V1APIGroupListBuilder(V1APIGroupList instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withGroups(instance.getGroups());

    this.withKind(instance.getKind());

    this.validationEnabled = validationEnabled; 
  }
  V1APIGroupListFluent<?> fluent;
  Boolean validationEnabled;
  public V1APIGroupList build() {
    V1APIGroupList buildable = new V1APIGroupList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setGroups(fluent.getGroups());
    buildable.setKind(fluent.getKind());
    return buildable;
  }
  
}
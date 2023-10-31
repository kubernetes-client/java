package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ServiceAccountListBuilder extends V1ServiceAccountListFluent<V1ServiceAccountListBuilder> implements VisitableBuilder<V1ServiceAccountList,V1ServiceAccountListBuilder>{
  public V1ServiceAccountListBuilder() {
    this(new V1ServiceAccountList());
  }
  
  public V1ServiceAccountListBuilder(V1ServiceAccountListFluent<?> fluent) {
    this(fluent, new V1ServiceAccountList());
  }
  
  public V1ServiceAccountListBuilder(V1ServiceAccountListFluent<?> fluent,V1ServiceAccountList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ServiceAccountListBuilder(V1ServiceAccountList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ServiceAccountListFluent<?> fluent;
  
  public V1ServiceAccountList build() {
    V1ServiceAccountList buildable = new V1ServiceAccountList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}
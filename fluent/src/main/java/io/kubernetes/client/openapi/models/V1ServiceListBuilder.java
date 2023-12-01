package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ServiceListBuilder extends V1ServiceListFluent<V1ServiceListBuilder> implements VisitableBuilder<V1ServiceList,V1ServiceListBuilder>{
  public V1ServiceListBuilder() {
    this(new V1ServiceList());
  }
  
  public V1ServiceListBuilder(V1ServiceListFluent<?> fluent) {
    this(fluent, new V1ServiceList());
  }
  
  public V1ServiceListBuilder(V1ServiceListFluent<?> fluent,V1ServiceList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ServiceListBuilder(V1ServiceList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ServiceListFluent<?> fluent;
  
  public V1ServiceList build() {
    V1ServiceList buildable = new V1ServiceList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}
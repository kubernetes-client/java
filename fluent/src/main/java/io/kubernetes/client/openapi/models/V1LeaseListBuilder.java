package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1LeaseListBuilder extends V1LeaseListFluent<V1LeaseListBuilder> implements VisitableBuilder<V1LeaseList,V1LeaseListBuilder>{
  public V1LeaseListBuilder() {
    this(new V1LeaseList());
  }
  
  public V1LeaseListBuilder(V1LeaseListFluent<?> fluent) {
    this(fluent, new V1LeaseList());
  }
  
  public V1LeaseListBuilder(V1LeaseListFluent<?> fluent,V1LeaseList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1LeaseListBuilder(V1LeaseList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1LeaseListFluent<?> fluent;
  
  public V1LeaseList build() {
    V1LeaseList buildable = new V1LeaseList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}
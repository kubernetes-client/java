package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1APIServiceListBuilder extends V1APIServiceListFluent<V1APIServiceListBuilder> implements VisitableBuilder<V1APIServiceList,V1APIServiceListBuilder>{
  public V1APIServiceListBuilder() {
    this(new V1APIServiceList());
  }
  
  public V1APIServiceListBuilder(V1APIServiceListFluent<?> fluent) {
    this(fluent, new V1APIServiceList());
  }
  
  public V1APIServiceListBuilder(V1APIServiceListFluent<?> fluent,V1APIServiceList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1APIServiceListBuilder(V1APIServiceList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1APIServiceListFluent<?> fluent;
  
  public V1APIServiceList build() {
    V1APIServiceList buildable = new V1APIServiceList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}
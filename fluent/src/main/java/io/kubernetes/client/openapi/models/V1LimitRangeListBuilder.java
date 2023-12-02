package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1LimitRangeListBuilder extends V1LimitRangeListFluent<V1LimitRangeListBuilder> implements VisitableBuilder<V1LimitRangeList,V1LimitRangeListBuilder>{
  public V1LimitRangeListBuilder() {
    this(new V1LimitRangeList());
  }
  
  public V1LimitRangeListBuilder(V1LimitRangeListFluent<?> fluent) {
    this(fluent, new V1LimitRangeList());
  }
  
  public V1LimitRangeListBuilder(V1LimitRangeListFluent<?> fluent,V1LimitRangeList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1LimitRangeListBuilder(V1LimitRangeList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1LimitRangeListFluent<?> fluent;
  
  public V1LimitRangeList build() {
    V1LimitRangeList buildable = new V1LimitRangeList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}
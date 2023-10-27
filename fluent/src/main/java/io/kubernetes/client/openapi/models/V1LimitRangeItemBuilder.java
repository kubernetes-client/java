package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1LimitRangeItemBuilder extends V1LimitRangeItemFluent<V1LimitRangeItemBuilder> implements VisitableBuilder<V1LimitRangeItem,V1LimitRangeItemBuilder>{
  public V1LimitRangeItemBuilder() {
    this(new V1LimitRangeItem());
  }
  
  public V1LimitRangeItemBuilder(V1LimitRangeItemFluent<?> fluent) {
    this(fluent, new V1LimitRangeItem());
  }
  
  public V1LimitRangeItemBuilder(V1LimitRangeItemFluent<?> fluent,V1LimitRangeItem instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1LimitRangeItemBuilder(V1LimitRangeItem instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1LimitRangeItemFluent<?> fluent;
  
  public V1LimitRangeItem build() {
    V1LimitRangeItem buildable = new V1LimitRangeItem();
    buildable.setDefault(fluent.getDefault());
    buildable.setDefaultRequest(fluent.getDefaultRequest());
    buildable.setMax(fluent.getMax());
    buildable.setMaxLimitRequestRatio(fluent.getMaxLimitRequestRatio());
    buildable.setMin(fluent.getMin());
    buildable.setType(fluent.getType());
    return buildable;
  }
  

}
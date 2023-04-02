package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1LimitRangeItemBuilder extends V1LimitRangeItemFluentImpl<V1LimitRangeItemBuilder> implements VisitableBuilder<V1LimitRangeItem,V1LimitRangeItemBuilder>{
  public V1LimitRangeItemBuilder() {
    this(false);
  }
  public V1LimitRangeItemBuilder(Boolean validationEnabled) {
    this(new V1LimitRangeItem(), validationEnabled);
  }
  public V1LimitRangeItemBuilder(V1LimitRangeItemFluent<?> fluent) {
    this(fluent, false);
  }
  public V1LimitRangeItemBuilder(V1LimitRangeItemFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1LimitRangeItem(), validationEnabled);
  }
  public V1LimitRangeItemBuilder(V1LimitRangeItemFluent<?> fluent,V1LimitRangeItem instance) {
    this(fluent, instance, false);
  }
  public V1LimitRangeItemBuilder(V1LimitRangeItemFluent<?> fluent,V1LimitRangeItem instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withDefault(instance.getDefault());

    fluent.withDefaultRequest(instance.getDefaultRequest());

    fluent.withMax(instance.getMax());

    fluent.withMaxLimitRequestRatio(instance.getMaxLimitRequestRatio());

    fluent.withMin(instance.getMin());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  public V1LimitRangeItemBuilder(V1LimitRangeItem instance) {
    this(instance,false);
  }
  public V1LimitRangeItemBuilder(V1LimitRangeItem instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withDefault(instance.getDefault());

    this.withDefaultRequest(instance.getDefaultRequest());

    this.withMax(instance.getMax());

    this.withMaxLimitRequestRatio(instance.getMaxLimitRequestRatio());

    this.withMin(instance.getMin());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  V1LimitRangeItemFluent<?> fluent;
  Boolean validationEnabled;
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
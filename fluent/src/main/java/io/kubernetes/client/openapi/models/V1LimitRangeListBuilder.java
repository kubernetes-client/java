package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1LimitRangeListBuilder extends V1LimitRangeListFluentImpl<V1LimitRangeListBuilder> implements VisitableBuilder<V1LimitRangeList,V1LimitRangeListBuilder>{
  public V1LimitRangeListBuilder() {
    this(false);
  }
  public V1LimitRangeListBuilder(Boolean validationEnabled) {
    this(new V1LimitRangeList(), validationEnabled);
  }
  public V1LimitRangeListBuilder(V1LimitRangeListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1LimitRangeListBuilder(V1LimitRangeListFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1LimitRangeList(), validationEnabled);
  }
  public V1LimitRangeListBuilder(V1LimitRangeListFluent<?> fluent,V1LimitRangeList instance) {
    this(fluent, instance, false);
  }
  public V1LimitRangeListBuilder(V1LimitRangeListFluent<?> fluent,V1LimitRangeList instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  public V1LimitRangeListBuilder(V1LimitRangeList instance) {
    this(instance,false);
  }
  public V1LimitRangeListBuilder(V1LimitRangeList instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  V1LimitRangeListFluent<?> fluent;
  Boolean validationEnabled;
  public V1LimitRangeList build() {
    V1LimitRangeList buildable = new V1LimitRangeList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  
}
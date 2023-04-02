package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1APIServiceListBuilder extends V1APIServiceListFluentImpl<V1APIServiceListBuilder> implements VisitableBuilder<V1APIServiceList,V1APIServiceListBuilder>{
  public V1APIServiceListBuilder() {
    this(false);
  }
  public V1APIServiceListBuilder(Boolean validationEnabled) {
    this(new V1APIServiceList(), validationEnabled);
  }
  public V1APIServiceListBuilder(V1APIServiceListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1APIServiceListBuilder(V1APIServiceListFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1APIServiceList(), validationEnabled);
  }
  public V1APIServiceListBuilder(V1APIServiceListFluent<?> fluent,V1APIServiceList instance) {
    this(fluent, instance, false);
  }
  public V1APIServiceListBuilder(V1APIServiceListFluent<?> fluent,V1APIServiceList instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  public V1APIServiceListBuilder(V1APIServiceList instance) {
    this(instance,false);
  }
  public V1APIServiceListBuilder(V1APIServiceList instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  V1APIServiceListFluent<?> fluent;
  Boolean validationEnabled;
  public V1APIServiceList build() {
    V1APIServiceList buildable = new V1APIServiceList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  
}
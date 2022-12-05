package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1ServiceListBuilder extends V1ServiceListFluentImpl<V1ServiceListBuilder> implements VisitableBuilder<V1ServiceList,V1ServiceListBuilder>{
  public V1ServiceListBuilder() {
    this(false);
  }
  public V1ServiceListBuilder(Boolean validationEnabled) {
    this(new V1ServiceList(), validationEnabled);
  }
  public V1ServiceListBuilder(V1ServiceListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ServiceListBuilder(V1ServiceListFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1ServiceList(), validationEnabled);
  }
  public V1ServiceListBuilder(V1ServiceListFluent<?> fluent,V1ServiceList instance) {
    this(fluent, instance, false);
  }
  public V1ServiceListBuilder(V1ServiceListFluent<?> fluent,V1ServiceList instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  public V1ServiceListBuilder(V1ServiceList instance) {
    this(instance,false);
  }
  public V1ServiceListBuilder(V1ServiceList instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  V1ServiceListFluent<?> fluent;
  Boolean validationEnabled;
  public V1ServiceList build() {
    V1ServiceList buildable = new V1ServiceList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  
}
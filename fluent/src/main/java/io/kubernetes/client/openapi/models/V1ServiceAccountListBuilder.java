package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1ServiceAccountListBuilder extends V1ServiceAccountListFluentImpl<V1ServiceAccountListBuilder> implements VisitableBuilder<V1ServiceAccountList,V1ServiceAccountListBuilder>{
  public V1ServiceAccountListBuilder() {
    this(false);
  }
  public V1ServiceAccountListBuilder(Boolean validationEnabled) {
    this(new V1ServiceAccountList(), validationEnabled);
  }
  public V1ServiceAccountListBuilder(V1ServiceAccountListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ServiceAccountListBuilder(V1ServiceAccountListFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1ServiceAccountList(), validationEnabled);
  }
  public V1ServiceAccountListBuilder(V1ServiceAccountListFluent<?> fluent,V1ServiceAccountList instance) {
    this(fluent, instance, false);
  }
  public V1ServiceAccountListBuilder(V1ServiceAccountListFluent<?> fluent,V1ServiceAccountList instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  public V1ServiceAccountListBuilder(V1ServiceAccountList instance) {
    this(instance,false);
  }
  public V1ServiceAccountListBuilder(V1ServiceAccountList instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  V1ServiceAccountListFluent<?> fluent;
  Boolean validationEnabled;
  public V1ServiceAccountList build() {
    V1ServiceAccountList buildable = new V1ServiceAccountList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  
}
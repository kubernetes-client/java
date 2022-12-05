package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1LeaseListBuilder extends V1LeaseListFluentImpl<V1LeaseListBuilder> implements VisitableBuilder<V1LeaseList,V1LeaseListBuilder>{
  public V1LeaseListBuilder() {
    this(false);
  }
  public V1LeaseListBuilder(Boolean validationEnabled) {
    this(new V1LeaseList(), validationEnabled);
  }
  public V1LeaseListBuilder(V1LeaseListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1LeaseListBuilder(V1LeaseListFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1LeaseList(), validationEnabled);
  }
  public V1LeaseListBuilder(V1LeaseListFluent<?> fluent,V1LeaseList instance) {
    this(fluent, instance, false);
  }
  public V1LeaseListBuilder(V1LeaseListFluent<?> fluent,V1LeaseList instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  public V1LeaseListBuilder(V1LeaseList instance) {
    this(instance,false);
  }
  public V1LeaseListBuilder(V1LeaseList instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  V1LeaseListFluent<?> fluent;
  Boolean validationEnabled;
  public V1LeaseList build() {
    V1LeaseList buildable = new V1LeaseList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  
}
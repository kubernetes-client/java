package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1ResourceQuotaListBuilder extends V1ResourceQuotaListFluentImpl<V1ResourceQuotaListBuilder> implements VisitableBuilder<V1ResourceQuotaList,V1ResourceQuotaListBuilder>{
  public V1ResourceQuotaListBuilder() {
    this(false);
  }
  public V1ResourceQuotaListBuilder(Boolean validationEnabled) {
    this(new V1ResourceQuotaList(), validationEnabled);
  }
  public V1ResourceQuotaListBuilder(V1ResourceQuotaListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ResourceQuotaListBuilder(V1ResourceQuotaListFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1ResourceQuotaList(), validationEnabled);
  }
  public V1ResourceQuotaListBuilder(V1ResourceQuotaListFluent<?> fluent,V1ResourceQuotaList instance) {
    this(fluent, instance, false);
  }
  public V1ResourceQuotaListBuilder(V1ResourceQuotaListFluent<?> fluent,V1ResourceQuotaList instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  public V1ResourceQuotaListBuilder(V1ResourceQuotaList instance) {
    this(instance,false);
  }
  public V1ResourceQuotaListBuilder(V1ResourceQuotaList instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  V1ResourceQuotaListFluent<?> fluent;
  Boolean validationEnabled;
  public V1ResourceQuotaList build() {
    V1ResourceQuotaList buildable = new V1ResourceQuotaList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  
}
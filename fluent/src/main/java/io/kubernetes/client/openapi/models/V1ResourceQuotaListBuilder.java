package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ResourceQuotaListBuilder extends V1ResourceQuotaListFluent<V1ResourceQuotaListBuilder> implements VisitableBuilder<V1ResourceQuotaList,V1ResourceQuotaListBuilder>{
  public V1ResourceQuotaListBuilder() {
    this(new V1ResourceQuotaList());
  }
  
  public V1ResourceQuotaListBuilder(V1ResourceQuotaListFluent<?> fluent) {
    this(fluent, new V1ResourceQuotaList());
  }
  
  public V1ResourceQuotaListBuilder(V1ResourceQuotaListFluent<?> fluent,V1ResourceQuotaList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ResourceQuotaListBuilder(V1ResourceQuotaList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ResourceQuotaListFluent<?> fluent;
  
  public V1ResourceQuotaList build() {
    V1ResourceQuotaList buildable = new V1ResourceQuotaList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}
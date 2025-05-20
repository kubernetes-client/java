package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta2ResourceClaimListBuilder extends V1beta2ResourceClaimListFluent<V1beta2ResourceClaimListBuilder> implements VisitableBuilder<V1beta2ResourceClaimList,V1beta2ResourceClaimListBuilder>{
  public V1beta2ResourceClaimListBuilder() {
    this(new V1beta2ResourceClaimList());
  }
  
  public V1beta2ResourceClaimListBuilder(V1beta2ResourceClaimListFluent<?> fluent) {
    this(fluent, new V1beta2ResourceClaimList());
  }
  
  public V1beta2ResourceClaimListBuilder(V1beta2ResourceClaimListFluent<?> fluent,V1beta2ResourceClaimList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta2ResourceClaimListBuilder(V1beta2ResourceClaimList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta2ResourceClaimListFluent<?> fluent;
  
  public V1beta2ResourceClaimList build() {
    V1beta2ResourceClaimList buildable = new V1beta2ResourceClaimList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}
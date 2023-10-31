package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha2ResourceClaimListBuilder extends V1alpha2ResourceClaimListFluent<V1alpha2ResourceClaimListBuilder> implements VisitableBuilder<V1alpha2ResourceClaimList,V1alpha2ResourceClaimListBuilder>{
  public V1alpha2ResourceClaimListBuilder() {
    this(new V1alpha2ResourceClaimList());
  }
  
  public V1alpha2ResourceClaimListBuilder(V1alpha2ResourceClaimListFluent<?> fluent) {
    this(fluent, new V1alpha2ResourceClaimList());
  }
  
  public V1alpha2ResourceClaimListBuilder(V1alpha2ResourceClaimListFluent<?> fluent,V1alpha2ResourceClaimList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha2ResourceClaimListBuilder(V1alpha2ResourceClaimList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha2ResourceClaimListFluent<?> fluent;
  
  public V1alpha2ResourceClaimList build() {
    V1alpha2ResourceClaimList buildable = new V1alpha2ResourceClaimList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}